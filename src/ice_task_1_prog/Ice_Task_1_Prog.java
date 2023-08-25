/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ice_task_1_prog;

import java.util.Scanner;

/**
 *
 * @author Michael Singh
 */
public class Ice_Task_1_Prog {

    /**
     * @param args the command line arguments
     */
    final static Scanner scanner = new Scanner(System.in);

public static void main(String[] args) {
        // TODO code application logic here

        welcome();

    }

    public static void welcome() {

        System.out.println("""
          Welcome to the program
                                         ___                          
        (|__/)      .___.      ■___■   _|___|_
        ( . .)      {0,o}      (◕‿◕)   <( * )
        C(")(")     /)__)      ▐ __▐    (_____)  
                    _"_"_      .▆|▆.
                           
                           
                           """);

        BringingEverythingIN();

    }

    public static void BringingEverythingIN() {

        Animal animal = new Animal();
        animal.IDTagInfo();

    }

}
