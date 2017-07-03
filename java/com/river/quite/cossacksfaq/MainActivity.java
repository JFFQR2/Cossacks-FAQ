package com.river.quite.cossacksfaq;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

public class MainActivity extends ListActivity {
    private final String[] main = {"Страны","Тактика","База Знаний","О Проэкте"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setListAdapter(new Adapter(this,main));
    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);
        switch (position){
            case 0: startActivity(new Intent(this,CountriesActivity.class));
                break;
            case 1: startActivity(new Intent(this,TacticksActivity.class));
                break;
            case 2: startActivity(new Intent(this,DataActivity.class));
                break;
            case 3: startActivity(new Intent(this,AboutActivity.class));
                break;
        }
    }
}

