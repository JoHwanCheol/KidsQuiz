package com.example.kidsquiz;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class dino extends MainActivity {

    static int c=5;
    static int d=0;
    static int a = (int)((Math.random()*10));
    static int b = (int)((Math.random()*10));

    MediaPlayer mediaPlayer;
    Button dsound1;
    Button dsound2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dino);

        dsound1 = (Button) findViewById(R.id.dsound1);
        dsound2 = (Button) findViewById(R.id.dsound2);

        dsound1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // MediaPlayer 객체 할당
                mediaPlayer = MediaPlayer.create(dino.this,R.raw.ankylosauruse);
                mediaPlayer.start();
            }
        });

        dsound2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // MediaPlayer 객체 할당
                mediaPlayer = MediaPlayer.create(dino.this,R.raw.ankylosaurusk);
                mediaPlayer.start();
            }
        });

        if(lang==0) {

            while(a==c){
                a = (int)((Math.random()*10));
            }

            while(b==c||b==a){
                b = (int)((Math.random()*10));
            }

            TextView textview = (TextView) findViewById(R.id.ans);
            TextView textview1 = (TextView) findViewById(R.id.ans1);
            TextView textview2 = (TextView) findViewById(R.id.ans2);

            textview.setText(name_dino[5]);
            textview1.setText(name_dino[a]);
            textview2.setText(name_dino[b]);
        }

        else if(lang==1) {

            while(a==d){
                a = (int)((Math.random()*10));
            }

            while(b==d||b==a){
                b = (int)((Math.random()*10));
            }

            TextView textview = (TextView) findViewById(R.id.ans);
            TextView textview1 = (TextView) findViewById(R.id.ans1);
            TextView textview2 = (TextView) findViewById(R.id.ans2);

            textview.setText(name_dino[0]);
            textview1.setText(name_dino[a]);
            textview2.setText(name_dino[b]);
        }
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        // MediaPlayer 해지
        if(mediaPlayer != null) {
            mediaPlayer.release();
            mediaPlayer = null;
        }
    }

    public void ankylosaurus(View v){
        Intent intent = new Intent(this, correct_dino.class);
        startActivity(intent);
    }

    public void ans1(View v){
        Intent intent1 = new Intent(this,wrong.class);
        startActivity(intent1);
    }

    public void ans2(View v){
        Intent intent2 = new Intent(this,wrong.class);
        startActivity(intent2);
    }
    public void backButton(View v){
        if(lang==0) {
            Intent backButton = new Intent(this, contents_list.class);
            startActivity(backButton);
        }

        if(lang==1){
            Intent backButton = new Intent(this, contents_list_English.class);
            startActivity(backButton);
        }
    }
}
