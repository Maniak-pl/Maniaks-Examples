package pl.maniak.example.ui.help;


import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import pl.maniak.example.ui.help.fragment.HelpDayNightFragment;
import pl.maniak.example.ui.help.fragment.HelpLightSensorFragment;
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
            case 1:
                return new HelpDayNightFragment();
            default:
                return new HelpLightSensorFragment();
        }

    }

    @Override
    public int getCount() {
        return 3;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0:
                return "Help Main";
            case 1:
                return "Day Night Theme";
            default:
                return "Light Sensor";
        }
    }
}
