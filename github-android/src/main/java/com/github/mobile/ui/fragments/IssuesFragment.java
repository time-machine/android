package com.github.mobile.ui.fragments;

import java.util.List;

import org.eclipse.egit.github.core.Issue;

import android.os.Bundle;
import android.support.v4.content.Loader;

public class IssuesFragment extends ListLoadingFragment<Issue> {

  @Override
  public Loader<List<Issue>> onCreateLoader(int arg0, Bundle arg1) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public void onLoadFinished(Loader<List<Issue>> arg0, List<Issue> arg1) {
    // TODO Auto-generated method stub

  }

  @Override
  public void onLoaderReset(Loader<List<Issue>> arg0) {
    // TODO Auto-generated method stub

  }

}
