package com.github.mobile.android.views;

import static android.text.format.DateUtils.getRelativeTimeSpanString;
import static com.github.mobile.android.R.id.tv_list_item_date;
import static com.github.mobile.android.R.id.tv_list_item_shortdesc;

import org.eclipse.egit.github.core.PullRequest;

import android.view.View;
import android.widget.TextView;

import com.madgag.android.listviews.ViewHolder;

public class PullRequestViewHolder implements ViewHolder<PullRequest> {
  private final TextView createdAt, title;

  public PullRequestViewHolder(final View v) {
    createdAt = (TextView)v.findViewById(tv_list_item_date);
    title = (TextView)v.findViewById(tv_list_item_shortdesc);
  }

  @Override
  public void updateViewFor(final PullRequest pr) {
    title.setText(pr.getTitle());
    createdAt.setText(getRelativeTimeSpanString(pr.getCreatedAt().getTime()));
  }
}
