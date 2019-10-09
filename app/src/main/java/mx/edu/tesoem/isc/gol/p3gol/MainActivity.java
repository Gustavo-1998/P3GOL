package mx.edu.tesoem.isc.gol.p3gol;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent principal = new Intent(MainActivity.this, pantalla2.class);
                startActivity(principal);
                finish();
            }
        },5000);
    }
}
