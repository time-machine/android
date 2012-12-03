package com.github.mobile.ui.fragments;

import java.util.List;

import org.eclipse.egit.github.core.PullRequest;

import android.os.Bundle;
import android.support.v4.content.Loader;


public class PullRequestsFragment extends ListLoadingFragment<PullRequest> {

  @Override
  public Loader<List<PullRequest>> onCreateLoader(final int arg0, final Bundle arg1) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public void onLoadFinished(final Loader<List<PullRequest>> arg0,
      final List<PullRequest> arg1) {
    // TODO Auto-generated method stub

  }

  @Override
  public void onLoaderReset(final Loader<List<PullRequest>> arg0) {
    // TODO Auto-generated method stub

  }
}
