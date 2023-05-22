package sg.edu.rp.c346.id22016809.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import java.util.ArrayList;

public class ModuleActivity extends AppCompatActivity {

    Module c346 = new Module("C346", "Android Programming", "2020", 1, 4, "W66M");
    Module c349 = new Module("C349", "IPad Programming", "2020", 2, 4, "W66M");
    Module c666 = new Module("C666", "Demon Programming", "2021", 2, 4, "W69M");
    Module c234 = new Module("C234", "Suspicious Programming", "2021", 3, 3, "W11M");


    Module c203 = new Module("C203", "Web Appln Development in php", "2021", 1, 3, "E33N");
    Module c206 = new Module("C206", "Software Development Process", "2021", 1, 3, "W64N");
    Module g953 = new Module("G953", "Life Skills III", "2022", 1, 3, "HBL");

    ArrayList<Module> moduleArrList = new ArrayList<>();

    TextView tvModule;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_module);

        tvModule = findViewById(R.id.TextViewModule);

        Log.d("ModuleActivity", "onCreate() called.");


        Intent intentReceived=getIntent();
        String moduleSelected = intentReceived.getStringExtra("Module");


        //match up int with module
        //set text to module info

        Module module;
        switch (moduleSelected){
            case "M1": module = c346; break;
            case "M2": module = c349; break;
            case "M3": module = c666; break;
            case "M4": module = c234; break;
            default:
                module = new Module("", "", "", 0, 0, "");
       }
        tvModule.setText(module.moduleInfo());

    }
    @Override
    protected void onStart() {
        Log.d("ModuleActivity", "onStart() called.");
        super.onStart();
    }
    @Override
    protected void onResume() {
        Log.d("ModuleActivity", "onResume() called.");
        super.onResume();
    }
    @Override
    protected void onPause() {
        Log.d("ModuleActivity", "onPause() called.");
        super.onPause();
    }
    @Override
    protected void onStop() {
        Log.d("ModuleActivity", "onStop() called.");
        super.onStop();
    }
    @Override
    protected void onDestroy() {
        Log.d("ModuleActivity", "onDestroy() called.");
        super.onDestroy();
    }
    @Override
    protected void onRestart() {
        Log.d("ModuleActivity", "onRestart() called.");
        super.onRestart();
    }

}