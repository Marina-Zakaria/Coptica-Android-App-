package Adapters;

import android.content.Context;
import android.graphics.Color;
import android.media.MediaPlayer;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.android.coptica.R;

import Model.Word;

/**
 * Created by Marina Zakaria on 7/4/2018.
 */

public class WordAdapter<W> extends ArrayAdapter<Word> {
Word currentWord;
    MediaPlayer mediaPlayer;
    Word [] words ;
    public WordAdapter(@NonNull Context context, Word[] words ) {
        super(context, 0 , words);
        this.words=words;
    }

    @NonNull
    @Override
    public View getView(final int position, @Nullable final View convertView, @NonNull ViewGroup parent) {

        View listItemView = convertView;
        if(listItemView==null){
            listItemView= LayoutInflater.from(getContext()).inflate(R.layout.word_item_layout,parent,false);

        }
         currentWord = getItem(position);

        TextView text = listItemView.findViewById(R.id.text);
        if(currentWord.getCategory()==Word.ANIMALS){
            text.setBackgroundColor(Color.RED);
        }else if(currentWord.getCategory()==Word.FAMILY){
            text.setBackgroundColor(Color.BLUE);

        }  else if(currentWord.getCategory()==Word.NUMBERS) {
            text.setBackgroundColor(Color.GREEN);

        }else  if(currentWord.getCategory()==Word.PHRASES){
            text.setBackgroundColor(Color.YELLOW);
        }else         if(currentWord.getCategory()==Word.BODY_PARTS){
            text.setBackgroundColor(Color.CYAN);
        }
            text.setText(currentWord.getName());

        ImageView image = listItemView.findViewById(R.id.image);
        if(currentWord.getImageResourceId()==Word.HAS_NO_IMAGE){
            image.setVisibility(View.GONE);
        }else {
            image.setImageResource(currentWord.getImageResourceId());
        }
        ImageView word = listItemView.findViewById(R.id.wordImage);

        if(currentWord.getWord()==Word.HAS_NO_WORD){
            word.setVisibility(View.GONE);
        }else {
            word.setImageResource(currentWord.getWord());
        }
        Button play = listItemView.findViewById(R.id.play_btn);
       play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.e("mediaPlayer",currentWord.getName()+" "+position);
                 mediaPlayer= MediaPlayer.create(getContext(),words[position].getSound());
                if(mediaPlayer!=null) {
                    mediaPlayer.start();
                }
            }

        });

        return listItemView;
    }

}
