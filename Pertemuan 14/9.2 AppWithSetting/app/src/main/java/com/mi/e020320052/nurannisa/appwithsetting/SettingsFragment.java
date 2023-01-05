package com.mi.e020320052.nurannisa.appwithsetting;

import android.os.Bundle;
import android.support.v7.preference.PreferenceFragmentCompat;
public class SettingsFragment extends PreferenceFragmentCompat {
    /**
     * Called during onCreate(Bundle) to supply the preferences for this
     * fragment. This calls setPreferenceFromResource to get the preferences
     * from the XML file.
     *
     * @param savedInstanceState If the fragment is being re-created from
     *                           a previous saved state, this is the state.
     * @param rootKey            If non-null, this preference fragment
     *                           should be rooted with this key.
     */
    @Override
    public void onCreatePreferences(Bundle savedInstanceState,
                                    String rootKey) {
        setPreferencesFromResource(R.xml.preferences, rootKey);
    }
}