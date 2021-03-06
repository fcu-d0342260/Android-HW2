package com.example.hong.homework2;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class HelloActivity extends AppCompatActivity {



    private TextView tv_show;
    private Button back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hello);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        Intent intent = getIntent();
        String input_str = intent.getStringExtra(MainActivity.KEY_ET_NAME);
        tv_show = (TextView) findViewById(R.id.tv_show);
        back = (Button)findViewById(R.id.back);

        tv_show.setText(input_str);

        back.setOnClickListener(fn);

    }

    private View.OnClickListener fn = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            finish();
        }
    };
}
