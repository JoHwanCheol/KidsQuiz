package com.example.kidsquiz;


import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;


public class correct_ride extends MainActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_correct_ride);

        Handler timer = new Handler();

        if (count_r == 0) {
            timer.postDelayed(new Runnable() { //2초후 쓰레드를 생성하는 postDelayed 메소드
                public void run() {
                    //intent 생성
                    Intent intent = new Intent(correct_ride.this, ride_2.class);
                    startActivity(intent); //다음 액티비티 이동
                    finish(); // 이 액티비티를 종료
                    count_r++;
                }
            }, 2000); //2000은 2초를 의미한다.
        }

        if (count_r == 1) {
            timer.postDelayed(new Runnable() { //2초후 쓰레드를 생성하는 postDelayed 메소드
                public void run() {
                    //intent 생성
                    Intent intent = new Intent(correct_ride.this, ride_3.class);
                    startActivity(intent); //다음 액티비티 이동
                    finish(); // 이 액티비티를 종료
                    count_r++;
                }
            }, 2000); //2000은 2초를 의미한다.
        }

        if (count_r == 2) {
            timer.postDelayed(new Runnable() { //2초후 쓰레드를 생성하는 postDelayed 메소드
                public void run() {
                    //intent 생성
                    Intent intent = new Intent(correct_ride.this, ride_4.class);
                    startActivity(intent); //다음 액티비티 이동
                    finish(); // 이 액티비티를 종료
                    count_r++;
                }
            }, 2000); //2000은 2초를 의미한다.
        }

        if (count_r == 3) {
            timer.postDelayed(new Runnable() { //2초후 쓰레드를 생성하는 postDelayed 메소드
                public void run() {
                    //intent 생성
                    Intent intent = new Intent(correct_ride.this, ride_5.class);
                    startActivity(intent); //다음 액티비티 이동
                    finish(); // 이 액티비티를 종료
                    count_r++;
                }
            }, 2000); //2000은 2초를 의미한다.
        }

        if (count_r == 4) {
            timer.postDelayed(new Runnable() { //2초후 쓰레드를 생성하는 postDelayed 메소드
                public void run() {
                    //intent 생성
                    Intent intent = new Intent(correct_ride.this, ride_6.class);
                    startActivity(intent); //다음 액티비티 이동
                    finish(); // 이 액티비티를 종료
                    count_r++;
                }
            }, 2000); //2000은 2초를 의미한다.
        }

        if (count_r == 5) {
            timer.postDelayed(new Runnable() { //2초후 쓰레드를 생성하는 postDelayed 메소드
                public void run() {
                    //intent 생성
                    Intent intent = new Intent(correct_ride.this, ride_7.class);
                    startActivity(intent); //다음 액티비티 이동
                    finish(); // 이 액티비티를 종료
                    count_r++;
                }
            }, 2000); //2000은 2초를 의미한다.
        }

        if (count_r == 6) {
            timer.postDelayed(new Runnable() { //2초후 쓰레드를 생성하는 postDelayed 메소드
                public void run() {
                    //intent 생성
                    Intent intent = new Intent(correct_ride.this, ride_8.class);
                    startActivity(intent); //다음 액티비티 이동
                    finish(); // 이 액티비티를 종료
                    count_r++;
                }
            }, 2000); //2000은 2초를 의미한다.
        }

        if (count_r == 7) {
            timer.postDelayed(new Runnable() { //2초후 쓰레드를 생성하는 postDelayed 메소드
                public void run() {
                    //intent 생성
                    Intent intent = new Intent(correct_ride.this, ride_9.class);
                    startActivity(intent); //다음 액티비티 이동
                    finish(); // 이 액티비티를 종료
                    count_r++;
                }
            }, 2000); //2000은 2초를 의미한다.
        }

        if (count_r == 8) {
            timer.postDelayed(new Runnable() { //2초후 쓰레드를 생성하는 postDelayed 메소드
                public void run() {
                    //intent 생성
                    Intent intent = new Intent(correct_ride.this, ride_10.class);
                    startActivity(intent); //다음 액티비티 이동
                    finish(); // 이 액티비티를 종료
                    count_r++;
                }
            }, 2000); //2000은 2초를 의미한다.
        }

        if (count_r == 9) {
            timer.postDelayed(new Runnable() { //2초후 쓰레드를 생성하는 postDelayed 메소드
                public void run() {
                    //intent 생성
                    Intent intent = new Intent(correct_ride.this, scoreboard.class);
                    startActivity(intent); //다음 액티비티 이동
                    finish(); // 이 액티비티를 종료
                    count_r++;
                }
            }, 2000); //2000은 2초를 의미한다.
        }

        }
}
