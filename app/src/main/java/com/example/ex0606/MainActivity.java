package com.example.ex0606;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    ImageView iView;
    Button btn;
    Random rnd;
    int num = 1;
    int x = 1;
    String st;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        iView = findViewById(R.id.iView);
        btn = findViewById(R.id.btn);
        rnd = new Random();
    }

    public void go(View view)
    {
        btn.setTextSize(100);
        do
        {
            x = num;
            num = rnd.nextInt(3) + 1;
        }
        while (num==x);
        st = num + "";
        btn.setText(st);

        if (num == 1)
        {
            iView.setImageResource(R.drawable.ex0606namber1);
        }
        else if (num == 2)
        {
            iView.setImageResource(R.drawable.ex0606namber2);
        }
        else
        {
            iView.setImageResource(R.drawable.ex0606namber3);
        }
    }
}