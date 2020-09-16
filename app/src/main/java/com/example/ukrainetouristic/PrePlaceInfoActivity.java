package com.example.ukrainetouristic;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;

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
        List<item> mlist = new ArrayList<>();
        mlist.add(new item(0,R.drawable.mp1, "","Київ "));
        mlist.add(new item(1,R.drawable.mp2, "Підгоре́цький за́мок","Підгірці, Львівська обл. 1635-1640р."));
        mlist.add(new item(2,R.drawable.mp3, "Бучацький замок","Бучач, Тернопільська обл. 16ст."));
        mlist.add(new item(3,R.drawable.mp4, "Palace","fghjklcvbnm,rtyuiop"));
        mlist.add(new item(4,R.drawable.mp5, "Palace","fghjklcvbnm,rtyuiop"));
        mlist.add(new item(5,R.drawable.mp5, "Palace","fghjklcvbnm,rtyuiop"));
        mlist.add(new item(6,R.drawable.mp5, "Palace","fghjklcvbnm,rtyuiop"));
        mlist.add(new item(7,R.drawable.mp5, "Palace","fghjklcvbnm,rtyuiop"));
        mlist.add(new item(8,R.drawable.mp5, "Palace","fghjklcvbnm,rtyuiop"));
        mlist.add(new item(9,R.drawable.mp5, "Palace","fghjklcvbnm,rtyuiop"));
        Adapter_recycler adapter = new Adapter_recycler(this, mlist);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}
