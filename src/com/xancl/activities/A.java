package com.xancl.activities;

import android.os.Bundle;
import android.app.Activity;
import android.util.Log;
import android.view.Menu;

public class A extends Activity {

	private String TAG;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		TAG = getClass().getSimpleName();
		Log.i(TAG, getCallMethodName());

		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_a);
	}

	private String getCallMethodName() {
		final StackTraceElement[] ste = Thread.currentThread().getStackTrace();
		String methodName = ste[3].getMethodName();
		return methodName;
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.a, menu);
		return true;
	}

	@Override
	protected void onDestroy() {
		Log.i(TAG, getCallMethodName());
		super.onDestroy();
	}

	@Override
	protected void onPause() {
		Log.i(TAG, getCallMethodName());
		super.onPause();
	}

	@Override
	protected void onRestart() {
		Log.i(TAG, getCallMethodName());
		super.onRestart();
	}

	@Override
	protected void onRestoreInstanceState(Bundle savedInstanceState) {
		Log.i(TAG, getCallMethodName());
		super.onRestoreInstanceState(savedInstanceState);
	}

	@Override
	protected void onResume() {
		Log.i(TAG, getCallMethodName());
		super.onResume();
	}

	@Override
	protected void onSaveInstanceState(Bundle outState) {
		Log.i(TAG, getCallMethodName());
		super.onSaveInstanceState(outState);
	}

	@Override
	protected void onStart() {
		Log.i(TAG, getCallMethodName());
		super.onStart();
	}

	@Override
	protected void onStop() {
		Log.i(TAG, getCallMethodName());
		super.onStop();
	}
}
