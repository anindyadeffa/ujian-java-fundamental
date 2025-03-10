package com.juaracoding.nabilaujian1jf.ujian1;

import java.util.Scanner; // Import package utils scanner

public class Soal4 {

    public static void main(String[] args) {
        // Package scanner for user's input
        Scanner scanner = new Scanner(System.in);
        System.out.println("Daftar Film Bioskop"); // Print the statement for title

        // Determine the length of the array to store value in the movieList variable
        String[] movieList = new String[5];

        // Looping: used for user's input a movie title
        for (int i = 0; i < movieList.length; i++) {
            System.out.print("Masukkan nama film " + (i+1) + ": ");
            movieList[i] = scanner.nextLine();
        }

        System.out.println("Film yang ingin ditonton: ");
        // Print the result: use looping to call element in movieList array
        for (int i = 0; i < movieList.length; i++) {
            System.out.println( (i+1) + ". " + movieList[i] ); // declare element in movieList array at index i+1
        }

    }

}
