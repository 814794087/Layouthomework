package com.example.human.layout;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_layout);
        Button button1=(Button)findViewById(R.id.intent_LinearLayout);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this, LinearLayoutActivity.class);
                startActivity(intent);
            }
        });
        Button button2=(Button)findViewById(R.id.intent_RelativeLayout);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this, RelativeLayoutActivity.class);
                startActivity(intent);
            }
        });
        Button button3=(Button)findViewById(R.id.intent_FrameLayout);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this, FrameLayoutActivity.class);
                startActivity(intent);
            }
        });
        Button button4=(Button)findViewById(R.id.intent_tableLayout);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this, TableLayoutActivity.class);
                startActivity(intent);
            }
        });
        Button button5=(Button)findViewById(R.id.intent_gridLayout);
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,GridLayoutActivity.class);
                startActivity(intent);
            }
        });
        Button button6=(Button)findViewById(R.id.intent_gridLayout);
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                  ActivityCollector.finishAll();
            }
        });
    }
}
