/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifnmg.client.command;

import br.edu.ifnmg.client.objects.Lamp;

/**
 *
 * @author maicon
 */
public abstract class LightCommand implements ICommand{
    
    protected final Lamp light;

    protected LightCommand(Lamp light) {
        this.light = light;
    }
}
