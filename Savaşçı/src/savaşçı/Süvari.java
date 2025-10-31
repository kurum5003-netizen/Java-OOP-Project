/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package savaşçı;

/**
 *
 * @author BERK
 */
public class Süvari extends Savaşçı{
    private int atçarpmagücü;
    public Süvari(int güç,String isim,int hız,int atçarpmagücü){
        super(güç,isim,hız);
        this.atçarpmagücü=atçarpmagücü;
        
        
    }

    public int getAthızı() {
        return atçarpmagücü;
    }

    
    public void setAthızı(int athızı) {
        this.atçarpmagücü = athızı;
    }
    
       @Override
    public void özelyetenek(){
        
        System.out.println("Özel gücü:at saldırısı ");
        
        
    }
      @Override
    public void bilgilerigoster(){
        super.bilgilerigoster();
        System.out.println("at çarpma gücü:"+atçarpmagücü);
        
        
    }
    
    
    
}
