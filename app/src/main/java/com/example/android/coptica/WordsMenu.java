package com.example.android.coptica;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

public class WordsMenu extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_words_menu);

    }
    public void goToColors (View v){
        Intent intent = new Intent(this,Colors.class);
        startActivity(intent);
    }
    public void goToNumbers (View v){
        Intent intent = new Intent(this,NumbersActivity.class);
        startActivity(intent);
    }
    public void goToAnimals (View v){
        Intent intent = new Intent(this,Animals.class);
        startActivity(intent);
        Log.e("wordsMenuActivity","intent started");

    } public void goToBody (View v){
        Intent intent = new Intent(this,Body.class);
        startActivity(intent);
    }
    public void goToFamily (View v){
        Intent intent = new Intent(this,Family.class);
        startActivity(intent);
    }


}
