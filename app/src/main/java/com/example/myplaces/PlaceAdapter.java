package com.example.myplaces;
import android.content.Context;
import android.view.View;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;


public class PlaceAdapter extends ArrayAdapter<place> {
    public PlaceAdapter(Context context, ArrayList<place>plcs){
        super(context,0,plcs);
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }
        place currentPlace = getItem(position);

        TextView engTextView = (TextView) listItemView.findViewById(R.id.engName_text_view);
        engTextView.setText(currentPlace.getEngName());

        TextView arabTextView = (TextView) listItemView.findViewById(R.id.arbName_text_view);
        arabTextView.setText(currentPlace.getArabName());

        ImageView imageView=(ImageView)listItemView.findViewById(R.id.image);
        imageView.setImageResource(currentPlace.getImageResourceId());

        return listItemView;
    }

}
