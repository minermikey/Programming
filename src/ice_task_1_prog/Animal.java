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
public class Animal {

    private int IDtag;
    private String species;

    public int getIDtag() {
        return IDtag;
    }

    public void setIDtag(int IDtag) {
        this.IDtag = IDtag;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public void IDTagInfo() {

        System.out.println("What is the ID Tag of the animal");
        this.IDtag = scanner.nextInt();
       
        String animalType = "";

        while (!animalType.equalsIgnoreCase("Bird") && !animalType.equalsIgnoreCase("Reptile")) {
            System.out.println("What species is it 'Bird' or 'Reptile'? ");
            animalType = scanner.next();

            if (!animalType.equalsIgnoreCase("Bird") && !animalType.equalsIgnoreCase("Reptile")) {
                System.out.println("Invalid species. Please enter 'Bird' or 'Reptile'.");
            }
        }
       
       

        String setAnimal = animalType.toLowerCase();    // chaning the answer to all lower case so that i dont have to account for various spelling    
                                                        // way one of ignoring diffrent case is to set a seperate variable to the lower case

        if (setAnimal.equals("bird")) {

            Bird brd = new Bird();

            brd.gettingBirdInfo(brd.getColour());
            // add summary here
            System.out.println("The ID for the Bird is " + getIDtag());
            System.out.println("The Colour of the Bird is " + brd.getFeathersColour());
            System.out.println("Thank you for using US!");

        } else {

            if (setAnimal.equals("reptile")) {

                Reptile rept = new Reptile();
               
                rept.gettingReptileInfo();
                // add summary here
                System.out.println("The ID for the Reptile is " + getIDtag());
                System.out.println("The blood temperature is " + rept.getBloodTemp());
                System.out.println("Thank you");

            } else {

                System.out.println("Please Choose between the 2 options properly ");

            }

        }

    }

}

