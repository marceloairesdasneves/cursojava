/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.auladejava.fundamentos;

/**
 *
 * @author USER
 */
public class IfDemo {
    public static void main(String[] args) {
        int a, b, c;
        
        a = 2;
        b = 3;
        
        if(a < b) System.out.println("a is less than b.");
        if(a == b) System.out.println("You won't see this.");
        System.out.println();
        c = a - b;
        System.out.println("c contains -1.");
        if(c >= 0) System.out.println("c is non-negative.");
        if(c < 0) System.out.println("c is negative");
    }
}
