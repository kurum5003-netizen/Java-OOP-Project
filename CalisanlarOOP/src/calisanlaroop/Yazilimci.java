/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calisanlaroop;

/**
 *
 * @author BERK
 */
public class Yazilimci extends Calisan {
    private String bildigidiller;
    public Yazilimci(String ad,String soyad,int id,String bildigidiller){
    
    super(ad,soyad,id);
    this.bildigidiller=bildigidiller;
    
    
    
}
    @Override
    public void bilgilerigoster(){
        super.bilgilerigoster();
        System.out.println("bildigi diller:" + getBildigidiller());
        
        
        
        
        
        
    }

    public String getBildigidiller() {
        return bildigidiller;
    }

    
    public void setBildigidiller(String bildigidiller) {
        this.bildigidiller = bildigidiller;
    }
    
    public void formatat(String isletimsistemii){
        
        System.out.println(isletimsistemii + "\tsistemine format atılıyor");
        
        
        
    }
    
    
    
    
    
    
    
    
    
    
    
    
}
