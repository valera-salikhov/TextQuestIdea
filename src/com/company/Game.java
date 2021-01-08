package com.company;

import java.util.Scanner;

public class Game {

    public static Character player;
    public static Story story;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Как тебя зовут? (Введи своё имя)");
        player = new Character(sc.nextLine());
        story = new Story();
        while (true) {
            System.out.println("=============" + story.current_situation.subject + "==============");
            System.out.println(story.current_situation.text);
            if (story.isEnd()) {
                System.out.println("====================the end!====================");
                return;
            }
            story.go(sc.nextInt());
        }
    }
}
