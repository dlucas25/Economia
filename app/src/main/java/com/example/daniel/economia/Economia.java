package com.example.daniel.economia;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.daniel.economia.Activities.Anualf;
import com.example.daniel.economia.Activities.Anualp;
import com.example.daniel.economia.Activities.Futuroa;
import com.example.daniel.economia.Activities.Futurop;
import com.example.daniel.economia.Activities.Presentea;
import com.example.daniel.economia.Activities.Presentef;


public class Economia extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_economia);
    }

    public void futuro(View v){
        Intent i = new Intent(this, Futurop.class);
        v.getContext().startActivity(i);
    }
    public void presente(View v){
        Intent i = new Intent(this, Presentef.class);
        v.getContext().startActivity(i);
    }
    public void presentea(View v){
        Intent i = new Intent(this, Presentea.class);
        v.getContext().startActivity(i);
    }
    public void anualp(View v){
        Intent i = new Intent(this, Anualp.class);
        v.getContext().startActivity(i);
    }
    public void anualf(View v){
        Intent i = new Intent(this, Anualf.class);
        v.getContext().startActivity(i);
    }
    public void futuroa(View v){
        Intent i = new Intent(this, Futuroa.class);
        v.getContext().startActivity(i);
    }


}
