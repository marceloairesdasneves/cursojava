/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.auladejava.fundamentos;

/**
 *
 * @author USER
 */
public class ConverterPolegadasToMetros {

    public static void main(String[] args) {
        double counter = 0;
        double metros;
        double polegadaToMetro;

        for (metros = 0; metros <= 100; metros++) {
            polegadaToMetro = metros * 39.37;
            System.out.println(" Em metros " + metros + " equivale em polegadas " + polegadaToMetro);
            
            counter++;

            if (counter == 12) {
                System.out.println();
                counter = 0;
            }
        }
    }
}
