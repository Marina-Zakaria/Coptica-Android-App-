package com.example.android.coptica;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import Adapters.LetterAdapter;
import Model.Letter;

public class Letters extends AppCompatActivity {

    String[] names = new String[32];
     int[] letterImageId = new int[32];
    public static  Letter[]letters=new Letter[32];
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_letters);
names[0]="ألفا";
        names[1]="فيتا";
        names[2]="غما";
        names[3]="دلتا";
        names[4]="اي";
        names[5]="سوو";
        names[6]="زيتا";
        names[7]="ايتا";
        names[8]="ثيتا";
        names[9]="يوتا";
        names[10]="كبا";
        names[11]="لولا";
        names[12]="مي";
        names[13]="ني";
        names[14]="اكسي";
        names[15]="اوميكرون";
        names[16]="بي";
        names[17]="رو";
        names[18]="سيما";
        names[19]="تاف";
        names[20]="ابسلن";
        names[21]="في";
        names[22]="كي";
        names[23]="ابسي";
        names[24]="اوميجا";
        names[25]="شاي";
        names[26]="فاي";
        names[27]="خاي";
        names[28]="هوري";
        names[29]="جنجا";
        names[30]="تشيما";
        names[31]="تي";

        letterImageId[0]=R.drawable.alpha;
            letterImageId[1]=R.drawable.veta;
            letterImageId[2]=R.drawable.gamma;
            letterImageId[3]=R.drawable.delta;
            letterImageId[4]=R.drawable.ei;
            letterImageId[5]=R.drawable.soo;
            letterImageId[6]=R.drawable.zeta;
            letterImageId[7]=R.drawable.eita;
            letterImageId[8]=R.drawable.theta;
            letterImageId[9]=R.drawable.yota;
            letterImageId[10]=R.drawable.kappa;
            letterImageId[11]=R.drawable.lolla;
            letterImageId[12]=R.drawable.mei;
            letterImageId[13]=R.drawable.nei;
            letterImageId[14]=R.drawable.exy;
            letterImageId[15]=R.drawable.oo;
            letterImageId[16]=R.drawable.py;
            letterImageId[17]=R.drawable.roo;
            letterImageId[18]=R.drawable.cima;
            letterImageId[19]=R.drawable.tav;
            letterImageId[20]=R.drawable.epslon;
            letterImageId[21]=R.drawable.fei;
            letterImageId[22]=R.drawable.kei;
            letterImageId[23]=R.drawable.epsy;
            letterImageId[24]=R.drawable.omega;
            letterImageId[25]=R.drawable.shay;
            letterImageId[26]=R.drawable.fay;
            letterImageId[27]=R.drawable.khay;
            letterImageId[28]=R.drawable.hoory;
            letterImageId[29]=R.drawable.gengea;
            letterImageId[30]=R.drawable.chima;
            letterImageId[31]=R.drawable.ty;


            for(int i=0;i<letters.length;i++){
            Letter letter = new Letter();
            letter.setName(names[i]);
            letter.setImageId(letterImageId[i]);
            letters[i]=letter;
        }

        Log.e("letters activity","word adapter can't be created");


        LetterAdapter<Letter> letterAdapter = new LetterAdapter<>(this, letters);
        Log.e("letters activity","word adapter created");
        ListView listView = (ListView) findViewById(R.id.lettersList);
        Log.e("letters activity","list view created created");

        listView.setAdapter(letterAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                Intent intent=new Intent( getApplicationContext() , LearnLetter.class);
                intent.putExtra("letterNumber",position);
                startActivity(intent);
            }
        });
}

}




