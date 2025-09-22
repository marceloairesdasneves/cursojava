/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atividadesrelacionamentodeclasses;

/**
 *
 * @author USER
 */
public class Veiculo {

    private String placa, marca, modelo, cor = " ";
    private float velocMax = 0.0f;
    private int qtdRodas = 0;
    private int motor = 0;

    public Veiculo(String placa, String marca, String modelo, String cor, int motor ) {
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
        this.motor = motor;
        this.velocMax = 0;
        this.qtdRodas = 4;
       
    }

    public String getPlaca() {
        return placa;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getCor() {
        return cor;
    }

    public float getVelocMax() {
        return velocMax;
    }

    public int getQtdRodas() {
        return qtdRodas;
    }

    public int getMotor() {
        return motor;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void setVelocMax(float velocMax) {
        this.velocMax = velocMax;
    }

    public void setQtdRodas(int qtdRodas) {
        this.qtdRodas = qtdRodas;
    }

    public void setMotor(int motor) {
        this.motor = motor;
    }

    

}
