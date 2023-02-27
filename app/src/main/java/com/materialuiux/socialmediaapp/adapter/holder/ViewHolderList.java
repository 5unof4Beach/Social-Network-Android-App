package com.materialuiux.socialmediaapp.adapter.holder;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.AdapterView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearSnapHelper;
import androidx.recyclerview.widget.RecyclerView;

import com.materialuiux.socialmediaapp.R;
import com.materialuiux.socialmediaapp.adapter.Ad_list;
import com.materialuiux.socialmediaapp.model.Post;
import com.materialuiux.socialmediaapp.model.Stories;
import com.materialuiux.socialmediaapp.utility.CenterZoomLayoutManager;

import java.util.ArrayList;

public class ViewHolderList extends RecyclerView.ViewHolder {

    private RecyclerView recyclerView;
    CenterZoomLayoutManager centerZoomLayoutManager;
    LinearSnapHelper snapHelper;

    public ViewHolderList(@NonNull View itemView, Context mContext) {
        super(itemView);
        recyclerView = itemView.findViewById(R.id.RecyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setNestedScrollingEnabled(false);
        recyclerView.setFocusable(false);
        centerZoomLayoutManager = new CenterZoomLayoutManager(mContext, RecyclerView.HORIZONTAL, false);
        recyclerView.setLayoutManager(centerZoomLayoutManager);
        snapHelper = new LinearSnapHelper();
        snapHelper.attachToRecyclerView(recyclerView);
        recyclerView.setOnFlingListener(snapHelper);
        Ad_list ad_list = new Ad_list(getData(), mContext);
        recyclerView.setAdapter(ad_list);
        recyclerView.smoothScrollToPosition(1);

    }

    public void setData(Post post, Context mContext) {

    }

    private ArrayList<Stories> getData() {
        ArrayList<Stories> arrayList = new ArrayList<>();
        arrayList.add(new Stories("yuna_tamago", "https://www.ffok123.com/zb_users/upload/2021/11/20211118150004163721880451063.jpeg"));
        arrayList.add(new Stories("eva", "https://i.pinimg.com/originals/e9/dd/65/e9dd658cc3077c0c18e45189337d08fb.jpg"));

        return arrayList;
    }
}
