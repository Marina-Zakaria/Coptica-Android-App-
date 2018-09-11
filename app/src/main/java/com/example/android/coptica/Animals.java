package com.example.android.coptica;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import Adapters.WordAdapter;
import Model.Word;


public class Animals extends AppCompatActivity {

    String[]animalsArray = new String[13];
    Word [] wordArray = new Word[13];
    int [] imageArray = new int[13];
    int[]   word = new int[13];
    int[] sound = new int[13];
    private MediaPlayer mediaPlayer = new MediaPlayer();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_colors);
        // LinearLayout colorsLayout = findViewById (R.id.colorsLayout);
        animalsArray[0]="ضفدع";
        animalsArray[1]="كلب";
        animalsArray[2]="قطة";
        animalsArray[3]="ثعبان";
        animalsArray[4]="حصان";
        animalsArray[5]="حمار وحشي";
        animalsArray[6]="أسد";
        animalsArray[7]="دب";
        animalsArray[8]="فار";
        animalsArray[9]="فيل";
        animalsArray[10]="زرافة";
        animalsArray[11]="جمل";
        animalsArray[12]="سلحفاة";

        imageArray[0]=R.drawable.frog;
        imageArray[1]=R.drawable.dog;
        imageArray[2]=R.drawable.cat;
        imageArray[3]=R.drawable.snake;
        imageArray[4]=R.drawable.horse;
        imageArray[5]=R.drawable.zebra;
        imageArray[6]=R.drawable.lion;
        imageArray[7]=R.drawable.bear;
        imageArray[8]=R.drawable.mouse;
        imageArray[9]=R.drawable.elephant;
        imageArray[10]=R.drawable.giraf;
        imageArray[11]=R.drawable.camel;
        imageArray[12]=R.drawable.turtle;



        word[0]=R.drawable.wfrog;
        word[1]=R.drawable.wdog;
        word[2]=R.drawable.wcat;
        word[3]=R.drawable.wsnake;
        word[4]=R.drawable.whorse;
        word[5]=R.drawable.wzebra;
        word[6]=R.drawable.wlion;
        word[7]=R.drawable.wbear;
        word[8]=R.drawable.wmouse;
        word[9]=R.drawable.welephant;
        word[10]=R.drawable.wgiraf;
        word[11]=R.drawable.wcamel;
        word[12]=R.drawable.wturtle;



        sound[0]=R.raw.frog;
        sound[1]=R.raw.dog;
        sound[2]=R.raw.cat;
        sound[3]=R.raw.snake;
        sound[4]=R.raw.horse;
        sound[5]=R.raw.zebra;
        sound[6]=R.raw.lion;
        sound[7]=R.raw.bear;
        sound[8]=R.raw.mouse;
        sound[9]=R.raw.elepant;
        sound[10]=R.raw.giraf;
        sound[11]=R.raw.camel;
        sound[12]=R.raw.turtle;







        for(int i =0;i<animalsArray.length;i++){
            Word animal = new Word();
            animal.setName(animalsArray[i]);
            animal.setImageResourceId(imageArray[i]);
            animal.setCategory(Word.ANIMALS);
            animal.setWord(word[i]);
            animal.setSound(sound[i]);
            wordArray[i]=animal;
        }



        WordAdapter<Word> wordAdapter = new WordAdapter<Word>(this, wordArray);
        ListView listView = (ListView) findViewById(R.id.colorslist);

        listView.setAdapter(wordAdapter);


    }
}
