package com.example.pedrogonzalez.calcproyecto;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    TextView Exit;
    String inComing;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Exit = (TextView) findViewById(R.id.my_screen);


        inComing = String.format("%s\n%s\n%s\n%s\n%s\n",
                Calculator.past[0],
                Calculator.past[1],
                Calculator.past[2],
                Calculator.past[3],
                Calculator.past[4]);

        Exit.setText(inComing);

    }
}
