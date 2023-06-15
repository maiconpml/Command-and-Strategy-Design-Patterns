/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package br.edu.ifnmg.strategydesignpattern;

import br.edu.ifnmg.strategydesignpattern.control.Room;
import br.edu.ifnmg.strategydesignpattern.control.RoomRoutineController;
import br.edu.ifnmg.strategydesignpattern.strategy.MovieRoutineStrategy;
import br.edu.ifnmg.strategydesignpattern.strategy.SleepRoutineStrategy;
import br.edu.ifnmg.strategydesignpattern.strategy.StudyRoutineStrategy;

/**
 *
 * @author maicon
 */
public class Client {

    public static void main(String[] args) {
        
        var mainBedroom = new Room("Main Bedroom");
        
        var bedroomControler = new RoomRoutineController(new StudyRoutineStrategy());
        
        bedroomControler.executeRoutine(mainBedroom);
        
        bedroomControler.setRoutine(new MovieRoutineStrategy());
        
        bedroomControler.executeRoutine(mainBedroom);
        
        bedroomControler.setRoutine(new SleepRoutineStrategy());
        
        bedroomControler.executeRoutine(mainBedroom);
    }
}
