package com.chnsys.william.dynamicviewpager;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

/**
 * Created by Administrator on 2015/6/26.
 */
public class JumpPage extends Activity {
    private TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView= (TextView) findViewById(R.id.firstInfo);
        String info=  this.getIntent().getStringExtra("info");
        textView.setText(info);
    }
}
