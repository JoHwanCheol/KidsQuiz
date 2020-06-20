package com.example.kidsquiz;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class language extends MainActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.language);

    }

    public void korean_Button(View v){
        Intent korean = new Intent(this,contents_list.class);
        startActivity(korean);
    }

    public void English_Button(View v){
        Intent English = new Intent(this,contents_list_English.class);
        startActivity(English);
    }

    public void backButton(View v){
        Intent back = new Intent(this,MainActivity.class);
        startActivity(back);
    }

}
