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