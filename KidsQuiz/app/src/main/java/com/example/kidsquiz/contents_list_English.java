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


public class contents_list_English extends MainActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contents_list__english);
        e_fruit_vegetable();
        e_animal_insect();
        e_ride();
        e_food();
        e_dino();
        e_place();
        lang=1;
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

    public void e_fruit_vegetable(){
        FirebaseFirestore db = FirebaseFirestore.getInstance();
        db.collection("English").document("fruit_vegetable").collection("kinds")
                .whereEqualTo("type", "fruit_vegetable")
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

    public void e_animal_insect(){
        FirebaseFirestore db = FirebaseFirestore.getInstance();
        db.collection("English").document("animal_insect").collection("kind")
                .whereEqualTo("type", "animal_insect")
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

    public void e_ride(){
        FirebaseFirestore db = FirebaseFirestore.getInstance();
        db.collection("English").document("ride").collection("kind")
                .whereEqualTo("type", "ride")
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

    public void e_food(){
        FirebaseFirestore db = FirebaseFirestore.getInstance();
        db.collection("English").document("food").collection("kind")
                .whereEqualTo("type", "food")
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

    public void e_dino(){
        FirebaseFirestore db = FirebaseFirestore.getInstance();
        db.collection("English").document("dinosaur").collection("kinds")
                .whereEqualTo("type", "dinosaur")
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

    public void e_place(){
        FirebaseFirestore db = FirebaseFirestore.getInstance();
        db.collection("English").document("place").collection("kinds")
                .whereEqualTo("type", "place")
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
