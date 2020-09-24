package com.example.ukrainetouristic.testplaceInfo;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.example.ukrainetouristic.R;


public class ViewPagerItemFragment extends Fragment {
    // widgets
    private ImageView mImage;
    private TextView mTitle, mDescribe;

    // vars
    private Hat mHat;

    public static ViewPagerItemFragment getInstance(Hat hat) {
        ViewPagerItemFragment fragment = new ViewPagerItemFragment();

        if (hat != null) {
            Bundle bundle = new Bundle();
            bundle.putParcelable("hat", hat);
            fragment.setArguments(bundle);
        }
        return fragment;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mHat = getArguments().getParcelable("hat");
        }
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_viewpager_item, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        mImage = view.findViewById(R.id.image);
        mTitle = view.findViewById(R.id.title);
        mDescribe = view.findViewById(R.id.describe);
        init();
    }

    private void init() {
        if (mHat != null) {
            RequestOptions options = new RequestOptions()
                    .placeholder(R.drawable.ic_launcher_background);

            Glide.with(getActivity())
                    .setDefaultRequestOptions(options)
                    .load(mHat.getImage())
                    .into(mImage);

            mTitle.setText(mHat.getTitle());
            mDescribe.setText(mHat.getDescribe());
        }
    }
}
