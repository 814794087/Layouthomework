package com.example.human.layout;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class RelativeLayoutActivity extends BaseActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.relativelayout_layout);
        Button alignparentbutton=(Button)findViewById(R.id.align_parent_button);
        alignparentbutton.setOnClickListener(this);
        Button controlisrelative1button=(Button)findViewById(R.id.control_is_relative_first);
        controlisrelative1button.setOnClickListener(this);
        Button controlisrelative2button=(Button)findViewById(R.id.control_is_relative_second);
        controlisrelative2button.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.align_parent_button:
                setContentView(R.layout.align_parent_seat);
                break;
            case R.id.control_is_relative_first:
                setContentView(R.layout.controlisrelative1);
            case R.id.control_is_relative_second:
                setContentView(R.layout.controlisrelative2);
                default:
                    break;
        }
    }
}
