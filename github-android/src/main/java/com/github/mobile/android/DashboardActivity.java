package com.github.mobile.android;

import static com.github.mobile.android.R.string.issues;
import static com.github.mobile.android.R.string.pull_requests;
import roboguice.activity.RoboFragmentActivity;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.widget.TabHost;

import com.github.mobile.ui.fragments.IssuesFragment;
import com.github.mobile.ui.fragments.PullRequestsFragment;
import com.github.mobile.ui.fragments.TabsAdapter;

public class DashboardActivity extends RoboFragmentActivity {
  public static final String BUNDLE_KEY_TAB = "tab";

  private TabHost tabHost;
  private ViewPager viewPager;
  private TabsAdapter tabsAdapter;

  @Override
  public void onCreate(final Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.fragment_tabs_pager);
    tabHost = (TabHost)findViewById(android.R.id.tabhost);
    tabHost.setup();

    viewPager = (ViewPager)findViewById(R.id.pager);
    tabsAdapter = new TabsAdapter(this, tabHost, viewPager);

    //addTab("news", news, CountingFragment.class);
    addTab("issues", issues, IssuesFragment.class);
    addTab("pulls", pull_requests, PullRequestsFragment.class);
  }

  private void addTab(final String tag, final int indicator, final Class<?> clazz){
    tabsAdapter.addTab(
        tabHost.newTabSpec(tag).setIndicator(getResources().getString(indicator)),
        clazz, null);
  }

  @Override
  protected void onSaveInstanceState(final Bundle outState) {
    super.onSaveInstanceState(outState);
    outState.putString(BUNDLE_KEY_TAB, tabHost.getCurrentTabTag());
  }
}
