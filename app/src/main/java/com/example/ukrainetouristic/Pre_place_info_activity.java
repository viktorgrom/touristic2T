package com.example.ukrainetouristic;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;

import java.util.ArrayList;
import java.util.List;

public class Pre_place_info_activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recycler_view_item);

        Window w = getWindow();
        w.setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS, WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);

        RecyclerView recyclerView = findViewById(R.id.rv_list);
        List<item> mlist = new ArrayList<>();
        mlist.add(new item(R.drawable.mp1, "Palace","fghjklcvbnm,rtyuiop"));
        mlist.add(new item(R.drawable.mp2, "Palace","fghjklcvbnm,rtyuiop"));
        mlist.add(new item(R.drawable.mp3, "Palace","fghjklcvbnm,rtyuiop"));
        mlist.add(new item(R.drawable.mp4, "Palace","fghjklcvbnm,rtyuiop"));
        mlist.add(new item(R.drawable.mp5, "Palace","fghjklcvbnm,rtyuiop"));
        mlist.add(new item(R.drawable.mp5, "Palace","fghjklcvbnm,rtyuiop"));
        mlist.add(new item(R.drawable.mp5, "Palace","fghjklcvbnm,rtyuiop"));
        mlist.add(new item(R.drawable.mp5, "Palace","fghjklcvbnm,rtyuiop"));
        mlist.add(new item(R.drawable.mp5, "Palace","fghjklcvbnm,rtyuiop"));
        Adapter_recycler adapter = new Adapter_recycler(this, mlist);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}
