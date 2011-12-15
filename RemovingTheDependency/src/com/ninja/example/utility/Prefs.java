/*
Copyright 2011 Ryan Mattison

   Licensed under the Apache License, Version 2.0 (the "License");
   you may not use this file except in compliance with the License.
   You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.
*/ 


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
