/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package br.edu.ifnmg.client;

import br.edu.ifnmg.client.command.RaiseLightWarmthCommand;
import br.edu.ifnmg.client.command.ReduceLightWarmthCommand;
import br.edu.ifnmg.client.command.TurnOffLightCommand;
import br.edu.ifnmg.client.command.TurnOnLightCommand;
import br.edu.ifnmg.client.objects.Controller;
import br.edu.ifnmg.client.objects.Lamp;

/**
 *
 * @author maicon
 */
public class Client {

    public static void main(String[] args) {
        
        var light1 = new Lamp("CeilBedroomLight", 4000, false);
        
        var bedroomLightsController = new Controller(new TurnOnLightCommand(light1), new TurnOffLightCommand(light1), new RaiseLightWarmthCommand(light1), new ReduceLightWarmthCommand(light1));
        
        bedroomLightsController.clickButton1();
        System.out.println(light1);
        bedroomLightsController.clickButton2();
        System.out.println(light1);
        bedroomLightsController.clickButton1();
        bedroomLightsController.clickButton3();
        bedroomLightsController.clickButton3();
        bedroomLightsController.clickButton3();
        bedroomLightsController.clickButton3();
        bedroomLightsController.clickButton3();
        System.out.println(light1);
        bedroomLightsController.clickButton4();
        bedroomLightsController.clickButton4();
        bedroomLightsController.clickButton4();
        System.out.println(light1);
        bedroomLightsController.undoOperation();
        bedroomLightsController.undoOperation();
        System.out.println(light1);
    }
}
