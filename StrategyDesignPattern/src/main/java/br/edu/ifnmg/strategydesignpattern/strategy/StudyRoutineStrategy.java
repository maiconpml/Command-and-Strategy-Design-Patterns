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
public class StudyRoutineStrategy implements ISmartRoutine{

    @Override
    public void execute(Room room) {
        
        System.out.println("Starting study routine in room "+ room.getName() +"...\n"
                + "Setting lights warmth to 5500K\n"
                + "Turning on BedroomPC\n"
                + "Muting notifications\n"
                + "End of study routine.\n");
    }
}
