package com.materialuiux.socialmediaapp.adapter.holder;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.materialuiux.socialmediaapp.R;

public class ViewHolderFollow extends RecyclerView.ViewHolder {

    public ImageView profileImage;
    public TextView text_name;

    public ViewHolderFollow(@NonNull View itemView) {
        super(itemView);
        profileImage = itemView.findViewById(R.id.profileImage);
        text_name = itemView.findViewById(R.id.User_Name);
    }
}
