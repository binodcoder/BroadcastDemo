package com.binodcoder.broadcastdemo;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.TextView;

public class BatteryReceive extends BroadcastReceiver {
    TextView tv;

    BatteryReceive(TextView tv){
        this.tv=tv;
    }
    @Override
    public void onReceive(Context context, Intent intent) {
        int percent=intent.getIntExtra("level", 0);
        if(percent!=0){
            tv.setText(percent+"%");
        }
    }
}
