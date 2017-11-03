package pl.maniak.example.ui.help;


import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import pl.maniak.example.ui.help.fragment.HelpDayNightFragment;
import pl.maniak.example.ui.help.fragment.HelpMainFragment;

public class HelpSectionsPageAdapter extends FragmentPagerAdapter {

    public HelpSectionsPageAdapter(FragmentManager fragmentManager) {
        super(fragmentManager);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new HelpMainFragment();
            default:
                return new HelpDayNightFragment();
        }
    }

    @Override
    public int getCount() {
        return 2;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0:
                return "Help Main";
            default:
                return "Day Night Theme";
        }
    }
}
