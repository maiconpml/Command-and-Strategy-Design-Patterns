/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package br.edu.ifnmg.client;

import br.edu.ifnmg.client.command.RaiseLampWarmthCommand;
import br.edu.ifnmg.client.command.ReduceLampWarmthCommand;
import br.edu.ifnmg.client.command.TurnOffLampCommand;
import br.edu.ifnmg.client.command.TurnOnLampCommand;
import br.edu.ifnmg.client.objects.Controller;
import br.edu.ifnmg.client.objects.Lamp;

/**
 *
 * @author maicon
 */
public class Client {

    public static void main(String[] args) {

        var lamp1 = new Lamp("CeilBedroomLight", 4000, false);

        var bedroomLightsController = new Controller(new TurnOnLampCommand(lamp1),
                new TurnOffLampCommand(lamp1),
                new RaiseLampWarmthCommand(lamp1));

        bedroomLightsController.clickButton1();//turn on lamp1
        System.out.println(lamp1);
        
        bedroomLightsController.clickButton2();//turn off lamp1
        System.out.println(lamp1);
        
        bedroomLightsController.clickButton1();//turn on lamp1
        bedroomLightsController.clickButton3();//raise warmth of lamp1
        bedroomLightsController.clickButton3();// --
        bedroomLightsController.clickButton3();// --
        bedroomLightsController.clickButton3();// -- 
        bedroomLightsController.clickButton3();//raise warmth of lamp1
        System.out.println(lamp1);
        
        bedroomLightsController.undoButton();//undo last raise warmth
        bedroomLightsController.undoButton();//undo last raise warmth
        System.out.println(lamp1);
    }
}
