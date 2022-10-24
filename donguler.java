package Giris;

import java.util.Scanner;

public class donguler {
    public static void main(String[] args) {
        int i = 0, k, sayac = 0, toplam = 0;
        Scanner inp = new Scanner(System.in);

        System.out.print("Lütfen sayı giriniz  : ");

        k = inp.nextInt();

        for (i = 0; i < k; i++) {
            if (i % 3 == 0 && i % 4 == 0) {
                System.out.println("3 ve 4 bölünen sayılar :  "+ i);
                toplam +=i;
                sayac++;

            }
        }

        int ortlama=toplam/sayac;

        System.out.println("Sayıların ortalaması  :"+ ortlama);





    }}
