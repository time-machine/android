package com.github.mobile.android;

import android.content.Context;
import android.support.v4.content.AsyncTaskLoader;

public abstract class AsyncLoader<D> extends AsyncTaskLoader<D> {

  public AsyncLoader(Context context) {
    super(context);
  }

}
