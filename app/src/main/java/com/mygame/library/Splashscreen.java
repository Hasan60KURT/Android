package com.mygame.library;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import gr.net.maroulis.library.EasySplashScreen;

public class Splashscreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EasySplashScreen config = new EasySplashScreen(Splashscreen.this)
                .withFullScreen()
                .withTargetActivity(MainActivity.class)
                .withSplashTimeOut(2000)
                .withBackgroundColor(Color.parseColor("#074E72"))
                .withLogo(R.drawable.unikutuphane)
                .withHeaderText("HOŞGELDİNİZ...")
                .withFooterText("Copyright 2019")
                .withBeforeLogoText("Bozok Üniversitesi Merkez Kütüphanesi");

        config.getHeaderTextView().setTextColor(Color.WHITE);
        config.getBeforeLogoTextView().setTextColor(Color.WHITE);
        config.getFooterTextView().setTextColor(Color.WHITE);

        View view = config.create();
        setContentView(view);

    }
}
