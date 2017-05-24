package com.dicksonmully6gmail.lettergrid;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.GridView;

public class MainActivity extends AppCompatActivity {
    GridView gridView;
    String[] letters = new String[] {
      "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K",
            "L", "M", "N", "O", "P", "Q", "R",
            "S", "T", "U", "V", "W", "X", "Y", "Z"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Typeface typeface = Typeface.createFromAsset(getAssets(), "fonts/AlexBrush-Regular.ttf");

        gridView = (GridView) findViewById(R.id.baseGridView);
        AlphabetAdapter adapter = new AlphabetAdapter(this, letters, typeface);
        gridView.setAdapter(adapter);


    }
}
