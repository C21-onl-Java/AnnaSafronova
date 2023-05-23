package ru.teachmeskills.homework10.task02;

public class Main {
    public static void main(String[] args) {
        String sentence = "Живи долго и процветай";

        String[] array = sentence.split(" ");
        String shortWord = array[0];
        String longWord = array[0];

        for (int i = 0; i < array.length; i++) {
            if (shortWord.length() >= array[i].length()) {
                shortWord = array[i];
            }
            if (longWord.length() <= array[i].length()) {
                longWord = array[i];
            }
        }

        System.out.println(shortWord);
        System.out.println(longWord);
    }
}
