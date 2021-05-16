package edu.neu.madcourse.numad21su_jingyixu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Create a "About" Button, two steps
        //get the button
        Button abt = findViewById(R.id.About);
        //... set what happens when user click
        abt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Name: Jingyi Xu \n Email: xu.jingyi1@northeastern.edu", Toast.LENGTH_LONG)
                        .show();
            }
        });

    }
}