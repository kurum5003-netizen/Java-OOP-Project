/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calisanlaroop;

import java.util.Scanner;

/**
 *
 * @author BERK
 */
public class CalisanlarOOP {

    
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        String islemler="1.yazilimci islemleri\n" + "2.yonetici islemleri\n" +"3.cikis";
        String d;
        while(true){
            System.out.println("islem seciniz");
            System.out.println(islemler);
            d=scanner.nextLine();
            if(d.equals("1")){
                String c;
                String islemlerr="1.format at\n" +"2.bilgileri goster\n" +"3.cikis";
                while(true){
                    Yazilimci yazilimci =new Yazilimci("berk","kurum",1239056,"c,c++,java ve php");
                    System.out.println("\nyazilimci islemlerine hosgeldiniz lütfen islem seciniz");
                    System.out.println(islemlerr);
                    c=scanner.nextLine();
                    if(c.equals("1")){
                        String a;
                        System.out.println("isletim sisteminiz nedir");
                        a=scanner.nextLine();
                        yazilimci.formatat(a);
                        
                        
                        
                    }
                    else if(c.equals("2")){
                        yazilimci.bilgilerigoster();
                        
                        
                        
                    }
                    else if(c.equals("3")){
                        System.out.println("cikis yapılıyorr...");
                        break;
                        
                    }
                    
                    
                    
                    
                }
                
            }
            
            else if(d.equals("2")){
                String islemlerr="1.zamyap\n" +"2.bilgileri goster\n" +"3.cikis";
                String c;
               
                while(true){
                    Yonetici yonetici=new Yonetici("murat","turan",1345908,130);
                    System.out.println("\nyonetici islemlerine hosgeldiniz islem seciniz");
                    System.out.println(islemlerr);
                    c=scanner.nextLine();
                    if(c.equals("1")){
                        int b;
                        System.out.println("zam yapmak istediğiniz tutar");
                        b=scanner.nextInt();
                        scanner.nextLine();
                        yonetici.zamyap(b);
                    }
                    else if(c.equals("2")){
                        yonetici.bilgilerigoster();
                        
                        
                    }
                    else if(c.equals("3")){
                        System.out.println("cikis yapılıyor...");
                        break;
                    }
                            
                    
                    
                    
                    
                }
                
                
                
            }
            else if(d.equals("3")){
                System.out.println("\nsistemden cikiliyor...");
                break;
                
                
                
            }
            
            
            
            
            
            
            
        }
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
}
