/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package savaşçı;

/**
 *
 * @author BERK
 */
public class Okçu extends Savaşçı {
    private int atışhızı;
    public Okçu(int güç,String isim,int hız,int atışhızı){
        super(güç,isim,hız);
        this.atışhızı=atışhızı;
        
        
    }

    
    public int getAtışhızı() {
        return atışhızı;
    }

       public void setAtışhızı(int atışhızı) {
        this.atışhızı = atışhızı;
    }
    
       @Override
    public void özelyetenek(){
        
        System.out.println("Özel gücü:ok yağmuru ");
        
        
    }
      @Override
    public void bilgilerigoster(){
        super.bilgilerigoster();
        System.out.println("atış hızı:"+atışhızı);
        
        
    }
    
    
    
}
