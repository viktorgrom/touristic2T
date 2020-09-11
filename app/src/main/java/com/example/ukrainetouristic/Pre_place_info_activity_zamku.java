package com.example.ukrainetouristic;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class Pre_place_info_activity_zamku extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recycler_view_item);

        Window w = getWindow();
        w.setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS, WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);

        RecyclerView recyclerView = findViewById(R.id.rv_list);
        List<item> mlist = new ArrayList<>();
        mlist.add(new item(11, R.drawable.test_cat1_zbaraj_zamok, "Зба́разький за́мок", "Збараж, 1626-1631р."));
        mlist.add(new item(12, R.drawable.test_cat1_hotun, "Підгоре́цький за́мок", "Підгірці, Львівська обл. 1635-1640р."));
        mlist.add(new item(13, R.drawable.test_cat1_bychach_zamok, "Бучацький замок", "Бучач, Тернопільська обл. 16ст."));
        mlist.add(new item(14, R.drawable.test_cat1_pidgirzi, "Хотинська фортеця", "Хотин, Чернівецька обл. 13-17ст."));
        mlist.add(new item(15, R.drawable.test_cat1_medjib_zamok, "Меджибі́зький замок", "Меджибіж, Хмельницька обл. 16ст."));
        mlist.add(new item(16, R.drawable.test_cat1_kam_pod_zamok, "Кам'яне́ць-Поді́льська форте́ця", "Кам'яне́ць-Поді́льськ, Хмельницька обл. 16ст."));
        mlist.add(new item(17, R.drawable.mp5, "Palace", "fghjklcvbnm,rtyuiop"));
        mlist.add(new item(18, R.drawable.mp5, "Palace", "fghjklcvbnm,rtyuiop"));
        mlist.add(new item(19, R.drawable.mp5, "Palace", "fghjklcvbnm,rtyuiop"));
        mlist.add(new item(20, R.drawable.mp5, "Palace", "fghjklcvbnm,rtyuiop"));
        Adapter_recycler adapter = new Adapter_recycler(this, mlist);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));


    }

    public void process_pre_item_clicked(View view) {
        Intent intent = null;
        //хочу сюди помістити id item який натиснуто
        if (view.getId() == R.id.card_background) {
            intent = new Intent(this, Place_info_activity.class);

            startActivity(intent);
        }


    }
}