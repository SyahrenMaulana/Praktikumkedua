


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Syahren Maulana
 */
public class Bola {
    public int jarijari;
    public int diameter;
    public double phi = 3.14;
    public void setJarijari(int jarijari){
        this.jarijari = jarijari;
                        
    }
    public void showDiameter(){
        diameter = jarijari * 2;
                
    }
    public void showLuaspermukaan(){
        System.out.println("Jari Jari :"+jarijari);
        System.out.println("Diameter :"+diameter);
        System.out.println ("Luas permukaannya = "+((phi*jarijari*jarijari)*4));
    }
    public void showVolume(){
        System.out.println("Jari Jari :"+jarijari);
        System.out.println("Diameter :"+diameter);
        System.out.println ("Volumenya = "+(((phi*jarijari*jarijari*jarijari)*4)/3));
    }
}
