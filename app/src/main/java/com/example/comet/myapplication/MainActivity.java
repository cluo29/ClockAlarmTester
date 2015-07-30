package com.example.comet.myapplication;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;


public class MainActivity extends ActionBarActivity {
    public static final String ALARM_ALERT_ACTION0 = "com.android.deskclock.ALARM_ALERT";
    public static final String ALARM_ALERT_ACTION1 ="com.android.alarmclock.ALARM_ALERT";
    public static final String ALARM_ALERT_ACTION2 = "com.samsung.sec.android.clockpackage.alarm.ALARM_ALERT";
    public static final String ALARM_ALERT_ACTION3 = "com.htc.android.worldclock.ALARM_ALERT";
    public static final String ALARM_ALERT_ACTION4 = "com.sonyericsson.alarm.ALARM_ALERT";
    public static final String ALARM_ALERT_ACTION5 ="com.motorola.blur.alarmclock.AlarmTimerAlert";
    public static final String ALARM_ALERT_ACTION6 = "com.motorola.blur.alarmclock.ALARM_ALERT";
    public static final String ALARM_ALERT_ACTION7 ="com.motorola.blur.alarmclock.AlarmClock";
    private BroadcastReceiver mReceiver = new BroadcastReceiver()
    {
        @Override
        public void onReceive(Context context, Intent intent)
        {
            switch (intent.getAction()) {
                case  ALARM_ALERT_ACTION0:
                    Log.d("SESSION", "alert0");
                    break;
                case  ALARM_ALERT_ACTION1:
                    Log.d("SESSION", "alert1");
                    break;
                case  ALARM_ALERT_ACTION2:
                    Log.d("SESSION", "alert2");
                    break;
                case  ALARM_ALERT_ACTION3:
                    Log.d("SESSION", "alert3");
                    break;
                case  ALARM_ALERT_ACTION4:
                    Log.d("SESSION", "alert4");
                    break;
                case  ALARM_ALERT_ACTION5:
                    Log.d("SESSION", "alert5");
                    break;
                case  ALARM_ALERT_ACTION6:
                    Log.d("SESSION", "alert6");
                    break;
                case  ALARM_ALERT_ACTION7:
                    Log.d("SESSION", "alert8");
                    break;

            }
        }
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        IntentFilter filter = new IntentFilter(ALARM_ALERT_ACTION0);
        filter.addAction(ALARM_ALERT_ACTION1);
        filter.addAction(ALARM_ALERT_ACTION2);
        filter.addAction(ALARM_ALERT_ACTION3);
        filter.addAction(ALARM_ALERT_ACTION4);
        filter.addAction(ALARM_ALERT_ACTION5);
        filter.addAction(ALARM_ALERT_ACTION6);
        filter.addAction(ALARM_ALERT_ACTION7);
        registerReceiver(mReceiver, filter);
    }
    @Override
    public boolean dispatchKeyEvent(KeyEvent event) {
        if (event.getKeyCode() == KeyEvent.KEYCODE_POWER) {
            Log.d("SESSION", "power pressed");
            return true;
        }
        Log.d("SESSION", " pressed");
        return super.dispatchKeyEvent(event);
    }

    @Override
    public boolean onTouchEvent(MotionEvent e) {
        switch (e.getAction()) {
            case MotionEvent.ACTION_DOWN:
                Log.d("SESSION", "screen touched");
                break;
        }
        return true;
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
