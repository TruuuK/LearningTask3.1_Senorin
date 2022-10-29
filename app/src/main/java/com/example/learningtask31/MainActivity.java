package com.example.learningtask31;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_layout);

        ImageView imgOne = findViewById(R.id.imageView1);
        ImageView imgTwo = findViewById(R.id.imageView2);
        ImageView imgThree = findViewById(R.id.imageView3);
        ImageView imgFour = findViewById(R.id.imageView4);

        imgOne.setOnClickListener(new View.OnClickListener() {
            //@Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SubOneActivity.class);
                startActivity(intent);
            }
        });
        imgTwo.setOnClickListener(new View.OnClickListener() {
            //@Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SubTwoActivity.class);
                startActivity(intent);
            }
        });
        imgThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, SubThreeActivity.class);
                startActivity(intent);
            }
        });
        imgFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, SubFourActivity.class);
                startActivity(intent);
            }
        });


    }
}