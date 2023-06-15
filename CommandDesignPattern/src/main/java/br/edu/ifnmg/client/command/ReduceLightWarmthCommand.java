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
public class ReduceLightWarmthCommand extends LightCommand {

    public ReduceLightWarmthCommand(Light light) {
        super(light);
    }

    @Override
    public final void execute() {

        light.reduceWarmth();
    }

    @Override
    public final void unexecute() {

        light.raiseWarmth();
    }
}
