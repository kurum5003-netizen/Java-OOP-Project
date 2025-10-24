/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ıdmanoop;

import java.util.Scanner;

/**
 *
 * @author BERK
 */
public class IdmanOOP {

   
    public static void main(String[] args) {
        
        Scanner scanner=new Scanner(System.in);
        String islemler="burpee\n" +"pushup\n" +"squat\n" +"situp\n" +"cikis icin q ya basın";
        System.out.println("sisteme hosgeldiniz");
        System.out.println("*******************");
        Idman ıdman=new Idman(50,30,40,25);
        while(true){
            String a; int b;
            System.out.println("Lütfen islem seciniz:");
            System.out.println(islemler);
            a=scanner.nextLine();
            a=a.toLowerCase();
            if(a.equals("pushup")){
                System.out.println("kaç adet pushup çektiniz");
                b=scanner.nextInt();
                scanner.nextLine();
              ıdman.pushupYap(b);}
            
            else if(a.equals("situp")){
                System.out.println("kaç adet situp çektiniz");
                b=scanner.nextInt();
                scanner.nextLine();
              ıdman.situpYap(b);}
             
            else  if(a.equals("burpee")){
                System.out.println("kaç adet burpee çektiniz");
                b=scanner.nextInt();
                scanner.nextLine();
              ıdman.burpeeYap(b);}
              
             else  if(a.equals("squat")){
                System.out.println("kaç adet squat çektiniz");
                b=scanner.nextInt();
                scanner.nextLine();
              ıdman.squatYap(b);}
            
             else if (a.equals("q")){
                 System.out.println("cikis yapılıyor...");
                 break;
             }
             else{
                 System.out.println("hatalı islem girdiniz...");
             }
            
            
            
            }
        
        
        
        
        
        
    }
    
}
