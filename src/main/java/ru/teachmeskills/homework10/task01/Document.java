package ru.teachmeskills.homework10.task01;

public class Document {
    public void showNumbers(String numberDocument) {
        String[] array = numberDocument.split("-");
        System.out.println(array[0] + array[2]);
    }

    public void changeLettersToAsterisks(String numberDocument) {
        System.out.println(numberDocument.replaceAll("[a-zA-Z]{3}", "***"));
    }

    public void showLowLetters(String numberDocument) {
        String[] array = numberDocument.split("-");
        System.out.println(String.join("/", array[1], array[3],
                String.valueOf(array[4].charAt(1)),
                String.valueOf(array[4].charAt(3))).
                toLowerCase());
    }

    public void showUpLetters(String numberDocument)
    {
        StringBuilder letters = new StringBuilder(numberDocument);
        System.out.println("Letters: " + letters.delete(0,5).
                replace(3,9, "/").
                replace(7, 9, "/").
                replace(9, 10, "/").
                toString().toUpperCase());
    }

    public void containsSequence(String numberDocument) {
        String sequence = "abc";

        if (numberDocument.toLowerCase().contains(sequence)) {
            System.out.println("Документ содержит последовательность " + sequence);
        } else {
            System.out.println("Документ не содержит последовательность " + sequence);
        }
    }

    public void startWithNumbers(String numberDocument) {
        String firstNumbers = "555";

        if (numberDocument.startsWith(firstNumbers)) {
            System.out.println("Документ начинается с " + firstNumbers);
        } else {
            System.out.println("Документ не начинается с " + firstNumbers);
        }
    }

    public void endWithSequence(String numberDocument) {
        String sequence = "1a2b";

        if (numberDocument.toLowerCase().endsWith(sequence)) {
            System.out.println("Документ заканчивается на последовательность " + sequence);
        } else {
            System.out.println("Документ не заканчивается на последовательность " + sequence);
        }
    }
}
