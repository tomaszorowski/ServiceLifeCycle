package com.example.tomek.servicelifecycle;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.widget.Toast;

/**
 * Created by Tomek on 11/1/2016.
 */

public class HelloService extends Service {
    //wskazuje jak się zachować gdy service zostanie zniszczony
    int mStartMode;
    //interface dla klienta który binduje(wiąże)
    IBinder mBinder;
    //określa czy należy stosować onRebind
    boolean mAllowRebind;


    //standardowo wywoływana podczas tworzenia serwisu
    @Override
    public void onCreate() {

    }
    //usługa uruchamiana ze względu na wywołanie startService()
    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        Toast.makeText(this, "Service Started", Toast.LENGTH_LONG).show();
        return START_STICKY;
    }
    //klient wiąże się z usługą przez bindService()
    @Override
    public IBinder onBind(Intent intent) {
        return mBinder;
    }

    //wywoływana gdy wszyscy klienci rozłączyli się poprzez unbindService()
    @Override
    public boolean onUnbind(Intent intent) {
        return mAllowRebind;
    }

    //wywołana kiedy klient wiąże się z usługą przez bindService()
    @Override
    public void onRebind(Intent intent) {

    }

    //wywoływana kiedy usługa nie jest już używana
    @Override
    public void onDestroy() {
        super.onDestroy();
        Toast.makeText(this, "Service Destroyed", Toast.LENGTH_LONG).show();
    }
}
