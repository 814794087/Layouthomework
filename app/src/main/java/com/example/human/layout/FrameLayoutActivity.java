package com.example.human.layout;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;

import java.sql.Time;
import java.util.Timer;
import java.util.TimerTask;

public class FrameLayoutActivity extends BaseActivity {

    FrameLayout frame=null;
    Handler handler=new Handler(){
        int i=0;
        public void handleMessage(Message msg){
            if(msg.what==0x123){
                move(i%9);
                i++;
            }
            super.handleMessage(msg);
        }
    };
    void move(int i){
        Drawable a=getResources().getDrawable(R.drawable.img1);
        Drawable b=getResources().getDrawable(R.drawable.img2);
        Drawable c=getResources().getDrawable(R.drawable.img3);
        Drawable d=getResources().getDrawable(R.drawable.img4);
        Drawable e=getResources().getDrawable(R.drawable.img5);
        Drawable f=getResources().getDrawable(R.drawable.img6);
        Drawable g=getResources().getDrawable(R.drawable.img7);
        Drawable h=getResources().getDrawable(R.drawable.img8);
        Drawable k=getResources().getDrawable(R.drawable.img9);
        switch (i){
            case 0:
                frame.setForeground(a);
                break;
            case 1:
                frame.setForeground(b);
                break;
            case 2:
                frame.setForeground(c);
                break;
            case 3:
                frame.setForeground(d);
                break;
            case 4:
                frame.setForeground(e);
                break;
            case 5:
                frame.setForeground(f);
                break;
            case 6:
                frame.setForeground(g);
                break;
            case 7:
                frame.setForeground(h);
                break;
            case 8:
                frame.setForeground(k);
                break;
        }

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.framelayout_layout);
        frame=(FrameLayout)findViewById(R.id.myframe);
        new Timer().schedule(new TimerTask() {
            @Override
            public void run() {
                handler.sendEmptyMessage(0x123);
            }
        },0,400);
        Button framebutton=(Button)findViewById(R.id.frame_layout_goback);
        framebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}
