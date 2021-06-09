package com.xmlnetwork;

import android.content.SharedPreferences;
import android.preference.PreferenceActivity;

/**
 * Created by Vladimir Salguero on 08/01/2016.
 */
public class SettingsActivity  extends PreferenceActivity implements
        SharedPreferences.OnSharedPreferenceChangeListener {

    @Override
    public void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String key) {
        // Sets refreshDisplay to true so that when the user returns to the main
        // activity, the display refreshes to reflect the new settings.
        MainActivity.refreshDisplay = true;
    }

}
