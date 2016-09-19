package com.steven.waveview;

import android.graphics.Color;
import android.graphics.Paint;
import android.os.Bundle;
import android.support.v4.view.animation.LinearOutSlowInInterpolator;
import android.support.v7.app.AppCompatActivity;
import android.view.animation.AccelerateInterpolator;

public class MainActivity extends AppCompatActivity {

    private WaveView mWaveView;
    private WaveView mWaveView2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mWaveView = (WaveView) findViewById(R.id.wave_view);
        mWaveView.setDuration(5000);
        mWaveView.setStyle(Paint.Style.FILL);
        mWaveView.setColor(Color.parseColor("#ff0000"));
        mWaveView.setInterpolator(new LinearOutSlowInInterpolator());
        mWaveView.start();

        mWaveView2 = (WaveView) findViewById(R.id.wave_view2);
        mWaveView2.setDuration(5000);
        mWaveView2.setStyle(Paint.Style.STROKE);
        mWaveView2.setSpeed(400);
        mWaveView2.setColor(Color.parseColor("#ff0000"));
        mWaveView2.setInterpolator(new AccelerateInterpolator(1.2f));
        mWaveView2.start();
    }
}
