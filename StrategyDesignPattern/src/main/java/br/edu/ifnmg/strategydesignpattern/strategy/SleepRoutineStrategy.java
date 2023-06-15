/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifnmg.strategydesignpattern.strategy;

import br.edu.ifnmg.strategydesignpattern.control.Room;

/**
 *
 * @author maicon
 */
public class SleepRoutineStrategy implements ISmartRoutine{

    @Override
    public void execute(Room room) {
        
        System.out.println("Starting sleep routine in room "+ room.getName() +"...\n"
                + "Turning off lights\n"
                + "Turning on table lamp light\n"
                + "Setting air conditioner to 15 Celsius\n"
                + "End of sleep routine.\n");
    }
    
}
