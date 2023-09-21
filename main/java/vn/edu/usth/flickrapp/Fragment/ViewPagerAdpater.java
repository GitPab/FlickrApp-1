package vn.edu.usth.flickrapp.Fragment;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStateManagerControl;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class ViewPagerAdpater extends FragmentStateAdapter {

    public ViewPagerAdpater(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position) {
            case 0:
                return new NewsFragment();
            case 1:
                return new SearchFragment();
            case 2:
                return new CameraAccess();
            case 3:
                return new NotificationFragment();
            case 4 :
                return new ProfileFragment();
            default:
                return new NewsFragment();
        }
    }

    @Override
    public int getItemCount() {
        return 5;
    }
}
