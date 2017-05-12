package com.example.illum.photogallery;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by illum on 5/12/2017.
 */

public class PhotoGalleryFragment extends Fragment {
    @BindView(R.id.fragment_photo_gallery_recycler_view)
    RecyclerView mPhotoRecyclerView;

    public static PhotoGalleryFragment newInstance() {
        return new PhotoGalleryFragment();
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRetainInstance(true);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_photo_gallery, container,
                false);
        ButterKnife.bind(this, v);
        mPhotoRecyclerView.setLayoutManager(new GridLayoutManager
                (getActivity(), 3));
        return v;
    }
}
