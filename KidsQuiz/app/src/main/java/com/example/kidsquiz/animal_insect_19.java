package com.example.kidsquiz;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;



public class animal_insect_19 extends MainActivity {

    static int c=10;
    static int d=15;
    static int a = (int)((Math.random()*20));
    static int b = (int)((Math.random()*20));

    MediaPlayer mediaPlayer;
    Button sound37;
    Button sound38;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animal_insect_19);

        sound37 = (Button) findViewById(R.id.sound37);
        sound38 = (Button) findViewById(R.id.sound38);

        sound37.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // MediaPlayer 객체 할당
                mediaPlayer = MediaPlayer.create(animal_insect_19.this,R.raw.mosquitoe);
                mediaPlayer.start();
            }
        });

        sound38.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // MediaPlayer 객체 할당
                mediaPlayer = MediaPlayer.create(animal_insect_19.this,R.raw.mosquitok);
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

            TextView textview = (TextView) findViewById(R.id.mosquito);
            TextView textview1 = (TextView) findViewById(R.id.ans1);
            TextView textview2 = (TextView) findViewById(R.id.ans2);

            textview.setText(name_animal[10]);
            textview1.setText(name_animal[a]);
            textview2.setText(name_animal[b]);
        }

        else if(lang==1) {

            while(a==d){
                a = (int)((Math.random()*20));
            }

            while(b==d||b==a){
                b = (int)((Math.random()*20));
            }

            TextView textview = (TextView) findViewById(R.id.mosquito);
            TextView textview1 = (TextView) findViewById(R.id.ans1);
            TextView textview2 = (TextView) findViewById(R.id.ans2);

            textview.setText(name_animal[15]);
            textview1.setText(name_animal[a]);
            textview2.setText(name_animal[b]);
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

    public void mosquito(View v){
        Intent intent = new Intent(this, correct_animal.class);
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
