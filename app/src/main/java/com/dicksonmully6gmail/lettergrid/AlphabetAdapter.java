package com.dicksonmully6gmail.lettergrid;

import android.content.Context;
import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

/**
 * Created by dickson on 5/24/17.
 */

public class AlphabetAdapter extends BaseAdapter {
    private Context mContext;
    private String[] mLetters;
    private Typeface mTypeface;

    public AlphabetAdapter (Context context, String[] mLetters, Typeface typeface) {
        this.mContext = context;
        this.mLetters = mLetters;
        this.mTypeface = typeface;
    }

    @Override
    public int getCount() {
        return mLetters.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View gridView;
        if (convertView == null) {
//            get layout from xml file
            gridView = inflater.inflate(R.layout.alphabet_grid_item, null);
//            pull views
            TextView letterView = (TextView) gridView.findViewById(R.id.grid_item_letter);
//            set values into view
            String letter = mLetters[position];
            letterView.setText(letter);
            letterView.setTypeface(mTypeface);
        }else {
            gridView = (View) convertView;
        }
        return gridView;
    }
}
