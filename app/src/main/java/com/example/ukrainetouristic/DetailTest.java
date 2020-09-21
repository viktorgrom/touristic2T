package com.example.ukrainetouristic;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.ukrainetouristic.category.ItemCategory;

public class DetailTest extends AppCompatActivity {
    public static final String EXTRA_MOUNTAIN = "extra_mountain";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_test);
        ImageView imageView= findViewById(R.id.image_detail);
        TextView name = findViewById(R.id.title_detail);
        TextView description = findViewById(R.id.descr_detail);
        TextView describeLong = findViewById(R.id.tv_long_descr_detail);

        ItemCategory itemCategory = getIntent().getParcelableExtra(EXTRA_MOUNTAIN);

        assert itemCategory != null;
        name.setText(itemCategory.getProfileName());
        description.setText(itemCategory.getProfileDescribe());
        describeLong.setText(itemCategory.getProfileLongDescribe());
        imageView.setImageResource(itemCategory.getBackground());
    }
}