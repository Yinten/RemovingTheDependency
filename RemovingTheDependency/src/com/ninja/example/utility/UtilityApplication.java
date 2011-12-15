package com.ninja.example.utility;

import android.app.Application;

public class UtilityApplication extends Application
{

	@Override
	public void onCreate()
	{
		super.onCreate();
		setUpGlobals();
	}

	public void setUpGlobals()
	{
		Globals.getInstance().setContext(this);
	}

}
