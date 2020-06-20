package com.example.kidsquiz;


import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;


public class correct_food extends MainActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_correct_food);

        Handler timer = new Handler();

        if (count_f == 0) {
            timer.postDelayed(new Runnable() { //2초후 쓰레드를 생성하는 postDelayed 메소드
                public void run() {
                    //intent 생성
                    Intent intent = new Intent(correct_food.this, food_2.class);
                    startActivity(intent); //다음 액티비티 이동
                    finish(); // 이 액티비티를 종료
                    count_f++;
                }
            }, 2000); //2000은 2초를 의미한다.
        }

        if (count_f == 1) {
            timer.postDelayed(new Runnable() { //2초후 쓰레드를 생성하는 postDelayed 메소드
                public void run() {
                    //intent 생성
                    Intent intent = new Intent(correct_food.this, food_3.class);
                    startActivity(intent); //다음 액티비티 이동
                    finish(); // 이 액티비티를 종료
                    count_f++;
                }
            }, 2000); //2000은 2초를 의미한다.
        }

        if (count_f == 2) {
            timer.postDelayed(new Runnable() { //2초후 쓰레드를 생성하는 postDelayed 메소드
                public void run() {
                    //intent 생성
                    Intent intent = new Intent(correct_food.this, food_4.class);
                    startActivity(intent); //다음 액티비티 이동
                    finish(); // 이 액티비티를 종료
                    count_f++;
                }
            }, 2000); //2000은 2초를 의미한다.
        }

        if (count_f == 3) {
            timer.postDelayed(new Runnable() { //2초후 쓰레드를 생성하는 postDelayed 메소드
                public void run() {
                    //intent 생성
                    Intent intent = new Intent(correct_food.this, food_5.class);
                    startActivity(intent); //다음 액티비티 이동
                    finish(); // 이 액티비티를 종료
                    count_f++;
                }
            }, 2000); //2000은 2초를 의미한다.
        }

        if (count_f == 4) {
            timer.postDelayed(new Runnable() { //2초후 쓰레드를 생성하는 postDelayed 메소드
                public void run() {
                    //intent 생성
                    Intent intent = new Intent(correct_food.this, food_6.class);
                    startActivity(intent); //다음 액티비티 이동
                    finish(); // 이 액티비티를 종료
                    count_f++;
                }
            }, 2000); //2000은 2초를 의미한다.
        }

        if (count_f == 5) {
            timer.postDelayed(new Runnable() { //2초후 쓰레드를 생성하는 postDelayed 메소드
                public void run() {
                    //intent 생성
                    Intent intent = new Intent(correct_food.this, food_7.class);
                    startActivity(intent); //다음 액티비티 이동
                    finish(); // 이 액티비티를 종료
                    count_f++;
                }
            }, 2000); //2000은 2초를 의미한다.
        }

        if (count_f == 6) {
            timer.postDelayed(new Runnable() { //2초후 쓰레드를 생성하는 postDelayed 메소드
                public void run() {
                    //intent 생성
                    Intent intent = new Intent(correct_food.this, food_8.class);
                    startActivity(intent); //다음 액티비티 이동
                    finish(); // 이 액티비티를 종료
                    count_f++;
                }
            }, 2000); //2000은 2초를 의미한다.
        }

        if (count_f == 7) {
            timer.postDelayed(new Runnable() { //2초후 쓰레드를 생성하는 postDelayed 메소드
                public void run() {
                    //intent 생성
                    Intent intent = new Intent(correct_food.this, food_9.class);
                    startActivity(intent); //다음 액티비티 이동
                    finish(); // 이 액티비티를 종료
                    count_f++;
                }
            }, 2000); //2000은 2초를 의미한다.
        }

        if (count_f == 8) {
            timer.postDelayed(new Runnable() { //2초후 쓰레드를 생성하는 postDelayed 메소드
                public void run() {
                    //intent 생성
                    Intent intent = new Intent(correct_food.this, food_10.class);
                    startActivity(intent); //다음 액티비티 이동
                    finish(); // 이 액티비티를 종료
                    count_f++;
                }
            }, 2000); //2000은 2초를 의미한다.
        }

        if (count_f == 9) {
            timer.postDelayed(new Runnable() { //2초후 쓰레드를 생성하는 postDelayed 메소드
                public void run() {
                    //intent 생성
                    Intent intent = new Intent(correct_food.this, scoreboard.class);
                    startActivity(intent); //다음 액티비티 이동
                    finish(); // 이 액티비티를 종료
                    count_f++;
                }
            }, 2000); //2000은 2초를 의미한다.
        }

    }
}
