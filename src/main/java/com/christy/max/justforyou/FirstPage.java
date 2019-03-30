package com.christy.max.justforyou;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class FirstPage extends AppCompatActivity {
    private ImageButton nextbutton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_page);
        nextbutton = (ImageButton) nextbutton.findViewById(R.id.nextbutton);
        nextbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openSecondPage();
            }
        });
    }
    public void openSecondPage(){
        Intent i = new Intent(this, SecondPage.class);
        startActivity(i);
    }
}
