/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package savaşçı;

import java.util.Scanner;

/**
 *
 * @author BERK
 */
public class Main {
    private static Karekterfabrikası kf =new Karekterfabrikası();
    
    public static void main(String[] args) {
      Scanner scanner =new Scanner(System.in);
        System.out.println("**karekter seçim ekranına hoşgeldiniz**");
      while(true){
          int a;
        String d="1.okçu\n" +"2.büyücü\n" + "3.süvari\n" ;
        System.out.println(d +"\n çıkış için 0 a basın");
        System.out.println("Karekterinizi seçniz");
        a=scanner.nextInt();
          if(a==0){
            System.out.println("çıkış yapılıyor...");
            break;
        }
        if(kf.karekteruret(a)== null)  {
            System.out.println("hatalı giris!!!");
            continue;
        }
        else{
            Savaşçı savaşçı =kf.karekteruret(a);
            savaşçı.bilgilerigoster();
            savaşçı.özelyetenek();
            
            
            
        }
      
        
        
        
        
          
          
          
          
          
      }
      
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
}
