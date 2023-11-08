package org.meicode.kalmni;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button rela=findViewById(R.id.b1);

        rela.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent relation=new Intent(getApplicationContext(),relations.class);
                startActivity(relation);
            }
        });

        Button rela1=findViewById(R.id.b2);
        rela1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent relation=new Intent(getApplicationContext(),depression.class);
                startActivity(relation);
            }
        });
        Button rela2=findViewById(R.id.b3);
        rela2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent relation=new Intent(getApplicationContext(),attached.class);
                startActivity(relation);
            }
        });

        Button rela4=findViewById(R.id.b4);
        rela4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent relation=new Intent(getApplicationContext(),Unit.class);
                startActivity(relation);
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        MenuItem facebookMenuItem = menu.findItem(R.id.item3);
        facebookMenuItem.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                String facebookUrl = "https://www.facebook.com/profile.php?id=100090748156087";
                try {
                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/profile.php?id=100090748156087" + facebookUrl));
                    startActivity(intent);
                } catch (Exception e) {
                    // If the Facebook app is not installed, open the website instead
                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(facebookUrl));
                    startActivity(intent);
                }
                return true;
            }




        });

        MenuItem instaMenuItem = menu.findItem(R.id.item2);
        instaMenuItem.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                String facebookUrl = "https://www.instagram.com/kalmni.official/?fbclid=IwAR3Lffdx4tQf6j8JYTEpBOEjtEBlX6aPoxczFvD_XnLxxW-t3nmj4dj7aJs";
                try {
                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com/kalmni.official/?fbclid=IwAR3Lffdx4tQf6j8JYTEpBOEjtEBlX6aPoxczFvD_XnLxxW-t3nmj4dj7aJs" + facebookUrl));
                    startActivity(intent);
                } catch (Exception e) {
                    // If the Facebook app is not installed, open the website instead
                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(facebookUrl));
                    startActivity(intent);
                }
                return true;
            }




        });
        MenuItem watsMenuItem = menu.findItem(R.id.item1);
        watsMenuItem.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                String facebookUrl = "https://web.whatsapp.com/";
                try {
                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://web.whatsapp.com/" + facebookUrl));
                    startActivity(intent);
                } catch (Exception e) {
                    // If the Facebook app is not installed, open the website instead
                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(facebookUrl));
                    startActivity(intent);
                }
                return true;
            }




        });

        return true;
    }

    }
