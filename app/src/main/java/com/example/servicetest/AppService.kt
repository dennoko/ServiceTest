package com.example.servicetest

import android.app.Service
import android.content.Intent
import android.os.IBinder
import android.util.Log

class AppService: Service() {
    override fun onCreate() {
        super.onCreate()
        Log.d("lifeCycleTest","AppService onCreate() called")
    }

    override fun onBind(intent: Intent?): IBinder? {
        Log.d("lifeCycleTest","AppService onBind() called")
        return null
    }

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        Log.d("lifeCycleTest","AppService onStartCommand() called")
        return super.onStartCommand(intent, flags, startId)
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("lifeCycleTest","AppService onDestroy() called")
    }
}