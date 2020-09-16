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

public class PrePlaceInfoActivityParku extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recycler_view_item);

        Window w = getWindow();
        w.setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS, WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);

        RecyclerView recyclerView = findViewById(R.id.rv_list);
        List<item> mlist = new ArrayList<>();
        mlist.add(new item(61,R.drawable.test_cat6_trahtemiriv, "Парк Трахтемирів","Трахтемирівський півострів, Київська обл."));
        mlist.add(new item(62,R.drawable.test_cat6_sofiivka, "Софіївський парк","Умань, Черкаська обл."));
        mlist.add(new item(63,R.drawable.test_cat1_bychach_zamok, "Бучацк","Бучач, ьська обл. 16ст."));
        mlist.add(new item(64,R.drawable.test_cat1_pidgirzi, "Хотинська ця","Хотин, Чернів обл. 13-17ст."));
        mlist.add(new item(65,R.drawable.test_cat1_medjib_zamok, "Меджибі́зьамок","Меджибіжил. 16ст."));
        mlist.add(new item(66,R.drawable.test_cat1_kam_pod_zamok, "Кам'яне́ць-Пська форте́ця","Кам'яне́ць-Поді́льськ, Хмельницька обл. 16ст."));

        Adapter_recycler adapter = new Adapter_recycler(this, mlist);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}
