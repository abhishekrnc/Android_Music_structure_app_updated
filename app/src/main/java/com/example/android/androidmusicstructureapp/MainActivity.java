package com.example.android.androidmusicstructureapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Find the Layout that shows the Now Playing category
        LinearLayout now_Playing = (LinearLayout) findViewById(R.id.now_Playing);
        LinearLayout albums = (LinearLayout) findViewById(R.id.albums);
        LinearLayout artists = (LinearLayout) findViewById(R.id.artists);
        LinearLayout musicStore = (LinearLayout) findViewById(R.id.musicStore);


        now_Playing.setOnClickListener
                (new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent now_PlayingIntent = new Intent(MainActivity.this, Now_playingActivity.class);
                        startActivity(now_PlayingIntent);
                    }
                });

        albums.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent albumsIntent = new Intent(MainActivity.this, Album.class);
                startActivity(albumsIntent);
            }
        });

        artists.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent artistsIntent = new Intent(MainActivity.this, Artist.class);
                startActivity(artistsIntent);
            }
        });

        musicStore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent musicStoreIntent = new Intent(MainActivity.this, MusicStore.class);
                startActivity(musicStoreIntent);
            }
        });



    }
}