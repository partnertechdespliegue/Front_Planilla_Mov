package com.app.partner.plan.Common;

import android.content.Context;
import android.content.SharedPreferences;

public class SharedPreferencesManager {


    private static final String APP_SETTINGS_FILE = "APP_SETTINGS";

    public SharedPreferencesManager() {
    }

    private static SharedPreferences getSharedPreferences(){
        return MyApp.getContext().getSharedPreferences(APP_SETTINGS_FILE, Context.MODE_PRIVATE);
    }

    public static void setPreferences(String key, String value){
        SharedPreferences.Editor editor = getSharedPreferences().edit();
        editor.putString(key, value).commit();
    }

    public static void setPreferences(String key, int value){
        SharedPreferences.Editor editor = getSharedPreferences().edit();
        editor.putInt(key, value).commit();
    }

    public static void setPreferences(String key, boolean value){
        SharedPreferences.Editor editor = getSharedPreferences().edit();
        editor.putBoolean(key, value).commit();
    }

    public static String getPrefString(String key){
        return getSharedPreferences().getString(key , null);
    }

    public static boolean getPrefBoolean(String key){
        return getSharedPreferences().getBoolean(key , false);
    }

}
