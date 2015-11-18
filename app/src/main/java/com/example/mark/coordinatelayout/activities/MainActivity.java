package com.example.mark.coordinatelayout.activities;

import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.example.mark.coordinatelayout.R;
import com.example.mark.coordinatelayout.widgets.FooterLayout;

public class MainActivity extends AppCompatActivity {
    private FooterLayout mFooterLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setupWidgets();
    }


    private void setupWidgets(){
        mFooterLayout = (FooterLayout) findViewById(R.id.footer_layout);
        final TextView textView = (TextView) findViewById(R.id.tv_second);
        textView.setVisibility(View.GONE);

        Toolbar toolbar = (Toolbar)findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton button = (FloatingActionButton) findViewById(R.id.fab);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if( textView.getVisibility() == View.GONE){
                    textView.setVisibility(View.VISIBLE);
                }else {
                    textView.setVisibility(View.GONE);
                }
            }
        });




    }





}
