/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atividadesrelacionamentodeclasses;

/**
 *
 * @author Marcelo Neves
 */
public class Teste {

    public static void main(String[] args) {
        Veiculo veiculo1 = new Veiculo("1111", "VW", "GOL", "Branco", 1);
        Veiculo veiculo2 = new Veiculo("2222", "GM", "CORSA","Branco", 2);
        Veiculo veiculo3 = new Veiculo("3333", "NISSAN", "SENTRA","Branco", 3);
        Veiculo veiculo4 = new Veiculo("4444", "FIAT", "UNO", "Branco",4);
        Veiculo veiculo5 = new Veiculo("5555", "KIA", "SERATO", "Branco",5);

        System.out.println("Veiculo1 " + veiculo1.getPlaca() + " " + veiculo1.getMarca() + " " + veiculo1.getModelo() + " " + veiculo1.getCor() + " " + veiculo1.getMotor());
        System.out.println("Veiculo2 " + veiculo2.getPlaca() + " " + veiculo2.getMarca() + " " + veiculo2.getModelo() + " " + veiculo2.getCor() + " " + veiculo2.getMotor());
        System.out.println("Veiculo3 " + veiculo3.getPlaca() + " " + veiculo3.getMarca() + " " + veiculo3.getModelo() + " " + veiculo3.getCor() + " " + veiculo3.getMotor());
        System.out.println("Veiculo4 " + veiculo4.getPlaca() + " " + veiculo4.getMarca() + " " + veiculo4.getModelo() + " " + veiculo4.getCor() + " " + veiculo4.getMotor());
        System.out.println("Veiculo5 " + veiculo5.getPlaca() + " " + veiculo5.getMarca() + " " + veiculo5.getModelo() + " " + veiculo5.getCor() + " " + veiculo5.getMotor());
    }
}
