package sg.edu.rp.c346.id22016809.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    Module c346 = new Module("C346", "Android Programming", "2020", 1, 4, "W66M");
    Module c349 = new Module("C349", "IPad Programming", "2020", 2, 4, "W66M");
    Module c666 = new Module("C666", "Demon Programming", "2021", 2, 4, "W69M");
    Module c234 = new Module("C234", "Suspicious Programming", "2021", 3, 3, "W11M");


    Module c203 = new Module("C203", "Web Appln Development in php", "2021", 1, 3, "E33N");
    Module c206 = new Module("C206", "Software Development Process", "2021", 1, 3, "W64N");
    Module g953 = new Module("G953", "Life Skills III", "2022", 1, 3, "HBL");

    TextView module1;
    TextView module2;
    TextView module3;
    TextView module4;
    LinearLayout mTL;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d("MainActivity", "onCreate() called.");


        ArrayList<Module> moduleArr = new ArrayList<>();

        moduleArr.add(c203);
        moduleArr.add(c206);
        moduleArr.add(g953);
        mTL = findViewById(R.id.moduleTxtLayout);
        for (Module m : moduleArr) {
            TextView text = new TextView(this); //implement string style
            text.setText(String.format("%s : %s", m.code, m.name));
            mTL.addView(text);
        }
        // dynamically add the module buttons
        // dynamic onclicklisteners

        module1 = findViewById(R.id.text1);
        module2 = findViewById(R.id.text2);
        module3 = findViewById(R.id.text3);
        module4 = findViewById(R.id.text4);

        module1.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, ModuleActivity.class);
            intent.putExtra("Module", 1);
            startActivity(intent);
            });
    }
    @Override
    protected void onStart() {
        Log.d("MainActivity", "onStart() called.");
        super.onStart();
    }
    @Override
    protected void onResume() {
        Log.d("MainActivity", "onResume() called.");
        super.onResume();
    }
    @Override
    protected void onPause() {
        Log.d("MainActivity", "onPause() called.");
        super.onPause();
    }
    @Override
    protected void onStop() {
        Log.d("MainActivity", "onStop() called.");
        super.onStop();
    }
    @Override
    protected void onDestroy() {
        Log.d("MainActivity", "onDestroy() called.");
        super.onDestroy();
    }
    @Override
    protected void onRestart() {
        Log.d("MainActivity", "onRestart() called.");
        super.onRestart();
    }

}