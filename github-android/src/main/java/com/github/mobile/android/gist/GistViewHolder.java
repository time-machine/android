package com.github.mobile.android.gist;

import org.eclipse.egit.github.core.Gist;

import android.view.View;
import android.widget.TextView;

import com.github.mobile.android.R;
import com.madgag.android.listviews.ViewHolder;

public class GistViewHolder implements ViewHolder<Gist> {
  private final TextView title;

  /**
   * Create view holder for a {@link Gist}
   *
   * @param v
   */
  public GistViewHolder(final View v) {
    title = (TextView)v.findViewById(R.id.gv_list_item_id);
  }

  @Override
  public void updateViewFor(final Gist gist) {
    final String id = gist.getId();
    title.setText(id);
  }

}
