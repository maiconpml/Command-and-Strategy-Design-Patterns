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
public class RaiseLampWarmthCommand extends LampCommand{
    
    public RaiseLampWarmthCommand(Lamp lamp) {
        super(lamp);
    }
    
    @Override
    public final void execute() {
        
        lamp.raiseWarmth();
    }

    @Override
    public final void unexecute() {
        
        lamp.reduceWarmth();
    }
}
