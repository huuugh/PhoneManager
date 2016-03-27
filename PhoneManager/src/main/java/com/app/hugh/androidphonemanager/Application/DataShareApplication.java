package com.app.hugh.androidphonemanager.Application;

import android.app.Application;
import android.content.SharedPreferences;

/**
 * Created by hs on 2016/3/25.
 */
public class DataShareApplication extends Application
{

    public static SharedPreferences sp;
    public static String path;
    private static SharedPreferences.Editor edit;

    @Override
    public void onCreate()
    {
        super.onCreate();
        /*初始化SharePreference*/
        sp = getSharedPreferences("Config", MODE_PRIVATE);
        edit = sp.edit();
        /*初始化路径*/
        path="http://192.168.3.69/Android_NetWork";
    }
    public static void savedata(String key,String value)
    {
        edit = sp.edit();
        edit.putString(key,value);
        edit.commit();
    }

    public static String getdata(String key)
    {
        String value = sp.getString(key, null);
        return value;
    }
}
