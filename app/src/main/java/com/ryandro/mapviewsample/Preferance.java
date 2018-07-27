package com.ryandro.mapviewsample;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

public class Preferance {
    private SharedPreferences preferences;
    private SharedPreferences.Editor edit;

    public Preferance(Context context) {
        if (preferences == null) {
            preferences = PreferenceManager.getDefaultSharedPreferences(context);
        }
        if (edit == null) {
            edit = preferences.edit();
        }
    }

    public void SaveString(String key,String value){
        edit.putString(key,value);
        edit.commit();
    }
    public String getStringValue(String Key){
        return preferences.getString(Key,"N/A");
    }
}
