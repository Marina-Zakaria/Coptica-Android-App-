package com.example.android.coptica;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.ListView;

import Adapters.WordAdapter;
import Model.Word;


public class Colors extends AppCompatActivity {

    String[]colorsArray = new String[9];
    Word [] wordArray = new Word[9];
    int [] imageArray = new int[9];
    int[]   word = new int[9];
    int[] sound = new int[9];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_colors);
        colorsArray[0] = "أحمر";
        colorsArray[1] = "أسود";
        colorsArray[2] = "أبيض";
        colorsArray[3] = "أخضر";
        colorsArray[4] = "أصفر";
        colorsArray[5] = "أزرق";
        colorsArray[6] = "رمادي";
        colorsArray[7] = "برتقالي";
        colorsArray[8] = "بنفسجي";

        imageArray[0] = R.drawable.red;
        imageArray[1] = R.drawable.black;
        imageArray[2] = R.drawable.white;
        imageArray[3] = R.drawable.green;
        imageArray[4] = R.drawable.yellow;
        imageArray[5] = R.drawable.blue;
        imageArray[6] = R.drawable.grey;
        imageArray[7] = R.drawable.orange;
        imageArray[8] = R.drawable.purple;

        word[0] = R.drawable.wred;
        word[1] = R.drawable.wblack;
        word[2] = R.drawable.wwhite;
        word[3] = R.drawable.wgreen;
        word[4] = R.drawable.wyellow;
        word[5] = R.drawable.wblue;
        word[6] = R.drawable.wgrey;
        word[7] = R.drawable.worange;
        word[8] = R.drawable.wpurple;

        sound[0] = R.raw.red;
        sound[1] = R.raw.black;
        sound[2] = R.raw.white;
        sound[3] = R.raw.green;
        sound[4] = R.raw.yrllow;
        sound[5] = R.raw.blue;
        sound[6] = R.raw.grey;
        sound[7] = R.raw.orange;
        sound[8] = R.raw.purple;


        for (int i = 0; i < colorsArray.length; i++) {
            Word color = new Word();
            color.setName(colorsArray[i]);
            color.setImageResourceId(imageArray[i]);
            color.setCategory(Word.COLORS);
            color.setWord(word[i]);
            color.setSound(sound[i]);
            wordArray[i] = color;
        }

        Log.e("colors activity", "word adapter can't be created");


        WordAdapter<Word> wordAdapter = new WordAdapter<Word>(this, wordArray);
        Log.e("colors activity", "word adapter created");
        ListView listView = (ListView) findViewById(R.id.colorslist);
        Log.e("colors activity", "list view created created");

        listView.setAdapter(wordAdapter);
    }

    }

