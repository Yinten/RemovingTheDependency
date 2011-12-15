package com.ninja.example;

import android.util.Log;

import com.ninja.example.utility.UtilityApplication;

public class RemovingTheDependencyApplication extends UtilityApplication
{

	private static final String TAG = "RemovingTheDependencyActivity";

	@Override
	public void onCreate()
	{
		super.onCreate();

		Log.d(TAG,
				"This is this particular application class, for extending the utility application features");
	}


}