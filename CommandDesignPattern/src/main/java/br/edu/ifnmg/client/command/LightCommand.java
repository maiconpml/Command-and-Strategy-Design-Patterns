/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifnmg.client.command;

import br.edu.ifnmg.client.objects.Light;

/**
 *
 * @author maicon
 */
public abstract class LightCommand implements ICommand{
    
    protected final Light light;

    protected LightCommand(Light light) {
        this.light = light;
    }
}
