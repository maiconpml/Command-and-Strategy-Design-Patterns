/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifnmg.strategydesignpattern.control;

import br.edu.ifnmg.strategydesignpattern.strategy.ISmartRoutine;

/**
 *
 * @author maicon
 */
public class RoomRoutineController {
    
    private ISmartRoutine routine;

    public RoomRoutineController(ISmartRoutine routine) {
        this.routine = routine;
    }

    public void setRoutine(ISmartRoutine routine) {
        this.routine = routine;
    }

    public ISmartRoutine getRoutine() {
        return routine;
    }
    
    public void executeRoutine(Room room) {
        routine.execute(room);
    }
}
