package com.river.quite.cossacksfaq;

import android.app.Activity;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;

public class CountryActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        switch (CountriesActivity.stat) {
            case 0: setContentView(R.layout.austria);
                setTitle("Австрия");
                getActionBar().setIcon(R.mipmap.austria_f);
                break;
            case 1: setContentView(R.layout.algeria);
                setTitle("Алжир");
                getActionBar().setIcon(R.mipmap.algeria_f);
                break;
            case 2: setContentView(R.layout.england);
                getActionBar().setIcon(R.mipmap.england_f);
                setTitle("Англия");
                break;
            case 3: setContentView(R.layout.bavaria);
                getActionBar().setIcon(R.mipmap.bavaria_f);
                setTitle("Бавария");
                break;
            case 4: setContentView(R.layout.hungary);
                getActionBar().setIcon(R.mipmap.hungary_f);
                setTitle("Венгрия");
                break;
            case 5: setContentView(R.layout.venice);
                getActionBar().setIcon(R.mipmap.venice_f);
                setTitle("Венеция");
                break;
            case 6: setContentView(R.layout.denmark);
                getActionBar().setIcon(R.mipmap.denmark_f);
                setTitle("Дания");
                break;
            case 7: setContentView(R.layout.spain);
                getActionBar().setIcon(R.mipmap.spain_f);
                setTitle("Испания");
                break;
            case 8: setContentView(R.layout.netherlands);
                getActionBar().setIcon(R.mipmap.netherlands_f);
                setTitle("Нидерланды");
                break;
            case 9: setContentView(R.layout.poland);
                getActionBar().setIcon(R.mipmap.poland_f);
                setTitle("Польша");
                break;
            case 10: setContentView(R.layout.portugal);
                getActionBar().setIcon(R.mipmap.portugal_f);
                setTitle("Португалия");
                break;
            case 11: setContentView(R.layout.prussia);
                getActionBar().setIcon(R.mipmap.prussia_f);
                setTitle("Пруссия");
                break;
            case 12: setContentView(R.layout.piedmont);
                getActionBar().setIcon(R.mipmap.piedmont_f);
                setTitle("Пьемонт");
                break;
            case 13: setContentView(R.layout.russia);
                getActionBar().setIcon(R.mipmap.russia_f);
                setTitle("Россия");
                break;
            case 14: setContentView(R.layout.saxony);
                getActionBar().setIcon(R.mipmap.saxony_f);
                setTitle("Саксония");
                break;
            case 15: setContentView(R.layout.turkey);
                getActionBar().setIcon(R.mipmap.turkey_f);
                setTitle("Турция");
                break;
            case 16: setContentView(R.layout.ukraine);
                getActionBar().setIcon(R.mipmap.ukraine_f);
                setTitle("Украина");
                break;
            case 17: setContentView(R.layout.sweden);
                getActionBar().setIcon(R.mipmap.sweden_f);
                setTitle("Швеция");
                break;
            case 18: setContentView(R.layout.switzerland);
                getActionBar().setIcon(R.mipmap.switzerland_f);
                setTitle("Швейцария");
                break;
            case 19: setContentView(R.layout.france);
                getActionBar().setIcon(R.mipmap.france_f);
                setTitle("Франция");
                break;
        }
    }

}
