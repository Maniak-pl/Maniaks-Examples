package pl.maniak.example.ui.help.fragment;

import android.app.Service;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.support.v7.app.AppCompatDelegate;
import android.widget.ImageView;
import android.widget.TextView;

import butterknife.BindView;
import pl.maniak.example.R;
import pl.maniak.example.ui.BaseFragment;

public class HelpLightSensorFragment extends BaseFragment implements SensorEventListener {

    @BindView(R.id.lightSensore)
    TextView lightSensore;

    @BindView(R.id.lightImage)
    ImageView imageView;

    SensorManager sensorManager;
    Sensor sensor;

    static boolean isNightMode = false;
    static boolean isDayMode = false;

    @Override
    protected int getLayoutId() {
        return R.layout.fragment_help_light_sensor;
    }

    @Override
    protected void init() {
        super.init();
        sensorManager = (SensorManager) getActivity().getSystemService(Service.SENSOR_SERVICE);
        sensor = sensorManager.getDefaultSensor(Sensor.TYPE_LIGHT);
    }

    @Override
    public void onResume() {
        super.onResume();
        sensorManager.registerListener(this, sensor, SensorManager.SENSOR_DELAY_FASTEST);
    }

    @Override
    public void onSensorChanged(SensorEvent event) {
        if(event.sensor.getType() == Sensor.TYPE_LIGHT && lightSensore != null) {
            float light = event.values[0];
            lightSensore.setText(""+String.valueOf(light));
            if(light >1) {
                if(!isDayMode) {
                    AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);
                    isDayMode = true;
                    isNightMode = false;
                    getActivity().recreate();

                }
            }else {
                if(!isNightMode) {
                    AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES);
                    isNightMode = true;
                    isDayMode = false;
                    getActivity().recreate();
                }
            }
        }
    }

    @Override
    public void onAccuracyChanged(Sensor sensor, int accuracy) {

    }
}