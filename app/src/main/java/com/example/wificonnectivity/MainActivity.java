package com.example.wificonnectivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.net.wifi.WifiManager;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    WifiManager wifiMngr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        wifiMngr = (WifiManager) getApplicationContext().getSystemService(Context.WIFI_SERVICE);
    }

    public void setWifiOnState(View view){
        wifiMngr.setWifiEnabled(true);
    }

    public void setWifiOffState(View view){
        wifiMngr.setWifiEnabled(false);
    }
}
