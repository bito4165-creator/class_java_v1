package com.oop15;

public class Music {
    private String title;
    private String type;
    private int playTime;

    public Music(String title, String type, int playTime) {
        this.title = title;
        this.type = type;
        this.playTime = playTime;
    }

    public void showInfo() {
        System.out.println("노래 제목 : "+ title);
        System.out.println("장르 :" + type);
        System.out.println("노래 길이 : " + playTime);
    }

    public void findType(Music music) {
        if (this.type.equals(music.type)) {
            System.out.println("노래 장르 : "+ this.type);
        }

    }

    public String getTitle() {
        return title;
    }

    public String getType() {
        return type;
    }

    public int getPlayTime() {
        return playTime;
    }
}
