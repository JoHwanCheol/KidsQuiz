package com.example.kidsquiz;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class food_2 extends MainActivity {

    static int c=3;
    static int d=1;
    static int a = (int)((Math.random()*10));
    static int b = (int)((Math.random()*10));

    MediaPlayer mediaPlayer;
    Button fsound3;
    Button fsound4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food_2);

        fsound3 = (Button) findViewById(R.id.fsound3);
        fsound4 = (Button) findViewById(R.id.fsound4);

        fsound3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // MediaPlayer 객체 할당
                mediaPlayer = MediaPlayer.create(food_2.this,R.raw.candye);
                mediaPlayer.start();
            }
        });

        fsound4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // MediaPlayer 객체 할당
                mediaPlayer = MediaPlayer.create(food_2.this,R.raw.candyk);
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

            textview.setText(name_food[3]);
            textview1.setText(name_food[a]);
            textview2.setText(name_food[b]);
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

            textview.setText(name_food[1]);
            textview1.setText(name_food[a]);
            textview2.setText(name_food[b]);
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
    public void candy(View v){
        Intent intent = new Intent(this, correct_food.class);
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