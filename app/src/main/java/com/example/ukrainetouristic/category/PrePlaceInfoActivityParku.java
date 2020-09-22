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
        List<ItemCategory> mlist = new ArrayList<>();
        mlist.add(new ItemCategory(61,R.drawable.cat6_trahtemiriv1, "Парк Трахтемирів","Трахтемирівський півострів, Київська обл.","Регіональний ландшафтний парк, розташований на Трахтемирівському півострові. Площа 10711 га. Являє собою унікальний за геологічною будовою район, що характеризується значною піднятістю горбистої поверхні та утворенням ярів на правобережжі Дніпра. Тут багатий тваринний та рослинний світ.  "));
        mlist.add(new ItemCategory(62,R.drawable.test_cat6_sofiivka, "Софіївський парк","Умань, Черкаська обл. 17-19ст.","Національний дендрологічний парк - шедевр світового значення серед садово-паркового мистецтва. Парк «Софіївка» заснований у 1796 році власником міста Умані, магнатом Станіславом Щенсним Потоцьким та названий на честь його дружини Софії Вітт-Потоцької. Щорічно тут відпочиває до 150тис. людей. Загальна площа 160 га. "));
        mlist.add(new ItemCategory(63,R.drawable.cat6_kreminski_lisu1, "Кремінські ліси","Кремінський р-н, Луганська обл.","Площа 7269 га. Парк створено з метою збереження та відновлення природних комплексів басейну річки Сіверський Донець. "));

        Adapter_recycler adapter = new Adapter_recycler(this, mlist);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}
