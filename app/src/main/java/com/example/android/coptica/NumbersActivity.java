package com.example.android.coptica;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.ListView;

import Adapters.WordAdapter;
import Model.Word;

public class NumbersActivity extends AppCompatActivity {
    private String numbersArray[]=new String[10];
    private int imageArray[]=new int[10];
    private Word[] wordArray=new Word[10];
    private int[] sound = new int[10];
    private MediaPlayer mediaPlayer =new MediaPlayer();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_colors);
        numbersArray[0]="واحد";
        numbersArray[1]="اتنين";
        numbersArray[2]="تلاتة";
        numbersArray[3]="أربعة";
        numbersArray[4]="خمسة";
        numbersArray[5]="ستة";
        numbersArray[6]="سبعة";
        numbersArray[7]="تمانية";
        numbersArray[8]="تسعة";
        numbersArray[9]="عشرة";

        imageArray[0]=R.drawable.number_one;
        imageArray[1]=R.drawable.number_two;
        imageArray[2]=R.drawable.number_three;
        imageArray[3]=R.drawable.number_four;
        imageArray[4]=R.drawable.number_five;
        imageArray[5]=R.drawable.number_six;
        imageArray[6]=R.drawable.number_seven;
        imageArray[7]=R.drawable.number_eight;
        imageArray[8]=R.drawable.number_nine;
        imageArray[9]=R.drawable.number_ten;
sound[0]=R.raw.one;
        sound[1]=R.raw.two;
        sound[2]=R.raw.three;
        sound[3]=R.raw.four;
        sound[4]=R.raw.five;
        sound[5]=R.raw.six;
        sound[6]=R.raw.seven;
        sound[7]=R.raw.eight;
        sound[8]=R.raw.nine;
        sound[9]=R.raw.ten;




        for(int i =0;i<10;i++){
            Word number = new Word();
            number.setName(numbersArray[i]);
            number.setImageResourceId(imageArray[i]);
            number.setCategory(Word.NUMBERS);
            number.setWord(Word.HAS_NO_WORD);
            number.setSound(sound[i]);
            wordArray[i]=number;
        }

        Log.e("colors activity","word adapter can't be created");


        WordAdapter<Word> wordAdapter = new WordAdapter<>(this, wordArray);
        Log.e("colors activity","word adapter created");
        ListView listView = (ListView) findViewById(R.id.colorslist);
        Log.e("colors activity","list view created created");

        listView.setAdapter(wordAdapter);

    }
}
