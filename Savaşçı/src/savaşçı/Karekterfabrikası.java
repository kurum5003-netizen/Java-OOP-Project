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
public class Karekterfabrikası {
    private Scanner scanner =new Scanner(System.in);
    public Savaşçı karekteruret(int a){
        
        if(a==1){
            return new Okçu(80,"alex",75,90);
            
        }
        else if(a==2){
            return new Büyücü(60,"madric",75);
        }
        
        else if(a==3){
            return new Süvari(95,"jorge",90,80);
            
        }
        else{
            return null;
        }
        
        
        
    }
    
    
    
    
    
    
}
