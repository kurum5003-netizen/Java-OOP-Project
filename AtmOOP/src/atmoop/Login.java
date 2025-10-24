/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atmoop;

import java.util.Scanner;

/**
 *
 * @author BERK
 */
public class Login {
   
    
    public boolean kontrol(Hesap hesap){
        Scanner scanner=new Scanner(System.in);
        String kullanici_adi;
        String sifree;
        System.out.println("kullanıcı adını giriniz:");
        kullanici_adi=scanner.nextLine();
        System.out.println("sifreyi giriniz:");
        sifree=scanner.nextLine();
        if(hesap.getKullaniciadi().equals(kullanici_adi) && hesap.getSifre().equals(sifree)){
            
            
            return true;
            
            
        }
                
        else {
            return false;
            
        } 
        
        
     
        
    }
    
    
    
    
}
