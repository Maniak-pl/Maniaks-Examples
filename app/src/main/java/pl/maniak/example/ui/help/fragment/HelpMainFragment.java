package pl.maniak.example.ui.help.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import pl.maniak.example.R;
import pl.maniak.example.util.log.L;


public class HelpMainFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        L.i("HelpMainFragment.onCreateView() ");
        ViewGroup root = (ViewGroup) inflater.inflate(R.layout.fragment_help_main, null);
        return root;
    }
}
