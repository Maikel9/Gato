package com.maikel.gato;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.sql.Array;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

    TextView textoVictoria;
    TextView b1, b2, b3, b4, b5, b6, b7, b8, b9;
    Integer[] botones;
    int [] tablero = new int[]{
            0, 0, 0,
            0, 0, 0,
            0, 0, 0
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textoVictoria = findViewById(R.id.textViewVictoria);
        b1 = findViewById(R.id.textView1);
        b2 = findViewById(R.id.textView2);
        b3 = findViewById(R.id.textView3);
        b4 = findViewById(R.id.textView4);
        b5 = findViewById(R.id.textView5);
        b6 = findViewById(R.id.textView6);
        b7 = findViewById(R.id.textView7);
        b8 = findViewById(R.id.textView8);
        b9 = findViewById(R.id.textView9);

        botones = new Integer[]{
                R.id.textView1, R.id.textView2, R.id.textView3,
                R.id.textView4, R.id.textView5, R.id.textView6,
                R.id.textView7, R.id.textView8, R.id.textView9,
        };

    }

    public void ponerFicha(View view){
        int numBoton = Arrays.asList(botones).indexOf(view.getId());
        //view.setBackgroundResource(R.color.blue);
        tablero[numBoton] = 1;
    }
}