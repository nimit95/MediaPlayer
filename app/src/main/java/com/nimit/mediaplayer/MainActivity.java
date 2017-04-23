package com.nimit.mediaplayer;

import android.media.MediaPlayer;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.samplevideo);
        mediaPlayer.start();
        //VideoView videoView = (VideoView) findViewById(R.id.videoView);

        /*videoView.setVideoURI(Uri.parse("android.resource://"
                    +getPackageName() +"/"+R.raw.samplevideo));
        videoView.start();
        videoView.setMediaController(new MediaController(this));
    */
    }
}
