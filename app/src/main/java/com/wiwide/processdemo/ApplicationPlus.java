package com.wiwide.processdemo;

import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.os.Process;
import android.util.Log;

import java.util.List;

/**
 * Created by Guolipeng on 2017/9/21.
 * 应用的自定义Application
 */

public class ApplicationPlus extends Application {

    private static final String TAG = "ApplicationPlus";

    @Override
    public void onCreate() {
        super.onCreate();
        String processName = getProcessName(getApplicationContext(), Process.myPid());
        Log.e(TAG, "application start, process name:" + processName);
    }

    private String getProcessName(Context context, int myPid) {

//        Log.e(TAG, "Context:" + context + " pid:" + myPid);

        ActivityManager am = (ActivityManager) context.getSystemService(Context.ACTIVITY_SERVICE);
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = am.getRunningAppProcesses();
        if (runningAppProcesses == null) {
            return null;
        }

//        Log.e(TAG, "##############################  runningAppProcesses.size()=" + runningAppProcesses.size());
//        for (int i = 0; i < runningAppProcesses.size(); i++) {
//            Log.e(TAG, "runningAppProcessName----------->>> " + i + " " + runningAppProcesses.get(i).processName);
//        }

        for (ActivityManager.RunningAppProcessInfo runningAppProcess : runningAppProcesses) {
            if (runningAppProcess.pid == myPid) {
                return runningAppProcess.processName;
            }
        }
        return null;
    }
}
