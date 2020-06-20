package com.example.kidsquiz;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.HashMap;

public class signup extends AppCompatActivity {

    private static final String TAG = "signupActivity";
    private FirebaseAuth firebaseAuth;

    private EditText editTextEmail;
    private EditText editTextPassword;
    private EditText editTextName;
    private EditText editTextTel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);


        //파이어베이스 접근 설정
        firebaseAuth =  FirebaseAuth.getInstance();
        editTextEmail = (EditText)findViewById(R.id.et_email);
        editTextPassword = (EditText)findViewById(R.id.et_password);
        editTextName = (EditText)findViewById(R.id.et_name);
        editTextTel = (EditText)findViewById(R.id.et_tel);

    }

    public void createUser(View V) {
        String email = editTextEmail.getText().toString().trim();
        String pwd = editTextPassword.getText().toString().trim();

        final ProgressDialog mDialog = new ProgressDialog(signup.this);

        if (!editTextEmail.getText().toString().equals("") && !editTextPassword.getText().toString().equals("")) {
            // 이메일과 비밀번호가 공백이 아닌 경우

            mDialog.setMessage("가입중입니다...");
            mDialog.show();
        } else {
            // 이메일과 비밀번호가 공백인 경우
            Toast.makeText(signup.this, "계정과 비밀번호를 입력하세요.", Toast.LENGTH_LONG).show();
        }

        firebaseAuth.createUserWithEmailAndPassword(email, pwd)
                .addOnCompleteListener(signup.this, new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if (task.isSuccessful()) {
                            mDialog.dismiss();
                            Toast.makeText(signup.this, "회원가입 성공", Toast.LENGTH_SHORT).show();
                            // 회원가입 성공시
                            Intent intent = new Intent(signup.this, MainActivity.class);
                            startActivity(intent);
                            finish();
                        } else {
                            mDialog.dismiss();
                            // 계정이 중복된 경우
                            Toast.makeText(signup.this, "이미 존재하는 계정입니다.", Toast.LENGTH_SHORT).show();
                        }
                    }
                });
    }
}