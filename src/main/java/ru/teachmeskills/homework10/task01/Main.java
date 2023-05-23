package ru.teachmeskills.homework10.task01;

public class Main {
    public static void main(String[] args) {
        String numberDocument = "1234-ABC-5678-QWE-1A2B";
        Document document = new Document();

        document.showNumbers(numberDocument);
        System.out.println();
        document.changeLettersToAsterisks(numberDocument);
        System.out.println();
        document.showLowLetters(numberDocument);
        System.out.println();
        document.showUpLetters(numberDocument);
        System.out.println();
        document.containsSequence(numberDocument);
        System.out.println();
        document.startWithNumbers(numberDocument);
        System.out.println();
        document.endWithSequence(numberDocument);
    }
}

