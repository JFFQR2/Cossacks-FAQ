package com.river.quite.cossacksfaq;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class TacticksActivity extends ListActivity {
    private final String[] tacticks = {"Основы","25 советов новичку","Добыча камня решает половину игры?"
            ,"Как собрать отряд из наемных гренадеров", "Рыболовство vs Земледелие","Дипломатический центр","Все про рынок",
            "Саксонский мушкетер 18-ого века","Саксонский гренадер 18-ого века","Стоимость перехода в 18-ый век",
            "Пикенер 18-ого века","Постороение через лодочку","Алжир-плюсы и минусы","Разное"};
static int x = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setListAdapter(new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,tacticks));
    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);
        switch (position){
            case 0: startActivity(new Intent(this,TextTactickActivity.class));
                x=0;
                break;
            case 1: startActivity(new Intent(this,TextTactickActivity.class));
                x=1;
                break;
            case 2: startActivity(new Intent(this,TextTactickActivity.class));
                x=2;
                break;
            case 3: startActivity(new Intent(this,TextTactickActivity.class));
                x=3;
                break;
            case 4: startActivity(new Intent(this,TextTactickActivity.class));
                x=4;
                break;
            case 5: startActivity(new Intent(this,TextTactickActivity.class));
                x=5;
                break;
            case 6: startActivity(new Intent(this,TextTactickActivity.class));
                x=6;
                break;
            case 7: startActivity(new Intent(this,TextTactickActivity.class));
                x=7;
                break;
            case 8: startActivity(new Intent(this,TextTactickActivity.class));
                x=8;
                break;
            case 9: startActivity(new Intent(this,TextTactickActivity.class));
                x=9;
                break;
            case 10: startActivity(new Intent(this,TextTactickActivity.class));
                x=10;
                break;
            case 11: startActivity(new Intent(this,TextTactickActivity.class));
                x=11;
                break;
            case 12: startActivity(new Intent(this,TextTactickActivity.class));
                x=12;
                break;
            case 13: startActivity(new Intent(this,TextTactickActivity.class));
                x=13;
                break;
        }
    }
}