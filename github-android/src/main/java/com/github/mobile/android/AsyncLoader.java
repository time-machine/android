/*
 * Copyright (C) 2011 Alexander Blom
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.github.mobile.android;

import android.content.Context;
import android.support.v4.content.AsyncTaskLoader;

/**
 * Loader which extends AsyncTaskLoaders and handles caveats
 * as pointed out in http://code.google.com/p/android/issues/detail?id=14944.
 *
 * Based on CursorLoader.java in the Fragment compatibility package
 *
 * @author Alexander Blom (me@alexanderblom.se)
 *
 * @param <D> data type
 */
public abstract class AsyncLoader<D> extends AsyncTaskLoader<D> {
  private D data;

  public AsyncLoader(final Context context) {
    super(context);
  }

  @Override
  public void deliverResult(final D data) {
    if (isReset()) {
      // an async query came in while the loader is stopped
      return;
    }

    this.data = data;

    super.deliverResult(data);
  }


  @Override
  protected void onStartLoading() {
    if (data != null) {
      deliverResult(data);
    }

    if (takeContentChanged() || data == null) {
      forceLoad();
    }
  }

  @Override
  protected void onStopLoading() {
    // attempt to cancel the current load task if possible
    cancelLoad();
  }

  @Override
  protected void onReset() {
    super.onReset();

    // ensure the loader is stopped
    onStopLoading();

    data = null;
  }
}