/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany._tugaskonversisuhu;

/**
 *
 * @author lenovo
 */
public class konverter {
    
    private double celcius;

    public konverter(double celcius) {
        this.celcius = celcius;
    }

    public double suhuCelcius() {
        return this.celcius;
    }

    public void editCelcius(double celcius) {
        this.celcius = celcius;
    }
    
    public double kelvin() {
        return this.celcius + 273.15;
    }

    public double reamur() {
        return (4 * this.celcius) / 5;
    }

    public double fahren() {
        return (9 * this.celcius) / 5 + 32;
    }

}
  
