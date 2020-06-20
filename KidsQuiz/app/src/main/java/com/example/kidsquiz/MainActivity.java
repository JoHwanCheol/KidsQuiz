package com.example.kidsquiz;


import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;


public class MainActivity extends AppCompatActivity {

    public static final String TAG = "MainActivity";
    public static String name_fruit[] = new String[100];
    public static String name_animal[] = new String[100];
    public static String name_ride[] = new String[100];
    public static String name_food[] = new String[100];
    public static String name_dino[] = new String[100];
    public static String name_place[] = new String[100];
    public static String type[] = new String[100];
    static int i = 0;   //데이터베이스에서 배열을 저장할 인덱스 값 [i]
    static int count = 0;   //과일채소 문제의 count
    static int count_a = 0; //동물곤충 문제의 count
    static int count_r = 0; //탈것 문제의 count
    static int count_f = 0; //음식 문제의 count
    static int count_d = 0; //공룡 문제의 count
    static int count_p = 0; //장소 문제의 count
    static int lang = 0;    //0일때 한국어, 1일때 영어
    static int try_count = 10;     // 문제 처음 갯수
    static int try_count2 = 20;    // 문제 처음 갯수2

    EditText mEmailText, mPasswordText;
    private FirebaseAuth firebaseAuth;
    private FirebaseAuth.AuthStateListener firebaseAuthListener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        firebaseAuth =  FirebaseAuth.getInstance();
        mEmailText = (EditText)findViewById(R.id.main_email);
        mPasswordText = (EditText)findViewById(R.id.main_password);
    }

    public void loginButton(View v){
        String email = mEmailText.getText().toString().trim();
        String pwd = mPasswordText.getText().toString().trim();
        firebaseAuth.signInWithEmailAndPassword(email,pwd)
                .addOnCompleteListener(MainActivity.this, new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if(task.isSuccessful()){
                            Toast.makeText(MainActivity.this,"로그인 성공",Toast.LENGTH_SHORT).show();

                            Intent login = new Intent(MainActivity.this, language.class);
                            startActivity(login);

                        }else{
                            Toast.makeText(MainActivity.this,"로그인 오류",Toast.LENGTH_SHORT).show();
                        }
                    }
                });
    }

    public void signupButton(View V){
        Intent signupbutton = new Intent(this,signup.class);
        startActivity(signupbutton);
    }
}