package com.ninja.example.utility;

import android.content.Context;
import android.content.SharedPreferences;

public class Prefs
{

	public static final String LAST_KNOWN_ZIP = "zip";

	public static SharedPreferences get()
	{
		return Globals.getInstance().getContext()
				.getSharedPreferences("PUSH_PREFS", Context.MODE_PRIVATE);
	}

	public static String getLastKnownZip()
	{
		return get().getString(LAST_KNOWN_ZIP, null);
	}

	public static void setLastKnownZip(String lastKnownZip)
	{
		setString(LAST_KNOWN_ZIP, lastKnownZip);
	}

	private static void setString(String key, String value)
	{

		SharedPreferences prefs = Prefs.get();
		SharedPreferences.Editor editor = prefs.edit();
		editor.putString(key, value);
		editor.commit();
	}
}
