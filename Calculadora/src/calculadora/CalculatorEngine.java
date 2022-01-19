/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

/**
 *
 * @author nataldj
 */
public class CalculatorEngine {
    private float value, keep;
    private int toDo;
 
    void CalculatorEngine(){
        value = keep = 0;
    }
 
    void Operation(int op, String tela){
        keep = Float.parseFloat(tela);
        toDo = op;
    }
    float Display(String tela){
        value = Float.parseFloat(tela);
        switch(toDo){
            case 0: return keep+value;
            case 1: return keep-value;
            case 2: return keep*value;
            case 3: return keep/value;
        }
        return 0;
    }
}
