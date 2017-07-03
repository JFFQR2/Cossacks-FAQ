package com.river.quite.cossacksfaq;

import android.app.Activity;
import android.os.Bundle;

public class TextTactickActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        switch (TacticksActivity.x){
            case 0: setContentView(R.layout.activity_text_tactick);
                setTitle("Основы");
                break;
            case 1: setContentView(R.layout.activityz_text_25);
                setTitle("25 советов новичку");
                break;
            case 2: setContentView(R.layout.stone);
                setTitle("Добыча камня решает половину игры?");
                break;
            case 3: setContentView(R.layout.grenader);
                setTitle("Как собрать отряд из наемных гренадеров");
                break;
            case 4: setContentView(R.layout.earth_vs_fish);
                setTitle("Рыболовство vs Земледелие");
                break;
            case 5: setContentView(R.layout.diplomat_canter);
                setTitle("Дипломатический центр");
                break;
            case 6: setContentView(R.layout.market);
                setTitle("Все про рынок");
                break;
            case 7: setContentView(R.layout.saxony_mushketer);
                setTitle("Саксонский мушкетер 18-ого века");
                break;
            case 8: setContentView(R.layout.saxony_grenader);
                setTitle("Саксонский гренадер 18-ого века");
                break;
            case 9: setContentView(R.layout.perehod);
                setTitle("Стоимость перехода в 18-ый век");
                break;
            case 10: setContentView(R.layout.spiker);
                setTitle("Пикенер 18-ого века");
                break;
            case 11: setContentView(R.layout.order);
                setTitle("Постороение через лодочку");
                break;
            case 12: setContentView(R.layout.algeria_pluse_minus);
                setTitle("Алжир-плюсы и минусы");
                break;
            case 13: setContentView(R.layout.usual);
                setTitle("Разное");
                break;
        }
    }
}
