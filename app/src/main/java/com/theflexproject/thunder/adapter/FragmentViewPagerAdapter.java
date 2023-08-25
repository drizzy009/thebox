package com.theflexproject.thunder.adapter;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.theflexproject.thunder.fragments.FilesLibraryFragment;
import com.theflexproject.thunder.fragments.MovieLibraryFragment;
import com.theflexproject.thunder.fragments.TvShowsLibraryFragment;

public class FragmentViewPagerAdapter extends FragmentStateAdapter {


    public FragmentViewPagerAdapter(@NonNull Fragment fragment) {
        super(fragment);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        if(position==0){
                return new MovieLibraryFragment();
        }else if(position==1){
                return new TvShowsLibraryFragment();
        }else {
                return new FilesLibraryFragment();
        }
    }



    @Override
    public int getItemCount() {
        return 3;
    }


}
