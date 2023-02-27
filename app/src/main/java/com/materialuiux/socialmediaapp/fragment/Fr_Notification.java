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
import com.materialuiux.socialmediaapp.adapter.Ad_Notification;
import com.materialuiux.socialmediaapp.model.Notification;
import com.materialuiux.socialmediaapp.model.Search;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class Fr_Notification extends Fragment {

    private Context mContext;
    private RecyclerView recyclerView;

    public Fr_Notification() {
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
        return inflater.inflate(R.layout.fr_notification, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        recyclerView = view.findViewById(R.id.RecyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(mContext));
        Ad_Notification ad_notification = new Ad_Notification(mContext, getData());
        recyclerView.setAdapter(ad_notification);


    }
    private ArrayList<Notification> getData() {
        ArrayList<Notification> arrayList = new ArrayList<>();
        arrayList.add(new Notification("Bùi Minh Đức","https://scontent.fhan14-3.fna.fbcdn.net/v/t1.15752-9/328751482_1319476191932232_3658527045561472947_n.jpg?_nc_cat=102&ccb=1-7&_nc_sid=ae9488&_nc_ohc=FoIA3PgmEeMAX9dB65v&_nc_ht=scontent.fhan14-3.fna&oh=03_AdQyKrKHeAR1PlYURjAQw5p_aRciSMKiuAExE45gPuchfA&oe=64244356"));
        arrayList.add(new Notification("Phùng Đức Cường","https://scontent.fhan14-2.fna.fbcdn.net/v/t1.15752-9/329244816_1260906708114829_5227376400988298423_n.jpg?_nc_cat=108&ccb=1-7&_nc_sid=ae9488&_nc_ohc=tiEvsuSsaTkAX8ZFotE&_nc_ht=scontent.fhan14-2.fna&oh=03_AdRFbkwqV7coPThs-p_KMLst2VS1Y3D2WIbpjlRZq0WCcA&oe=6424465C"));
        arrayList.add(new Notification("Đinh Văn Giới","https://scontent.fhan14-3.fna.fbcdn.net/v/t1.15752-9/327523475_2542077852597433_3495141376131933026_n.jpg?_nc_cat=104&ccb=1-7&_nc_sid=ae9488&_nc_ohc=DJCONJcwcmEAX-_BiON&_nc_ht=scontent.fhan14-3.fna&oh=03_AdSH-FwqpvDZUSnErg5Pk2bE4fEdIgZH_nzDv3dB05vbeQ&oe=642422AB"));
        return arrayList;
    }
}
