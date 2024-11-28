/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo_teori;

import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int Metode;
        
        System.out.println("Pilih Metode Pembayaran");
        System.out.println("1. E-Wallet");
        System.out.println("2. Credit Card");
        System.out.println("3. Debit Card");
        System.out.println("4. ShopeePay");
        System.out.println("5. Gopay");
        System.out.println("6. Cash");
        Metode = input.nextInt();
        
        if (Metode == 1){
            PembayaranBelanja pbe = new PembayaranBelanja();
            System.out.println("Masukkan PIN E-Wallet anda");
            pbe.pin =input.nextInt();
            System.out.println("Nominal Pembayaran");
            pbe.BayarEwallet = input.nextInt();
            System.out.println("Pembayaran E-Wallet Berhasil \n" + 
                               "Total Transaksi \n" + "Rp"+pbe.BayarEwallet);
        }else if (Metode == 2){
            PembayaranBelanja pbc = new PembayaranBelanja();
            System.out.println("Masukkan Credit PIN anda");
            pbc.pin=input.nextInt();
            System.out.println("Nominal Pembayaran");
            pbc.BayarCreditCard= input.nextInt();
            System.out.println("Pembayaran Melalui Credit Card Berhasil \n" + 
                               "Total Transaksi \n" + "Rp"+pbc.BayarCreditCard);
        }else if (Metode == 3){
            PembayaranBelanja pbq = new PembayaranBelanja();
            System.out.println("Masukkan PIN QRIS anda");
            pbq.pin=input.nextInt();
            System.out.println("Nominal Pembayaran");
            pbq.BayarQRIS= input.nextInt();
            System.out.println("Pembayaran melalui QRIS Berhasil \n" + 
                               "Total Transaksi \n" + "Rp"+pbq.BayarQRIS);
        }else if (Metode == 4){
            PembayaranBelanja pbs = new PembayaranBelanja();
            System.out.println("Masukkan PIN Shopee anda");
            pbs.pin=input.nextInt();
            System.out.println("Nominal Pembayaran");
            pbs.BayarShopee= input.nextInt();
            System.out.println("Pembayaran melalui Shopee Berhasil \n" + 
                               "Total Transaksi \n" + "Rp"+pbs.BayarShopee);
        }else if (Metode == 5){
            PembayaranBelanja pbg = new PembayaranBelanja();
            System.out.println("Masukkan PIN anda");
            pbg.pin=input.nextInt();
            System.out.println("Nominal Pembayaran");
            pbg.BayarGopay= input.nextInt();
            System.out.println("Pembayaran melalui Shopee Berhasil \n" + 
                               "Total Transaksi \n" + "Rp"+pbg.BayarGopay);
        }else if (Metode == 6){
            PembayaranBelanja pbcs = new PembayaranBelanja();
            System.out.println("Nominal Pembayaran");
            pbcs.BayarCash = input.nextInt();
            System.out.println("Kembalian" + pbcs.kembalian);
        }
    }
}
