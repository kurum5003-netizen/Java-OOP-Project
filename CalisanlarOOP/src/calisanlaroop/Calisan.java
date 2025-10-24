/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calisanlaroop;

/**
 *
 * @author BERK
 */
public class Calisan {
    private String ad;
    private String soyad;
    private int id;
    
    public Calisan(String ad,String soyad,int id){
        this.ad=ad;
        this.soyad=soyad;
        this.id=id;
          
    }
    
    public void bilgilerigoster(){
        System.out.println("calisan bilgileri");
        System.out.println("*************************");
        System.out.println("ad:" + ad);
        System.out.println("soyad" + soyad);
        System.out.println("id" + id);
        
        
        
        
        
        
    }
    
    
    

    
    public String getAd() {
        return ad;
    }

    
    public void setAd(String ad) {
        this.ad = ad;
    }

    
    public String getSoyad() {
        return soyad;
    }

   
    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    
    public int getId() {
        return id;
    }

    
    public void setId(int id) {
        this.id = id;
    }
    
    
    
    
    
    
    
}
