package zorail.rohan.com.myprofiler.profilesettings;


import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import zorail.rohan.com.myprofiler.R;

/**
 * Created by zorail on 16-May-17.
 */

public class ProfileSettingsActivity extends AppCompatActivity {

    private static final String SETTINGS_FRAGMENT = "SETTINGS_FRAGMENT";

    private FragmentManager manager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_settings);

        setSupportActionBar((Toolbar) findViewById(R.id.toolbar_settings));
        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle(R.string.activity_settings);

        manager = getSupportFragmentManager();

        ProfileSettingsFragment fragment = (ProfileSettingsFragment) manager.findFragmentByTag(SETTINGS_FRAGMENT);

        if (fragment == null) {
            fragment = ProfileSettingsFragment.newInstance();
        }

        FragmentTransaction transaction = manager.beginTransaction();
        transaction.replace(R.id.cont_settings_fragment, fragment, SETTINGS_FRAGMENT)
                .commit();

    }
}
