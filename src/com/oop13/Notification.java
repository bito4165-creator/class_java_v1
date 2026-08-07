package com.oop13;

public class Notification {

    //메시지 내용만 출력
    public void send(String message) {
        System.out.println(message);
    }

    //메시지를 입력받은 횟수만큼 반복해서 출력합니다
    public void send(String message, int count) {
        for (int i = 0; i < count; i++) {
            send(message);
        }
    }

    // 받는 사람과 내용을 출력
    public void send(String receiver, String message) {
        System.out.println(receiver + "님에게 메세지 : " + message);
    }

    public static void main(String[] args) {
        Notification noti = new Notification();

        String m = "밥 먹었습니까?";
        int c = 6;
        String r = "마커스";

        noti.send(m);
        noti.send(m,c);
        noti.send(r,m);

        noti.send("밥 먹을래?");

    }


}
