package com.github.mobile.android;


import roboguice.activity.RoboActivity;
import android.os.Bundle;

public class DashboardActivity extends RoboActivity {
    private static final String TAG = "DA";

	@Override
	public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dashboard);
    }

}
