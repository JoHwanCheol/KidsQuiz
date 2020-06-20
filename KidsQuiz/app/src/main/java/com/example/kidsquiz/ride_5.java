package com.example.kidsquiz;


import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ride_5 extends MainActivity {

    static int c=0;
    static int d=4;
    static int a = (int)((Math.random()*10));
    static int b = (int)((Math.random()*10));

    MediaPlayer mediaPlayer;
    Button rsound9;
    Button rsound10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ride_5);

        rsound9 = (Button) findViewById(R.id.rsound9);
        rsound10 = (Button) findViewById(R.id.rsound10);

        rsound9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // MediaPlayer 객체 할당
                mediaPlayer = MediaPlayer.create(ride_5.this,R.raw.horsee);
                mediaPlayer.start();
            }
        });

        rsound10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // MediaPlayer 객체 할당
                mediaPlayer = MediaPlayer.create(ride_5.this,R.raw.horsek);
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

            textview.setText(name_ride[0]);
            textview1.setText(name_ride[a]);
            textview2.setText(name_ride[b]);
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

            textview.setText(name_ride[4]);
            textview1.setText(name_ride[a]);
            textview2.setText(name_ride[b]);
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
    public void horse(View v){
        Intent intent = new Intent(this, correct_ride.class);
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
