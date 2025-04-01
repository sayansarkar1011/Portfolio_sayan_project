package com.syn10.portfoliosayan;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.airbnb.lottie.LottieAnimationView;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
ArrayList<MyAccount> arrAccount = new ArrayList<>();



    Myadapter adapter;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);


        RecyclerView recyclerView= findViewById(R.id.recyclerView_id);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        arrAccount.add(new MyAccount(R.drawable.sayanimg,"Hi, I'm Sayan Sarkar!","I'm an Android Developer","A fresher","9330443682","sayansarkar1110@gmail.com","Feel free to explore my portfolio and reach out","I'd love to connect!","I'm a fresher that's why I don't have any experience but I would like to gain experience by developing new real life applications.",R.drawable.java,"Core Java",R.drawable.kotlin,"Kotlin",R.drawable.astudio,"Android Studio",R.drawable.xml,"XML",R.drawable.c,"C Programming",R.drawable.mysql,"My SQL","Sign up and login page","Instagram Homepage","Contact Application","Portfolio Application"));
        adapter = new Myadapter(this,arrAccount);
        recyclerView.setAdapter(adapter);





    }
}