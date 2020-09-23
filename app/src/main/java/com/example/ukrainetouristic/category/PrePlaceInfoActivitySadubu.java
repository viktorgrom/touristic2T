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
        mlist.add(new ItemCategory(71,R.drawable.cat7_fon_mekk1, "Маєток фон Мекк","Копилів, Київська обл. 1889-1899р.","Маєток фон Мекка-будований у 1882 році для  Миколи Карловича фон Мекк.\n" +
                "Микола Карлович являвся заможним паном, будував залізниці та був одним з перших автомобілістів.\n" +
                "Гостював у маєтку сам Чайковский..\n" +
                "З 1910 року тут розташовувалась: школа, німецький штаб, сільська рада.\n" +
                "У наш час будинок знаходиться в аварійному стані. Збереглися ялинова й липова алеї, руїни молочної ферми, водонапірної башти, фонтану та панський став. Правда щоб розглянути ці будівлі необхідно пробратись через хащі та кучі мусору..\n" +
                " Маєток внесено до Державного реєстру архітектурних пам’яток національного значення.\n" +
                "До Євро-2012 мали зробити реконструкцію, але жодного пункту з плану не було виконано.\n" +
                "Добре, що ми мали нагоду заїхати сюди в глянути на колишню велич і красу, нажаль, через пару років будівля розрушиться вщент..\n"));
        mlist.add(new ItemCategory(72,R.drawable.cat7_zabotin1, "Садиба Заботіна","с.Мала Ростовка, Вінницька обл. 1901р.","Палацо-парковий комплекс садиби Заботіних. Основну будівлю палацу збудовано у 1901 році. Про історію створення та власників відомо не багато. Палац у неоготичному стилі та прикрашений статуями Артеміди та левів. Садиба охайна та доглянута. Хто неї володіє та що всередині - невідомо."));
        mlist.add(new ItemCategory(73,R.drawable.cat7_bobroviza1, "Садиба Катериничів","Бобровиця, Чернігівська обл. 1910р.","Садиба Катериничів у Бобровиці.\n" +
                "Споруда 1910 року побудови. Належала родині Петра Петровича Катеринича, відомого мецената, цукровара й члена Товариства імені Тараса Шевченка. Разом з найближчим парком, який зберігся, вважалася його родовим маєтком.\n" +
                "Дах і головний вхід прикрашають візерунчасті металеві решітки які, УЯВІТЬ СОБІ, збереглись ще з 1910 року!! Як вони залишились, і їх не розікрали на метал- справжнє диво..\n" +
                "Багато вікон. Деякі з них без скла, оскільки будівля не реставрується. Сходи та інші частини будови частково зруйновані. Не так давно, коли в Бобровиці ще працював цукровий завод, тут проводили місцеву \"заводську\" дискотеку. Нині у споруді розміщується бібліотека і спортивний клуб.\n"));
        mlist.add(new ItemCategory(74,R.drawable.cat7_mejigirria1, "Межигір'я","Нові Петрівці, Київська обл. 2000-ні.","Колишня резиденція Віктора Януковича з 2002-2014 роки. Територія 140 га. Це величезний комплекс будівель, парків, озер з власним зоопарком, фермою, гаражем на десятки авто (в ньому ж зараз експонуються раритетні авто). Нажаль всесвітньо відомий золотий унітаз поцуплено. Загалом на сьогодні чудове місце, щоб на природі провести день. Вхід платний."));

        Adapter_recycler adapter = new Adapter_recycler(this, mlist);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}