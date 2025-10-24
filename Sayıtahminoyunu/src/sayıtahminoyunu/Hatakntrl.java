/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sayıtahminoyunu;

/**
 *
 * @author BERK
 */
public class Hatakntrl {
     
   public boolean karekterkontrol(String s){
       
     if(s==null || s.isEmpty()){
               
               return false;
     }
       for(int i =0 ;i<s.length();i++){
       if(!Character.isDigit(s.charAt(i)))
       return false;
       
   }
       
       return true;
       
       
       
   }
    
  public boolean sayikontrol(int max,int a)  {
      int min=1;
      if(a>=min && a<=max ){
          return true;
      }
      else{
          
          return false;
      }
      
      
      
      
      
      
  }
    
    
    
    public int toInt(String s){ //string değer aldğımız için onu int e çevirme
        
       int sonuc=0;
       for(int i=0;i<s.length();i++){
       sonuc = sonuc * 10 + (s.charAt(i) - '0');
       }
        
        return sonuc;
        
        
    }
   
   
   
   
   
   
   
   
   
   
   
   
   
    
    
    
   
}