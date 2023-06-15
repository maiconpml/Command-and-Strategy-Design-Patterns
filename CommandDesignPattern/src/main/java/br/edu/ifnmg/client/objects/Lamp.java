/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifnmg.client.objects;

/**
 *
 * @author maicon
 */
public class Lamp {
    
    private String name;
    
    private int warmth;
    private boolean status;

    public Lamp(String name, int warmth, boolean status) {
        this.name = name;
        this.warmth = warmth;
        this.status = status;
    }

    public int getWarmth() {
        return warmth;
    }
    
    public String getName(){
        return name;
    }

    public boolean isStatus() {
        return status;
    }
    
    public void turnOn(){
        this.status = true;
    }
    
    public void turnOff(){
        this.status = false;
    }
    
    public void raiseWarmth(){
        this.warmth += 500;
    }
    
    public void reduceWarmth(){
        this.warmth -= 500;
    }
    
    @Override
    public String toString(){
        String statusStr = "off";
        if(status) statusStr = "on";
        return "Light " + name + "; Status: " + statusStr + "; Warmth: " + warmth;
    }
}
