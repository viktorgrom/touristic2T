package com.example.ukrainetouristic.category;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;

import com.example.ukrainetouristic.R;

import java.util.ArrayList;
import java.util.List;

public class PrePlaceInfoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recycler_view_item);

        Window w = getWindow();
        w.setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS, WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);

        RecyclerView recyclerView = findViewById(R.id.rv_list);
        List<ItemCategory> mlist = new ArrayList<>();
        mlist.add(new ItemCategory(0,R.drawable.mp1, "","Київ ","12"));
        mlist.add(new ItemCategory(1,R.drawable.mp2, "Підгоре́цький за́мок","Підгірці, Львівська обл. 1635-1640р.","12"));
        mlist.add(new ItemCategory(2,R.drawable.mp3, "Бучацький замок","Бучач, Тернопільська обл. 16ст.","12"));
        mlist.add(new ItemCategory(3,R.drawable.mp4, "Palace","fghjklcvbnm,rtyuiop","12"));
        mlist.add(new ItemCategory(4,R.drawable.mp5, "Palace","fghjklcvbnm,rtyuiop","12"));
        mlist.add(new ItemCategory(5,R.drawable.mp5, "Palace","fghjklcvbnm,rtyuiop","12"));
        mlist.add(new ItemCategory(6,R.drawable.mp5, "Palace","fghjklcvbnm,rtyuiop","12"));
        mlist.add(new ItemCategory(7,R.drawable.mp5, "Palace","fghjklcvbnm,rtyuiop","12"));
        mlist.add(new ItemCategory(8,R.drawable.mp5, "Palace","fghjklcvbnm,rtyuiop","12"));
        mlist.add(new ItemCategory(9,R.drawable.mp5, "Palace","fghjklcvbnm,rtyuiop","12"));
        Adapter_recycler adapter = new Adapter_recycler(this, mlist);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}
