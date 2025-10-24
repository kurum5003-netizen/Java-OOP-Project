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
public class ATM {
    
    
    public void calistir(Hesap hesap){
        Scanner scanner=new Scanner(System.in);
        String c,islemler="1:para çekme\n" + "2:para yatırma\n" + "3:bakiye öğrenme\n" +"4:cikis yapma";
        
        int giris_hakki=3,b;
        System.out.println("***************************");
        System.out.println("Sisteme hoşgeldiniz!!!");
        System.out.println("***************************");
        Login login=new Login();
        while(true){
      if(login.kontrol(hesap)){
            System.out.println("giris saglandı");
            break;
        }
        else 
        {
            System.out.println("hatalı giris");
            giris_hakki--;
            
        }
             if(giris_hakki==0){
                 System.out.println("giris hakınız kalmadı cikis yapılıyor...");
                 return;
             }
          
        }
        
        while(true){
        System.out.println("islem seçiniz");
        System.out.println(islemler);
        c=scanner.nextLine();
        
        if(c.equals("1")){
            System.out.println("cekmek istediginiz tutar\t:");
            b=scanner.nextInt();
            scanner.nextLine();
            hesap.paracekme(b);
            
        }
        
       else if(c.equals("2")){
            System.out.println("yatirmak istediginiz tutar");
           b=scanner.nextInt();
           scanner.nextLine();
            hesap.parayatirma(b);
            
            
        }
       else if(c.equals("3")){
            System.out.println("Bakiyeniz\t:" + hesap.getBakiye());
        
        
        
        }
        
       else if(c.equals("4")){
            System.out.println("programdan çıkılıyor...");
           break;
           
       }
        
        
        }  
        
    }
}
    
    
    
    
    
     

