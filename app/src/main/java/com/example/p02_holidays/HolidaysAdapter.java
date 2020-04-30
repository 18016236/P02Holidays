package com.example.p02_holidays;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class HolidaysAdapter extends ArrayAdapter<Holidays> {

    private ArrayList<Holidays> holiday;
    private TextView tvname;
    private TextView tvdate;
    private ImageView pic;
    private Context context;

    public HolidaysAdapter(Context context, int resource, ArrayList<Holidays> objects) {
        super(context,resource,objects);
        // Store the food that is passed to this adapter
        holiday = objects;
        // Store Context object as we would need to use it later
        this.context = context;

    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // The usual way to get the LayoutInflater object to
        //  "inflate" the XML file into a View object
        LayoutInflater inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        // "Inflate" the row.xml as the layout for the View object
        View rowView = inflater.inflate(R.layout.secular, parent, false);


        // Get the TextView object
        tvname = (TextView) rowView.findViewById(R.id.tvDay);
        tvdate = (TextView) rowView.findViewById(R.id.tvDate);
        // Get the ImageView object
        pic = (ImageView) rowView.findViewById(R.id.imageView);


        // The parameter "position" is the index of the
        //  row ListView is requesting.
        //  We get back the food at the same index.
        Holidays currentDays = holiday.get(position);
        // Set the TextView to show the food

        tvname.setText(currentDays.getName());
        tvdate.setText(currentDays.getDate());
        pic.setImageResource(currentDays.getPic());

        // Return the nicely done up View to the ListView
        return rowView;
    }
}
