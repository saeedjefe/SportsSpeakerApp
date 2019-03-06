package saeed.example.com.sportsspeakerapp;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );

//        mediaPlayer = MediaPlayer.create( this, R.raw.aikido );


    }


    public void shout(View v) {

        switch (v.getTag().toString()) {
            case "aikido":

                Toast.makeText( MainActivity.this, "aikido", Toast.LENGTH_SHORT ).show();

                placeSportsName( "aikido" );

//                mediaPlayer = MediaPlayer.create(this, R.raw.aikido);
//                mediaPlayer.start();
                break;
            case "judo":

                Toast.makeText( MainActivity.this, "judo", Toast.LENGTH_SHORT ).show();

                placeSportsName( "judo" );
//                mediaPlayer = MediaPlayer.create(this, R.raw.judo);
//                mediaPlayer.start();


                break;
            case "boxing":

                Toast.makeText( MainActivity.this, "boxing", Toast.LENGTH_SHORT ).show();
//
                placeSportsName( "boxing" );
//                mediaPlayer = MediaPlayer.create(this, R.raw.boxing);
//                mediaPlayer.start();

                break;

            case "kickboxing":

                Toast.makeText( MainActivity.this, "kickBoxing", Toast.LENGTH_SHORT ).show();

                placeSportsName( "kickboxing" );


//                mediaPlayer = MediaPlayer.create(this, R.raw.kickboxing);
//                mediaPlayer.start();


                break;

            case "taekwondo":

                Toast.makeText( MainActivity.this, "taekwondo", Toast.LENGTH_SHORT ).show();

//                mediaPlayer = MediaPlayer.create(this, R.raw.taekwondo);
//                mediaPlayer.start();

                placeSportsName( "taekwondo" );

                break;

            case "karate":

                Toast.makeText( MainActivity.this, "karate", Toast.LENGTH_SHORT ).show();

//
//                mediaPlayer = MediaPlayer.create(this, R.raw.karate);
//                mediaPlayer.start();

                placeSportsName( "karate" );


                break;

        }


    }

    public void placeSportsName(String name) {

        mediaPlayer = MediaPlayer.create( MainActivity.this, getResources().getIdentifier( name, "raw", "saeed.example.com.sportsspeakerapp" ) );

        mediaPlayer.start();
    }
}

