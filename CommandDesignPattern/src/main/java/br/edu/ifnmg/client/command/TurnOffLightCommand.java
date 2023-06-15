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
public class TurnOffLightCommand extends LightCommand{

    public TurnOffLightCommand(Lamp light) {
        super(light);
    }

    @Override
    public final void execute() {
        
        light.turnOff();
    }

    @Override
    public final void unexecute() {
        
        light.turnOn();
    }
}
