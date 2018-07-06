package com.example.human.layout;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

public class LinearLayoutActivity extends BaseActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.linearlayout_layout);
        Button horizontalbutton=(Button)findViewById(R.id.horizontalbutton);
        horizontalbutton.setOnClickListener(this);
        Button verticalbutton=(Button)findViewById(R.id.verticalbutton);
        verticalbutton.setOnClickListener(this);
        Button alignLeftbutton=(Button)findViewById(R.id.alignLeftbutton);
        alignLeftbutton.setOnClickListener(this);
        Button widthselfmatchingeffectbutton=(Button)findViewById(R.id.width_self_matching_effect);
        widthselfmatchingeffectbutton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.horizontalbutton:
                setContentView(R.layout.horizontallayout);
                break;
            case R.id.verticalbutton:
                setContentView(R.layout.verticallayout);
                break;
            case R.id.alignLeftbutton:
                setContentView(R.layout.alignleft);
                break;
            case R.id.width_self_matching_effect:
                setContentView(R.layout.width_self_matching_effect);
                default:
                    break;
        }
    }
}
