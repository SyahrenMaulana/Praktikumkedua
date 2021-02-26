/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Syahren Maulana
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Bola bola = new Bola();
        //pemanggilan luas permukaan
        System.out.println("Luas Permukaan :");
        bola.setJarijari(21);
        bola.showDiameter();
        bola.showLuaspermukaan();
        //luas permukaan kedua
        System.out.println("Luas Permukaan kedua:");
        bola.setJarijari(35);
        bola.showDiameter();
        bola.showLuaspermukaan();
        
        //pemanggilan volume
        System.out.println("Volume :");
        bola.setJarijari(21);
        bola.showDiameter();
        bola.showVolume();
        
        //pemanggilan volume kedua
        System.out.println("Volume kedua:");
        bola.setJarijari(35);
        bola.showDiameter();
        bola.showVolume();
    }
    
}
