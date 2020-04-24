package com.company;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {

    static final Scanner in = new Scanner(System.in);

    public static void main(String[]args) {
        boolean run = true;

        while (run) {
            int menu = showMenu();
            if (menu == 1) {
                penjumlahan();
            } else if (menu == 2) {
                jumlah();
            } else if (menu == 3) {
                run = false;
            }
            System.out.println("\n-------------------------Terima kasih-------------------------");
        }
    }

    private static int showMenu() {
        System.out.println("Pendataan dan Perhitungan IPS (Indeks Prestasi Semester)\n" +
                "1. Penjumlahan Bilangan Prima\n" +
                "2. Jumlah Bilangan Prima\n" +
                "3. Keluar");
        int Menu = 0;

        while (Menu < 1 || Menu > 3) {
            try{
                System.out.print("Masukkan menu yang anda pilih: ");
                Menu = in.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Mohon maaf anda salah memasukkan menu");
            }
            in.nextLine();
        }

        return Menu;
    }

    private static void penjumlahan() {

        int bil1 = 0, bil2 = 0;
        int Penjumlahan = 0;
        boolean validasi =false;

        while (!validasi) {
            try {
                System.out.print("Masukkan Bilangan 1 \t: ");
                bil1 = in.nextInt();
                validasi = true;
            } catch (InputMismatchException e) {
                System.out.println("Mohon maaf masukkan bilangan yang dimasukkan harus berupa angka");
            }
            in.nextLine();
            try {
                System.out.print("Masukkan Bilangan 2 \t: ");
                bil2 = in.nextInt();
                validasi = true;
            } catch (InputMismatchException e) {
                System.out.println("Mohon maaf masukkan bilangan yang dimasukkan harus berupa angka");
            }
        }

        System.out.println("---------------------------------------");
        System.out.println("Bilangan Prima Antara "+bil1+" dan "+bil2);

        for (int i = bil1;i <= bil2; i++){
            var bilPrima = true;
            for (int j = 2; j < i; j++) {
                if(i%j==0){
                    bilPrima = false;
                    break;
                }
            }
            if(bilPrima){
                System.out.print(i +"\t");
                Penjumlahan += i;
            }
        }

        System.out.println("\nPenjumlahan Bilangan Prima "+Penjumlahan);

    }

    private static void jumlah() {
        int bil1 = 0, bil2 = 0;
        int Jumlah = 0;
        boolean validasi =false;

        while (!validasi) {
            try {
                System.out.print("Masukkan Bilangan 1 \t: ");
                bil1 = in.nextInt();
                validasi = true;
            } catch (InputMismatchException e) {
                System.out.println("Mohon maaf masukkan bilangan yang dimasukkan harus berupa angka");
            }
            in.nextLine();
            try {
                System.out.print("Masukkan Bilangan 2 \t: ");
                bil2 = in.nextInt();
                validasi = true;
            } catch (InputMismatchException e) {
                System.out.println("Mohon maaf masukkan bilangan yang dimasukkan harus berupa angka");
            }
        }

        System.out.println("---------------------------------------");
        System.out.println("Bilangan Prima Antara "+bil1+" dan "+bil2);

        ArrayList Prima = new ArrayList();
        for (int i = bil1;i <= bil2; i++){
            var bilPrima = true;
            for (int j = 2; j < i; j++) {
                if(i%j==0){
                    bilPrima = false;
                    break;
                }
            }
            if(bilPrima){
                System.out.print(i +"\t");
                Prima.add(i);
            }
        }

        Jumlah = Prima.size();
        System.out.println("\nJumlah Bilangan Prima "+Jumlah);
    }

}
