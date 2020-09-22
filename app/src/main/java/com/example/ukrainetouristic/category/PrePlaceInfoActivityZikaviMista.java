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

public class PrePlaceInfoActivityZikaviMista extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recycler_view_item);

        Window w = getWindow();
        w.setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS, WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);

        RecyclerView recyclerView = findViewById(R.id.rv_list);
        List<ItemCategory> mlist = new ArrayList<>();
        mlist.add(new ItemCategory(81,R.drawable.test_cat8_kremenets, "Кременець","Тернопільська обл.","Кременець - економічний та культурний, туристичний центр півночі Тернопільської області. Містор розташоване серед Кременецьких гір і розтягнуте на кілька кілометрів вздовж їх підніжжя. В місті є старий центр - де розташовані історичні будівлі: Комплекс колегіуму чину єзуїтів збудований у 1731-1743 роках, Костел святого Станіслава. З центру добре видно Замкову гору Бону, на якій височіють залишки неприступного Кременецького замку, це один з трьох замків, які встояли перед монголо-татарською наваллою. Ще в місті можна поглянути на Будинок родини Словацьких, споруди Василіянського монастиря 17ст., Житловий будинок 'Близнята', палац Кароліни Дзембовської. Також є новий цетр де вирує економічне життя міста, багато магазинів та ресторани. Радимо відвідати також природні пам'ятки: парк 'Кременецькі гори', Кременецький ботанічний сад, джерело 'Крито'. Унікальним місцем є санна траса, єдина діюча. Вона працює весь рік, тут можна розвинути швидкість до 105км/год. Туристів також катаю. Є кілька готелів для розміщення. Загалом, щоб оглянути все місто вистачить 3-х днів.    "));
        mlist.add(new ItemCategory(82,R.drawable.test_cat8_buchach, "Бучач","Тернопільська обл.","Місто невелике, розташоване на території Опілля — західної частини Подільської височини. Центр оточений пагорбами та розташований в долині річки Стрепи. Цікавою та насиченою є історія міста. Зараз у Бучачі налічується 8 пам'яток архітектури загальноукраїнського значення: ратуша, замок, Василіянський монастир, Здвиженська церква, Святопокровська церква, церква св. Миколая, римо-католицький костел Успіння Матері Божої, руїни церкви в урочищі Монастирок поблизу міста. "));
        mlist.add(new ItemCategory(83,R.drawable.cat8_shepetivka1, "Шепетівка","Шепетівка, Хмельницька обл.","Шепетівка досить велике місто на півночі Хмельницької області. Розквіт міста почався, коли сюди в 19ст проклали залізничні колії. В кінці позаминулого століття це містечко вважалось курортом, та славилось лікувальними водами. У місті унікальна споруда, аналогів якій нема у всьому світі - музей пропаганди. Незвична форма музею, схожа на багаття, поряд на високому постаменті стоїть паровоз. Цей музей будувався силами всього Радянського союзу. З містом пов'язано життя письменника Миколи Островського, який написав відомий роман 'Як гартувалась сталь'. Місто варто відвідати. "));

        Adapter_recycler adapter = new Adapter_recycler(this, mlist);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}