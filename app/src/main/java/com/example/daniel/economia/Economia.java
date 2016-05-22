package com.example.daniel.economia;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Economia extends AppCompatActivity {
    EditText present;
    EditText number;
    EditText interest;
    TextView resultado;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_economia);
        present=(EditText)findViewById(R.id.editText);
        number=(EditText)findViewById(R.id.editText2);
        interest=(EditText)findViewById(R.id.editText3);
        resultado=(TextView)findViewById(R.id.textView);


    }
    public void futuro(View v){
        int presente = Integer.parseInt(present.getText().toString());
        int numero = Integer.parseInt(number.getText().toString());
        int interes = Integer.parseInt(interest.getText().toString());
        int res= presente*(1+(interes/100))^numero;
        resultado.setText(""+res);
    }
}
