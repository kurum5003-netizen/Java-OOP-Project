/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sayıtahminoyunu;

import static java.time.temporal.TemporalAdjusters.next;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author BERK
 */
public class Rasgelesayi {
    
    public int randomsayi(int maxx){
        int b;
        Random rndm = new Random();
        Scanner scanner=new Scanner(System.in);
        
        b=rndm.nextInt(maxx) +1;
        
        
        return b;
        
    }
    
    
    
    
}
