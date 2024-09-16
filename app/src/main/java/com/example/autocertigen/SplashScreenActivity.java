package com.example.autocertigen;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import gr.net.maroulis.library.EasySplashScreen;

public class SplashScreenActivity extends AppCompatActivity {
    static {
        System.setProperty(
                "org.apache.poi.javax.xml.stream.XMLInputFactory",
                "com.fasterxml.aalto.stax.InputFactoryImpl"
        );
        System.setProperty(
                "org.apache.poi.javax.xml.stream.XMLOutputFactory",
                "com.fasterxml.aalto.stax.OutputFactoryImpl"
        );
        System.setProperty(
                "org.apache.poi.javax.xml.stream.XMLEventFactory",
                "com.fasterxml.aalto.stax.EventFactoryImpl"
        );
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );

        EasySplashScreen config = new EasySplashScreen( SplashScreenActivity.this )
                .withFullScreen()
                .withTargetActivity( MainActivity.class )
                .withSplashTimeOut( 2000 )
                .withBackgroundResource(R.drawable.splash2)
                .withHeaderText( "" )
                .withFooterText( "Copyright 2021" );

        config.getHeaderTextView().setTextColor( Color.BLACK );
        config.getFooterTextView().setTextColor( Color.WHITE );

        View splashscreen = config.create();
        setContentView( splashscreen );
    }
}
