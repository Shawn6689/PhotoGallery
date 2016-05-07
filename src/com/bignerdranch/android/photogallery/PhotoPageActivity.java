package com.bignerdranch.android.photogallery;

import android.support.v4.app.Fragment;

/**
 * Created by shawn on 5/3/2016.
 */
public class PhotoPageActivity extends SingleFragmentActivity {
    @Override
    public Fragment createFragment() {
        return new PhotoPageFragment();
    }
}
