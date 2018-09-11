package com.example.android.coptica;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import Adapters.WordAdapter;
import Model.Word;


public class Body extends AppCompatActivity {

    String[]bodyArray = new String[13];
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
        bodyArray[0]="رأس";
        bodyArray[1]="عين";
        bodyArray[2]="فم";
        bodyArray[3]="أسنان";
        bodyArray[4]="لسان";
        bodyArray[5]="ركبة";
        bodyArray[6]="شعر";
        bodyArray[7]="يد";
        bodyArray[8]="قلب";
        bodyArray[9]="رقبة";
        bodyArray[10]="كوع";
        bodyArray[11]="قدم";
        bodyArray[12]="أنف";


        imageArray[0]=R.drawable.head;
        imageArray[1]=R.drawable.eye;
        imageArray[2]=R.drawable.mouth;
        imageArray[3]=R.drawable.ear;
        imageArray[4]=R.drawable.toungue;
        imageArray[5]=R.drawable.knee;
        imageArray[6]=R.drawable.hair;
        imageArray[7]=R.drawable.hand;
        imageArray[8]=R.drawable.heart;
        imageArray[9]=R.drawable.neck;
        imageArray[10]=R.drawable.elbow;
        imageArray[11]=R.drawable.foot;
        imageArray[12]=R.drawable.nose;




        word[0]=R.drawable.whead;
        word[1]=R.drawable.weye;
        word[2]=R.drawable.wmouth;
        word[3]=R.drawable.wear;
        word[4]=R.drawable.wtoungue;
        word[5]=R.drawable.wknee;
        word[6]=R.drawable.whair;
        word[7]=R.drawable.whand;
        word[8]=R.drawable.wheart;
        word[9]=R.drawable.wneck;
        word[10]=R.drawable.welbow;
        word[11]=R.drawable.wfoot;
        word[12]=R.drawable.wnose;




        sound[0]=R.raw.head;
        sound[1]=R.raw.eye;
        sound[2]=R.raw.mouth;
        sound[3]=R.raw.ear;
        sound[4]=R.raw.toungue;
        sound[5]=R.raw.knee;
        sound[6]=R.raw.hair;
        sound[7]=R.raw.hand;
        sound[8]=R.raw.heart;
        sound[9]=R.raw.neck;
        sound[10]=R.raw.elbow;
        sound[11]=R.raw.foot;
        sound[12]=R.raw.nose;








        for(int i =0;i<wordArray.length;i++){
            Word animal = new Word();
            animal.setName(bodyArray[i]);
            animal.setImageResourceId(imageArray[i]);
            animal.setCategory(Word.BODY_PARTS);
            animal.setWord(word[i]);
            animal.setSound(sound[i]);
            wordArray[i]=animal;
        }

        WordAdapter<Word> wordAdapter = new WordAdapter<Word>(this, wordArray);
        ListView listView = (ListView) findViewById(R.id.colorslist);

        listView.setAdapter(wordAdapter);

    }
}
