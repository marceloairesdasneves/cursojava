/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.auladejava.fundamentos;

/**
 * Este programa converte galoes em litros.
 *
 * @author Marcelo Neves
 */
public class GalToLit {

    public static void main(String[] args) {
        double gallons, liters;
        int counter = 0;

        for (gallons = 0; gallons <= 100; gallons++) {
            liters = gallons * 3.7854;
            System.out.println(gallons + " gallons is " + liters + " liters. ");
            counter++;

            if (counter == 10) {
                System.out.println();
                counter = 0;
            }
        }
    }
}
