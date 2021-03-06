package com.xancl.activities;

import com.xancl.utils.DbgUtils;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;

public class A extends Activity {

	private String TAG = null;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		TAG = getClass().getSimpleName();

		Log.i(TAG, DbgUtils.getCallMethodName());

		if (savedInstanceState != null) {
			Log.i(TAG,
					"savedInstanceState: " + savedInstanceState.getString(TAG));
		}

		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_a);
		TextView tv = (TextView) findViewById(R.id.textview_a);
		tv.setText(R.string.hello);

		findViewById(R.id.button_id_goto_b).setOnClickListener(
				new OnClickListener() {

					@Override
					public void onClick(View v) {
						Intent i = new Intent();
						i.setClass(A.this, B.class);
						startActivity(i);
					}
				});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.a, menu);
		return true;
	}

	@Override
	protected void onDestroy() {
		Log.i(TAG, DbgUtils.getCallMethodName());
		super.onDestroy();
	}

	@Override
	protected void onRestart() {
		Log.i(TAG, DbgUtils.getCallMethodName());
		super.onRestart();
	}

	@Override
	protected void onStart() {
		Log.i(TAG, DbgUtils.getCallMethodName());
		super.onStart();
	}

	@Override
	protected void onStop() {
		Log.i(TAG, DbgUtils.getCallMethodName());
		super.onStop();
	}

	@Override
	protected void onPause() {
		Log.i(TAG, DbgUtils.getCallMethodName());
		super.onPause();
	}

	@Override
	protected void onResume() {
		Log.i(TAG, DbgUtils.getCallMethodName());
		super.onResume();
	}

	@Override
	protected void onSaveInstanceState(Bundle outState) {
		Log.i(TAG, DbgUtils.getCallMethodName());
		outState.putString(TAG, "outState");
		super.onSaveInstanceState(outState);
	}

	@Override
	protected void onRestoreInstanceState(Bundle savedInstanceState) {
		Log.i(TAG, DbgUtils.getCallMethodName());
		super.onRestoreInstanceState(savedInstanceState);
		if (savedInstanceState != null) {
			Log.i(TAG,
					"savedInstanceState: " + savedInstanceState.getString(TAG));
		}
	}
}
