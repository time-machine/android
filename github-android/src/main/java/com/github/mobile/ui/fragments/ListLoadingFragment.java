package com.github.mobile.ui.fragments;

import java.util.List;

import roboguice.fragment.RoboListFragment;
import android.os.Bundle;
import android.support.v4.app.LoaderManager;
import android.support.v4.content.Loader;
import android.view.View;
import android.widget.ListAdapter;
import android.widget.ListView;

public abstract class ListLoadingFragment<E> extends RoboListFragment
    implements LoaderManager.LoaderCallbacks<List<E>> {
  @Override
  public void onLoadFinished(final Loader<List<E>> loader,
      final List<E> items) {
    setListAdapter(adapterFor(items));
    if (isResumed()) {
      setListShown(true);
    }
    else {
      setListShownNoAnimation(true);
    }
  }

  @Override
  public void onLoaderReset(final Loader<List<E>> listLoader) {
    // clear the data in the adapter
  }

  @Override
  public void onListItemClick(final ListView l, final View v,
      final int position, final long id) {
    // insert desired behavior here
  }

  @Override
  public void onActivityCreated(final Bundle savedInstanceState) {
    super.onActivityCreated(savedInstanceState);
    setEmptyText("No data");

    // start out with a progress indicator
    setListShown(false);

    // prepare the loader. Either re-connect with an existing one,
    // or start a new one
    getLoaderManager().initLoader(0, null, this);
  }

  abstract ListAdapter adapterFor(List<E> items);
}
