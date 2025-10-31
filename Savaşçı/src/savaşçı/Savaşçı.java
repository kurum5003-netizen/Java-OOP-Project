/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package savaşçı;

/**
 *
 * @author BERK
 */
public class Savaşçı {
    private int güç;
    private String isim;
    private int hız;
    
    
    public Savaşçı(int güç,String isim,int hız){
        this.güç=güç;
        this.isim=isim;
        this.hız=hız;
        
        
        
    }

    
    public int getGüç() {
        return güç;
    }

    
    public void setGüç(int güç) {
        this.güç = güç;
    }

    
    public String getIsim() {
        return isim;
    }

    
    public void setIsim(String isim) {
        this.isim = isim;
    }

    
    public int getHız() {
        return hız;
    }

    
    public void setHız(int hız) {
        this.hız = hız;
    }
    
    public void özelyetenek(){
        System.out.println("bu savaşçının özel yeteneği yok");
        
    }
    public void bilgilerigoster(){
        System.out.println("hız:"+ hız);
        System.out.println("güç:"+ güç);
        System.out.println("isim:"+isim);
        
        
    }
    
    
}
