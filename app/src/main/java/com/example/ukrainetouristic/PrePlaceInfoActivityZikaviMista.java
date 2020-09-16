package com.example.ukrainetouristic;

import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class PrePlaceInfoActivityZikaviMista extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recycler_view_item);

        Window w = getWindow();
        w.setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS, WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);

        RecyclerView recyclerView = findViewById(R.id.rv_list);
        List<item> mlist = new ArrayList<>();
        mlist.add(new item(81,R.drawable.test_cat8_kremenets, "Кременець","Тернопільська обл."));
        mlist.add(new item(82,R.drawable.test_cat8_buchach, "Бучач","Тернопільська обл."));
        mlist.add(new item(83,R.drawable.test_cat1_bychach_zamok, "Бучацький замок","Бучач, Тернопільська обл. 16ст."));
        mlist.add(new item(84,R.drawable.test_cat1_pidgirzi, "Хотинська фортеця","Хотин, Чернівецька обл. 13-17ст."));
        mlist.add(new item(85,R.drawable.test_cat1_medjib_zamok, "Меджибі́зький замок","Меджибіж, Хмельницька обл. 16ст."));
        mlist.add(new item(86,R.drawable.test_cat1_kam_pod_zamok, "Кам'яне́ць-Поді́льська форте́ця","Кам'яне́ць-Поді́льськ, Хмельницька обл. 16ст."));

        Adapter_recycler adapter = new Adapter_recycler(this, mlist);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}