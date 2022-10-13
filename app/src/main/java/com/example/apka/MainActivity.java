package com.example.apka;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn = findViewById(R.id.button);
        ArrayList<ImageView> obrazki = new ArrayList<>();
        ArrayList<Kostka> Kostki = new ArrayList<>();
        obrazki.add(findViewById(R.id.imageView1));
        obrazki.add(findViewById(R.id.imageView2));
        obrazki.add(findViewById(R.id.imageView3));
        obrazki.add(findViewById(R.id.imageView4));
        obrazki.add(findViewById(R.id.imageView5));
        for(int i=0; i<obrazki.size(); i++){
            ImageView obrazek = obrazki.get(i);
            Kostka kosc = new Kostka();
            Kostki.add(kosc);
            obrazek.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if(!kosc.isCzy()){
                        obrazek.setAlpha(150);
                        kosc.setCzy(true);
                    }
                    else{
                        obrazek.setAlpha(255);
                        kosc.setCzy(false);
                    }
                }
            });
        }
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                for(int i=0;i<obrazki.size();i++){
                    Kostka kosc = Kostki.get(i);
                    if(!kosc.isCzy()){
                        obrazki.get(i).setImageResource(kosc.losuj());
                    }
                }
            }
        });
    }
}