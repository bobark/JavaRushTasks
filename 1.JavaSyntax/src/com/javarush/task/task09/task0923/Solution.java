package com.javarush.task.task09.task0923;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution {
    public static char[] vowels = new char[]{'а', 'я', 'у', 'ю', 'и', 'ы', 'э', 'е', 'о', 'ё'};

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str = reader.readLine();
        ArrayList gl = new ArrayList();
        ArrayList sgl = new ArrayList();
        str = str.replaceAll("\\s", "");

        for (int i = 0; i < str.length(); i++) {
            char charIs = str.charAt(i);
            if (isVowel(charIs) == true){
              gl.add(charIs);
            }
            else sgl.add(charIs);

        }

        for (Object o : gl) {
            System.out.print(o + " ");

        }

        System.out.println();
        for (Object o : sgl) {
            System.out.print(o + " ");

        }
    }

    // метод проверяет, гласная ли буква
    public static boolean isVowel(char character) {
        character = Character.toLowerCase(character);  // приводим символ в нижний регистр - от заглавных к строчным буквам
        for (char vowel : vowels) {  // ищем среди массива гласных
            if (character == vowel) {
                return true;
            }
        }
        return false;
    }
}