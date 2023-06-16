/*
 * MIT License
 *
 * Copyright (c) 2023 Maicon Leles
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
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
