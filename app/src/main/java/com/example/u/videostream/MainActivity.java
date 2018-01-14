package com.example.u.videostream;

import android.app.ProgressDialog;
import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {

    String video_uri = "https://drive.google.com/file/d/1XpXcAcbbYlVwnqCX97rf8OR4Yv1CxqYy/view?usp=sharing";
    EditText editText;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        editText = (EditText) findViewById(R.id.editText_url);

    }


    public void onVideoPlayer(View view) {
        // HERE SET YOUR VIDEO URI
        // **********************************

        Intent intent = new Intent(this, VideoSample.class);
        intent.putExtra("video_path", video_uri);
        startActivity(intent);
    }
}
































//
//    ImageView imageView;
//    VideoView videoView;
//    ProgressDialog mDialog;
//
//    String videoURL = "http://www.androidbegin.com/tutorial/AndroidCommercial.3gp";
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//
//        imageView = (ImageView) findViewById(R.id.button_play_id);
//        videoView = (VideoView) findViewById(R.id.videoView_id);
//        mDialog = new ProgressDialog(this);
//        mDialog.setTitle("Loading");
//        mDialog.setMessage("Please wait...");
//    }
//
//    public void onPlayPause(View view) {
//        mDialog.setCanceledOnTouchOutside(false);
//        mDialog.show();
//        try{
//            if(videoView.isPlaying()) {
//                Uri uri = Uri.parse(videoURL);
//                videoView.setVideoURI(uri);
//                videoView.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
//                    @Override
//                    public void onCompletion(MediaPlayer mediaPlayer) {
//                        imageView.setImageResource(R.drawable.ap1);
//                    }
//                });
//            }else{
//                videoView.pause();
//                imageView.setImageResource(R.drawable.ap1);
//            }
//        }catch(Exception e){
//
//        }
//        videoView.requestFocus();
//        videoView.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
//            @Override
//            public void onPrepared(MediaPlayer mediaPlayer) {
//                mDialog.dismiss();
//                mediaPlayer.setLooping(true);
//                videoView.start();
//                imageView.setImageResource(R.drawable.ap1);
//            }
//        });
//    }
//}
