package org.main;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner objInput = new Scanner(System.in);

        System.out.print("Nama: ");
        String nama = objInput.nextLine();

        System.out.print("Jenis Kelamin (L/P): ");
        String jenisKelamin = objInput.nextLine();

        System.out.print("Tanggal Lahir (yyyy-mm-dd): ");
        String lahirInput = objInput.nextLine();
        LocalDate lahir = LocalDate.parse(lahirInput);

        LocalDate now = LocalDate.now();
        Period periode = Period.between(lahir, now);

        System.out.println(" ");

        System.out.println("Nama : " + nama);
        System.out.print("Jenis Kelamin : ");
        if (jenisKelamin.equalsIgnoreCase("L")) {
            System.out.print("Laki-laki");
        } else if (jenisKelamin.equalsIgnoreCase("P")) {
            System.out.print("Perempuan");
        }
        System.out.println();
        System.out.println("Umur Anda : " + periode.getYears() + " tahun " + periode.getMonths() + " bulan");

        objInput.close();
    }
}