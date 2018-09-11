package Adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.android.coptica.R;

import Model.Letter;

/**
 * Created by Marina Zakaria on 7/4/2018.
 */

public class LetterAdapter<L> extends ArrayAdapter<Letter> {


    public LetterAdapter(@NonNull Context context, Letter[] letters ) {
        super(context, 0 , letters);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View listItemView = convertView;
        if(listItemView==null){
            listItemView= LayoutInflater.from(getContext()).inflate(R.layout.letter_item_layout,parent,false);

        }
        Letter currentLetter = getItem(position);

        TextView text = listItemView.findViewById(R.id.letterName);

        text.setText(currentLetter.getName());

        ImageView image = listItemView.findViewById(R.id.letterImage);
        image.setImageResource(currentLetter.getImageId());


        return listItemView;
    }
}
