package com.company;
class SonicHero{
    private static SonicHero sonicHero = new SonicHero();
    private int speed;
    private SonicHero(){
        this.speed = 200;
    }
    public static SonicHero getInstance(){
        return sonicHero;
    }
    public int getSpeed(){
        return speed;
    }
    public void setSpeed(int speed){
        this.speed = speed;
    }
}
public class Main{
    public static void main(String[] args) {
        SonicHero Sc = SonicHero.getInstance();
        System.out.println(Sc.getSpeed());
        Sc.setSpeed(600);
        SonicHero Sc1 = SonicHero.getInstance();
        System.out.println(Sc1.getSpeed());
        if (Sc1.hashCode() == Sc.hashCode()){
            System.out.println("OK");
        }else {
            System.out.println("Error!");
        }
    }
}

