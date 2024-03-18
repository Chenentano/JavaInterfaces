package org.example;

public class Main {
    public static void main(String[] args) {

        Playable MusicPlayer = new MusicPlayer();
        Playable VideoPlayer = new VideoPlayer();

        MediaController mediaController = new MediaController();

        mediaController.playMedia(MusicPlayer);
        mediaController.playMedia(VideoPlayer);



    }
}