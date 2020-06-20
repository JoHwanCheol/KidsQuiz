package com.example.kidsquiz;


import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;


public class wrong extends MainActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wrong);

        try_count++;
        try_count2++;
        Handler timer = new Handler();

            timer.postDelayed(new Runnable() { //2초후 쓰레드를 생성하는 postDelayed 메소드
                public void run() {
                    //intent 생성//다음 액티비티 이동
                    finish(); // 이 액티비티를 종료
                }
            }, 1000); //1000은 1초를 의미한다.

    }
}