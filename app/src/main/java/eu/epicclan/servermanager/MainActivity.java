package eu.epicclan.servermanager;

import android.content.SharedPreferences;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import eu.epicclan.servermanager.manager.LoginManager;
import eu.epicclan.servermanager.manager.ServerManager;

public class MainActivity extends AppCompatActivity {

    public static ServerManager manager;
    public static MainActivity main;

    public static SharedPreferences pref;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        main = this;

        LoginManager.loadSavedLogin();
        new ServerManager();
    }

}
