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


package com.ninja.example;

import com.ninja.example.utility.Prefs;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

public class RemovingTheDependencyActivity extends Activity {
	
	
    private static final String TAG = "RemovingTheDependencyActivity";

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        
        if(Prefs.getLastKnownZip() != null && Prefs.getLastKnownZip().equals("55416"))
        {
        	Log.i(TAG, "Preferences were maintained after application close"); 
        }
        
        LogZip(Prefs.getLastKnownZip());
        Prefs.setLastKnownZip("56701"); 
        LogZip(Prefs.getLastKnownZip());
        Prefs.setLastKnownZip("55416"); 
        LogZip(Prefs.getLastKnownZip());
        
        
    }

	private void LogZip(String lastKnownZip)
	{
		if(lastKnownZip == null)
        {
        	Log.i(TAG, "Current ZIP Preference is null");
        }
		else if(lastKnownZip.equals(""))
		{
			Log.i(TAG, "Current ZIP Preference is blank");
		}
		else
		{
			Log.i(TAG, "Current ZIP Preference: " + lastKnownZip);
		}
		
	}
}