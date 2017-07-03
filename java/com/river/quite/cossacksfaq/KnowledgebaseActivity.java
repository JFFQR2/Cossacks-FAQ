package com.river.quite.cossacksfaq;

import android.app.Activity;
import android.os.Bundle;

public class KnowledgebaseActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        switch (DataActivity.x){
            case 0: setContentView(R.layout.hot_keys);
                setTitle("Горячие клавиши");
                break;
            case 1: setContentView(R.layout.problem_with_gpu);
                setTitle("Решение проблем с GPU");
                break;
            case 2: setContentView(R.layout.cossacks_game);
                setTitle("Казаки:Снова Война");
                break;
            case 3: setContentView(R.layout.cossacks_video);
                setTitle("История создания Казаков");
                break;
        }
    }
}
