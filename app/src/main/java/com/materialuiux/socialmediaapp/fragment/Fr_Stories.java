package com.materialuiux.socialmediaapp.fragment;


import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.materialuiux.socialmediaapp.R;
import com.materialuiux.socialmediaapp.utility.StoriesProgressView;

/**
 * A simple {@link Fragment} subclass.
 */
public class Fr_Stories extends Fragment implements StoriesProgressView.StoriesListener {


    public Fr_Stories() {
        // Required empty public constructor
    }

    Context mContext;
    private static final int PROGRESS_COUNT = 2;

    private StoriesProgressView storiesProgressView;
    private ImageView image , close;

    private int counter = 0;
    private final String[] resources = new String[]{
            "https://i.imgur.com/CKt7CUVl.jpg",
            "data:image/jpeg;base64,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"
    };


    long pressTime = 0L;
    long limit = 500L;

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        mContext = context;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        return inflater.inflate(R.layout.fr_stories, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        storiesProgressView = view.findViewById(R.id.stories);
        storiesProgressView.setStoriesCount(PROGRESS_COUNT);
        storiesProgressView.setStoryDuration(3000L);
        storiesProgressView.setStoriesListener(this);
        counter = 0;
        storiesProgressView.startStories(counter);
        image = (ImageView) view.findViewById(R.id.image);
        Glide.with(mContext).load(resources[counter]).into(image);
        close = view.findViewById(R.id.close_image);
        close.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onComplete();
            }
        });
        // bind reverse view
        View reverse =view. findViewById(R.id.reverse);
        reverse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                storiesProgressView.reverse();
            }
        });
        reverse.setOnTouchListener(onTouchListener);

        // bind skip view
        View skip =view. findViewById(R.id.skip);
        skip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                storiesProgressView.skip();
            }
        });
        skip.setOnTouchListener(onTouchListener);

    }

    private View.OnTouchListener onTouchListener = new View.OnTouchListener() {
        @Override
        public boolean onTouch(View v, MotionEvent event) {
            switch (event.getAction()) {
                case MotionEvent.ACTION_DOWN:
                    pressTime = System.currentTimeMillis();
                    storiesProgressView.pause();
                    return false;
                case MotionEvent.ACTION_UP:
                    long now = System.currentTimeMillis();
                    storiesProgressView.resume();
                    return limit < now - pressTime;
            }
            return false;
        }
    };
    @Override
    public void onNext() {
        Glide.with(mContext).load(resources[++counter]).into(image);

    }

    @Override
    public void onPrev() {
        if ((counter - 1) < 0) return;
        Glide.with(mContext).load(resources[--counter]).into(image);
    }

    @Override
    public void onComplete() {
        getActivity().finish();
    }

    @Override
    public void onDestroy() {
        // Very important !
        storiesProgressView.destroy();
        super.onDestroy();
    }


    @Override
    public void onResume() {
        super.onResume();
        getActivity().getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);
    }

    @Override
    public void onPause() {
        super.onPause();
        getActivity().getWindow().clearFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);
    }
}
