package dota.antimage;

import android.media.MediaPlayer;
        import android.os.Bundle;
        import android.support.v7.app.AppCompatActivity;
        import android.view.View;
        import android.widget.Button;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        final MediaPlayer sound = MediaPlayer.create(this, R.raw.lasthit);
        final MediaPlayer sound2 = MediaPlayer.create(this, R.raw.its_a_disaster);
        Button lasthit = (Button) this.findViewById(R.id.button);
        Button disastah = (Button) this.findViewById(R.id.disastahbutton);

        /////////////////////////////////////////////////////////////////
        lasthit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
              sound.start();
            }
        });
        /////////////////////////////////////////////////////////////


        ////////////////////////////////////////////////////////
        disastah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sound2.start();
            }
        });
        ///////////////////////////////////////////////////////




    }
}