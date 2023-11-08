package org.meicode.kalmni;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class attached extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_attached);
        Button prbt=findViewById(R.id.button2);
        prbt.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent relationn=new Intent(getApplicationContext(),problemRelation.class);
                startActivity(relationn);
            }
        });
        Button prso=findViewById(R.id.button3);
        prso.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent relationn=new Intent(getApplicationContext(),solutionRelation.class);
                startActivity(relationn);
            }
        });
        Button btcon=findViewById(R.id.button4);
        btcon.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent relationn=new Intent(getApplicationContext(),consultation.class);
                startActivity(relationn);
            }
        });
    }
}