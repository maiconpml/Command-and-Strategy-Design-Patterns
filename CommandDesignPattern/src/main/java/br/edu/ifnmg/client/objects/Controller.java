/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifnmg.client.objects;

import br.edu.ifnmg.client.command.ICommand;
import java.util.Stack;

/**
 *
 * @author maicon
 */
public class Controller {

    private ICommand button1;
    private ICommand button2;
    private ICommand button3;
    private Stack<ICommand> history;
    
    public Controller(ICommand button1, ICommand button2, ICommand button3) {
        this.button1 = button1;
        this.button2 = button2;
        this.button3 = button3;
        history = new Stack();
    }

    public void setButton1(ICommand button1) {
        this.button1 = button1;
    }

    public void setButton2(ICommand button2) {
        this.button2 = button2;
    }

    public void setButton3(ICommand button3) {
        this.button3 = button3;
    }

    public ICommand getButton1() {
        return button1;
    }

    public ICommand getButton2() {
        return button2;
    }

    public ICommand getButton3() {
        return button3;
    }

    public void clickButton1() {
        history.push(button1);
        button1.execute();
    }

    public void clickButton2() {
        history.push(button2);
        button2.execute();
    }

    public void clickButton3() {
        history.push(button3);
        button3.execute();
    }
    
    public void undoButton(){
        if(history.empty()) return;
        
        history.pop().unexecute();
    }

}
