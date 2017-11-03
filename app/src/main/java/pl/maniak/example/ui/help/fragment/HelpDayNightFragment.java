package pl.maniak.example.ui.help.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatDelegate;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import butterknife.ButterKnife;
import butterknife.OnClick;
import pl.maniak.example.R;
import pl.maniak.example.util.log.L;

public class HelpDayNightFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        L.i("HelpDayNightFragment.onCreateView() ");
        ViewGroup root = (ViewGroup) inflater.inflate(R.layout.fragment_help_day_night, null);
        ButterKnife.bind(this, root);
        return root;
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