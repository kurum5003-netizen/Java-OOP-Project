/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ıdmanoop;

/**
 *
 * @author BERK
 */
public class Idman {
    
    private  int burpee_sayisi;
    private int pushup_sayisi;
    private int situp_sayisi;
    private int squat_sayisi;
    
    public Idman(int burpee_sayisi,int pushup_sayisi,int situp_sayisi,int squat_sayisi){
        this.burpee_sayisi=burpee_sayisi;
        this.pushup_sayisi=pushup_sayisi;
        this.situp_sayisi=situp_sayisi;
        this.squat_sayisi=squat_sayisi;
        
        
    }

    
    public int getBurpee_sayisi() {
        return burpee_sayisi;
    }

   
    public void setBurpee_sayisi(int burpee_sayisi) {
        this.burpee_sayisi = burpee_sayisi;
    }

    
    public int getPushup_sayisi() {
        return pushup_sayisi;
    }

    
    public void setPushup_sayisi(int pushup_sayisi) {
        this.pushup_sayisi = pushup_sayisi;
    }

  
    public int getSitup_sayisi() {
        return situp_sayisi;
    }

   
    public void setSitup_sayisi(int situp_sayisi) {
        this.situp_sayisi = situp_sayisi;
    }

    
    public int getSquat_sayisi() {
        return squat_sayisi;
    }

   
    public void setSquat_sayisi(int squat_sayisi) {
        this.squat_sayisi = squat_sayisi;
    }
    
    
       public void HareketYap(String harekettürü,int sayi){
           
           if(harekettürü.equals("burpee")){
               
               
               burpeeYap(sayi);
               
               
           }
           else if(harekettürü.equals("squat")){
               
               
               squatYap(sayi);
               
           }
           else if(harekettürü.equals("situp")){
               
              situpYap(sayi); 
               
               
               
               
           }
           
           else if(harekettürü.equals("pushup")){
               
               pushupYap(sayi);
               
               
               
               
           }
           
           else{
               
               System.out.println("geçersiz hareket");
           }
           
           
           
           
           
           
           
           
       }
    
    public void pushupYap(int sayii){
        
        if(pushup_sayisi-sayii<0){
            System.out.println("tebrikler günlük hedeften fazla pushup yaptınız");
            pushup_sayisi=0;
            System.out.println("yeni pushup sayınız\t" + pushup_sayisi);
        }
        else if(pushup_sayisi-sayii>0){
            
            System.out.println("günlük hedeften az pushup yaptınız!!!");
            pushup_sayisi-=sayii;
            System.out.println("kalan pushup sayisi\t" + pushup_sayisi);
        }
        else{
            System.out.println("tebrikler günlük hedefi tamamldınız");
             pushup_sayisi=0;
             System.out.println("kalan pushup sayisi\t" + pushup_sayisi);}
        
    }
       
        public void squatYap(int sayii){
        
        if(squat_sayisi-sayii<0){
            System.out.println("tebrikler günlük hedeften fazla squat yaptınız");
            squat_sayisi=0;
            System.out.println("yeni squat sayınız\t" + squat_sayisi);
        }
        else if(squat_sayisi-sayii>0){
            
            System.out.println("günlük hedeften az squat yaptınız!!!");
            squat_sayisi-=sayii;
            System.out.println("kalan pushup sayisi\t" + squat_sayisi);
        }
        else{
            System.out.println("tebrikler günlük hedefi tamamldınız");
             squat_sayisi=0;
             System.out.println("kalan pushup sayisi\t" + squat_sayisi);}
        
    }
       
      public void situpYap(int sayii){
        
        if(situp_sayisi-sayii<0){
            System.out.println("tebrikler günlük hedeften fazla situp yaptınız");
            situp_sayisi=0;
            System.out.println("yeni situp sayınız\t" + situp_sayisi);
        }
        else if(situp_sayisi-sayii>0){
            
            System.out.println("günlük hedeften az situp yaptınız!!!");
            situp_sayisi-=sayii;
            System.out.println("kalan situp sayisi\t" + situp_sayisi);
        }
        else{
            System.out.println("tebrikler günlük hedefi tamamldınız");
             situp_sayisi=0;
             System.out.println("kalan situp sayisi\t" + situp_sayisi);}
        
    }  
    
    
     public void burpeeYap(int sayii){
        
        if(burpee_sayisi-sayii<0){
            System.out.println("tebrikler günlük hedeften fazla burpee yaptınız");
            burpee_sayisi=0;
            System.out.println("yeni burpee sayınız\t" + burpee_sayisi);
        }
        else if(burpee_sayisi-sayii>0){
            
            System.out.println("günlük hedeften az burpee yaptınız!!!");
            burpee_sayisi-=sayii;
            System.out.println("kalan burpee sayisi\t" + burpee_sayisi);
        }
        else{
            System.out.println("tebrikler günlük hedefi tamamldınız");
             burpee_sayisi=0;
             System.out.println("kalan burpee sayisi\t" + burpee_sayisi);}
        
    }
    
    
     
    
    
    
    
}
