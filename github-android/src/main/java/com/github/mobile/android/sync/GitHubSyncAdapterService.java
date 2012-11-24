package com.github.mobile.android.sync;

import roboguice.service.RoboService;
import android.content.Intent;
import android.os.IBinder;

import com.google.inject.Inject;
import com.google.inject.Provider;

public class GitHubSyncAdapterService extends RoboService {

	@Inject Provider<GitHubSyncAdapter> syncAdapterProvider;

	@Override
	public IBinder onBind(Intent intent) {
        return syncAdapterProvider.get().getSyncAdapterBinder();
	}
}