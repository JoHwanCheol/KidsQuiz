package com.example.kidsquiz;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import androidx.annotation.NonNull;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.QueryDocumentSnapshot;
import com.google.firebase.firestore.QuerySnapshot;


public class contents_list extends MainActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.contents_list);
        fruit_vegetable();
        animal_insect();
        ride();
        food();
        dino();
        place();
        lang=0;
        try_count=10;
        try_count2=20;

    }

    public void fruit_veget_Button(View V){
        Intent fruitveget = new Intent(this,fruit_vegetable.class);
        startActivity(fruitveget);
    }

    public void animal_Button(View V){
        Intent animalinsect = new Intent(this,animal_insect.class);
        startActivity(animalinsect);
    }

    public void ride_Button(View V){
        Intent ride = new Intent(this,ride.class);
        startActivity(ride);
    }

    public void food_Button(View V){
        Intent food = new Intent(this,food.class);
        startActivity(food);
    }

    public void dino_Button(View V){
        Intent dino = new Intent(this,dino.class);
        startActivity(dino);
    }

    public void place_Button(View V){
        Intent place = new Intent(this,place.class);
        startActivity(place);
    }

    public void backButton(View v){
            Intent backButton = new Intent(this, language.class);
            startActivity(backButton);
    }

    public void fruit_vegetable(){
            FirebaseFirestore db = FirebaseFirestore.getInstance();
            db.collection("한국어").document("과일채소").collection("종류")
                    .whereEqualTo("type", "과일채소")
                    .get()
                    .addOnCompleteListener(new OnCompleteListener<QuerySnapshot>() {
                        @Override
                        public void onComplete(@NonNull Task<QuerySnapshot> task) {
                            if (task.isSuccessful()) {
                                i=0;
                                for (QueryDocumentSnapshot document : task.getResult()) {
                                    Log.d(TAG, document.getId() + " => " + document.getData());
                                    name_fruit[i] = (String) document.getData().get("name");
                                    i++;
                                }
                            } else {
                                Log.d(TAG, "Error getting documents: ", task.getException());
                            }
                        }
                    });
    }

    public void animal_insect(){
        FirebaseFirestore db = FirebaseFirestore.getInstance();
        db.collection("한국어").document("동물곤충").collection("종류")
                .whereEqualTo("type", "동물곤충")
                .get()
                .addOnCompleteListener(new OnCompleteListener<QuerySnapshot>() {
                    @Override
                    public void onComplete(@NonNull Task<QuerySnapshot> task) {
                        if (task.isSuccessful()) {
                            i=0;
                            for (QueryDocumentSnapshot document : task.getResult()) {
                                Log.d(TAG, document.getId() + " => " + document.getData());
                                name_animal[i] = (String) document.getData().get("name");
                                i++;
                            }
                        } else {
                            Log.d(TAG, "Error getting documents: ", task.getException());
                        }
                    }
                });
    }

    public void ride(){
        FirebaseFirestore db = FirebaseFirestore.getInstance();
        db.collection("한국어").document("탈것").collection("종류")
                .whereEqualTo("type", "탈것")
                .get()
                .addOnCompleteListener(new OnCompleteListener<QuerySnapshot>() {
                    @Override
                    public void onComplete(@NonNull Task<QuerySnapshot> task) {
                        if (task.isSuccessful()) {
                            i=0;
                            for (QueryDocumentSnapshot document : task.getResult()) {
                                Log.d(TAG, document.getId() + " => " + document.getData());
                                name_ride[i] = (String) document.getData().get("name");
                                i++;
                            }
                        } else {
                            Log.d(TAG, "Error getting documents: ", task.getException());
                        }
                    }
                });
    }

    public void food(){
        FirebaseFirestore db = FirebaseFirestore.getInstance();
        db.collection("한국어").document("음식").collection("종류")
                .whereEqualTo("type", "음식")
                .get()
                .addOnCompleteListener(new OnCompleteListener<QuerySnapshot>() {
                    @Override
                    public void onComplete(@NonNull Task<QuerySnapshot> task) {
                        if (task.isSuccessful()) {
                            i=0;
                            for (QueryDocumentSnapshot document : task.getResult()) {
                                Log.d(TAG, document.getId() + " => " + document.getData());
                                name_food[i] = (String) document.getData().get("name");
                                i++;
                            }
                        } else {
                            Log.d(TAG, "Error getting documents: ", task.getException());
                        }
                    }
                });
    }

    public void dino(){
        FirebaseFirestore db = FirebaseFirestore.getInstance();
        db.collection("한국어").document("공룡").collection("종류")
                .whereEqualTo("type", "공룡")
                .get()
                .addOnCompleteListener(new OnCompleteListener<QuerySnapshot>() {
                    @Override
                    public void onComplete(@NonNull Task<QuerySnapshot> task) {
                        if (task.isSuccessful()) {
                            i=0;
                            for (QueryDocumentSnapshot document : task.getResult()) {
                                Log.d(TAG, document.getId() + " => " + document.getData());
                                name_dino[i] = (String) document.getData().get("name");
                                i++;
                            }
                        } else {
                            Log.d(TAG, "Error getting documents: ", task.getException());
                        }
                    }
                });
    }

    public void place(){
        FirebaseFirestore db = FirebaseFirestore.getInstance();
        db.collection("한국어").document("장소").collection("종류")
                .whereEqualTo("type", "장소")
                .get()
                .addOnCompleteListener(new OnCompleteListener<QuerySnapshot>() {
                    @Override
                    public void onComplete(@NonNull Task<QuerySnapshot> task) {
                        if (task.isSuccessful()) {
                            i=0;
                            for (QueryDocumentSnapshot document : task.getResult()) {
                                Log.d(TAG, document.getId() + " => " + document.getData());
                                name_place[i] = (String) document.getData().get("name");
                                i++;
                            }
                        } else {
                            Log.d(TAG, "Error getting documents: ", task.getException());
                        }
                    }
                });
    }
}
