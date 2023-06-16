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
public class TurnOnLampCommand extends LampCommand{

    public TurnOnLampCommand(Lamp lamp) {
        super(lamp);
    }

    @Override
    public final void execute() {
        
        lamp.turnOn();
    }

    @Override
    public final void unexecute() {
        
        lamp.turnOff();
    }
}
