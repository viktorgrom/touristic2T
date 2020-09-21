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

public class PrePlaceInfoActivityZikaviMiszia extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recycler_view_item);

        Window w = getWindow();
        w.setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS, WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);

        RecyclerView recyclerView = findViewById(R.id.rv_list);
        List<ItemCategory> mlist = new ArrayList<>();
        mlist.add(new ItemCategory(41,R.drawable.test_cat4_zmievi_valu, "Змієві вали","Васильків, Київська обл.","Це залишки оборонних споруд. Загальна довжина 2000км. Ісорики стверджують що це укріплення часів Київської Русі, але важко уявити скільки зусиль та людей потрібно для зведення такої кількості оборонних споруд, при тогочасному розвитку техніки. Також їх оборонне значення піддається сумніву, так як щоб по всій довжині розмістити війська для оборони - військо має налічувати мільйон воїнів, при тому що все населення Київської Русі в 10 ст. було близько 5млн. осіб. Вали потребують збереження та подальшого вивчення, зараз можна зустріти лише поодинокі їх частини, більша частина була знищена або розорана. "));
        mlist.add(new ItemCategory(42,R.drawable.test_cat4_zentr_europa, "Географічний центр Європи","с.Ділове, Закарпатська обл. ","У 1885–1887 роках географи з Імператорсько-Королівського військово-географічного інституту у Відні, проводили дослідження в Закарпатській області сучасної України та встановили, що Географічний центр Європи знаходиться поряд з с. Ділове, де й встановили кам'яний знак з координатами. Варто згадати, що на цей статус претендують інші країни з певними обумовленнями. "));

        Adapter_recycler adapter = new Adapter_recycler(this, mlist);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}