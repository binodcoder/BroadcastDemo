package com.binodcoder.broadcastdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView changeBattery;
    BatteryReceive batteryReceive;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        changeBattery=(TextView)findViewById(R.id.tv_battery);
        batteryReceive=new BatteryReceive(changeBattery);
        registerReceiver(batteryReceive, new IntentFilter(Intent.ACTION_BATTERY_CHANGED));

    }

    @Override
    protected void onStop() {
        super.onStop();
        unregisterReceiver(batteryReceive);
    }
}