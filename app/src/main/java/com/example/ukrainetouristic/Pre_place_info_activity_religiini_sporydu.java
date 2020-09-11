package com.example.ukrainetouristic;

import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class Pre_place_info_activity_religiini_sporydu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recycler_view_item);

        Window w = getWindow();
        w.setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS, WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);

        RecyclerView recyclerView = findViewById(R.id.rv_list);
        List<item> mlist = new ArrayList<>();
        mlist.add(new item(51,R.drawable.test_cat5_pochaiv, "Почаївська лавра","Почаїв, Тернопільська обл. 1771-1791р."));
        mlist.add(new item(52,R.drawable.test_5_kostel_stara_kotelna, "Костел Антонія Падуанського","с.Стара Котельня, Житомирська обл."));
        mlist.add(new item(53,R.drawable.test_cat1_bychach_zamok, "Бучацк","Бучач, ьська обл. 16ст."));
        mlist.add(new item(54,R.drawable.test_cat1_pidgirzi, "Хотинська ця","Хотин, Чернів обл. 13-17ст."));
        mlist.add(new item(55,R.drawable.test_cat1_medjib_zamok, "Меджибі́зьамок","Меджибіжил. 16ст."));
        mlist.add(new item(56,R.drawable.test_cat1_kam_pod_zamok, "Кам'яне́ць-Пська форте́ця","Кам'яне́ць-Поді́льськ, Хмельницька обл. 16ст."));

        Adapter_recycler adapter = new Adapter_recycler(this, mlist);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}