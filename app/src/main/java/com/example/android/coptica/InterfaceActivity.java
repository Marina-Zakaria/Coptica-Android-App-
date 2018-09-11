package com.example.android.coptica;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class InterfaceActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_interface);
    }

    public void goToLetters (View v){
        Intent intent = new Intent(this,Letters.class);
        startActivity(intent);
    }
    public void goToWords (View v){
        Intent intent = new Intent(this,WordsMenu.class);
        startActivity(intent);
    }
    public void goToGames (View v){
        Intent intent = new Intent(this,GameActivity.class);
        finish();
        startActivity(intent);
    }

}
