package com.christy.max.justforyou;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class SecondPage extends AppCompatActivity {
    private ImageButton nextbutton, backbutton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_page);
        nextbutton = (ImageButton) nextbutton.findViewById(R.id.nextbutton);
        backbutton = (ImageButton) backbutton.findViewById(R.id.backbutton);
        nextbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openThirddPage();
            }
        });
        backbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openFirstPage();
            }
        });
    }
    public void openThirddPage(){
        Intent i = new Intent(this, ThirdPage.class);
        startActivity(i);
    }
    public void openFirstPage(){
        Intent i = new Intent(this, FirstPage.class);
        startActivity(i);
    }
}
