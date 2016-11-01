package com.example.tomek.servicelifecycle;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;

public class MainActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//       // getMenuInflater().inflate(R.menu.activity_main, menu);
//        return true;
//    }

    // Method to start the service
    public void startService(View view) {
        startService(new Intent(getBaseContext(), HelloService.class));
    }

    // Method to stop the service
    public void stopService(View view) {
        stopService(new Intent(getBaseContext(), HelloService.class));
    }
}
