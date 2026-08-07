package com.oop15;

import java.util.Scanner;

public class MusicApp {

    private Music[] musics;
    private int musicCount;

    public MusicApp(int size) {
        this.musics = new Music[size];
        this.musicCount = 0;
    }

    public void addMusic(Music music) {
        if (musicCount > musics.length) {
            System.out.println("저장 공간이 없습니다.");
        }
        musics[musicCount] = music;
        musicCount++;
    }

    public void showMusic() {
        // 배열 길이가 아니라 실제 담긴 개수까지만 순회한다.
        for (int i = 0; i < musicCount; i++) {
            musics[i].showInfo();
        }
    }

    public void findType(Scanner sc,Music[] musics) {
        String findType = sc.nextLine();
        for (int i = 0; i < musicCount; i++) {
            if (findType.equals(musics[i].getType()))  {
                System.out.println(musics[i].getTitle());
            }
        }
    }


}
