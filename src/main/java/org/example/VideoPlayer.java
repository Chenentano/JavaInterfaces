package org.example;

public class VideoPlayer implements Playable {

    private String video;

    public void play(String video){
        System.out.println("Current Video: " + video);
    }

    @Override
    public void play() {

    }
}
