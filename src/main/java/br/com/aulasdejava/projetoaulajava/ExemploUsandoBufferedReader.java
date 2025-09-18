/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.aulasdejava.projetoaulajava;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author USER
 */
public class ExemploUsandoBufferedReader {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Digite seu nome: ");
        String nome = reader.readLine();
        
        System.out.println("Digite sua idade: ");
        int idade = Integer.parseInt(reader.readLine());
        
        System.out.println("Nome: " + nome + ", Idade: " + idade );
        
    }
    
}
