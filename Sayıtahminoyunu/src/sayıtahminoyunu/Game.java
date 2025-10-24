/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sayıtahminoyunu;

import java.util.Scanner;

/**
 *
 * @author BERK
 */
public class Game {
    Scanner scanner=new Scanner(System.in);
    private int hak;
    private int max;
    private int min=1;
    private int sure;
    private int randommsayi;
    private boolean zamandoldu;
    
    Hatakntrl hk =new Hatakntrl();
    Rasgelesayi rs=new Rasgelesayi();
    String tahmin;
    public void oyunubaslat(){
        System.out.println("--SAYİ TAHMİN OYUNUNA HOSGELDİNİZ--");
        maksimumdgr();
        randommsayi=rs.randomsayi(max);//random classından aldığımız saıyı randommsayı değişkenine aktarma
        int e=suresecimi();//kullanıcıdan aldığımız süre isteğini e değişkenine aktarma
       
        while(true){
            
    
             zamandoldu=false;
           
            if(hak==0){
                System.out.println("üzgünüm hakkiniz kalmadi");
                System.out.println("dogru sayi:" + randommsayi);
                break;
            }
            System.out.println("tahmininiz nedir:"); 
             Time time=new Time(e,this);
             Thread t = new Thread(time);
            time.start();
           
            if (scanner.hasNextLine()) { //kullanıcı değer girmişmi diye kontrol eder girmişse tahmin değişkenine aktarır
        tahmin = scanner.nextLine();
    }
            time.stopp();
            if(zamandoldu){//zaman dolduğu zaman tekrar tahmin almaya yarar
                continue;
            }
            
            
            
            if(!hk.karekterkontrol(tahmin)){
                System.out.println("geçersiz karekter!");
                continue;
            }
            int sahtetahmin=hk.toInt(tahmin);
            if(!hk.sayikontrol(max, sahtetahmin)){
                System.out.println("aralik disinda sayi girdiniz");
                continue;
            }
            
            
            
            if(randommsayi==sahtetahmin){
                System.out.println("tebrikler dogru bildiniz kalan hakkiniz\t" + hak );
                break;
            }
            else if(sahtetahmin>randommsayi){
                System.out.println("aşağı inin");
                hak--;
                System.out.println("kalan hakkiniz:" + hak);
                continue;
                
                
            }
            
            else{
                System.out.println("yukari cikin");
                hak--;
                System.out.println("kalan hakkiniz:" + hak);
                continue;
            }
            
            
            
        
        
                   
        
         
        
        
        
                  }
        
        
        
    }
    
    
    //-------------------------------------------------
    
     public void hakazaltma(){
         hak--;
         System.out.println("kalan hakkiniz\t" + hak);
         System.out.println("devam etmek icin enter a basin");
       zamandoldu=true;
     }
    //-------------------------------------------------
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    //-------------------------------------------------
    public void maksimumdgr(){//kullanıcıdan aralık değeri alma
        System.out.println("\nhangi aralikta tahmin yapmak istiyosunuz?");
        while(true){
        System.out.println("1-100 arasi icin 1 e , 1-1000 arasi icin 2 ye basin");
        int maxxx=scanner.nextInt();
        scanner.nextLine(); // boslugu atlar
        if(maxxx==1){
            System.out.println("hakkınız 5 olarak belirlenmistir");
            max=100;
            hak=5;
            break;
        }
        else if(maxxx==2){
            System.out.println("hakkınız 10 olarak belirlenmistir");
            max=1000;
            hak=10;
            break;
        }
        else{
            System.out.println("hatalı sayi veya ifade girdiniz!!!");
          
        }
        }
    }
    
     //-------------------------------------------------
    
    public int suresecimi(){// kullanıcıdan yeterli süre alma
        System.out.println("her tahmin için kaç saniye süre hakkiniz olsun?");
        while(true){
            System.out.println("1 ile 20 saniye arasi süre secimi yapin");
            int d=scanner.nextInt();
            scanner.nextLine(); // boslugu atlar
            if(d>=1 && d<=20){
                return d;
                
            }
            else{
                System.out.println("gecerli sayi giriniz!!!");
            }
            
            
    
            
        }
        
        
        
        
        
    }
    
    //-------------------------------------------------
    
    
    
    
    
    
}  
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    
    
    

