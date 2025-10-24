/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package atmoop;

/**
 *
 * @author BERK
 */
public class AtmOOP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Hesap hesap1=new Hesap("tlhkhnt","urxtyı",1000);
        ATM atm=new ATM();
        atm.calistir(hesap1);
    }
    
}
