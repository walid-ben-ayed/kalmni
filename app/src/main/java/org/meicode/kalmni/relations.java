package org.meicode.kalmni;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class relations extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_relations);
        Button prbt=findViewById(R.id.b11);
        prbt.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent relationn=new Intent(getApplicationContext(),problemRelation.class);
                startActivity(relationn);
            }
        });
        Button prso=findViewById(R.id.b12);
        prso.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent relationn=new Intent(getApplicationContext(),solutionRelation.class);
                startActivity(relationn);
            }
        });
        Button btcon=findViewById(R.id.b13);
        btcon.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent relationn=new Intent(getApplicationContext(),consultation.class);
                startActivity(relationn);
            }
        });
    }

}