package com.vivasayigames.gameshub.firsttime;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.vivasayigames.gameshub.R;

public class Screen_one extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_screen_one);

        ImageView next = (ImageView) findViewById(R.id.btnscreenone);
        //screen one to screen two
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(Screen_one.this,Screen_two.class);
                startActivity(i);
            }
        });
    }
}