package com.example.human.layout;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TableLayoutActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tablelayout_layout);
        Button tablebutton=(Button)findViewById(R.id.table_button5);
        tablebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}
