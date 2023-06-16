/*
 * MIT License
 *
 * Copyright (c) 2023 Maicon Leles
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
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
