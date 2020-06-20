package com.example.kidsquiz;


import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;


public class correct_animal extends MainActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_correct);

        Handler timer = new Handler();

        if (count_a == 0) {
            timer.postDelayed(new Runnable() { //2초후 쓰레드를 생성하는 postDelayed 메소드
                public void run() {
                    //intent 생성
                    Intent intent = new Intent(correct_animal.this, animal_insect_2.class);
                    startActivity(intent); //다음 액티비티 이동
                    finish(); // 이 액티비티를 종료
                    count_a++;
                }
            }, 2000); //2000은 2초를 의미한다.
        }

        if (count_a == 1) {
            timer.postDelayed(new Runnable() { //2초후 쓰레드를 생성하는 postDelayed 메소드
                public void run() {
                    //intent 생성
                    Intent intent = new Intent(correct_animal.this, animal_insect_3.class);
                    startActivity(intent); //다음 액티비티 이동
                    finish(); // 이 액티비티를 종료
                    count_a++;
                }
            }, 2000); //2000은 2초를 의미한다.
        }
        if (count_a == 2) {
            timer.postDelayed(new Runnable() { //2초후 쓰레드를 생성하는 postDelayed 메소드
                public void run() {
                    //intent 생성
                    Intent intent = new Intent(correct_animal.this, animal_insect_4.class);
                    startActivity(intent); //다음 액티비티 이동
                    finish(); // 이 액티비티를 종료
                    count_a++;
                }
            }, 2000); //2000은 2초를 의미한다.
        }
        if (count_a == 3) {
            timer.postDelayed(new Runnable() { //2초후 쓰레드를 생성하는 postDelayed 메소드
                public void run() {
                    //intent 생성
                    Intent intent = new Intent(correct_animal.this, animal_insect_5.class);
                    startActivity(intent); //다음 액티비티 이동
                    finish(); // 이 액티비티를 종료
                    count_a++;
                }
            }, 2000); //2000은 2초를 의미한다.
        }
        if (count_a == 4) {
            timer.postDelayed(new Runnable() { //2초후 쓰레드를 생성하는 postDelayed 메소드
                public void run() {
                    //intent 생성
                    Intent intent = new Intent(correct_animal.this, animal_insect_6.class);
                    startActivity(intent); //다음 액티비티 이동
                    finish(); // 이 액티비티를 종료
                    count_a++;
                }
            }, 2000); //2000은 2초를 의미한다.
        }
        if (count_a == 5) {
            timer.postDelayed(new Runnable() { //2초후 쓰레드를 생성하는 postDelayed 메소드
                public void run() {
                    //intent 생성
                    Intent intent = new Intent(correct_animal.this, animal_insect_7.class);
                    startActivity(intent); //다음 액티비티 이동
                    finish(); // 이 액티비티를 종료
                    count_a++;
                }
            }, 2000); //2000은 2초를 의미한다.
        }
        if (count_a == 6) {
            timer.postDelayed(new Runnable() { //2초후 쓰레드를 생성하는 postDelayed 메소드
                public void run() {
                    //intent 생성
                    Intent intent = new Intent(correct_animal.this, animal_insect_8.class);
                    startActivity(intent); //다음 액티비티 이동
                    finish(); // 이 액티비티를 종료
                    count_a++;
                }
            }, 2000); //2000은 2초를 의미한다.
        }
        if (count_a == 7) {
            timer.postDelayed(new Runnable() { //2초후 쓰레드를 생성하는 postDelayed 메소드
                public void run() {
                    //intent 생성
                    Intent intent = new Intent(correct_animal.this, animal_insect_9.class);
                    startActivity(intent); //다음 액티비티 이동
                    finish(); // 이 액티비티를 종료
                    count_a++;
                }
            }, 2000); //2000은 2초를 의미한다.
        }
        if (count_a == 8) {
            timer.postDelayed(new Runnable() { //2초후 쓰레드를 생성하는 postDelayed 메소드
                public void run() {
                    //intent 생성
                    Intent intent = new Intent(correct_animal.this, animal_insect_10.class);
                    startActivity(intent); //다음 액티비티 이동
                    finish(); // 이 액티비티를 종료
                    count_a++;
                }
            }, 2000); //2000은 2초를 의미한다.
        }
        if (count_a == 9) {
            timer.postDelayed(new Runnable() { //2초후 쓰레드를 생성하는 postDelayed 메소드
                public void run() {
                    //intent 생성
                    Intent intent = new Intent(correct_animal.this, animal_insect_11.class);
                    startActivity(intent); //다음 액티비티 이동
                    finish(); // 이 액티비티를 종료
                    count_a++;
                }
            }, 2000); //2000은 2초를 의미한다.
        }
        if (count_a == 10) {
            timer.postDelayed(new Runnable() { //2초후 쓰레드를 생성하는 postDelayed 메소드
                public void run() {
                    //intent 생성
                    Intent intent = new Intent(correct_animal.this, animal_insect_12.class);
                    startActivity(intent); //다음 액티비티 이동
                    finish(); // 이 액티비티를 종료
                    count_a++;
                }
            }, 2000); //2000은 2초를 의미한다.
        }
        if (count_a == 11) {
            timer.postDelayed(new Runnable() { //2초후 쓰레드를 생성하는 postDelayed 메소드
                public void run() {
                    //intent 생성
                    Intent intent = new Intent(correct_animal.this, animal_insect_13.class);
                    startActivity(intent); //다음 액티비티 이동
                    finish(); // 이 액티비티를 종료
                    count_a++;
                }
            }, 2000); //2000은 2초를 의미한다.
        }
        if (count_a == 12) {
            timer.postDelayed(new Runnable() { //2초후 쓰레드를 생성하는 postDelayed 메소드
                public void run() {
                    //intent 생성
                    Intent intent = new Intent(correct_animal.this, animal_insect_14.class);
                    startActivity(intent); //다음 액티비티 이동
                    finish(); // 이 액티비티를 종료
                    count_a++;
                }
            }, 2000); //2000은 2초를 의미한다.
        }
        if (count_a == 13) {
            timer.postDelayed(new Runnable() { //2초후 쓰레드를 생성하는 postDelayed 메소드
                public void run() {
                    //intent 생성
                    Intent intent = new Intent(correct_animal.this, animal_insect_15.class);
                    startActivity(intent); //다음 액티비티 이동
                    finish(); // 이 액티비티를 종료
                    count_a++;
                }
            }, 2000); //2000은 2초를 의미한다.
        }
        if (count_a == 14) {
            timer.postDelayed(new Runnable() { //2초후 쓰레드를 생성하는 postDelayed 메소드
                public void run() {
                    //intent 생성
                    Intent intent = new Intent(correct_animal.this, animal_insect_16.class);
                    startActivity(intent); //다음 액티비티 이동
                    finish(); // 이 액티비티를 종료
                    count_a++;
                }
            }, 2000); //2000은 2초를 의미한다.
        }
        if (count_a == 15) {
            timer.postDelayed(new Runnable() { //2초후 쓰레드를 생성하는 postDelayed 메소드
                public void run() {
                    //intent 생성
                    Intent intent = new Intent(correct_animal.this, animal_insect_17.class);
                    startActivity(intent); //다음 액티비티 이동
                    finish(); // 이 액티비티를 종료
                    count_a++;
                }
            }, 2000); //2000은 2초를 의미한다.
        }
        if (count_a == 16) {
            timer.postDelayed(new Runnable() { //2초후 쓰레드를 생성하는 postDelayed 메소드
                public void run() {
                    //intent 생성
                    Intent intent = new Intent(correct_animal.this, animal_insect_18.class);
                    startActivity(intent); //다음 액티비티 이동
                    finish(); // 이 액티비티를 종료
                    count_a++;
                }
            }, 2000); //2000은 2초를 의미한다.
        }
        if (count_a == 17) {
            timer.postDelayed(new Runnable() { //2초후 쓰레드를 생성하는 postDelayed 메소드
                public void run() {
                    //intent 생성
                    Intent intent = new Intent(correct_animal.this, animal_insect_19.class);
                    startActivity(intent); //다음 액티비티 이동
                    finish(); // 이 액티비티를 종료
                    count_a++;
                }
            }, 2000); //2000은 2초를 의미한다.
        }
        if (count_a == 18) {
            timer.postDelayed(new Runnable() { //2초후 쓰레드를 생성하는 postDelayed 메소드
                public void run() {
                    //intent 생성
                    Intent intent = new Intent(correct_animal.this, animal_insect_20.class);
                    startActivity(intent); //다음 액티비티 이동
                    finish(); // 이 액티비티를 종료
                    count_a++;
                }
            }, 2000); //2000은 2초를 의미한다.
        }

        if (count_a == 19) {
            timer.postDelayed(new Runnable() { //2초후 쓰레드를 생성하는 postDelayed 메소드
                public void run() {
                    //intent 생성
                    Intent intent = new Intent(correct_animal.this, scoreboard.class);
                    startActivity(intent); //다음 액티비티 이동
                    finish(); // 이 액티비티를 종료
                    count_a++;
                }
            }, 2000); //2000은 2초를 의미한다.
        }


    }
}