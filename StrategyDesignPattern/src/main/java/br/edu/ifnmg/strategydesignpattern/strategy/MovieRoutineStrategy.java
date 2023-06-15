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
public class MovieRoutineStrategy implements ISmartRoutine{

    @Override
    public void execute(Room room) {
        
        System.out.println("Starting movie routine in room "+ room.getName() +"...\n"
                + "Turning on TV and sound devices\n"
                + "Turning off lights\n"
                + "Muting notifications\n"
                + "End of movie routine.\n");
    }
}
