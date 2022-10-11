package com.brics.foodwaste;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {


RelativeLayout searchfood,donatefood,updatefood,myorder,myprofile,createcity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        searchfood=findViewById(R.id.searchfood);
        donatefood=findViewById(R.id.donatefood);
        updatefood=findViewById(R.id.updatefood);
        myorder=findViewById(R.id.myorder);

        myprofile=findViewById(R.id.myprofile);
        createcity=findViewById(R.id.createcity);
        searchfood.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,Searchfood.class);
                startActivity(intent);

            }
        });
        donatefood.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,Donatefood.class);
                startActivity(intent);

            }
        });
        updatefood.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,Updatefood.class);
                startActivity(intent);

            }
        });
        myorder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,Myorder.class);
                startActivity(intent);

            }
        });
        myprofile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,Myprofile.class);
                startActivity(intent);

            }
        });
        createcity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,Createcity.class);
                startActivity(intent);

            }
        });


    }
}