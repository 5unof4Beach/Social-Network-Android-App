package com.materialuiux.socialmediaapp.fragment;


import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.materialuiux.socialmediaapp.R;
import com.materialuiux.socialmediaapp.adapter.Ad_Follow;
import com.materialuiux.socialmediaapp.adapter.Ad_Search;
import com.materialuiux.socialmediaapp.model.Follow;
import com.materialuiux.socialmediaapp.model.Search;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class Fr_follow extends Fragment {

    Context mContext;
    RecyclerView recyclerView;

    public Fr_follow() {
        // Required empty public constructor
    }

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        mContext = context;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fr_follow, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        recyclerView = view.findViewById(R.id.RecyclerView);
        Ad_Follow ad_follow = new Ad_Follow(mContext, getdata());

        recyclerView .setLayoutManager(new LinearLayoutManager(mContext));
        recyclerView.setAdapter(ad_follow);
    }

    private ArrayList<Follow> getdata() {
        ArrayList<Follow> arrayList = new ArrayList<>();
        arrayList.add(new Follow("Yuna Tamago", "https://i.imgur.com/CKt7CUVl.jpg"));
        return arrayList;
    }


}
