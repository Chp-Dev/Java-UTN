package com.UTN.Java.Class3.A1;

public class Exercise1 {

    // a. Cuenta la cantidad de apariciones de una letra en un String

    public static void main(String[] args){
        String phrase = "Hola Mundo!";
        char letter = 'o';
        int counter = countOccurrences(phrase, letter);
        System.out.println("El número de apariciones de la letra '" + letter + "' en la cadena '" + phrase + "' es: " + counter);
    }
    public static int countOccurrences(String phrase, char letter) {
        int counter = 0;
        for (int i = 0; i < phrase.length(); i++) {
            if (phrase.charAt(i) == letter) {
                counter++;
            }
        }
        return counter;
    }
}
