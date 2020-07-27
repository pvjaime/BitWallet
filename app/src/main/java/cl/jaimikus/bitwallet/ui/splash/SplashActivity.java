package cl.jaimikus.bitwallet.ui.splash;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Timer;
import java.util.TimerTask;

import cl.jaimikus.bitwallet.ui.addresss.AddressActivity;
import cl.jaimikus.bitwallet.ui.home.MainActivity;
import cl.jaimikus.bitwallet.R;

import static cl.jaimikus.bitwallet.utils.CONSTS.ADDRESS_KEY;

public class SplashActivity extends AppCompatActivity {


    private static final long TIME_SPLASH = 2000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        //Check if the user has a address
        checkFlow();
    }

    private void checkFlow() {
        SharedPreferences sp = getPreferences(MODE_PRIVATE);
        final Intent goTo;
        if (sp.getString(ADDRESS_KEY, null) != null) {
            goTo = new Intent(this, MainActivity.class);
        } else {
            goTo = new Intent(this, AddressActivity.class);
        }

        //Simulate a task
        TimerTask task = new TimerTask() {
            @Override
            public void run() {
                startActivity(goTo);
                finish();
            }

        };
        Timer timer = new Timer();
        timer.schedule(task, TIME_SPLASH); //2 seconds of duration
    }
}