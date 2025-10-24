/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calisanlaroop;

/**
 *
 * @author BERK
 */
public class Yonetici extends Calisan {
    private int kisisayisi;
   public Yonetici(String ad,String soyad,int id,int kisisayisi){
    
    super(ad,soyad,id);
    this.kisisayisi=kisisayisi;
    
    
    
}
    @Override
    public void bilgilerigoster(){
        super.bilgilerigoster();
        System.out.println("sorumlu oldugu kisi sayisi\t" + getKisisayisi());
        
        
    }
            
      public void zamyap(int miktarr){
          System.out.println(miktarr +"\tTL zam yapılıyor");
          
          
          
          
      }      

    
    public int getKisisayisi() {
        return kisisayisi;
    }

    
    public void setKisisayisi(int kisisayisi) {
        this.kisisayisi = kisisayisi;
    }
            
           
    
    
    
    
    
    
    
    
}
