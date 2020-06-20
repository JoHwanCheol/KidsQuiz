package com.example.kidsquiz;


import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;


public class correct extends MainActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_correct);

        Handler timer = new Handler();

        if (count == 0) {
            timer.postDelayed(new Runnable() { //2초후 쓰레드를 생성하는 postDelayed 메소드
                public void run() {
                    //intent 생성
                    Intent intent = new Intent(correct.this, fruit_vegetable_2.class);
                    startActivity(intent); //다음 액티비티 이동
                    finish(); // 이 액티비티를 종료
                    count++;
                }
            }, 2000); //2000은 2초를 의미한다.
        }

    if (count == 1) {
        timer.postDelayed(new Runnable() { //2초후 쓰레드를 생성하는 postDelayed 메소드
            public void run() {
                //intent 생성
                Intent intent = new Intent(correct.this, fruit_vegetable_3.class);
                startActivity(intent); //다음 액티비티 이동
                finish(); // 이 액티비티를 종료
                count++;
            }
        }, 2000); //2000은 2초를 의미한다.
    }

        if (count == 2) {
            timer.postDelayed(new Runnable() { //2초후 쓰레드를 생성하는 postDelayed 메소드
                public void run() {
                    //intent 생성
                    Intent intent = new Intent(correct.this, fruit_vegetable_4.class);
                    startActivity(intent); //다음 액티비티 이동
                    finish(); // 이 액티비티를 종료
                    count++;
                }
            }, 2000); //2000은 2초를 의미한다.
        }

        if (count == 3) {
            timer.postDelayed(new Runnable() { //2초후 쓰레드를 생성하는 postDelayed 메소드
                public void run() {
                    //intent 생성
                    Intent intent = new Intent(correct.this, fruit_vegetable_5.class);
                    startActivity(intent); //다음 액티비티 이동
                    finish(); // 이 액티비티를 종료
                    count++;
                }
            }, 2000); //2000은 2초를 의미한다.
        }

        if (count == 4) {
            timer.postDelayed(new Runnable() { //2초후 쓰레드를 생성하는 postDelayed 메소드
                public void run() {
                    //intent 생성
                    Intent intent = new Intent(correct.this, fruit_vegetable_6.class);
                    startActivity(intent); //다음 액티비티 이동
                    finish(); // 이 액티비티를 종료
                    count++;
                }
            }, 2000); //2000은 2초를 의미한다.
        }

        if (count == 5) {
            timer.postDelayed(new Runnable() { //2초후 쓰레드를 생성하는 postDelayed 메소드
                public void run() {
                    //intent 생성
                    Intent intent = new Intent(correct.this, fruit_vegetable_7.class);
                    startActivity(intent); //다음 액티비티 이동
                    finish(); // 이 액티비티를 종료
                    count++;
                }
            }, 2000); //2000은 2초를 의미한다.
        }

        if (count == 6) {
            timer.postDelayed(new Runnable() { //2초후 쓰레드를 생성하는 postDelayed 메소드
                public void run() {
                    //intent 생성
                    Intent intent = new Intent(correct.this, fruit_vegetable_8.class);
                    startActivity(intent); //다음 액티비티 이동
                    finish(); // 이 액티비티를 종료
                    count++;
                }
            }, 2000); //2000은 2초를 의미한다.
        }

        if (count == 7) {
            timer.postDelayed(new Runnable() { //2초후 쓰레드를 생성하는 postDelayed 메소드
                public void run() {
                    //intent 생성
                    Intent intent = new Intent(correct.this, fruit_vegetable_9.class);
                    startActivity(intent); //다음 액티비티 이동
                    finish(); // 이 액티비티를 종료
                    count++;
                }
            }, 2000); //2000은 2초를 의미한다.
        }

        if (count == 8) {
            timer.postDelayed(new Runnable() { //2초후 쓰레드를 생성하는 postDelayed 메소드
                public void run() {
                    //intent 생성
                    Intent intent = new Intent(correct.this, fruit_vegetable_10.class);
                    startActivity(intent); //다음 액티비티 이동
                    finish(); // 이 액티비티를 종료
                    count++;
                }
            }, 2000); //2000은 2초를 의미한다.
        }

        if (count == 9) {
            timer.postDelayed(new Runnable() { //2초후 쓰레드를 생성하는 postDelayed 메소드
                public void run() {
                    //intent 생성
                    Intent intent = new Intent(correct.this, fruit_vegetable_11.class);
                    startActivity(intent); //다음 액티비티 이동
                    finish(); // 이 액티비티를 종료
                    count++;
                }
            }, 2000); //2000은 2초를 의미한다.
        }

        if (count == 10) {
            timer.postDelayed(new Runnable() { //2초후 쓰레드를 생성하는 postDelayed 메소드
                public void run() {
                    //intent 생성
                    Intent intent = new Intent(correct.this, fruit_vegetable_12.class);
                    startActivity(intent); //다음 액티비티 이동
                    finish(); // 이 액티비티를 종료
                    count++;
                }
            }, 2000); //2000은 2초를 의미한다.
        }
        if (count == 11) {
            timer.postDelayed(new Runnable() { //2초후 쓰레드를 생성하는 postDelayed 메소드
                public void run() {
                    //intent 생성
                    Intent intent = new Intent(correct.this, fruit_vegetable_13.class);
                    startActivity(intent); //다음 액티비티 이동
                    finish(); // 이 액티비티를 종료
                    count++;
                }
            }, 2000); //2000은 2초를 의미한다.
        }
        if (count == 12) {
            timer.postDelayed(new Runnable() { //2초후 쓰레드를 생성하는 postDelayed 메소드
                public void run() {
                    //intent 생성
                    Intent intent = new Intent(correct.this, fruit_vegetable_14.class);
                    startActivity(intent); //다음 액티비티 이동
                    finish(); // 이 액티비티를 종료
                    count++;
                }
            }, 2000); //2000은 2초를 의미한다.
        }
        if (count == 13) {
            timer.postDelayed(new Runnable() { //2초후 쓰레드를 생성하는 postDelayed 메소드
                public void run() {
                    //intent 생성
                    Intent intent = new Intent(correct.this, fruit_vegetable_15.class);
                    startActivity(intent); //다음 액티비티 이동
                    finish(); // 이 액티비티를 종료
                    count++;
                }
            }, 2000); //2000은 2초를 의미한다.
        }
        if (count == 14) {
            timer.postDelayed(new Runnable() { //2초후 쓰레드를 생성하는 postDelayed 메소드
                public void run() {
                    //intent 생성
                    Intent intent = new Intent(correct.this, fruit_vegetable_16.class);
                    startActivity(intent); //다음 액티비티 이동
                    finish(); // 이 액티비티를 종료
                    count++;
                }
            }, 2000); //2000은 2초를 의미한다.
        }
        if (count == 15) {
            timer.postDelayed(new Runnable() { //2초후 쓰레드를 생성하는 postDelayed 메소드
                public void run() {
                    //intent 생성
                    Intent intent = new Intent(correct.this, fruit_vegetable_17.class);
                    startActivity(intent); //다음 액티비티 이동
                    finish(); // 이 액티비티를 종료
                    count++;
                }
            }, 2000); //2000은 2초를 의미한다.
        }
        if (count == 16) {
            timer.postDelayed(new Runnable() { //2초후 쓰레드를 생성하는 postDelayed 메소드
                public void run() {
                    //intent 생성
                    Intent intent = new Intent(correct.this, fruit_vegetable_18.class);
                    startActivity(intent); //다음 액티비티 이동
                    finish(); // 이 액티비티를 종료
                    count++;
                }
            }, 2000); //2000은 2초를 의미한다.
        }
        if (count == 17) {
            timer.postDelayed(new Runnable() { //2초후 쓰레드를 생성하는 postDelayed 메소드
                public void run() {
                    //intent 생성
                    Intent intent = new Intent(correct.this, fruit_vegetable_19.class);
                    startActivity(intent); //다음 액티비티 이동
                    finish(); // 이 액티비티를 종료
                    count++;
                }
            }, 2000); //2000은 2초를 의미한다.
        }
        if (count == 18) {
            timer.postDelayed(new Runnable() { //2초후 쓰레드를 생성하는 postDelayed 메소드
                public void run() {
                    //intent 생성
                    Intent intent = new Intent(correct.this, fruit_vegetable_20.class);
                    startActivity(intent); //다음 액티비티 이동
                    finish(); // 이 액티비티를 종료
                    count++;
                }
            }, 2000); //2000은 2초를 의미한다.
        }

        if (count == 19) {
            timer.postDelayed(new Runnable() { //2초후 쓰레드를 생성하는 postDelayed 메소드
                public void run() {
                    //intent 생성
                    Intent intent = new Intent(correct.this, scoreboard.class);
                    startActivity(intent); //다음 액티비티 이동
                    finish(); // 이 액티비티를 종료
                    count++;
                }
            }, 2000); //2000은 2초를 의미한다.
        }
    }
}