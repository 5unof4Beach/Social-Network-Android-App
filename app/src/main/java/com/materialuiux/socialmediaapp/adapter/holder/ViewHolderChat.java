package com.materialuiux.socialmediaapp.adapter.holder;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.materialuiux.socialmediaapp.R;
import com.materialuiux.socialmediaapp.model.Chat;

public class ViewHolderChat extends RecyclerView.ViewHolder {

    public ImageView profileImage;
    public TextView name, message;

    public ViewHolderChat(@NonNull View itemView, Context mContext) {
        super(itemView);
        profileImage = itemView.findViewById(R.id.profileImage);
        name = itemView.findViewById(R.id.UserName);
        message = itemView.findViewById(R.id.lastMessage);

    }

}
