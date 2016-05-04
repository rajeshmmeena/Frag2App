package com.example.meena.frag2app;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements Communicator {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void send(String s) {
        Fagmentsecond secondFragment = (Fagmentsecond) getSupportFragmentManager().findFragmentById(R.id.fragment);

        secondFragment.send(s);
    }
}
