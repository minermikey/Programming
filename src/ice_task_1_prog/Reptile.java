/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ice_task_1_prog;

import static ice_task_1_prog.Ice_Task_1_Prog.scanner;
/**
 *
 * @author Michael Singh
 */
public class Reptile extends Animal {
    
    final Animal animal = new Animal();

    private double bloodTemp;

    public double getBloodTemp() {

        return bloodTemp;

    }

    public void setBloodTemp(double bloodTemp) {

        this.bloodTemp = bloodTemp;

    }

    public void gettingReptileInfo() {

        System.out.println("What is the blood temp of the reptile ? ");
        bloodTemp = scanner.nextDouble();

    }

}
