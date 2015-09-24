package com.cantrowitz.rxbroadcast;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;

/**
 * Created by adamcantrowitz on 9/1/15.
 */
class BroadcastRegistrar implements BroadcastRegistrarStrategy {
    private final Context context;
    private final IntentFilter intentFilter;

    BroadcastRegistrar(IntentFilter intentFilter, Context context) {
        this.intentFilter = intentFilter;
        this.context = context.getApplicationContext();
    }

    @Override
    public void registerBroadcastReceiver(BroadcastReceiver broadcastReceiver) {
        context.registerReceiver(broadcastReceiver, intentFilter);
    }

    @Override
    public void unregisterBroadcastReceiver(BroadcastReceiver broadcastReceiver) {
        context.unregisterReceiver(broadcastReceiver);
    }
}
