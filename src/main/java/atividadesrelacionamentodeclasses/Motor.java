/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atividadesrelacionamentodeclasses;

/**
 *
 * @author Marcelo Neves
 */
public class Motor {

    private int qtdPist, potencia = 0;
    
    public Motor(int qtdPist, int potencia ) {
        this.potencia = potencia;
        this.qtdPist = qtdPist;
       
    }

    public int getPotencia() {
        return potencia;
    }

    public int getQtdPist() {
        return qtdPist;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public void setQtdPist(int qtdPist) {
        this.qtdPist = qtdPist;
    }
    
    
}
