package pl.maniak.example.ui.help;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import butterknife.BindView;
import butterknife.ButterKnife;
import pl.maniak.example.R;

public class HelpActivity extends AppCompatActivity {

    @BindView(R.id.container)
    ViewPager viewPager;

    @BindView(R.id.tabs)
    TabLayout tabLayout;

    private HelpSectionsPageAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_help);
        ButterKnife.bind(this);

        adapter = new HelpSectionsPageAdapter(getSupportFragmentManager());
        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);
    }
}
