package com.example.kidsquiz;


import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class fruit_vegetable_16 extends MainActivity {

    static int c=9;
    static int d=9;
    static int a = (int)((Math.random()*20));
    static int b = (int)((Math.random()*20));

    MediaPlayer mediaPlayer;
    Button vsound31;
    Button vsound32;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fruit_vegetable_16);

        vsound31 = (Button) findViewById(R.id.vsound31);
        vsound32 = (Button) findViewById(R.id.vsound32);

        vsound31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // MediaPlayer 객체 할당
                mediaPlayer = MediaPlayer.create(fruit_vegetable_16.this,R.raw.lettucee);
                mediaPlayer.start();
            }
        });

        vsound32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // MediaPlayer 객체 할당
                mediaPlayer = MediaPlayer.create(fruit_vegetable_16.this,R.raw.lettucek);
                mediaPlayer.start();
            }
        });

        if(lang==0) {

            while(a==c){
                a = (int)((Math.random()*20));
            }

            while(b==c||b==a){
                b = (int)((Math.random()*20));
            }

            TextView textview = (TextView) findViewById(R.id.lettuce);
            TextView textview1 = (TextView) findViewById(R.id.ans1);
            TextView textview2 = (TextView) findViewById(R.id.ans2);

            textview.setText(name_fruit[9]);
            textview1.setText(name_fruit[a]);
            textview2.setText(name_fruit[b]);
        }

        else if(lang==1) {

            while(a==d){
                a = (int)((Math.random()*20));
            }

            while(b==d||b==a){
                b = (int)((Math.random()*20));
            }

            TextView textview = (TextView) findViewById(R.id.lettuce);
            TextView textview1 = (TextView) findViewById(R.id.ans1);
            TextView textview2 = (TextView) findViewById(R.id.ans2);

            textview.setText(name_fruit[9]);
            textview1.setText(name_fruit[a]);
            textview2.setText(name_fruit[b]);
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
    public void lettuce(View v){
        Intent intent = new Intent(this, correct.class);
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
