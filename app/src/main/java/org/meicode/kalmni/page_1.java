
package org.meicode.kalmni;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;

import android.os.Bundle;
import android.widget.ImageView;

import org.meicode.kalmni.MainActivity;
import org.meicode.kalmni.R;

public class page_1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page1);
        ImageView p1 = findViewById(R.id.imageView);

        Thread page1 =new Thread(){
            public void run(){
                try {
                    sleep(4000);
                    Intent mainactivity=new Intent(getApplicationContext(), MainActivity.class);
                    startActivity(mainactivity);
                    finish();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

            }
        };
        page1.start();


    }

}