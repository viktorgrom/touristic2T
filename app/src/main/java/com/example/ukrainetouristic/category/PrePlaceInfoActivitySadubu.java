package com.example.ukrainetouristic.category;

import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.ukrainetouristic.R;

import java.util.ArrayList;
import java.util.List;

public class PrePlaceInfoActivitySadubu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recycler_view_item);

        Window w = getWindow();
        w.setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS, WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);

        RecyclerView recyclerView = findViewById(R.id.rv_list);
        List<ItemCategory> mlist = new ArrayList<>();
        mlist.add(new ItemCategory(71,R.drawable.test_cat7_fon_mekk, "Маєток фон Мекк","Копилів, Київська обл. 1889-1899р.","12"));
        mlist.add(new ItemCategory(72,R.drawable.test_cat7_zabotin, "Садиба Заботіна","с.Мала Ростовка, Вінницька обл. 1900р.","12"));
        mlist.add(new ItemCategory(73,R.drawable.test_cat1_bychach_zamok, "Бучацк","Бучач, ьська обл. 16ст.","12"));
        mlist.add(new ItemCategory(74,R.drawable.test_cat1_pidgirzi, "Хотинська ця","Хотин, Чернів обл. 13-17ст.","12"));
        mlist.add(new ItemCategory(75,R.drawable.test_cat1_medjib_zamok, "Меджибі́зьамок","Меджибіжил. 16ст.","12"));
        mlist.add(new ItemCategory(76,R.drawable.test_cat1_kam_pod_zamok, "Кам'яне́ць-Пська форте́ця","Кам'яне́ць-Поді́льськ, Хмельницька обл. 16ст.","12"));

        Adapter_recycler adapter = new Adapter_recycler(this, mlist);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}