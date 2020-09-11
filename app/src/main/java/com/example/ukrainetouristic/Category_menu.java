package com.example.ukrainetouristic;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class Category_menu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category_menu);
    }
    public void process_category(View view) {
        Intent intent = null;
        if (view.getId() == R.id.place_category1) {
            intent = new Intent(this, Pre_place_info_activity_zamku.class);

            startActivity(intent);
        }
        else if (view.getId() == R.id.place_category2) {
            intent = new Intent(this, Pre_place_info_activity_palaces.class);

            startActivity(intent);
        }
        else if (view.getId() == R.id.place_category3) {
            intent = new Intent(this, Pre_place_info_activity_pam_prurody.class);

            startActivity(intent);
        }
        else if (view.getId() == R.id.place_category4) {
            intent = new Intent(this, Pre_place_info_activity_zikavi_miszia.class);

            startActivity(intent);
        }
        else if (view.getId() == R.id.place_category5) {
            intent = new Intent(this, Pre_place_info_activity_religiini_sporydu.class);

            startActivity(intent);
        }
        else if (view.getId() == R.id.place_category6) {
            intent = new Intent(this, Pre_place_info_activity_parku.class);

            startActivity(intent);
        }
        else if (view.getId() == R.id.place_category7) {
            intent = new Intent(this, Pre_place_info_activity_panski_sadibi.class);

            startActivity(intent);
        }
        else if(view.getId() == R.id.place_category8) {
            intent = new Intent(this, Pre_place_info_activity_zikavi_mista.class);

            startActivity(intent);
        }

    }
}
