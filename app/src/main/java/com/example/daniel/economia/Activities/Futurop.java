package com.example.daniel.economia.Activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;
import com.example.daniel.economia.R;
import android.view.View;
import android.widget.Toast;

public class Futurop extends AppCompatActivity {
    EditText present;
    EditText number;
    EditText interest;
    TextView result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_futurop);
        present=(EditText)findViewById(R.id.editText);
        number=(EditText)findViewById(R.id.editText2);
        interest=(EditText)findViewById(R.id.editText3);
        result=(TextView)findViewById(R.id.textView);
    }
    public void calculaFuturo(View v){
        if(present.getText().toString().equals("hi") || number.getText().toString().equals("") || interest.getText().toString().equals("")){
            Toast.makeText(this, "Ingresar valores", Toast.LENGTH_SHORT).show();
        }else{
            double presente = Double.parseDouble(present.getText().toString());
            double numero = Double.parseDouble(number.getText().toString());
            double interes = Double.parseDouble(interest.getText().toString());
            double res= presente*Math.pow(1+(interes/100),numero);
            result.setText(""+res);
        }
    }
}
