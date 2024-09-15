package com.example.lab2_bai1;

import androidx.appcompat.app.AppCompatActivity;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    int[] images = {R.drawable.brazil, R.drawable.england, R.drawable.penguin};
    String[] texts = {"Brazil", "Endland", "Normal"};
    int[] colors = {Color.BLUE, Color.GREEN, Color.RED};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ImageView imageView = findViewById(R.id.imageView);
        TextView textView = findViewById(R.id.textView);
        LinearLayout mainLayout = findViewById(R.id.mainLayout);


        Random random = new Random();
        int randomIndex = random.nextInt(images.length);


        imageView.setImageResource(images[randomIndex]);
        textView.setText(texts[randomIndex]);
        mainLayout.setBackgroundColor(colors[randomIndex]);
    }
}