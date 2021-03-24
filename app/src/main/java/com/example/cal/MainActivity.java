package com.example.cal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button btn_suma;
    private Button btn_resta;
    private Button btn_multiplicacion;
    private Button btn_division;

    private TextView text_respuesta;

    private EditText edit_numero_uno;
    private EditText edit_numero_dos;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text_respuesta = findViewById(R.id.respuesta);

        edit_numero_uno = findViewById(R.id.numero1);
        edit_numero_dos = findViewById(R.id.numero2);

        btn_suma = findViewById(R.id.button_suma);
        btn_suma.setOnClickListener(v -> text_respuesta.setText(suma(Integer.parseInt(edit_numero_uno.getText().toString()),Integer.parseInt(edit_numero_dos.getText().toString()))+""));

        btn_resta = findViewById(R.id.button_resta);
        btn_resta.setOnClickListener(v -> text_respuesta.setText(resta(Integer.parseInt(edit_numero_uno.getText().toString()),Integer.parseInt(edit_numero_dos.getText().toString()))+""));

        btn_multiplicacion = findViewById(R.id.button_multiplicacion);
        btn_multiplicacion.setOnClickListener(v -> text_respuesta.setText(multiplicacion(Integer.parseInt(edit_numero_uno.getText().toString()),Integer.parseInt(edit_numero_dos.getText().toString()))+""));

        btn_division = findViewById(R.id.button_division);
        btn_division.setOnClickListener(v -> text_respuesta.setText(division(Double.parseDouble(edit_numero_uno.getText().toString()),Double.parseDouble(edit_numero_dos.getText().toString()))+""));

    }

    public int suma (int a, int b){
        return a+b;
    }

    public int resta (int a, int b){
        return a-b;
    }

    public int multiplicacion (int a, int b){
        return a*b;
    }

    public double division (double a, double b){
        double respuesta = 0;

        if(b!=0){
            respuesta= a/b;
        }

        return respuesta;

    }
}