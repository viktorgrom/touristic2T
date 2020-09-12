package com.example.ukrainetouristic.util.category;

import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.ukrainetouristic.Adapter_recycler;
import com.example.ukrainetouristic.R;
import com.example.ukrainetouristic.item;

import java.util.ArrayList;
import java.util.List;

public class Pre_place_info_activity_palaces extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recycler_view_item);

        Window w = getWindow();
        w.setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS, WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);

        RecyclerView recyclerView = findViewById(R.id.rv_list);
        List<item> mlist = new ArrayList<>();
        mlist.add(new item(21,R.drawable.test_cat2_vishnivez, "Палац Вишневецьких", "смт Вишнівець, Тернопільська обл. 18ст."));
        mlist.add(new item(22,R.drawable.test_cat2_sangushko_izaslav, "Палац Сангушків", "Ізяслав, Хмельницька обл. 1754-1770р."));
        mlist.add(new item(23,R.drawable.test_cat2_badeni, "Палац Бадені", "Коропець, Тернопільська обл. 1893-1906р."));
        mlist.add(new item(24,R.drawable.test_cat2_rymianzev, "Палац Рум'янцева-Задунайського", "Вишеньки, Чернігівська обл. 1782-1787р."));
        mlist.add(new item(25,R.drawable.test_cat2_kachanivka, "Качанівський палац", "Качанівка, Чернігівська обл. 1770-ті."));
        mlist.add(new item(26,R.drawable.test_cat2_galaganiv, "Палац Галаганів", "Сокиренці, Чернігівська обл. 1823-1829р."));
        mlist.add(new item(27,R.drawable.mp5, "Palace", "fghjklcvbnm,rtyuiop"));
        mlist.add(new item(28,R.drawable.mp5, "Palace", "fghjklcvbnm,rtyuiop"));
        mlist.add(new item(29,R.drawable.mp5, "Palace", "fghjklcvbnm,rtyuiop"));
        mlist.add(new item(210,R.drawable.mp5, "Palace", "fghjklcvbnm,rtyuiop"));
        Adapter_recycler adapter = new Adapter_recycler(this, mlist);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}
