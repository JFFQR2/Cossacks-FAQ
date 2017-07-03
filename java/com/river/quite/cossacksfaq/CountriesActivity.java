package com.river.quite.cossacksfaq;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class CountriesActivity extends ListActivity {
    static byte stat = 0;
    private final String[] countries = {"Австрия","Алжир","Англия","Бавария","Венгрия",
            "Венеция","Дания","Испания","Нидерланды","Польша","Португалия","Пруссия",
            "Пьемонт","Россия","Саксония","Турция","Украина","Швеция","Швейцария","Франция"};
    private ArrayAdapter<String> adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setListAdapter(new Adapter(this,countries));
    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);
        switch (position){
            case 0: startActivity(new Intent(this,CountryActivity.class));
                stat=0;
                break;
            case 1: startActivity(new Intent(this,CountryActivity.class));
                stat=1;
                break;
            case 2: startActivity(new Intent(this,CountryActivity.class));
                stat=2;
                break;
            case 3: startActivity(new Intent(this,CountryActivity.class));
                stat=3;
                break;
            case 4: startActivity(new Intent(this,CountryActivity.class));
                stat=4;
                break;
            case 5: startActivity(new Intent(this,CountryActivity.class));
                stat=5;
                break;
            case 6: startActivity(new Intent(this,CountryActivity.class));
                stat=6;
                break;
            case 7: startActivity(new Intent(this,CountryActivity.class));
                stat=7;
                break;
            case 8: startActivity(new Intent(this,CountryActivity.class));
                stat=8;
                break;
            case 9: startActivity(new Intent(this,CountryActivity.class));
                stat=9;
                break;
            case 10: startActivity(new Intent(this,CountryActivity.class));
                stat=10;
                break;
            case 11: startActivity(new Intent(this,CountryActivity.class));
                stat=11;
                break;
            case 12: startActivity(new Intent(this,CountryActivity.class));
                stat=12;
                break;
            case 13: startActivity(new Intent(this,CountryActivity.class));
                stat=13;
                break;
            case 14: startActivity(new Intent(this,CountryActivity.class));
                stat=14;
                break;
            case 15: startActivity(new Intent(this,CountryActivity.class));
                stat=15;
                break;
            case 16: startActivity(new Intent(this,CountryActivity.class));
                stat=16;
                break;
            case 17: startActivity(new Intent(this,CountryActivity.class));
                stat=17;
                break;
            case 18: startActivity(new Intent(this,CountryActivity.class));
                stat=18;
                break;
            case 19: startActivity(new Intent(this,CountryActivity.class));
                stat=19;
                break;
        }
    }
}
