package org.meicode.kalmni;

import static org.meicode.kalmni.R.id.b111;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class depression extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_depression);
        Button prbt=findViewById(R.id.b111);
        prbt.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent relationn=new Intent(getApplicationContext(),problemRelation.class);
                startActivity(relationn);
            }
        });
        Button prso=findViewById(R.id.b22);
        prso.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent relationn=new Intent(getApplicationContext(),solutionRelation.class);
                startActivity(relationn);
            }
        });
        Button btcon=findViewById(R.id.b23);
        btcon.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent relationn=new Intent(getApplicationContext(),consultation.class);
                startActivity(relationn);
            }
        });

    }
}