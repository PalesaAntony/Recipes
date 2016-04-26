package com.devstudio.mlabsa.recipes;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

/**
 * Created by client on 11/02/2016.
 */
public class SplashScreen extends Activity {

    @Override
    protected void onCreate(Bundle saveInstanceState){
        super.onCreate(saveInstanceState);
        setContentView(R.layout.splash);

        Thread startTimer = new Thread(){
            public void run(){
                try{
                    sleep(3000);
                    Intent i = new Intent(SplashScreen.this, MainActivity.class);
                    startActivity(i);
                    finish();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        startTimer.start();
    }
}