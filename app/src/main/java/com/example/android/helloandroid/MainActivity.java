package com.example.android.helloandroid;

import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void map(View view) {
        Intent mapIntent = new Intent(android.content.Intent.ACTION_VIEW,
                Uri.parse("geo:0,0?q=2465 Latham St Mountain View, CA 94043"));
        startActivity(mapIntent);
    }

    public void web(View view) {
        Intent webIntent = new Intent(android.content.Intent.ACTION_VIEW,
                Uri.parse("https://www.udacity.com"));
        startActivity(webIntent);
    }

    public void email(View view) {
        Intent emailIntent = new Intent(android.content.Intent.ACTION_SEND);
        emailIntent.setType("plain/text");
        emailIntent.putExtra(android.content.Intent.EXTRA_EMAIL, new String[]{"info@udacity.com"});
        startActivity(Intent.createChooser(emailIntent, ""));
    }

    public void phone(View view) {
        Intent phoneIntent = new Intent(android.content.Intent.ACTION_VIEW,
                Uri.parse("tel:(650)555 5555"));
        startActivity(phoneIntent);
    }
}




