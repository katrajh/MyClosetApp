package rvir.mycloset;

//import android.arch.persistence.room.Room;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        /*
        AppDB db = Room.databaseBuilder(getApplicationContext(),
                AppDB.class, "oblacila" +
                        "").build();
        */
    }

    public void gumb_mojeOmare(View view) {
        Intent intent = new Intent(this, SeznamOmarActivity.class);
        startActivity(intent);
    }

    public void gumb_dodajOblacilo(View view) {
        Intent intent = new Intent(this, DodajOblekoActivity.class);
        startActivity(intent);
    }

    public void gumb_dodajKombinacijo(View view) {
        Intent intent = new Intent(this, DodajKombinacijoActivity.class);
        startActivity(intent);
    }

    public void gumb_kajNajOblecem(View view) {
        Intent intent = new Intent(this, KajNajOblecemActivity.class);
        startActivity(intent);
    }




}
