package com.example.makiec.adapter;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Color;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.example.makiec.myapplication.R;

import java.util.ArrayList;
import java.util.List;

import support.Person;

public class PersonListAdapter extends ArrayAdapter<Person> {

    private Context mContext;
    int mResource;

    public PersonListAdapter(Context context, int resource, List<Person> objects) {
        super(context, resource, objects);
        this.mResource = resource;
        this.mContext = context;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        String name = getItem(position).getName();
        double height = getItem(position).getHeight();
        String surname = getItem(position).getSurname();
        boolean status = getItem(position).getStatus();

        Person person = new Person(name, surname, height, status);

        LayoutInflater inflater = LayoutInflater.from(mContext);
        convertView = inflater.inflate(mResource, parent, false);
        TextView textView1 = (TextView) convertView.findViewById(R.id.textView1);
        TextView textView2 = (TextView) convertView.findViewById(R.id.textView2);
        TextView textView3 = (TextView) convertView.findViewById(R.id.textView3);

        textView1.setText(name);
        textView2.setText(surname);
        textView3.setText(Double.toString(height));

        if (status){
            convertView.setBackgroundColor(Color.parseColor("#39FF14"));
        } else {
            convertView.setBackgroundColor(Color.parseColor("#ED2939"));
        }

        return convertView;
    }


}