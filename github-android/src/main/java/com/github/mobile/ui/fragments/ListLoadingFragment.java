package com.github.mobile.ui.fragments;

import java.util.List;

import roboguice.fragment.RoboListFragment;
import android.support.v4.app.LoaderManager;

public abstract class ListLoadingFragment<E> extends RoboListFragment
    implements LoaderManager.LoaderCallbacks<List<E>> {

}
