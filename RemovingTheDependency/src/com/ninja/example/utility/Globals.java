package com.ninja.example.utility;

import android.content.Context;

public class Globals
{

	private static Globals globals;

	public Context context;
	

	private Globals()
	{
	}

	public static Globals getInstance()
	{
		if (globals == null)
		{
			globals = new Globals();
		}

		return globals;
	}
	
	public Context getContext()
	{
		return context;
	}

	public void setContext(Context context)
	{
		this.context = context;
	}
	
}
