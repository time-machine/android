package com.github.mobile.android.sync;

import roboguice.inject.ContextScopedProvider;
import roboguice.service.RoboService;
import android.content.Intent;
import android.os.IBinder;

import com.google.inject.Inject;

public class GitHubSyncAdapterService extends RoboService {

	@Inject ContextScopedProvider<GitHubSyncAdapter> syncAdapterProvider;

	@Override
	public IBinder onBind(Intent intent) {
        return syncAdapterProvider.get(this).getSyncAdapterBinder();
	}
}