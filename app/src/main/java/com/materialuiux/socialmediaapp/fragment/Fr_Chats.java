/*
 * *
 *  * Created by Mohammed Alsudani on 7/14/19 12:45 AM
 *   linkedin =  https://www.linkedin.com/in/alsudani-mohammed-259a28152
 *  * Copyright (c) 2019 . All rights reserved.
 *  * Last modified 7/14/19 12:45 AM
 *
 */

package com.materialuiux.socialmediaapp.fragment;


import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.materialuiux.socialmediaapp.R;
import com.materialuiux.socialmediaapp.adapter.Ad_Chat;
import com.materialuiux.socialmediaapp.adapter.Ad_list;
import com.materialuiux.socialmediaapp.model.Chat;
import com.materialuiux.socialmediaapp.model.Search;
import com.materialuiux.socialmediaapp.model.Stories;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class Fr_Chats extends Fragment {

    private RecyclerView Chats_Recycler, Stores_Recycler;
    private Context mContext;
    private Ad_Chat ad_chats;

    public Fr_Chats() {
        // Required empty public constructor
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        this.mContext = context;
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fr_chat, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);


        Chats_Recycler = view.findViewById(R.id.RecyclerView);
        Stores_Recycler = view.findViewById(R.id.RecyclerViewStores);


        Chats_Recycler.setLayoutManager(new LinearLayoutManager(mContext));
        Chats_Recycler.setHasFixedSize(true);
        ad_chats = new Ad_Chat(getChatData(), mContext);
        Chats_Recycler.setAdapter(ad_chats);

        Stores_Recycler.setLayoutManager(new LinearLayoutManager(mContext, RecyclerView.HORIZONTAL, false));
        Chats_Recycler.setHasFixedSize(true);
        Ad_list ad_list = new Ad_list(getData(), mContext);
        Stores_Recycler.setAdapter(ad_list);


    }

    private ArrayList<Chat> getChatData() {
        ArrayList<Chat> arrayList = new ArrayList<>();
        arrayList.add(new Chat("Bùi Minh Đức","https://scontent.fhan14-3.fna.fbcdn.net/v/t1.15752-9/328751482_1319476191932232_3658527045561472947_n.jpg?_nc_cat=102&ccb=1-7&_nc_sid=ae9488&_nc_ohc=FoIA3PgmEeMAX9dB65v&_nc_ht=scontent.fhan14-3.fna&oh=03_AdQyKrKHeAR1PlYURjAQw5p_aRciSMKiuAExE45gPuchfA&oe=64244356", "20 cm"));
        arrayList.add(new Chat("Phùng Đức Cường","https://scontent.fhan14-2.fna.fbcdn.net/v/t1.15752-9/329244816_1260906708114829_5227376400988298423_n.jpg?_nc_cat=108&ccb=1-7&_nc_sid=ae9488&_nc_ohc=tiEvsuSsaTkAX8ZFotE&_nc_ht=scontent.fhan14-2.fna&oh=03_AdRFbkwqV7coPThs-p_KMLst2VS1Y3D2WIbpjlRZq0WCcA&oe=6424465C", "Chào e"));
        arrayList.add(new Chat("Đinh Văn Giới","https://scontent.fhan14-3.fna.fbcdn.net/v/t1.15752-9/327523475_2542077852597433_3495141376131933026_n.jpg?_nc_cat=104&ccb=1-7&_nc_sid=ae9488&_nc_ohc=DJCONJcwcmEAX-_BiON&_nc_ht=scontent.fhan14-3.fna&oh=03_AdSH-FwqpvDZUSnErg5Pk2bE4fEdIgZH_nzDv3dB05vbeQ&oe=642422AB", "e ăn cơm chưa"));
        return arrayList;
    }

    private ArrayList<Stories> getData() {
        ArrayList<Stories> arrayList = new ArrayList<>();
        arrayList.add(new Stories("Bùi Minh Đức","https://scontent.fhan14-3.fna.fbcdn.net/v/t1.15752-9/328751482_1319476191932232_3658527045561472947_n.jpg?_nc_cat=102&ccb=1-7&_nc_sid=ae9488&_nc_ohc=FoIA3PgmEeMAX9dB65v&_nc_ht=scontent.fhan14-3.fna&oh=03_AdQyKrKHeAR1PlYURjAQw5p_aRciSMKiuAExE45gPuchfA&oe=64244356"));
        arrayList.add(new Stories("Phùng Đức Cường","https://scontent.fhan14-2.fna.fbcdn.net/v/t1.15752-9/329244816_1260906708114829_5227376400988298423_n.jpg?_nc_cat=108&ccb=1-7&_nc_sid=ae9488&_nc_ohc=tiEvsuSsaTkAX8ZFotE&_nc_ht=scontent.fhan14-2.fna&oh=03_AdRFbkwqV7coPThs-p_KMLst2VS1Y3D2WIbpjlRZq0WCcA&oe=6424465C"));
        arrayList.add(new Stories("Đinh Văn Giới","https://scontent.fhan14-3.fna.fbcdn.net/v/t1.15752-9/327523475_2542077852597433_3495141376131933026_n.jpg?_nc_cat=104&ccb=1-7&_nc_sid=ae9488&_nc_ohc=DJCONJcwcmEAX-_BiON&_nc_ht=scontent.fhan14-3.fna&oh=03_AdSH-FwqpvDZUSnErg5Pk2bE4fEdIgZH_nzDv3dB05vbeQ&oe=642422AB"));
        return arrayList;
    }


}
