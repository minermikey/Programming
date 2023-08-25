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
public class Bird extends Animal {

    // declerations
    private int colour;
    private String feathersColour;

    public String getFeathersColour() {
        return feathersColour;
    }

    public void setFeathersColour(String feathersColour) {
        this.feathersColour = feathersColour;
    }

    public int getColour() {
        return colour;
    }

    public void setColour(int colour) {
        this.colour = colour;
    }

    public void gettingBirdInfo(int colour) {
        

        System.out.println("What is the colour of the bird?\n"
        + "Choose either: Grey, White, or Black ");

boolean validColorChoice = false;

while (!validColorChoice) {
    String colourChoice = scanner.next();

    if (colourChoice.equalsIgnoreCase("grey")) {
        colour = 1;
        validColorChoice = true;
    } else if (colourChoice.equalsIgnoreCase("white")) {
        colour = 2;
        validColorChoice = true;
    } else if (colourChoice.equalsIgnoreCase("black")) {
        colour = 3;
        validColorChoice = true;
    } else {
        System.out.println("Please choose a valid option. Next time, this is your punishment.");
        validColorChoice = false; // Not necessary since it's already false, but just to make it clear
    }
}
        birdColourSorter(colour);

    }

    public void birdColourSorter(int colour) {

        if (colour == 1) {
            feathersColour = "Grey";
        } else if (colour == 2) {
            feathersColour = "White";
        } else if (colour == 3) {
            feathersColour = "Black";
        } else if (colour == 0) {
            feathersColour = "You did not pick a vaild option";
        }

    }

}

