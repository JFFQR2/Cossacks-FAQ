package com.river.quite.cossacksfaq;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by quite on 03.03.17.
 */
public class Adapter extends ArrayAdapter<String> {
    private final Context context;
    private final String[] values;

    public Adapter(Context context, String[] values) {
        super(context, R.layout.adapter, values);
        this.context = context;
        this.values = values;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View view = inflater.inflate(R.layout.adapter, parent, false);
        TextView textView = (TextView) view.findViewById(R.id.textView_adapter);
        ImageView imageView = (ImageView) view.findViewById(R.id.imageView_adapter);
        textView.setText(values[position]);

        if (values[position].equals("Австрия")) {
            imageView.setImageResource(R.mipmap.austria);
        } else if (values[position].equals("Алжир")) {
            imageView.setImageResource(R.mipmap.algeria);
        } else if (values[position].equals("Англия")) {
            imageView.setImageResource(R.mipmap.england);
        } else if ((values[position].equals("Бавария"))||(values[position].equals("Пруссия"))||(values[position].equals("Саксония"))) {
            imageView.setImageResource(R.mipmap.germany);
        } else if (values[position].equals("Венгрия")) {
            imageView.setImageResource(R.mipmap.hungary);
        } else if ((values[position].equals("Венеция"))||(values[position].equals("Испания"))||(values[position].equals("Пьемонт"))) {
            imageView.setImageResource(R.mipmap.spain);
        } else if (values[position].equals("Дания")) {
            imageView.setImageResource(R.mipmap.denmark);
        } else if (values[position].equals("Нидерланды")) {
            imageView.setImageResource(R.mipmap.netherlands);
        } else if (values[position].equals("Польша")) {
            imageView.setImageResource(R.mipmap.poland);
        } else if (values[position].equals("Португалия")) {
            imageView.setImageResource(R.mipmap.portugal);
        } else if (values[position].equals("Россия")) {
            imageView.setImageResource(R.mipmap.russia);
        } else if (values[position].equals("Турция")) {
            imageView.setImageResource(R.mipmap.turkey);
        } else if (values[position].equals("Украина")) {
            imageView.setImageResource(R.mipmap.ukraine);
        } else if (values[position].equals("Швеция")) {
            imageView.setImageResource(R.mipmap.sweden);
        } else if (values[position].equals("Швейцария")) {
            imageView.setImageResource(R.mipmap.switzerland);
        } else if (values[position].equals("Франция")) {
            imageView.setImageResource(R.mipmap.france);
        } else if (values[position].equals("Страны")) {
            imageView.setImageResource(R.mipmap.countries);
        } else if (values[position].equals("Тактика")) {
            imageView.setImageResource(R.mipmap.tacticks);
        } else if (values[position].equals("База Знаний")) {
            imageView.setImageResource(R.mipmap.wiki);
        } else if (values[position].equals("О Проэкте")) {
            imageView.setImageResource(R.mipmap.help);
        }

        return view;
    }
}