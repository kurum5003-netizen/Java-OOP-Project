/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sayıtahminoyunu;

/**
 *
 * @author BERK
 */
public class Time extends Thread {
    private int sure;
    private boolean devam = true;
    private Game game;

    public Time(int sure, Game game) {
        this.sure = sure;
        this.game = game;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(sure * 1000); // Süre kadar bekle
            if (devam) {
                System.out.println("\nZaman tükendi!!!");
                game.hakazaltma();
            }
        } catch (InterruptedException e) {
            // Thread durdurulduysa burası çalışır
        }
    }

    public void stopp() {
        devam = false;
        this.interrupt(); // Thread uyuyorsa uyandır
    }
}

    

