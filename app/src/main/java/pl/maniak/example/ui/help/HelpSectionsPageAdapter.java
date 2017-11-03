package pl.maniak.example.ui.help;


import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import pl.maniak.example.ui.help.fragment.HelpMainFragment;

public class HelpSectionsPageAdapter extends FragmentPagerAdapter{

    public HelpSectionsPageAdapter(FragmentManager fragmentManager) {
        super(fragmentManager);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                default:
                    return new HelpMainFragment();
        }
    }

    @Override
    public int getCount() {
        return 1;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            default:
                return "HelpMain";
        }
    }
}
