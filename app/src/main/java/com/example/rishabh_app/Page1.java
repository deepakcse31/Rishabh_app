package com.example.rishabh_app;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.bumptech.glide.Glide;

public class Page1 extends Fragment {


    public Page1() {
        // required empty public constructor.
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_page_1, container, false);
//        Glide.with(requireView()).load(profileimage)
//                .placeholder(CShowProgress.getInstance().getCircularProgressDrawable(mContext))
//                .error(R.drawable.ic_placeholder)
//                .into(binding.ivProfilenew);

    }
}


