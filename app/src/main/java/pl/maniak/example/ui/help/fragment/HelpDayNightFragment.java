package pl.maniak.example.ui.help.fragment;

import android.support.v7.app.AppCompatDelegate;

import butterknife.OnClick;
import pl.maniak.example.R;
import pl.maniak.example.ui.BaseFragment;

public class HelpDayNightFragment extends BaseFragment {

    @Override
    protected int getLayoutId() {
        return R.layout.fragment_help_day_night;
    }

    @OnClick(R.id.buttonAutoMode)
    void buttonAutoMode() {
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_AUTO);
        recreate();
    }

    @OnClick(R.id.buttonDayMode)
    void buttonDayMode() {
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);
        recreate();
    }

    @OnClick(R.id.buttonNightMode)
    void buttonNightMode() {
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES);
        recreate();
    }

    private void recreate() {
        getActivity().recreate();
    }
}