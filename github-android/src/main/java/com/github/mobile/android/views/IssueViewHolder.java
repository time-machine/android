package com.github.mobile.android.views;

import static android.text.format.DateUtils.getRelativeTimeSpanString;
import static com.github.mobile.android.R.id.tv_list_item_date;
import static com.github.mobile.android.R.id.tv_list_item_shortdesc;

import org.eclipse.egit.github.core.Issue;

import android.view.View;
import android.widget.TextView;

import com.madgag.android.listviews.ViewHolder;

public class IssueViewHolder implements ViewHolder<Issue> {
  private final TextView createdAt;
  private final TextView title;

  public IssueViewHolder(final View v) {
    createdAt = (TextView)v.findViewById(tv_list_item_date);
    title = (TextView)v.findViewById(tv_list_item_shortdesc);
  }
  @Override
  public void updateViewFor(final Issue i) {
    title.setText(i.getTitle());
    createdAt.setText(getRelativeTimeSpanString(i.getCreatedAt().getTime()));
  }
}
