package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class VideoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video);
        VideoView videoView = findViewById(R.id.videoview1);
//        String vpath = "android.resource://"+getPackageName() + "/raw/robotics";
        String onlinevideopath = "https://assets.mixkit.co/videos/preview/mixkit-waves-coming-to-the-beach-5016-large.mp4";
//        videoView.setVideoPath(vpath);

        Uri uri = Uri.parse(onlinevideopath);
        videoView.setVideoURI(uri);


        MediaController mediaController = new MediaController(this);
        videoView.setMediaController(mediaController);
        videoView.start();
    }
}