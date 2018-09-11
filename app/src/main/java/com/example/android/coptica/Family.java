package com.example.android.coptica;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import Adapters.WordAdapter;
import Model.Word;

public class Family extends AppCompatActivity {
    String[]familyArray = new String[4];
    Word[] wordArray = new Word[4];
    int [] imageArray = new int[4];
    int[]   copticWord = new int[4];
    int[] sound = new int[4];


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_colors);
        familyArray[0] = "أبي";
        familyArray[1] = "أمي";
        familyArray[2] = "أخي";
        familyArray[3] = "أختي";

        imageArray[0] = R.drawable.dad;
        imageArray[1] = R.drawable.mom;
        imageArray[2] = R.drawable.son;
        imageArray[3] = R.drawable.daughter;

        copticWord[0] = R.drawable.wdad;
        copticWord[1] = R.drawable.wmom;
        copticWord[2] = R.drawable.wson;
        copticWord[3] = R.drawable.wdaughter;

        sound[0] = R.raw.dad;
        sound[1] = R.raw.mom;
        sound[2] = R.raw.son;
        sound[3] = R.raw.daughter;

        for (int i = 0; i < familyArray.length; i++) {
            Word family = new Word();
            family.setName(familyArray[i]);
            family.setImageResourceId(imageArray[i]);
            family.setCategory(Word.COLORS);
            family.setWord(copticWord[i]);
            family.setSound(sound[i]);
            wordArray[i] = family;
        }



        WordAdapter<Word> wordAdapter = new WordAdapter<Word>(this, wordArray);
        ListView listView = (ListView) findViewById(R.id.colorslist);

        listView.setAdapter(wordAdapter);
    }


}

