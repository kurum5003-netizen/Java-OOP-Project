/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atmoop;

/**
 *
 * @author BERK
 */
public class Hesap {
    private String kullaniciadi;
    private String sifre;
    private int bakiye;

public Hesap(String kullaniciadi,String sifre,int bakiye){
    
    this.kullaniciadi=kullaniciadi;
    this.sifre=sifre;
    this.bakiye=bakiye;
    
    
    
    
    
    
    
}    
      public void parayatirma(int ytutar){
          bakiye+=ytutar;
          System.out.println("bakiyeniz güncellenmistir yeni bakiye\t" + bakiye);
          
          
      }





      public void paracekme(int tutar){
          if(bakiye-tutar<0){
              System.out.println("yetersiz bakiye");
              
          }
          else{
              bakiye-=tutar;
              System.out.println("islem basariyla gerceklesti yeni bakiye\t:" + bakiye);
          }
          
          
      }

        
    public String getKullaniciadi() {
        return kullaniciadi;
    }

    
    public void setKullaniciadi(String kullaniciadi) {
        this.kullaniciadi = kullaniciadi;
    }

   
    public String getSifre() {
        return sifre;
    }

    
    public void setSifre(String sifre) {
        this.sifre = sifre;
    }

  
    public int getBakiye() {
        return bakiye;
    }

   
    public void setBakiye(int bakiye) {
        this.bakiye = bakiye;
    }
    
  



    
    
    
    
}
