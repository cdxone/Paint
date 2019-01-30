package com.cdx.example.paint;

import android.graphics.Paint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //抗锯齿
        Paint paint = new Paint(Paint.ANTI_ALIAS_FLAG);
        paint.setTextSize(15);
        Paint.FontMetrics fontMetrics = paint.getFontMetrics();

        //获得参数的值
        Log.e(TAG,"fontMetrics.top:"+fontMetrics.top);
        Log.e(TAG,"fontMetrics.ascent:"+fontMetrics.ascent);
        Log.e(TAG,"fontMetrics.descent:"+fontMetrics.descent);
        Log.e(TAG,"fontMetrics.bottom:"+fontMetrics.bottom);
        Log.e(TAG,"fontMetrics.leading"+fontMetrics.leading);
    }
}
