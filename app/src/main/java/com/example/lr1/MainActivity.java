package com.example.lr1;

import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private View textFIO;
    private View textGroup;
    private View btnShow1;
    private View imageButton3;
    private View imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        
        textFIO = findViewById(R.id.textFIO);
        textGroup = findViewById(R.id.textGroup);
        btnShow1 = findViewById(R.id.btnShow1);
        imageButton3 = findViewById(R.id.imageButton3);
        imageView = findViewById(R.id.imageView);

        btnShow1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (textFIO.getVisibility() == View.VISIBLE) {
                    textFIO.setVisibility(View.GONE);
                    textGroup.setVisibility(View.GONE);
                } else {
                    textFIO.setVisibility(View.VISIBLE);
                    textGroup.setVisibility(View.VISIBLE);
                }
            }
        });

        imageButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (imageView.getVisibility() == View.VISIBLE) {
                    imageView.setVisibility(View.GONE);
                } else {
                    imageView.setVisibility(View.VISIBLE);
                }
            }
        });
    }
}