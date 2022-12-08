package fr.efrei.views;

import java.util.Scanner;

public class Menu {

    public static Scanner scanner = new Scanner(System.in);

    public static void AddEmployee(){
        System.out.println("First : \nChoose race");
        System.out.println("1. Indian" +
                "\n2. White" +
                "\n3. SpaceMan");

    }


    public static void loadObject() {

        int choice = 0;




            System.out.println("Hello !\nWelcome to our APP");
            System.out.println("Select your choice");
            System.out.println("1. Add employee" +
                    "\n2. Update an employee" +
                    "\n3. Delete an Employee" +
                    "\n4. Exit");
            choice = scanner.nextInt();
            System.out.println("Your choice :" + choice);
            switch (choice)
            {
                case 1:
                    System.out.println("Add an Employee");
                    Menu.AddEmployee();
                    break;

                case 2:
                    System.out.println("Update an Employee");
                    break;

                case 3:
                    System.out.println("Delete an Employee");
                    break;

                default:
                    System.out.println("Exit");
                    break;
            }



    }

}
