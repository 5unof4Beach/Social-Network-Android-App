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
import com.materialuiux.socialmediaapp.adapter.Ad_Search;
import com.materialuiux.socialmediaapp.model.Search;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class Fr_Search extends Fragment {

    Context mContext;
    RecyclerView recyclerView;

    public Fr_Search() {
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
        return inflater.inflate(R.layout.fr_search, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        recyclerView = view.findViewById(R.id.RecyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(mContext));
        Ad_Search ad_search = new Ad_Search(mContext, getdata());
        recyclerView.setAdapter(ad_search);
    }

    private ArrayList<Search> getdata() {
        ArrayList<Search> arrayList = new ArrayList<>();
        arrayList.add(new Search("Yuna Tamago", "https://i.imgur.com/CKt7CUVl.jpg"));
        arrayList.add(new Search("Eva", "https://i.pinimg.com/originals/e9/dd/65/e9dd658cc3077c0c18e45189337d08fb.jpg"));
        return arrayList;
    }
}
