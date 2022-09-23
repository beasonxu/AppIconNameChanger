package in.myinnos.changeappiconandname;

import android.content.ComponentName;
import android.content.pm.PackageManager;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import in.myinnos.library.AppIconNameChanger;

public class MainActivity extends AppCompatActivity {

    Button btSettings, btMessage, btCamera;
    String activeName;
    List<String> disableNames = new ArrayList<String>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btSettings = (Button) findViewById(R.id.btSettings);
        btMessage = (Button) findViewById(R.id.btMessage);
        btCamera = (Button) findViewById(R.id.btCamera);

        btSettings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                final PackageManager manager=getPackageManager();
                Handler handler = new Handler();
                handler.post(new Runnable() {
                    @Override
                    public void run() {
                        manager.setComponentEnabledSetting(new ComponentName(MainActivity.this,"in.myinnos.changeappiconandname.MainActivity")
                                ,PackageManager.COMPONENT_ENABLED_STATE_DISABLED,PackageManager.DONT_KILL_APP);
                        manager.setComponentEnabledSetting(new ComponentName(MainActivity.this,"in.myinnos.changeappiconandname.MainActivity.setting")
                                ,PackageManager.COMPONENT_ENABLED_STATE_ENABLED,PackageManager.DONT_KILL_APP);
                        manager.setComponentEnabledSetting(new ComponentName(MainActivity.this,"in.myinnos.changeappiconandname.MainActivity.chrome")
                                ,PackageManager.COMPONENT_ENABLED_STATE_DISABLED,PackageManager.DONT_KILL_APP);
                        MainActivity.this.finish();

                    }
                });


            }
        });

        btMessage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final PackageManager manager=getPackageManager();
                Handler handler = new Handler();
                handler.post(new Runnable() {
                    @Override
                    public void run() {
                        manager.setComponentEnabledSetting(new ComponentName(MainActivity.this,"in.myinnos.changeappiconandname.MainActivity")
                                ,PackageManager.COMPONENT_ENABLED_STATE_DISABLED,PackageManager.DONT_KILL_APP);
                        manager.setComponentEnabledSetting(new ComponentName(MainActivity.this,"in.myinnos.changeappiconandname.MainActivity.setting")
                                ,PackageManager.COMPONENT_ENABLED_STATE_DISABLED,PackageManager.DONT_KILL_APP);
                        manager.setComponentEnabledSetting(new ComponentName(MainActivity.this,"in.myinnos.changeappiconandname.MainActivity.chrome")
                                ,PackageManager.COMPONENT_ENABLED_STATE_ENABLED,PackageManager.DONT_KILL_APP);
                        MainActivity.this.finish();

                    }
                });
            }
        });

        btCamera.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final PackageManager manager=getPackageManager();
                Handler handler = new Handler();
                handler.post(new Runnable() {
                    @Override
                    public void run() {
                        manager.setComponentEnabledSetting(new ComponentName(MainActivity.this,"in.myinnos.changeappiconandname.MainActivity")
                                ,PackageManager.COMPONENT_ENABLED_STATE_ENABLED,PackageManager.DONT_KILL_APP);
                        manager.setComponentEnabledSetting(new ComponentName(MainActivity.this,"in.myinnos.changeappiconandname.MainActivity.setting")
                                ,PackageManager.COMPONENT_ENABLED_STATE_DISABLED,PackageManager.DONT_KILL_APP);
                        manager.setComponentEnabledSetting(new ComponentName(MainActivity.this,"in.myinnos.changeappiconandname.MainActivity.chrome")
                                ,PackageManager.COMPONENT_ENABLED_STATE_DISABLED,PackageManager.DONT_KILL_APP);
                        MainActivity.this.finish();

                    }
                });
            }
        });



    }

    private void changeicon() {

        // enable old icon


    }

    private void newicon() {

        // enable old icon
        final PackageManager manager=getPackageManager();
        Handler handler = new Handler();
        handler.post(new Runnable() {
            @Override
            public void run() {
                // enable new icon
                manager.setComponentEnabledSetting(new ComponentName(MainActivity.this,"in.myinnos.changeappiconandname.MainActivitySettings")
                        ,PackageManager.COMPONENT_ENABLED_STATE_DISABLED,PackageManager.DONT_KILL_APP);
                manager.setComponentEnabledSetting(new ComponentName(MainActivity.this,"in.myinnos.changeappiconandname.MainActivity")
                        ,PackageManager.COMPONENT_ENABLED_STATE_ENABLED,PackageManager.DONT_KILL_APP);

              //  Toast.makeText(MainActivity.this,"Enable New Icon" ,Toast.LENGTH_LONG).show();
            }
        });

    }


}
