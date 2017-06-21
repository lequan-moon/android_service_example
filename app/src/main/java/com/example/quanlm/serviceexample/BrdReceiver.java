package com.example.quanlm.serviceexample;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.widget.Toast;

/**
 * Created by QuanLM on 6/21/2017.
 */

public class BrdReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        Log.d("BROADCAST", "onReceive: " + intent.getAction());
        Toast.makeText(context, "Received: " + intent.getAction(), Toast.LENGTH_SHORT).show();
    }
}
