package com.example.kidsquiz;


import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;


public class scoreboard extends MainActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scoreboard);

        TextView countView = (TextView) findViewById(R.id.correct_num);
        TextView countView2 = (TextView) findViewById(R.id.correct_num);
        TextView countView_num = (TextView) findViewById(R.id.count_try);
        TextView countView_num2 = (TextView) findViewById(R.id.count_try);

        if (count_a >= 10 || count >= 10) {
            countView2.setText(String.valueOf(20));
            countView_num2.setText(String.valueOf(try_count2));
            count_a = 0;
            count = 0;
        } else {
            countView.setText(String.valueOf(10));
            countView_num.setText(String.valueOf(try_count));

        }

    }

    public void back(View v){
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
