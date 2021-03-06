package com.example.daniel.economia.Activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import com.example.daniel.economia.R;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Futuroa extends AppCompatActivity {
    EditText anual;
    EditText number;
    EditText interest;
    TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_futuroa);
        anual=(EditText)findViewById(R.id.editText);
        number=(EditText)findViewById(R.id.editText2);
        interest=(EditText)findViewById(R.id.editText3);
        result=(TextView)findViewById(R.id.textView);
    }

    public void calculaFuturoa(View v){
        if(anual.getText().toString().equals("hi") || number.getText().toString().equals("") || interest.getText().toString().equals("")){
            Toast.makeText(this, "Ingresar valores", Toast.LENGTH_SHORT).show();
        }else {
            double anual1 = Double.parseDouble(anual.getText().toString());
            double numero = Double.parseDouble(number.getText().toString());
            double interes = Double.parseDouble(interest.getText().toString());
            double res = anual1 * ((Math.pow((1 + (interes / 100)), numero) - 1) / (interes / 100));
            result.setText("" + res);
        }
    }
}
