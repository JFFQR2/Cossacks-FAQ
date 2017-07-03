package com.river.quite.cossacksfaq;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class DataActivity extends ListActivity {
    static byte x=0;
    private final String[] data = {
            "Горячие клавиши","Решение проблем с GPU","Казаки:Снова Война","История создания Казаков"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setListAdapter(new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,data));
    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);
        switch (position){
            case 0:startActivity(new Intent(this,KnowledgebaseActivity.class));
                x=0;
                break;
            case 1:startActivity(new Intent(this,KnowledgebaseActivity.class));
                x=1;
                break;
            case 2:startActivity(new Intent(this,KnowledgebaseActivity.class));
                x=2;
                break;
            case 3:startActivity(new Intent(this,KnowledgebaseActivity.class));
                x=3;
                break;
        }
    }
}
