/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany._tugaskonversisuhu;

import java.util.Scanner;

/**
 *
 * @author lenovo
 */
public class main {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        double celcius;
        int menu;
        
        System.out.println("=============================");
        System.out.println("| PROGRAM KONVERSI SUHU AIR |");
        System.out.println("=============================");
        System.out.println("Masukkan suhu celcius :");
        
        celcius = keyboard.nextDouble();
        
        konverter konversi = new konverter(celcius);
        
        while (true){
            System.out.println();
            System.out.println("MENU");
            System.out.println("---------------");
            System.out.println("1. Lihat data konversi");
            System.out.println("2. Edit data konversi");
            System.out.println("3. Exit");
            System.out.println("Pilih menu : ");
            
            menu = keyboard.nextInt();
            System.out.println();
            
                if (menu == 1) {
                    System.out.println(" Suhu Celcius : " + konversi.suhuCelcius() + "C");
                    System.out.println(" Suhu Reamur : " + konversi.reamur() + "R");
                    System.out.println(" Suhu Kelvin : " + konversi.kelvin() + "K");
                    System.out.println(" Suhu Fahrenheit : " + konversi.fahren() + "F");
                    
                    if (konversi.suhuCelcius() <= 0) {
                        System.out.println(" Kondisi air beku");
                    }
                    else if (konversi.suhuCelcius() >= 100) {
                        System.out.println(" Kondisi air mendidih");
                    }
                    else {
                        System.out.println(" Kondisi air normal");
                    }
                }
                
                else if (menu == 2) {
                    System.out.println("Masukkan suhu celcius :");
                    celcius = keyboard.nextDouble();
                    konversi.editCelcius(celcius);
                }
                
                else if (menu == 3) {
                break;
                }
                
                else {
                    System.out.println("Menu tidak sesuai, mohon masukkan menu dengan benar!");
                }
        }           
    }
}
