package com.example.kidsquiz;


import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;


public class correct_dino extends MainActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_correct_dino);

        Handler timer = new Handler();

        if (count_d == 0) {
            timer.postDelayed(new Runnable() { //2초후 쓰레드를 생성하는 postDelayed 메소드
                public void run() {
                    //intent 생성
                    Intent intent = new Intent(correct_dino.this, dino_2.class);
                    startActivity(intent); //다음 액티비티 이동
                    finish(); // 이 액티비티를 종료
                    count_d++;
                }
            }, 2000); //2000은 2초를 의미한다.
        }

        if (count_d == 1) {
            timer.postDelayed(new Runnable() { //2초후 쓰레드를 생성하는 postDelayed 메소드
                public void run() {
                    //intent 생성
                    Intent intent = new Intent(correct_dino.this, dino_3.class);
                    startActivity(intent); //다음 액티비티 이동
                    finish(); // 이 액티비티를 종료
                    count_d++;
                }
            }, 2000); //2000은 2초를 의미한다.
        }

        if (count_d == 2) {
            timer.postDelayed(new Runnable() { //2초후 쓰레드를 생성하는 postDelayed 메소드
                public void run() {
                    //intent 생성
                    Intent intent = new Intent(correct_dino.this, dino_4.class);
                    startActivity(intent); //다음 액티비티 이동
                    finish(); // 이 액티비티를 종료
                    count_d++;
                }
            }, 2000); //2000은 2초를 의미한다.
        }

        if (count_d == 3) {
            timer.postDelayed(new Runnable() { //2초후 쓰레드를 생성하는 postDelayed 메소드
                public void run() {
                    //intent 생성
                    Intent intent = new Intent(correct_dino.this, dino_5.class);
                    startActivity(intent); //다음 액티비티 이동
                    finish(); // 이 액티비티를 종료
                    count_d++;
                }
            }, 2000); //2000은 2초를 의미한다.
        }

        if (count_d == 4) {
            timer.postDelayed(new Runnable() { //2초후 쓰레드를 생성하는 postDelayed 메소드
                public void run() {
                    //intent 생성
                    Intent intent = new Intent(correct_dino.this, dino_6.class);
                    startActivity(intent); //다음 액티비티 이동
                    finish(); // 이 액티비티를 종료
                    count_d++;
                }
            }, 2000); //2000은 2초를 의미한다.
        }

        if (count_d == 5) {
            timer.postDelayed(new Runnable() { //2초후 쓰레드를 생성하는 postDelayed 메소드
                public void run() {
                    //intent 생성
                    Intent intent = new Intent(correct_dino.this, dino_7.class);
                    startActivity(intent); //다음 액티비티 이동
                    finish(); // 이 액티비티를 종료
                    count_d++;
                }
            }, 2000); //2000은 2초를 의미한다.
        }

        if (count_d == 6) {
            timer.postDelayed(new Runnable() { //2초후 쓰레드를 생성하는 postDelayed 메소드
                public void run() {
                    //intent 생성
                    Intent intent = new Intent(correct_dino.this, dino_8.class);
                    startActivity(intent); //다음 액티비티 이동
                    finish(); // 이 액티비티를 종료
                    count_d++;
                }
            }, 2000); //2000은 2초를 의미한다.
        }

        if (count_d == 7) {
            timer.postDelayed(new Runnable() { //2초후 쓰레드를 생성하는 postDelayed 메소드
                public void run() {
                    //intent 생성
                    Intent intent = new Intent(correct_dino.this, dino_9.class);
                    startActivity(intent); //다음 액티비티 이동
                    finish(); // 이 액티비티를 종료
                    count_d++;
                }
            }, 2000); //2000은 2초를 의미한다.
        }

        if (count_d == 8) {
            timer.postDelayed(new Runnable() { //2초후 쓰레드를 생성하는 postDelayed 메소드
                public void run() {
                    //intent 생성
                    Intent intent = new Intent(correct_dino.this, dino_10.class);
                    startActivity(intent); //다음 액티비티 이동
                    finish(); // 이 액티비티를 종료
                    count_d++;
                }
            }, 2000); //2000은 2초를 의미한다.
        }

        if (count_d == 9) {
            timer.postDelayed(new Runnable() { //2초후 쓰레드를 생성하는 postDelayed 메소드
                public void run() {
                    //intent 생성
                    Intent intent = new Intent(correct_dino.this, scoreboard.class);
                    startActivity(intent); //다음 액티비티 이동
                    finish(); // 이 액티비티를 종료
                    count_d++;
                }
            }, 2000); //2000은 2초를 의미한다.
        }

    }
}
