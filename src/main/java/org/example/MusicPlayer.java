package org.example;

public class MusicPlayer implements Playable {

    private String song;


    public void play(String song){
        System.out.println("Current Song: " + song);
    }

    @Override
    public void play() {

    }
}
