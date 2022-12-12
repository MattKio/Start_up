package fr.efrei.views;

import fr.efrei.domain.*;
import fr.efrei.factory.*;
import fr.efrei.repository.*;

import java.util.Scanner;

public class Menu {

    public static EmployeeRepository employeeRepository = EmployeeRepository.getEmployeeRepository();
    public static RaceRepository raceRepository = RaceRepository.getRepository();
    public static GenderRepository genderRepository = GenderRepository.getRepository();
    public static EmploieRepository emploieRepository = EmploieRepository.getRepository();
    public static PosteRepository posteRepository = PosteRepository.getRepository();

    public static Scanner scanner = new Scanner(System.in);
    public static Scanner nameScanner = new Scanner(System.in);

    public static void AddEmployee() {

        int choiceRace;
        String firstname;
        String middlename;
        String lastname;
        String phoneNumber;
        String email;
        String homeNumber;
        String streetAddress;
        String postalAddress;
        String passport;
        String NIC;



        System.out.println("First : \nChoose race");
        System.out.println("1. Indian" +
                "\n2. White");
        choiceRace = scanner.nextInt();

        switch (choiceRace) {
            case 1:
                int choiceSex;

                System.out.println("Choose Sex\n 1. Male / 2. Female");
                choiceSex = scanner.nextInt();

                switch (choiceSex) {
                    case 1:
                        int choiceEmploie;
                        System.out.println("DEMOGRAPHIC INFO FINISH");
                        System.out.println("Title of the employee :\n1. Manager / 2. Trainee / 3. Work-Study");
                        choiceEmploie = scanner.nextInt();

                        switch (choiceEmploie) {
                            case 1:
                                int choiceJob;
                                System.out.println("Which Job he's doing ?\n1. Seller / 2. Reception Desk");
                                choiceJob = scanner.nextInt();

                                switch (choiceJob) {
                                    case 1:
                                        int choiceName;
                                        System.out.println("Now, Enter your name");
                                        System.out.println("Have a middlename ?\n1. Yes / 2. No");
                                        choiceName = scanner.nextInt();

                                        switch (choiceName) {
                                            case 1:
                                                System.out.println("Enter Firstname : ");
                                                firstname = nameScanner.nextLine();
                                                System.out.println("Enter Middlename : ");
                                                middlename = nameScanner.nextLine();
                                                System.out.println("Enter Lastname : ");
                                                lastname = nameScanner.nextLine();
                                                Name name1 = NameFactory.createName(firstname, middlename, lastname);


                                                System.out.println("Enter contact Details :");
                                                System.out.println("Phone Number : ");
                                                phoneNumber = scanner.nextLine();
                                                System.out.println("Home Number : ");
                                                homeNumber = scanner.nextLine();
                                                System.out.println("Email : ");
                                                email = scanner.nextLine();
                                                System.out.println("Street Address : ");
                                                streetAddress = scanner.nextLine();
                                                System.out.println("Postal Address : ");
                                                postalAddress = scanner.nextLine();
                                                System.out.println("Passport : ");
                                                passport = scanner.nextLine();
                                                System.out.println("NIC : ");
                                                NIC = scanner.nextLine();

                                                Demographic_info demographicInfo1 = Demographic_infoFactory.createDemo_info(raceRepository.read("Indian"), genderRepository.read("Male"));
                                                Identity_Type identityType1 = Identity_TypeFactory.createIdentity(passport, NIC);
                                                Poste poste1 = PosteFactory.createPoste(posteRepository.read("Seller"));
                                                Emploie emploie1 = EmploieFactory.createEmploie(emploieRepository.read("Manager"));
                                                Contact_Details contactDetails1 = Contact_DetailsFactory.createContact(phoneNumber, email, homeNumber);
                                                AddressDetails addressDetails1 = AddressDetailsFactory.createAddress(streetAddress, postalAddress);

                                                Employee employee = EmployeeFactory.createEmployee(name1, demographicInfo1, identityType1, poste1, emploie1, contactDetails1, addressDetails1);
                                                employeeRepository.create(employee);
                                                System.out.println(employee);
                                                System.out.println("\n\n");
                                                menu();

                                            case 2:
                                                System.out.println("Enter Firstname : ");
                                                firstname = nameScanner.nextLine();
                                                System.out.println("Enter Lastname : ");
                                                lastname = nameScanner.nextLine();
                                                Name name = NameFactory.createName(firstname, lastname);


                                                System.out.println("Enter contact Details :");
                                                System.out.println("Phone Number : ");
                                                phoneNumber = scanner.nextLine();
                                                System.out.println("Home Number : ");
                                                homeNumber = scanner.nextLine();
                                                System.out.println("Email : ");
                                                email = scanner.nextLine();
                                                System.out.println("Street Address : ");
                                                streetAddress = scanner.nextLine();
                                                System.out.println("Postal Address : ");
                                                postalAddress = scanner.nextLine();
                                                System.out.println("Passport : ");
                                                passport = scanner.nextLine();
                                                System.out.println("NIC : ");
                                                NIC = scanner.nextLine();

                                                Demographic_info demographicInfo = Demographic_infoFactory.createDemo_info(raceRepository.read("Indian"), genderRepository.read("Male"));
                                                Identity_Type identityType = Identity_TypeFactory.createIdentity(passport, NIC);
                                                Poste poste = PosteFactory.createPoste(posteRepository.read("Seller"));
                                                Emploie emploie = EmploieFactory.createEmploie(emploieRepository.read("Manager"));
                                                Contact_Details contactDetails = Contact_DetailsFactory.createContact(phoneNumber, email, homeNumber);
                                                AddressDetails addressDetails = AddressDetailsFactory.createAddress(streetAddress, postalAddress);

                                                Employee employee1 = EmployeeFactory.createEmployee(name, demographicInfo, identityType, poste, emploie, contactDetails, addressDetails);
                                                employeeRepository.create(employee1);
                                                System.out.println(employee1);
                                                menu();
                                        }


                                    case 2:
                                        int choice6;
                                        System.out.println("Now, Enter your name");
                                        System.out.println("Have a middlename ?\n1. Yes / 2. No");
                                        choice6 = scanner.nextInt();

                                        switch (choice6) {
                                            case 1:
                                                System.out.println("Enter Firstname : ");
                                                firstname = nameScanner.nextLine();
                                                System.out.println("Enter Middlename : ");
                                                middlename = nameScanner.nextLine();
                                                System.out.println("Enter Lastname : ");
                                                lastname = nameScanner.nextLine();
                                                Name name1 = NameFactory.createName(firstname, middlename, lastname);


                                                System.out.println("Enter contact Details :");
                                                System.out.println("Phone Number : ");
                                                phoneNumber = scanner.nextLine();
                                                System.out.println("Home Number : ");
                                                homeNumber = scanner.nextLine();
                                                System.out.println("Email : ");
                                                email = scanner.nextLine();
                                                System.out.println("Street Address : ");
                                                streetAddress = scanner.nextLine();
                                                System.out.println("Postal Address : ");
                                                postalAddress = scanner.nextLine();
                                                System.out.println("Passport : ");
                                                passport = scanner.nextLine();
                                                System.out.println("NIC : ");
                                                NIC = scanner.nextLine();

                                                Demographic_info demographicInfo1 = Demographic_infoFactory.createDemo_info(raceRepository.read("Indian"), genderRepository.read("Male"));
                                                Identity_Type identityType1 = Identity_TypeFactory.createIdentity(passport, NIC);
                                                Poste poste1 = PosteFactory.createPoste(posteRepository.read("Reception Desk"));
                                                Emploie emploie1 = EmploieFactory.createEmploie(emploieRepository.read("Manager"));
                                                Contact_Details contactDetails1 = Contact_DetailsFactory.createContact(phoneNumber, email, homeNumber);
                                                AddressDetails addressDetails1 = AddressDetailsFactory.createAddress(streetAddress, postalAddress);

                                                Employee employee = EmployeeFactory.createEmployee(name1, demographicInfo1, identityType1, poste1, emploie1, contactDetails1, addressDetails1);
                                                employeeRepository.create(employee);
                                                System.out.println(employee);
                                                menu();

                                            case 2:
                                                System.out.println("Enter Firstname : ");
                                                firstname = nameScanner.nextLine();
                                                System.out.println("Enter Lastname : ");
                                                lastname = nameScanner.nextLine();
                                                Name name = NameFactory.createName(firstname, lastname);


                                                System.out.println("Enter contact Details :");
                                                System.out.println("Phone Number : ");
                                                phoneNumber = scanner.nextLine();
                                                System.out.println("Home Number : ");
                                                homeNumber = scanner.nextLine();
                                                System.out.println("Email : ");
                                                email = scanner.nextLine();
                                                System.out.println("Street Address : ");
                                                streetAddress = scanner.nextLine();
                                                System.out.println("Postal Address : ");
                                                postalAddress = scanner.nextLine();
                                                System.out.println("Passport : ");
                                                passport = scanner.nextLine();
                                                System.out.println("NIC : ");
                                                NIC = scanner.nextLine();

                                                Demographic_info demographicInfo = Demographic_infoFactory.createDemo_info(raceRepository.read("Indian"), genderRepository.read("Male"));
                                                Poste poste = PosteFactory.createPoste(posteRepository.read("Reception Desk"));
                                                Emploie emploie = EmploieFactory.createEmploie(emploieRepository.read("Manage"));
                                                Identity_Type identityType = Identity_TypeFactory.createIdentity(passport, NIC);
                                                Contact_Details contactDetails = Contact_DetailsFactory.createContact(phoneNumber, email, homeNumber);
                                                AddressDetails addressDetails = AddressDetailsFactory.createAddress(streetAddress, postalAddress);

                                                Employee employee1 = EmployeeFactory.createEmployee(name, demographicInfo, identityType, poste, emploie, contactDetails, addressDetails);
                                                employeeRepository.create(employee1);
                                                System.out.println(employee1);
                                                menu();
                                        }
                                }

                            case 2:

                                System.out.println("Which Job he's doing ?\n1. Seller / 2. Reception Desk");
                                choiceJob = scanner.nextInt();

                                switch (choiceJob)
                                {
                                    case 1:
                                        int choiceName;
                                        System.out.println("Now, Enter your name");
                                        System.out.println("Have a middlename ?\n1. Yes / 2. No");
                                        choiceName = scanner.nextInt();

                                        switch (choiceName)
                                        {
                                            case 1:
                                                System.out.println("Enter Firstname : ");
                                                firstname = nameScanner.nextLine();
                                                System.out.println("Enter Middlename : ");
                                                middlename = nameScanner.nextLine();
                                                System.out.println("Enter Lastname : ");
                                                lastname = nameScanner.nextLine();
                                                Name name1 = NameFactory.createName(firstname, middlename, lastname);


                                                System.out.println("Enter contact Details :");
                                                System.out.println("Phone Number : ");
                                                phoneNumber = scanner.nextLine();
                                                System.out.println("Home Number : ");
                                                homeNumber = scanner.nextLine();
                                                System.out.println("Email : ");
                                                email = scanner.nextLine();
                                                System.out.println("Street Address : ");
                                                streetAddress = scanner.nextLine();
                                                System.out.println("Postal Address : ");
                                                postalAddress = scanner.nextLine();
                                                System.out.println("Passport : ");
                                                passport = scanner.nextLine();
                                                System.out.println("NIC : ");
                                                NIC = scanner.nextLine();

                                                Demographic_info demographicInfo1 = Demographic_infoFactory.createDemo_info(raceRepository.read("Indian"), genderRepository.read("Male"));
                                                Identity_Type identityType1 = Identity_TypeFactory.createIdentity(passport, NIC);
                                                Poste poste1 = PosteFactory.createPoste(posteRepository.read("Seller"));
                                                Emploie emploie1 = EmploieFactory.createEmploie(emploieRepository.read("Trainee"));
                                                Contact_Details contactDetails1 = Contact_DetailsFactory.createContact(phoneNumber, email, homeNumber);
                                                AddressDetails addressDetails1 = AddressDetailsFactory.createAddress(streetAddress, postalAddress);

                                                Employee employee = EmployeeFactory.createEmployee(name1, demographicInfo1, identityType1, poste1, emploie1, contactDetails1, addressDetails1);
                                                employeeRepository.create(employee);
                                                System.out.println(employee);
                                                menu();

                                            case 2:
                                                System.out.println("Enter Firstname : ");
                                                firstname = nameScanner.nextLine();
                                                System.out.println("Enter Lastname : ");
                                                lastname = nameScanner.nextLine();
                                                Name name = NameFactory.createName(firstname, lastname);


                                                System.out.println("Enter contact Details :");
                                                System.out.println("Phone Number : ");
                                                phoneNumber = scanner.nextLine();
                                                System.out.println("Home Number : ");
                                                homeNumber = scanner.nextLine();
                                                System.out.println("Email : ");
                                                email = scanner.nextLine();
                                                System.out.println("Street Address : ");
                                                streetAddress = scanner.nextLine();
                                                System.out.println("Postal Address : ");
                                                postalAddress = scanner.nextLine();
                                                System.out.println("Passport : ");
                                                passport = scanner.nextLine();
                                                System.out.println("NIC : ");
                                                NIC = scanner.nextLine();

                                                Demographic_info demographicInfo = Demographic_infoFactory.createDemo_info(raceRepository.read("Indian"), genderRepository.read("Male"));
                                                Identity_Type identityType = Identity_TypeFactory.createIdentity(passport, NIC);
                                                Poste poste = PosteFactory.createPoste(posteRepository.read("Seller"));
                                                Emploie emploie = EmploieFactory.createEmploie(emploieRepository.read("Trainee"));
                                                Contact_Details contactDetails = Contact_DetailsFactory.createContact(phoneNumber, email, homeNumber);
                                                AddressDetails addressDetails = AddressDetailsFactory.createAddress(streetAddress, postalAddress);

                                                Employee employee1 = EmployeeFactory.createEmployee(name, demographicInfo, identityType, poste, emploie, contactDetails, addressDetails);
                                                employeeRepository.create(employee1);
                                                System.out.println(employee1);
                                                menu();
                                        }

                                    case 2:
                                        int choice7;
                                        System.out.println("Now, Enter your name");
                                        System.out.println("Have a middlename ?\n1. Yes / 2. No");
                                        choice7 = scanner.nextInt();

                                        switch (choice7)
                                        {
                                            case 1:
                                                System.out.println("Enter Firstname : ");
                                                firstname = nameScanner.nextLine();
                                                System.out.println("Enter Middlename : ");
                                                middlename = nameScanner.nextLine();
                                                System.out.println("Enter Lastname : ");
                                                lastname = nameScanner.nextLine();
                                                Name name1 = NameFactory.createName(firstname, middlename, lastname);


                                                System.out.println("Enter contact Details :");
                                                System.out.println("Phone Number : ");
                                                phoneNumber = scanner.nextLine();
                                                System.out.println("Home Number : ");
                                                homeNumber = scanner.nextLine();
                                                System.out.println("Email : ");
                                                email = scanner.nextLine();
                                                System.out.println("Street Address : ");
                                                streetAddress = scanner.nextLine();
                                                System.out.println("Postal Address : ");
                                                postalAddress = scanner.nextLine();
                                                System.out.println("Passport : ");
                                                passport = scanner.nextLine();
                                                System.out.println("NIC : ");
                                                NIC = scanner.nextLine();

                                                Demographic_info demographicInfo1 = Demographic_infoFactory.createDemo_info(raceRepository.read("Indian"), genderRepository.read("Male"));
                                                Identity_Type identityType1 = Identity_TypeFactory.createIdentity(passport, NIC);
                                                Poste poste1 = PosteFactory.createPoste(posteRepository.read("Reception Desk"));
                                                Emploie emploie1 = EmploieFactory.createEmploie(emploieRepository.read("Trainee"));
                                                Contact_Details contactDetails1 = Contact_DetailsFactory.createContact(phoneNumber, email, homeNumber);
                                                AddressDetails addressDetails1 = AddressDetailsFactory.createAddress(streetAddress, postalAddress);

                                                Employee employee = EmployeeFactory.createEmployee(name1, demographicInfo1, identityType1, poste1, emploie1, contactDetails1, addressDetails1);
                                                employeeRepository.create(employee);
                                                System.out.println(employee);
                                                menu();

                                            case 2:
                                                System.out.println("Enter Firstname : ");
                                                firstname = nameScanner.nextLine();
                                                System.out.println("Enter Lastname : ");
                                                lastname = nameScanner.nextLine();
                                                Name name = NameFactory.createName(firstname, lastname);


                                                System.out.println("Enter contact Details :");
                                                System.out.println("Phone Number : ");
                                                phoneNumber = scanner.nextLine();
                                                System.out.println("Home Number : ");
                                                homeNumber = scanner.nextLine();
                                                System.out.println("Email : ");
                                                email = scanner.nextLine();
                                                System.out.println("Street Address : ");
                                                streetAddress = scanner.nextLine();
                                                System.out.println("Postal Address : ");
                                                postalAddress = scanner.nextLine();
                                                System.out.println("Passport : ");
                                                passport = scanner.nextLine();
                                                System.out.println("NIC : ");
                                                NIC = scanner.nextLine();

                                                Demographic_info demographicInfo = Demographic_infoFactory.createDemo_info(raceRepository.read("Indian"), genderRepository.read("Male"));
                                                Identity_Type identityType = Identity_TypeFactory.createIdentity(passport, NIC);
                                                Poste poste = PosteFactory.createPoste(posteRepository.read("Reception Desk"));
                                                Emploie emploie = EmploieFactory.createEmploie(emploieRepository.read("Trainee"));
                                                Contact_Details contactDetails = Contact_DetailsFactory.createContact(phoneNumber, email, homeNumber);
                                                AddressDetails addressDetails = AddressDetailsFactory.createAddress(streetAddress, postalAddress);

                                                Employee employee1 = EmployeeFactory.createEmployee(name, demographicInfo, identityType, poste, emploie, contactDetails, addressDetails);
                                                employeeRepository.create(employee1);
                                                System.out.println(employee1);
                                                menu();
                                        }
                                }


                            case 3:
                                int choice9;
                                System.out.println("Which Job he's doing ?\n1. Seller / 2. Reception Desk");
                                choice9 = scanner.nextInt();

                                switch (choice9) {
                                    case 1:
                                        int choiceName;
                                        System.out.println("Now, Enter your name");
                                        System.out.println("Have a middlename ?\n1. Yes / 2. No");
                                        choiceName = scanner.nextInt();

                                        switch (choiceName) {
                                            case 1:
                                                System.out.println("Enter Firstname : ");
                                                firstname = nameScanner.nextLine();
                                                System.out.println("Enter Middlename : ");
                                                middlename = nameScanner.nextLine();
                                                System.out.println("Enter Lastname : ");
                                                lastname = nameScanner.nextLine();
                                                Name name1 = NameFactory.createName(firstname, middlename, lastname);


                                                System.out.println("Enter contact Details :");
                                                System.out.println("Phone Number : ");
                                                phoneNumber = scanner.nextLine();
                                                System.out.println("Home Number : ");
                                                homeNumber = scanner.nextLine();
                                                System.out.println("Email : ");
                                                email = scanner.nextLine();
                                                System.out.println("Street Address : ");
                                                streetAddress = scanner.nextLine();
                                                System.out.println("Postal Address : ");
                                                postalAddress = scanner.nextLine();
                                                System.out.println("Passport : ");
                                                passport = scanner.nextLine();
                                                System.out.println("NIC : ");
                                                NIC = scanner.nextLine();

                                                Demographic_info demographicInfo1 = Demographic_infoFactory.createDemo_info(raceRepository.read("Indian"), genderRepository.read("Male"));
                                                Identity_Type identityType1 = Identity_TypeFactory.createIdentity(passport, NIC);
                                                Poste poste1 = PosteFactory.createPoste(posteRepository.read("Seller"));
                                                Emploie emploie1 = EmploieFactory.createEmploie(emploieRepository.read("Work-Study"));
                                                Contact_Details contactDetails1 = Contact_DetailsFactory.createContact(phoneNumber, email, homeNumber);
                                                AddressDetails addressDetails1 = AddressDetailsFactory.createAddress(streetAddress, postalAddress);

                                                Employee employee = EmployeeFactory.createEmployee(name1, demographicInfo1, identityType1, poste1, emploie1, contactDetails1, addressDetails1);
                                                employeeRepository.create(employee);
                                                System.out.println(employee);
                                                menu();

                                            case 2:
                                                System.out.println("Enter Firstname : ");
                                                firstname = nameScanner.nextLine();
                                                System.out.println("Enter Lastname : ");
                                                lastname = nameScanner.nextLine();
                                                Name name = NameFactory.createName(firstname, lastname);


                                                System.out.println("Enter contact Details :");
                                                System.out.println("Phone Number : ");
                                                phoneNumber = scanner.nextLine();
                                                System.out.println("Home Number : ");
                                                homeNumber = scanner.nextLine();
                                                System.out.println("Email : ");
                                                email = scanner.nextLine();
                                                System.out.println("Street Address : ");
                                                streetAddress = scanner.nextLine();
                                                System.out.println("Postal Address : ");
                                                postalAddress = scanner.nextLine();
                                                System.out.println("Passport : ");
                                                passport = scanner.nextLine();
                                                System.out.println("NIC : ");
                                                NIC = scanner.nextLine();

                                                Demographic_info demographicInfo = Demographic_infoFactory.createDemo_info(raceRepository.read("Indian"), genderRepository.read("Male"));
                                                Identity_Type identityType = Identity_TypeFactory.createIdentity(passport, NIC);
                                                Poste poste = PosteFactory.createPoste(posteRepository.read("Seller"));
                                                Emploie emploie = EmploieFactory.createEmploie(emploieRepository.read("Work-Study"));
                                                Contact_Details contactDetails = Contact_DetailsFactory.createContact(phoneNumber, email, homeNumber);
                                                AddressDetails addressDetails = AddressDetailsFactory.createAddress(streetAddress, postalAddress);

                                                Employee employee1 = EmployeeFactory.createEmployee(name, demographicInfo, identityType, poste, emploie, contactDetails, addressDetails);
                                                employeeRepository.create(employee1);
                                                System.out.println(employee1);
                                                menu();
                                        }


                                    case 2:
                                        int choice6;
                                        System.out.println("Now, Enter your name");
                                        System.out.println("Have a middlename ?\n1. Yes / 2. No");
                                        choice6 = scanner.nextInt();

                                        switch (choice6) {
                                            case 1:
                                                System.out.println("Enter Firstname : ");
                                                firstname = nameScanner.nextLine();
                                                System.out.println("Enter Middlename : ");
                                                middlename = nameScanner.nextLine();
                                                System.out.println("Enter Lastname : ");
                                                lastname = nameScanner.nextLine();
                                                Name name1 = NameFactory.createName(firstname, middlename, lastname);


                                                System.out.println("Enter contact Details :");
                                                System.out.println("Phone Number : ");
                                                phoneNumber = scanner.nextLine();
                                                System.out.println("Home Number : ");
                                                homeNumber = scanner.nextLine();
                                                System.out.println("Email : ");
                                                email = scanner.nextLine();
                                                System.out.println("Street Address : ");
                                                streetAddress = scanner.nextLine();
                                                System.out.println("Postal Address : ");
                                                postalAddress = scanner.nextLine();
                                                System.out.println("Passport : ");
                                                passport = scanner.nextLine();
                                                System.out.println("NIC : ");
                                                NIC = scanner.nextLine();

                                                Demographic_info demographicInfo1 = Demographic_infoFactory.createDemo_info(raceRepository.read("Indian"), genderRepository.read("Male"));
                                                Identity_Type identityType1 = Identity_TypeFactory.createIdentity(passport, NIC);
                                                Poste poste1 = PosteFactory.createPoste(posteRepository.read("Reception Desk"));
                                                Emploie emploie1 = EmploieFactory.createEmploie(emploieRepository.read("Work-Study"));
                                                Contact_Details contactDetails1 = Contact_DetailsFactory.createContact(phoneNumber, email, homeNumber);
                                                AddressDetails addressDetails1 = AddressDetailsFactory.createAddress(streetAddress, postalAddress);

                                                Employee employee = EmployeeFactory.createEmployee(name1, demographicInfo1, identityType1, poste1, emploie1, contactDetails1, addressDetails1);
                                                employeeRepository.create(employee);
                                                System.out.println(employee);
                                                menu();

                                            case 2:
                                                System.out.println("Enter Firstname : ");
                                                firstname = nameScanner.nextLine();
                                                System.out.println("Enter Lastname : ");
                                                lastname = nameScanner.nextLine();
                                                Name name = NameFactory.createName(firstname, lastname);


                                                System.out.println("Enter contact Details :");
                                                System.out.println("Phone Number : ");
                                                phoneNumber = scanner.nextLine();
                                                System.out.println("Home Number : ");
                                                homeNumber = scanner.nextLine();
                                                System.out.println("Email : ");
                                                email = scanner.nextLine();
                                                System.out.println("Street Address : ");
                                                streetAddress = scanner.nextLine();
                                                System.out.println("Postal Address : ");
                                                postalAddress = scanner.nextLine();
                                                System.out.println("Passport : ");
                                                passport = scanner.nextLine();
                                                System.out.println("NIC : ");
                                                NIC = scanner.nextLine();

                                                Demographic_info demographicInfo = Demographic_infoFactory.createDemo_info(raceRepository.read("Indian"), genderRepository.read("Male"));
                                                Poste poste = PosteFactory.createPoste(posteRepository.read("Reception Desk"));
                                                Emploie emploie = EmploieFactory.createEmploie(emploieRepository.read("Work-Study"));
                                                Identity_Type identityType = Identity_TypeFactory.createIdentity(passport, NIC);
                                                Contact_Details contactDetails = Contact_DetailsFactory.createContact(phoneNumber, email, homeNumber);
                                                AddressDetails addressDetails = AddressDetailsFactory.createAddress(streetAddress, postalAddress);

                                                Employee employee1 = EmployeeFactory.createEmployee(name, demographicInfo, identityType, poste, emploie, contactDetails, addressDetails);
                                                employeeRepository.create(employee1);
                                                System.out.println(employee1);
                                                menu();
                                        }
                                }

                        }

                    case 2:
                        int choice10;
                        System.out.println("DEMOGRAPHIC INFO FINISH");
                        System.out.println("Title of the employee :\n1. Manager / 2. Trainee / 3. Work-Study");
                        choice10 = scanner.nextInt();

                        switch (choice10) {
                            case 1:
                                int choiceJob;
                                System.out.println("Which Job he's doing ?\n1. Seller / 2. Reception Desk");
                                choiceJob = scanner.nextInt();

                                switch (choiceJob) {
                                    case 1:
                                        int choiceName;
                                        System.out.println("Now, Enter your name");
                                        System.out.println("Have a middlename ?\n1. Yes / 2. No");
                                        choiceName = scanner.nextInt();

                                        switch (choiceName) {
                                            case 1:
                                                System.out.println("Enter Firstname : ");
                                                firstname = nameScanner.nextLine();
                                                System.out.println("Enter Middlename : ");
                                                middlename = nameScanner.nextLine();
                                                System.out.println("Enter Lastname : ");
                                                lastname = nameScanner.nextLine();
                                                Name name1 = NameFactory.createName(firstname, middlename, lastname);


                                                System.out.println("Enter contact Details :");
                                                System.out.println("Phone Number : ");
                                                phoneNumber = scanner.nextLine();
                                                System.out.println("Home Number : ");
                                                homeNumber = scanner.nextLine();
                                                System.out.println("Email : ");
                                                email = scanner.nextLine();
                                                System.out.println("Street Address : ");
                                                streetAddress = scanner.nextLine();
                                                System.out.println("Postal Address : ");
                                                postalAddress = scanner.nextLine();
                                                System.out.println("Passport : ");
                                                passport = scanner.nextLine();
                                                System.out.println("NIC : ");
                                                NIC = scanner.nextLine();

                                                Demographic_info demographicInfo1 = Demographic_infoFactory.createDemo_info(raceRepository.read("White"), genderRepository.read("Female"));
                                                Identity_Type identityType1 = Identity_TypeFactory.createIdentity(passport, NIC);
                                                Poste poste1 = PosteFactory.createPoste(posteRepository.read("Seller"));
                                                Emploie emploie1 = EmploieFactory.createEmploie(emploieRepository.read("Manager"));
                                                Contact_Details contactDetails1 = Contact_DetailsFactory.createContact(phoneNumber, email, homeNumber);
                                                AddressDetails addressDetails1 = AddressDetailsFactory.createAddress(streetAddress, postalAddress);

                                                Employee employee = EmployeeFactory.createEmployee(name1, demographicInfo1, identityType1, poste1, emploie1, contactDetails1, addressDetails1);
                                                employeeRepository.create(employee);
                                                System.out.println(employee);
                                                menu();

                                            case 2:
                                                System.out.println("Enter Firstname : ");
                                                firstname = nameScanner.nextLine();
                                                System.out.println("Enter Lastname : ");
                                                lastname = nameScanner.nextLine();
                                                Name name = NameFactory.createName(firstname, lastname);


                                                System.out.println("Enter contact Details :");
                                                System.out.println("Phone Number : ");
                                                phoneNumber = scanner.nextLine();
                                                System.out.println("Home Number : ");
                                                homeNumber = scanner.nextLine();
                                                System.out.println("Email : ");
                                                email = scanner.nextLine();
                                                System.out.println("Street Address : ");
                                                streetAddress = scanner.nextLine();
                                                System.out.println("Postal Address : ");
                                                postalAddress = scanner.nextLine();
                                                System.out.println("Passport : ");
                                                passport = scanner.nextLine();
                                                System.out.println("NIC : ");
                                                NIC = scanner.nextLine();

                                                Demographic_info demographicInfo = Demographic_infoFactory.createDemo_info(raceRepository.read("White"), genderRepository.read("Female"));
                                                Identity_Type identityType = Identity_TypeFactory.createIdentity(passport, NIC);
                                                Poste poste = PosteFactory.createPoste(posteRepository.read("Seller"));
                                                Emploie emploie = EmploieFactory.createEmploie(emploieRepository.read("Manager"));
                                                Contact_Details contactDetails = Contact_DetailsFactory.createContact(phoneNumber, email, homeNumber);
                                                AddressDetails addressDetails = AddressDetailsFactory.createAddress(streetAddress, postalAddress);

                                                Employee employee1 = EmployeeFactory.createEmployee(name, demographicInfo, identityType, poste, emploie, contactDetails, addressDetails);
                                                employeeRepository.create(employee1);
                                                System.out.println(employee1);
                                                menu();
                                        }


                                    case 2:
                                        int choice6;
                                        System.out.println("Now, Enter your name");
                                        System.out.println("Have a middlename ?\n1. Yes / 2. No");
                                        choice6 = scanner.nextInt();

                                        switch (choice6) {
                                            case 1:
                                                System.out.println("Enter Firstname : ");
                                                firstname = nameScanner.nextLine();
                                                System.out.println("Enter Middlename : ");
                                                middlename = nameScanner.nextLine();
                                                System.out.println("Enter Lastname : ");
                                                lastname = nameScanner.nextLine();
                                                Name name1 = NameFactory.createName(firstname, middlename, lastname);


                                                System.out.println("Enter contact Details :");
                                                System.out.println("Phone Number : ");
                                                phoneNumber = scanner.nextLine();
                                                System.out.println("Home Number : ");
                                                homeNumber = scanner.nextLine();
                                                System.out.println("Email : ");
                                                email = scanner.nextLine();
                                                System.out.println("Street Address : ");
                                                streetAddress = scanner.nextLine();
                                                System.out.println("Postal Address : ");
                                                postalAddress = scanner.nextLine();
                                                System.out.println("Passport : ");
                                                passport = scanner.nextLine();
                                                System.out.println("NIC : ");
                                                NIC = scanner.nextLine();

                                                Demographic_info demographicInfo1 = Demographic_infoFactory.createDemo_info(raceRepository.read("White"), genderRepository.read("Female"));
                                                Identity_Type identityType1 = Identity_TypeFactory.createIdentity(passport, NIC);
                                                Poste poste1 = PosteFactory.createPoste(posteRepository.read("Reception Desk"));
                                                Emploie emploie1 = EmploieFactory.createEmploie(emploieRepository.read("Manager"));
                                                Contact_Details contactDetails1 = Contact_DetailsFactory.createContact(phoneNumber, email, homeNumber);
                                                AddressDetails addressDetails1 = AddressDetailsFactory.createAddress(streetAddress, postalAddress);

                                                Employee employee = EmployeeFactory.createEmployee(name1, demographicInfo1, identityType1, poste1, emploie1, contactDetails1, addressDetails1);
                                                employeeRepository.create(employee);
                                                System.out.println(employee);
                                                menu();

                                            case 2:
                                                System.out.println("Enter Firstname : ");
                                                firstname = nameScanner.nextLine();
                                                System.out.println("Enter Lastname : ");
                                                lastname = nameScanner.nextLine();
                                                Name name = NameFactory.createName(firstname, lastname);


                                                System.out.println("Enter contact Details :");
                                                System.out.println("Phone Number : ");
                                                phoneNumber = scanner.nextLine();
                                                System.out.println("Home Number : ");
                                                homeNumber = scanner.nextLine();
                                                System.out.println("Email : ");
                                                email = scanner.nextLine();
                                                System.out.println("Street Address : ");
                                                streetAddress = scanner.nextLine();
                                                System.out.println("Postal Address : ");
                                                postalAddress = scanner.nextLine();
                                                System.out.println("Passport : ");
                                                passport = scanner.nextLine();
                                                System.out.println("NIC : ");
                                                NIC = scanner.nextLine();

                                                Demographic_info demographicInfo = Demographic_infoFactory.createDemo_info(raceRepository.read("White"), genderRepository.read("Female"));
                                                Poste poste = PosteFactory.createPoste(posteRepository.read("Reception Desk"));
                                                Emploie emploie = EmploieFactory.createEmploie(emploieRepository.read("Manage"));
                                                Identity_Type identityType = Identity_TypeFactory.createIdentity(passport, NIC);
                                                Contact_Details contactDetails = Contact_DetailsFactory.createContact(phoneNumber, email, homeNumber);
                                                AddressDetails addressDetails = AddressDetailsFactory.createAddress(streetAddress, postalAddress);

                                                Employee employee1 = EmployeeFactory.createEmployee(name, demographicInfo, identityType, poste, emploie, contactDetails, addressDetails);
                                                employeeRepository.create(employee1);
                                                System.out.println(employee1);
                                                menu();

                                        }
                                }

                            case 2:

                                System.out.println("Which Job he's doing ?\n1. Seller / 2. Reception Desk");
                                choiceJob = scanner.nextInt();

                                switch (choiceJob)
                                {
                                    case 1:
                                        int choiceName;
                                        System.out.println("Now, Enter your name");
                                        System.out.println("Have a middlename ?\n1. Yes / 2. No");
                                        choiceName = scanner.nextInt();

                                        switch (choiceName)
                                        {
                                            case 1:
                                                System.out.println("Enter Firstname : ");
                                                firstname = nameScanner.nextLine();
                                                System.out.println("Enter Middlename : ");
                                                middlename = nameScanner.nextLine();
                                                System.out.println("Enter Lastname : ");
                                                lastname = nameScanner.nextLine();
                                                Name name1 = NameFactory.createName(firstname, middlename, lastname);


                                                System.out.println("Enter contact Details :");
                                                System.out.println("Phone Number : ");
                                                phoneNumber = scanner.nextLine();
                                                System.out.println("Home Number : ");
                                                homeNumber = scanner.nextLine();
                                                System.out.println("Email : ");
                                                email = scanner.nextLine();
                                                System.out.println("Street Address : ");
                                                streetAddress = scanner.nextLine();
                                                System.out.println("Postal Address : ");
                                                postalAddress = scanner.nextLine();
                                                System.out.println("Passport : ");
                                                passport = scanner.nextLine();
                                                System.out.println("NIC : ");
                                                NIC = scanner.nextLine();

                                                Demographic_info demographicInfo1 = Demographic_infoFactory.createDemo_info(raceRepository.read("White"), genderRepository.read("Female"));
                                                Identity_Type identityType1 = Identity_TypeFactory.createIdentity(passport, NIC);
                                                Poste poste1 = PosteFactory.createPoste(posteRepository.read("Seller"));
                                                Emploie emploie1 = EmploieFactory.createEmploie(emploieRepository.read("Trainee"));
                                                Contact_Details contactDetails1 = Contact_DetailsFactory.createContact(phoneNumber, email, homeNumber);
                                                AddressDetails addressDetails1 = AddressDetailsFactory.createAddress(streetAddress, postalAddress);

                                                Employee employee = EmployeeFactory.createEmployee(name1, demographicInfo1, identityType1, poste1, emploie1, contactDetails1, addressDetails1);
                                                employeeRepository.create(employee);
                                                System.out.println(employee);
                                                menu();

                                            case 2:
                                                System.out.println("Enter Firstname : ");
                                                firstname = nameScanner.nextLine();
                                                System.out.println("Enter Lastname : ");
                                                lastname = nameScanner.nextLine();
                                                Name name = NameFactory.createName(firstname, lastname);


                                                System.out.println("Enter contact Details :");
                                                System.out.println("Phone Number : ");
                                                phoneNumber = scanner.nextLine();
                                                System.out.println("Home Number : ");
                                                homeNumber = scanner.nextLine();
                                                System.out.println("Email : ");
                                                email = scanner.nextLine();
                                                System.out.println("Street Address : ");
                                                streetAddress = scanner.nextLine();
                                                System.out.println("Postal Address : ");
                                                postalAddress = scanner.nextLine();
                                                System.out.println("Passport : ");
                                                passport = scanner.nextLine();
                                                System.out.println("NIC : ");
                                                NIC = scanner.nextLine();

                                                Demographic_info demographicInfo = Demographic_infoFactory.createDemo_info(raceRepository.read("White"), genderRepository.read("Female"));
                                                Identity_Type identityType = Identity_TypeFactory.createIdentity(passport, NIC);
                                                Poste poste = PosteFactory.createPoste(posteRepository.read("Seller"));
                                                Emploie emploie = EmploieFactory.createEmploie(emploieRepository.read("Trainee"));
                                                Contact_Details contactDetails = Contact_DetailsFactory.createContact(phoneNumber, email, homeNumber);
                                                AddressDetails addressDetails = AddressDetailsFactory.createAddress(streetAddress, postalAddress);

                                                Employee employee1 = EmployeeFactory.createEmployee(name, demographicInfo, identityType, poste, emploie, contactDetails, addressDetails);
                                                employeeRepository.create(employee1);
                                                System.out.println(employee1);
                                                menu();
                                        }

                                    case 2:
                                        int choice7;
                                        System.out.println("Now, Enter your name");
                                        System.out.println("Have a middlename ?\n1. Yes / 2. No");
                                        choice7 = scanner.nextInt();

                                        switch (choice7)
                                        {
                                            case 1:
                                                System.out.println("Enter Firstname : ");
                                                firstname = nameScanner.nextLine();
                                                System.out.println("Enter Middlename : ");
                                                middlename = nameScanner.nextLine();
                                                System.out.println("Enter Lastname : ");
                                                lastname = nameScanner.nextLine();
                                                Name name1 = NameFactory.createName(firstname, middlename, lastname);


                                                System.out.println("Enter contact Details :");
                                                System.out.println("Phone Number : ");
                                                phoneNumber = scanner.nextLine();
                                                System.out.println("Home Number : ");
                                                homeNumber = scanner.nextLine();
                                                System.out.println("Email : ");
                                                email = scanner.nextLine();
                                                System.out.println("Street Address : ");
                                                streetAddress = scanner.nextLine();
                                                System.out.println("Postal Address : ");
                                                postalAddress = scanner.nextLine();
                                                System.out.println("Passport : ");
                                                passport = scanner.nextLine();
                                                System.out.println("NIC : ");
                                                NIC = scanner.nextLine();

                                                Demographic_info demographicInfo1 = Demographic_infoFactory.createDemo_info(raceRepository.read("White"), genderRepository.read("Female"));
                                                Identity_Type identityType1 = Identity_TypeFactory.createIdentity(passport, NIC);
                                                Poste poste1 = PosteFactory.createPoste(posteRepository.read("Reception Desk"));
                                                Emploie emploie1 = EmploieFactory.createEmploie(emploieRepository.read("Trainee"));
                                                Contact_Details contactDetails1 = Contact_DetailsFactory.createContact(phoneNumber, email, homeNumber);
                                                AddressDetails addressDetails1 = AddressDetailsFactory.createAddress(streetAddress, postalAddress);

                                                Employee employee = EmployeeFactory.createEmployee(name1, demographicInfo1, identityType1, poste1, emploie1, contactDetails1, addressDetails1);
                                                employeeRepository.create(employee);
                                                System.out.println(employee);
                                                menu();

                                            case 2:
                                                System.out.println("Enter Firstname : ");
                                                firstname = nameScanner.nextLine();
                                                System.out.println("Enter Lastname : ");
                                                lastname = nameScanner.nextLine();
                                                Name name = NameFactory.createName(firstname, lastname);


                                                System.out.println("Enter contact Details :");
                                                System.out.println("Phone Number : ");
                                                phoneNumber = scanner.nextLine();
                                                System.out.println("Home Number : ");
                                                homeNumber = scanner.nextLine();
                                                System.out.println("Email : ");
                                                email = scanner.nextLine();
                                                System.out.println("Street Address : ");
                                                streetAddress = scanner.nextLine();
                                                System.out.println("Postal Address : ");
                                                postalAddress = scanner.nextLine();
                                                System.out.println("Passport : ");
                                                passport = scanner.nextLine();
                                                System.out.println("NIC : ");
                                                NIC = scanner.nextLine();

                                                Demographic_info demographicInfo = Demographic_infoFactory.createDemo_info(raceRepository.read("White"), genderRepository.read("Female"));
                                                Identity_Type identityType = Identity_TypeFactory.createIdentity(passport, NIC);
                                                Poste poste = PosteFactory.createPoste(posteRepository.read("Reception Desk"));
                                                Emploie emploie = EmploieFactory.createEmploie(emploieRepository.read("Trainee"));
                                                Contact_Details contactDetails = Contact_DetailsFactory.createContact(phoneNumber, email, homeNumber);
                                                AddressDetails addressDetails = AddressDetailsFactory.createAddress(streetAddress, postalAddress);

                                                Employee employee1 = EmployeeFactory.createEmployee(name, demographicInfo, identityType, poste, emploie, contactDetails, addressDetails);
                                                employeeRepository.create(employee1);
                                                System.out.println(employee1);
                                                menu();
                                        }
                                }


                            case 3:
                                int choice9;
                                System.out.println("Which Job he's doing ?\n1. Seller / 2. Reception Desk");
                                choice9 = scanner.nextInt();

                                switch (choice9) {
                                    case 1:
                                        int choiceName;
                                        System.out.println("Now, Enter your name");
                                        System.out.println("Have a middlename ?\n1. Yes / 2. No");
                                        choiceName = scanner.nextInt();

                                        switch (choiceName) {
                                            case 1:
                                                System.out.println("Enter Firstname : ");
                                                firstname = nameScanner.nextLine();
                                                System.out.println("Enter Middlename : ");
                                                middlename = nameScanner.nextLine();
                                                System.out.println("Enter Lastname : ");
                                                lastname = nameScanner.nextLine();
                                                Name name1 = NameFactory.createName(firstname, middlename, lastname);


                                                System.out.println("Enter contact Details :");
                                                System.out.println("Phone Number : ");
                                                phoneNumber = scanner.nextLine();
                                                System.out.println("Home Number : ");
                                                homeNumber = scanner.nextLine();
                                                System.out.println("Email : ");
                                                email = scanner.nextLine();
                                                System.out.println("Street Address : ");
                                                streetAddress = scanner.nextLine();
                                                System.out.println("Postal Address : ");
                                                postalAddress = scanner.nextLine();
                                                System.out.println("Passport : ");
                                                passport = scanner.nextLine();
                                                System.out.println("NIC : ");
                                                NIC = scanner.nextLine();

                                                Demographic_info demographicInfo1 = Demographic_infoFactory.createDemo_info(raceRepository.read("White"), genderRepository.read("Female"));
                                                Identity_Type identityType1 = Identity_TypeFactory.createIdentity(passport, NIC);
                                                Poste poste1 = PosteFactory.createPoste(posteRepository.read("Seller"));
                                                Emploie emploie1 = EmploieFactory.createEmploie(emploieRepository.read("Work-Study"));
                                                Contact_Details contactDetails1 = Contact_DetailsFactory.createContact(phoneNumber, email, homeNumber);
                                                AddressDetails addressDetails1 = AddressDetailsFactory.createAddress(streetAddress, postalAddress);

                                                Employee employee = EmployeeFactory.createEmployee(name1, demographicInfo1, identityType1, poste1, emploie1, contactDetails1, addressDetails1);
                                                employeeRepository.create(employee);
                                                System.out.println(employee);
                                                menu();

                                            case 2:
                                                System.out.println("Enter Firstname : ");
                                                firstname = nameScanner.nextLine();
                                                System.out.println("Enter Lastname : ");
                                                lastname = nameScanner.nextLine();
                                                Name name = NameFactory.createName(firstname, lastname);


                                                System.out.println("Enter contact Details :");
                                                System.out.println("Phone Number : ");
                                                phoneNumber = scanner.nextLine();
                                                System.out.println("Home Number : ");
                                                homeNumber = scanner.nextLine();
                                                System.out.println("Email : ");
                                                email = scanner.nextLine();
                                                System.out.println("Street Address : ");
                                                streetAddress = scanner.nextLine();
                                                System.out.println("Postal Address : ");
                                                postalAddress = scanner.nextLine();
                                                System.out.println("Passport : ");
                                                passport = scanner.nextLine();
                                                System.out.println("NIC : ");
                                                NIC = scanner.nextLine();

                                                Demographic_info demographicInfo = Demographic_infoFactory.createDemo_info(raceRepository.read("White"), genderRepository.read("Female"));
                                                Identity_Type identityType = Identity_TypeFactory.createIdentity(passport, NIC);
                                                Poste poste = PosteFactory.createPoste(posteRepository.read("Seller"));
                                                Emploie emploie = EmploieFactory.createEmploie(emploieRepository.read("Work-Study"));
                                                Contact_Details contactDetails = Contact_DetailsFactory.createContact(phoneNumber, email, homeNumber);
                                                AddressDetails addressDetails = AddressDetailsFactory.createAddress(streetAddress, postalAddress);

                                                Employee employee1 = EmployeeFactory.createEmployee(name, demographicInfo, identityType, poste, emploie, contactDetails, addressDetails);
                                                employeeRepository.create(employee1);
                                                System.out.println(employee1);
                                                menu();
                                        }


                                    case 2:
                                        int choice6;
                                        System.out.println("Now, Enter your name");
                                        System.out.println("Have a middlename ?\n1. Yes / 2. No");
                                        choice6 = scanner.nextInt();

                                        switch (choice6) {
                                            case 1:
                                                System.out.println("Enter Firstname : ");
                                                firstname = nameScanner.nextLine();
                                                System.out.println("Enter Middlename : ");
                                                middlename = nameScanner.nextLine();
                                                System.out.println("Enter Lastname : ");
                                                lastname = nameScanner.nextLine();
                                                Name name1 = NameFactory.createName(firstname, middlename, lastname);


                                                System.out.println("Enter contact Details :");
                                                System.out.println("Phone Number : ");
                                                phoneNumber = scanner.nextLine();
                                                System.out.println("Home Number : ");
                                                homeNumber = scanner.nextLine();
                                                System.out.println("Email : ");
                                                email = scanner.nextLine();
                                                System.out.println("Street Address : ");
                                                streetAddress = scanner.nextLine();
                                                System.out.println("Postal Address : ");
                                                postalAddress = scanner.nextLine();
                                                System.out.println("Passport : ");
                                                passport = scanner.nextLine();
                                                System.out.println("NIC : ");
                                                NIC = scanner.nextLine();

                                                Demographic_info demographicInfo1 = Demographic_infoFactory.createDemo_info(raceRepository.read("White"), genderRepository.read("Female"));
                                                Identity_Type identityType1 = Identity_TypeFactory.createIdentity(passport, NIC);
                                                Poste poste1 = PosteFactory.createPoste(posteRepository.read("Reception Desk"));
                                                Emploie emploie1 = EmploieFactory.createEmploie(emploieRepository.read("Work-Study"));
                                                Contact_Details contactDetails1 = Contact_DetailsFactory.createContact(phoneNumber, email, homeNumber);
                                                AddressDetails addressDetails1 = AddressDetailsFactory.createAddress(streetAddress, postalAddress);

                                                Employee employee = EmployeeFactory.createEmployee(name1, demographicInfo1, identityType1, poste1, emploie1, contactDetails1, addressDetails1);
                                                employeeRepository.create(employee);
                                                System.out.println(employee);
                                                menu();

                                            case 2:
                                                System.out.println("Enter Firstname : ");
                                                firstname = nameScanner.nextLine();
                                                System.out.println("Enter Lastname : ");
                                                lastname = nameScanner.nextLine();
                                                Name name = NameFactory.createName(firstname, lastname);


                                                System.out.println("Enter contact Details :");
                                                System.out.println("Phone Number : ");
                                                phoneNumber = scanner.nextLine();
                                                System.out.println("Home Number : ");
                                                homeNumber = scanner.nextLine();
                                                System.out.println("Email : ");
                                                email = scanner.nextLine();
                                                System.out.println("Street Address : ");
                                                streetAddress = scanner.nextLine();
                                                System.out.println("Postal Address : ");
                                                postalAddress = scanner.nextLine();
                                                System.out.println("Passport : ");
                                                passport = scanner.nextLine();
                                                System.out.println("NIC : ");
                                                NIC = scanner.nextLine();

                                                Demographic_info demographicInfo = Demographic_infoFactory.createDemo_info(raceRepository.read("White"), genderRepository.read("Female"));
                                                Poste poste = PosteFactory.createPoste(posteRepository.read("Reception Desk"));
                                                Emploie emploie = EmploieFactory.createEmploie(emploieRepository.read("Work-Study"));
                                                Identity_Type identityType = Identity_TypeFactory.createIdentity(passport, NIC);
                                                Contact_Details contactDetails = Contact_DetailsFactory.createContact(phoneNumber, email, homeNumber);
                                                AddressDetails addressDetails = AddressDetailsFactory.createAddress(streetAddress, postalAddress);

                                                Employee employee1 = EmployeeFactory.createEmployee(name, demographicInfo, identityType, poste, emploie, contactDetails, addressDetails);
                                                employeeRepository.create(employee1);
                                                System.out.println(employee1);
                                                menu();
                                        }
                                }
                        }
                }


            case 2:
                int choice11;

                System.out.println("Choose Sex\n 1. Male / 2. Female");
                choice11 = scanner.nextInt();

                switch (choice11) {
                    case 1:
                        int choiceEmploie;
                        System.out.println("DEMOGRAPHIC INFO FINISH");
                        System.out.println("Title of the employee :\n1. Manager / 2. Trainee / 3. Work-Study");
                        choiceEmploie = scanner.nextInt();

                        switch (choiceEmploie) {
                            case 1:
                                int choiceJob;
                                System.out.println("Which Job he's doing ?\n1. Seller / 2. Reception Desk");
                                choiceJob = scanner.nextInt();

                                switch (choiceJob) {
                                    case 1:
                                        int choiceName;
                                        System.out.println("Now, Enter your name");
                                        System.out.println("Have a middlename ?\n1. Yes / 2. No");
                                        choiceName = scanner.nextInt();

                                        switch (choiceName) {
                                            case 1:
                                                System.out.println("Enter Firstname : ");
                                                firstname = nameScanner.nextLine();
                                                System.out.println("Enter Middlename : ");
                                                middlename = nameScanner.nextLine();
                                                System.out.println("Enter Lastname : ");
                                                lastname = nameScanner.nextLine();
                                                Name name1 = NameFactory.createName(firstname, middlename, lastname);


                                                System.out.println("Enter contact Details :");
                                                System.out.println("Phone Number : ");
                                                phoneNumber = scanner.nextLine();
                                                System.out.println("Home Number : ");
                                                homeNumber = scanner.nextLine();
                                                System.out.println("Email : ");
                                                email = scanner.nextLine();
                                                System.out.println("Street Address : ");
                                                streetAddress = scanner.nextLine();
                                                System.out.println("Postal Address : ");
                                                postalAddress = scanner.nextLine();
                                                System.out.println("Passport : ");
                                                passport = scanner.nextLine();
                                                System.out.println("NIC : ");
                                                NIC = scanner.nextLine();

                                                Demographic_info demographicInfo1 = Demographic_infoFactory.createDemo_info(raceRepository.read("White"), genderRepository.read("Male"));
                                                Identity_Type identityType1 = Identity_TypeFactory.createIdentity(passport, NIC);
                                                Poste poste1 = PosteFactory.createPoste(posteRepository.read("Seller"));
                                                Emploie emploie1 = EmploieFactory.createEmploie(emploieRepository.read("Manager"));
                                                Contact_Details contactDetails1 = Contact_DetailsFactory.createContact(phoneNumber, email, homeNumber);
                                                AddressDetails addressDetails1 = AddressDetailsFactory.createAddress(streetAddress, postalAddress);

                                                Employee employee = EmployeeFactory.createEmployee(name1, demographicInfo1, identityType1, poste1, emploie1, contactDetails1, addressDetails1);
                                                employeeRepository.create(employee);
                                                System.out.println(employee);
                                                menu();

                                            case 2:
                                                System.out.println("Enter Firstname : ");
                                                firstname = nameScanner.nextLine();
                                                System.out.println("Enter Lastname : ");
                                                lastname = nameScanner.nextLine();
                                                Name name = NameFactory.createName(firstname, lastname);


                                                System.out.println("Enter contact Details :");
                                                System.out.println("Phone Number : ");
                                                phoneNumber = scanner.nextLine();
                                                System.out.println("Home Number : ");
                                                homeNumber = scanner.nextLine();
                                                System.out.println("Email : ");
                                                email = scanner.nextLine();
                                                System.out.println("Street Address : ");
                                                streetAddress = scanner.nextLine();
                                                System.out.println("Postal Address : ");
                                                postalAddress = scanner.nextLine();
                                                System.out.println("Passport : ");
                                                passport = scanner.nextLine();
                                                System.out.println("NIC : ");
                                                NIC = scanner.nextLine();

                                                Demographic_info demographicInfo = Demographic_infoFactory.createDemo_info(raceRepository.read("White"), genderRepository.read("Male"));
                                                Identity_Type identityType = Identity_TypeFactory.createIdentity(passport, NIC);
                                                Poste poste = PosteFactory.createPoste(posteRepository.read("Seller"));
                                                Emploie emploie = EmploieFactory.createEmploie(emploieRepository.read("Manager"));
                                                Contact_Details contactDetails = Contact_DetailsFactory.createContact(phoneNumber, email, homeNumber);
                                                AddressDetails addressDetails = AddressDetailsFactory.createAddress(streetAddress, postalAddress);

                                                Employee employee1 = EmployeeFactory.createEmployee(name, demographicInfo, identityType, poste, emploie, contactDetails, addressDetails);
                                                employeeRepository.create(employee1);
                                                System.out.println(employee1);
                                                menu();
                                        }


                                    case 2:
                                        int choice6;
                                        System.out.println("Now, Enter your name");
                                        System.out.println("Have a middlename ?\n1. Yes / 2. No");
                                        choice6 = scanner.nextInt();

                                        switch (choice6) {
                                            case 1:
                                                System.out.println("Enter Firstname : ");
                                                firstname = nameScanner.nextLine();
                                                System.out.println("Enter Middlename : ");
                                                middlename = nameScanner.nextLine();
                                                System.out.println("Enter Lastname : ");
                                                lastname = nameScanner.nextLine();
                                                Name name1 = NameFactory.createName(firstname, middlename, lastname);


                                                System.out.println("Enter contact Details :");
                                                System.out.println("Phone Number : ");
                                                phoneNumber = scanner.nextLine();
                                                System.out.println("Home Number : ");
                                                homeNumber = scanner.nextLine();
                                                System.out.println("Email : ");
                                                email = scanner.nextLine();
                                                System.out.println("Street Address : ");
                                                streetAddress = scanner.nextLine();
                                                System.out.println("Postal Address : ");
                                                postalAddress = scanner.nextLine();
                                                System.out.println("Passport : ");
                                                passport = scanner.nextLine();
                                                System.out.println("NIC : ");
                                                NIC = scanner.nextLine();

                                                Demographic_info demographicInfo1 = Demographic_infoFactory.createDemo_info(raceRepository.read("White"), genderRepository.read("Male"));
                                                Identity_Type identityType1 = Identity_TypeFactory.createIdentity(passport, NIC);
                                                Poste poste1 = PosteFactory.createPoste(posteRepository.read("Reception Desk"));
                                                Emploie emploie1 = EmploieFactory.createEmploie(emploieRepository.read("Manager"));
                                                Contact_Details contactDetails1 = Contact_DetailsFactory.createContact(phoneNumber, email, homeNumber);
                                                AddressDetails addressDetails1 = AddressDetailsFactory.createAddress(streetAddress, postalAddress);

                                                Employee employee = EmployeeFactory.createEmployee(name1, demographicInfo1, identityType1, poste1, emploie1, contactDetails1, addressDetails1);
                                                employeeRepository.create(employee);
                                                System.out.println(employee);
                                                menu();

                                            case 2:
                                                System.out.println("Enter Firstname : ");
                                                firstname = nameScanner.nextLine();
                                                System.out.println("Enter Lastname : ");
                                                lastname = nameScanner.nextLine();
                                                Name name = NameFactory.createName(firstname, lastname);


                                                System.out.println("Enter contact Details :");
                                                System.out.println("Phone Number : ");
                                                phoneNumber = scanner.nextLine();
                                                System.out.println("Home Number : ");
                                                homeNumber = scanner.nextLine();
                                                System.out.println("Email : ");
                                                email = scanner.nextLine();
                                                System.out.println("Street Address : ");
                                                streetAddress = scanner.nextLine();
                                                System.out.println("Postal Address : ");
                                                postalAddress = scanner.nextLine();
                                                System.out.println("Passport : ");
                                                passport = scanner.nextLine();
                                                System.out.println("NIC : ");
                                                NIC = scanner.nextLine();

                                                Demographic_info demographicInfo = Demographic_infoFactory.createDemo_info(raceRepository.read("White"), genderRepository.read("Male"));
                                                Poste poste = PosteFactory.createPoste(posteRepository.read("Reception Desk"));
                                                Emploie emploie = EmploieFactory.createEmploie(emploieRepository.read("Manage"));
                                                Identity_Type identityType = Identity_TypeFactory.createIdentity(passport, NIC);
                                                Contact_Details contactDetails = Contact_DetailsFactory.createContact(phoneNumber, email, homeNumber);
                                                AddressDetails addressDetails = AddressDetailsFactory.createAddress(streetAddress, postalAddress);

                                                Employee employee1 = EmployeeFactory.createEmployee(name, demographicInfo, identityType, poste, emploie, contactDetails, addressDetails);
                                                employeeRepository.create(employee1);
                                                System.out.println(employee1);
                                                menu();
                                        }
                                }

                            case 2:

                                System.out.println("Which Job he's doing ?\n1. Seller / 2. Reception Desk");
                                choiceJob = scanner.nextInt();

                                switch (choiceJob)
                                {
                                    case 1:
                                        int choiceName;
                                        System.out.println("Now, Enter your name");
                                        System.out.println("Have a middlename ?\n1. Yes / 2. No");
                                        choiceName = scanner.nextInt();

                                        switch (choiceName)
                                        {
                                            case 1:
                                                System.out.println("Enter Firstname : ");
                                                firstname = nameScanner.nextLine();
                                                System.out.println("Enter Middlename : ");
                                                middlename = nameScanner.nextLine();
                                                System.out.println("Enter Lastname : ");
                                                lastname = nameScanner.nextLine();
                                                Name name1 = NameFactory.createName(firstname, middlename, lastname);


                                                System.out.println("Enter contact Details :");
                                                System.out.println("Phone Number : ");
                                                phoneNumber = scanner.nextLine();
                                                System.out.println("Home Number : ");
                                                homeNumber = scanner.nextLine();
                                                System.out.println("Email : ");
                                                email = scanner.nextLine();
                                                System.out.println("Street Address : ");
                                                streetAddress = scanner.nextLine();
                                                System.out.println("Postal Address : ");
                                                postalAddress = scanner.nextLine();
                                                System.out.println("Passport : ");
                                                passport = scanner.nextLine();
                                                System.out.println("NIC : ");
                                                NIC = scanner.nextLine();

                                                Demographic_info demographicInfo1 = Demographic_infoFactory.createDemo_info(raceRepository.read("White"), genderRepository.read("Male"));
                                                Identity_Type identityType1 = Identity_TypeFactory.createIdentity(passport, NIC);
                                                Poste poste1 = PosteFactory.createPoste(posteRepository.read("Seller"));
                                                Emploie emploie1 = EmploieFactory.createEmploie(emploieRepository.read("Trainee"));
                                                Contact_Details contactDetails1 = Contact_DetailsFactory.createContact(phoneNumber, email, homeNumber);
                                                AddressDetails addressDetails1 = AddressDetailsFactory.createAddress(streetAddress, postalAddress);

                                                Employee employee = EmployeeFactory.createEmployee(name1, demographicInfo1, identityType1, poste1, emploie1, contactDetails1, addressDetails1);
                                                employeeRepository.create(employee);
                                                System.out.println(employee);
                                                menu();

                                            case 2:
                                                System.out.println("Enter Firstname : ");
                                                firstname = nameScanner.nextLine();
                                                System.out.println("Enter Lastname : ");
                                                lastname = nameScanner.nextLine();
                                                Name name = NameFactory.createName(firstname, lastname);


                                                System.out.println("Enter contact Details :");
                                                System.out.println("Phone Number : ");
                                                phoneNumber = scanner.nextLine();
                                                System.out.println("Home Number : ");
                                                homeNumber = scanner.nextLine();
                                                System.out.println("Email : ");
                                                email = scanner.nextLine();
                                                System.out.println("Street Address : ");
                                                streetAddress = scanner.nextLine();
                                                System.out.println("Postal Address : ");
                                                postalAddress = scanner.nextLine();
                                                System.out.println("Passport : ");
                                                passport = scanner.nextLine();
                                                System.out.println("NIC : ");
                                                NIC = scanner.nextLine();

                                                Demographic_info demographicInfo = Demographic_infoFactory.createDemo_info(raceRepository.read("White"), genderRepository.read("Male"));
                                                Identity_Type identityType = Identity_TypeFactory.createIdentity(passport, NIC);
                                                Poste poste = PosteFactory.createPoste(posteRepository.read("Seller"));
                                                Emploie emploie = EmploieFactory.createEmploie(emploieRepository.read("Trainee"));
                                                Contact_Details contactDetails = Contact_DetailsFactory.createContact(phoneNumber, email, homeNumber);
                                                AddressDetails addressDetails = AddressDetailsFactory.createAddress(streetAddress, postalAddress);

                                                Employee employee1 = EmployeeFactory.createEmployee(name, demographicInfo, identityType, poste, emploie, contactDetails, addressDetails);
                                                employeeRepository.create(employee1);
                                                System.out.println(employee1);
                                                menu();
                                        }

                                    case 2:
                                        int choice7;
                                        System.out.println("Now, Enter your name");
                                        System.out.println("Have a middlename ?\n1. Yes / 2. No");
                                        choice7 = scanner.nextInt();

                                        switch (choice7)
                                        {
                                            case 1:
                                                System.out.println("Enter Firstname : ");
                                                firstname = nameScanner.nextLine();
                                                System.out.println("Enter Middlename : ");
                                                middlename = nameScanner.nextLine();
                                                System.out.println("Enter Lastname : ");
                                                lastname = nameScanner.nextLine();
                                                Name name1 = NameFactory.createName(firstname, middlename, lastname);


                                                System.out.println("Enter contact Details :");
                                                System.out.println("Phone Number : ");
                                                phoneNumber = scanner.nextLine();
                                                System.out.println("Home Number : ");
                                                homeNumber = scanner.nextLine();
                                                System.out.println("Email : ");
                                                email = scanner.nextLine();
                                                System.out.println("Street Address : ");
                                                streetAddress = scanner.nextLine();
                                                System.out.println("Postal Address : ");
                                                postalAddress = scanner.nextLine();
                                                System.out.println("Passport : ");
                                                passport = scanner.nextLine();
                                                System.out.println("NIC : ");
                                                NIC = scanner.nextLine();

                                                Demographic_info demographicInfo1 = Demographic_infoFactory.createDemo_info(raceRepository.read("White"), genderRepository.read("Male"));
                                                Identity_Type identityType1 = Identity_TypeFactory.createIdentity(passport, NIC);
                                                Poste poste1 = PosteFactory.createPoste(posteRepository.read("Reception Desk"));
                                                Emploie emploie1 = EmploieFactory.createEmploie(emploieRepository.read("Trainee"));
                                                Contact_Details contactDetails1 = Contact_DetailsFactory.createContact(phoneNumber, email, homeNumber);
                                                AddressDetails addressDetails1 = AddressDetailsFactory.createAddress(streetAddress, postalAddress);

                                                Employee employee = EmployeeFactory.createEmployee(name1, demographicInfo1, identityType1, poste1, emploie1, contactDetails1, addressDetails1);
                                                employeeRepository.create(employee);
                                                System.out.println(employee);
                                                menu();

                                            case 2:
                                                System.out.println("Enter Firstname : ");
                                                firstname = nameScanner.nextLine();
                                                System.out.println("Enter Lastname : ");
                                                lastname = nameScanner.nextLine();
                                                Name name = NameFactory.createName(firstname, lastname);


                                                System.out.println("Enter contact Details :");
                                                System.out.println("Phone Number : ");
                                                phoneNumber = scanner.nextLine();
                                                System.out.println("Home Number : ");
                                                homeNumber = scanner.nextLine();
                                                System.out.println("Email : ");
                                                email = scanner.nextLine();
                                                System.out.println("Street Address : ");
                                                streetAddress = scanner.nextLine();
                                                System.out.println("Postal Address : ");
                                                postalAddress = scanner.nextLine();
                                                System.out.println("Passport : ");
                                                passport = scanner.nextLine();
                                                System.out.println("NIC : ");
                                                NIC = scanner.nextLine();

                                                Demographic_info demographicInfo = Demographic_infoFactory.createDemo_info(raceRepository.read("White"), genderRepository.read("Male"));
                                                Identity_Type identityType = Identity_TypeFactory.createIdentity(passport, NIC);
                                                Poste poste = PosteFactory.createPoste(posteRepository.read("Reception Desk"));
                                                Emploie emploie = EmploieFactory.createEmploie(emploieRepository.read("Trainee"));
                                                Contact_Details contactDetails = Contact_DetailsFactory.createContact(phoneNumber, email, homeNumber);
                                                AddressDetails addressDetails = AddressDetailsFactory.createAddress(streetAddress, postalAddress);

                                                Employee employee1 = EmployeeFactory.createEmployee(name, demographicInfo, identityType, poste, emploie, contactDetails, addressDetails);
                                                employeeRepository.create(employee1);
                                                System.out.println(employee1);
                                                menu();
                                        }
                                }


                            case 3:
                                int choice9;
                                System.out.println("Which Job he's doing ?\n1. Seller / 2. Reception Desk");
                                choice9 = scanner.nextInt();

                                switch (choice9) {
                                    case 1:
                                        int choiceName;
                                        System.out.println("Now, Enter your name");
                                        System.out.println("Have a middlename ?\n1. Yes / 2. No");
                                        choiceName = scanner.nextInt();

                                        switch (choiceName) {
                                            case 1:
                                                System.out.println("Enter Firstname : ");
                                                firstname = nameScanner.nextLine();
                                                System.out.println("Enter Middlename : ");
                                                middlename = nameScanner.nextLine();
                                                System.out.println("Enter Lastname : ");
                                                lastname = nameScanner.nextLine();
                                                Name name1 = NameFactory.createName(firstname, middlename, lastname);


                                                System.out.println("Enter contact Details :");
                                                System.out.println("Phone Number : ");
                                                phoneNumber = scanner.nextLine();
                                                System.out.println("Home Number : ");
                                                homeNumber = scanner.nextLine();
                                                System.out.println("Email : ");
                                                email = scanner.nextLine();
                                                System.out.println("Street Address : ");
                                                streetAddress = scanner.nextLine();
                                                System.out.println("Postal Address : ");
                                                postalAddress = scanner.nextLine();
                                                System.out.println("Passport : ");
                                                passport = scanner.nextLine();
                                                System.out.println("NIC : ");
                                                NIC = scanner.nextLine();

                                                Demographic_info demographicInfo1 = Demographic_infoFactory.createDemo_info(raceRepository.read("White"), genderRepository.read("Male"));
                                                Identity_Type identityType1 = Identity_TypeFactory.createIdentity(passport, NIC);
                                                Poste poste1 = PosteFactory.createPoste(posteRepository.read("Seller"));
                                                Emploie emploie1 = EmploieFactory.createEmploie(emploieRepository.read("Work-Study"));
                                                Contact_Details contactDetails1 = Contact_DetailsFactory.createContact(phoneNumber, email, homeNumber);
                                                AddressDetails addressDetails1 = AddressDetailsFactory.createAddress(streetAddress, postalAddress);

                                                Employee employee = EmployeeFactory.createEmployee(name1, demographicInfo1, identityType1, poste1, emploie1, contactDetails1, addressDetails1);
                                                employeeRepository.create(employee);
                                                System.out.println(employee);
                                                menu();

                                            case 2:
                                                System.out.println("Enter Firstname : ");
                                                firstname = nameScanner.nextLine();
                                                System.out.println("Enter Lastname : ");
                                                lastname = nameScanner.nextLine();
                                                Name name = NameFactory.createName(firstname, lastname);


                                                System.out.println("Enter contact Details :");
                                                System.out.println("Phone Number : ");
                                                phoneNumber = scanner.nextLine();
                                                System.out.println("Home Number : ");
                                                homeNumber = scanner.nextLine();
                                                System.out.println("Email : ");
                                                email = scanner.nextLine();
                                                System.out.println("Street Address : ");
                                                streetAddress = scanner.nextLine();
                                                System.out.println("Postal Address : ");
                                                postalAddress = scanner.nextLine();
                                                System.out.println("Passport : ");
                                                passport = scanner.nextLine();
                                                System.out.println("NIC : ");
                                                NIC = scanner.nextLine();

                                                Demographic_info demographicInfo = Demographic_infoFactory.createDemo_info(raceRepository.read("White"), genderRepository.read("Male"));
                                                Identity_Type identityType = Identity_TypeFactory.createIdentity(passport, NIC);
                                                Poste poste = PosteFactory.createPoste(posteRepository.read("Seller"));
                                                Emploie emploie = EmploieFactory.createEmploie(emploieRepository.read("Work-Study"));
                                                Contact_Details contactDetails = Contact_DetailsFactory.createContact(phoneNumber, email, homeNumber);
                                                AddressDetails addressDetails = AddressDetailsFactory.createAddress(streetAddress, postalAddress);

                                                Employee employee1 = EmployeeFactory.createEmployee(name, demographicInfo, identityType, poste, emploie, contactDetails, addressDetails);
                                                employeeRepository.create(employee1);
                                                System.out.println(employee1);
                                                menu();
                                        }


                                    case 2:
                                        int choice6;
                                        System.out.println("Now, Enter your name");
                                        System.out.println("Have a middlename ?\n1. Yes / 2. No");
                                        choice6 = scanner.nextInt();

                                        switch (choice6) {
                                            case 1:
                                                System.out.println("Enter Firstname : ");
                                                firstname = nameScanner.nextLine();
                                                System.out.println("Enter Middlename : ");
                                                middlename = nameScanner.nextLine();
                                                System.out.println("Enter Lastname : ");
                                                lastname = nameScanner.nextLine();
                                                Name name1 = NameFactory.createName(firstname, middlename, lastname);


                                                System.out.println("Enter contact Details :");
                                                System.out.println("Phone Number : ");
                                                phoneNumber = scanner.nextLine();
                                                System.out.println("Home Number : ");
                                                homeNumber = scanner.nextLine();
                                                System.out.println("Email : ");
                                                email = scanner.nextLine();
                                                System.out.println("Street Address : ");
                                                streetAddress = scanner.nextLine();
                                                System.out.println("Postal Address : ");
                                                postalAddress = scanner.nextLine();
                                                System.out.println("Passport : ");
                                                passport = scanner.nextLine();
                                                System.out.println("NIC : ");
                                                NIC = scanner.nextLine();

                                                Demographic_info demographicInfo1 = Demographic_infoFactory.createDemo_info(raceRepository.read("White"), genderRepository.read("Male"));
                                                Identity_Type identityType1 = Identity_TypeFactory.createIdentity(passport, NIC);
                                                Poste poste1 = PosteFactory.createPoste(posteRepository.read("Reception Desk"));
                                                Emploie emploie1 = EmploieFactory.createEmploie(emploieRepository.read("Work-Study"));
                                                Contact_Details contactDetails1 = Contact_DetailsFactory.createContact(phoneNumber, email, homeNumber);
                                                AddressDetails addressDetails1 = AddressDetailsFactory.createAddress(streetAddress, postalAddress);

                                                Employee employee = EmployeeFactory.createEmployee(name1, demographicInfo1, identityType1, poste1, emploie1, contactDetails1, addressDetails1);
                                                employeeRepository.create(employee);
                                                System.out.println(employee);
                                                menu();

                                            case 2:
                                                System.out.println("Enter Firstname : ");
                                                firstname = nameScanner.nextLine();
                                                System.out.println("Enter Lastname : ");
                                                lastname = nameScanner.nextLine();
                                                Name name = NameFactory.createName(firstname, lastname);


                                                System.out.println("Enter contact Details :");
                                                System.out.println("Phone Number : ");
                                                phoneNumber = scanner.nextLine();
                                                System.out.println("Home Number : ");
                                                homeNumber = scanner.nextLine();
                                                System.out.println("Email : ");
                                                email = scanner.nextLine();
                                                System.out.println("Street Address : ");
                                                streetAddress = scanner.nextLine();
                                                System.out.println("Postal Address : ");
                                                postalAddress = scanner.nextLine();
                                                System.out.println("Passport : ");
                                                passport = scanner.nextLine();
                                                System.out.println("NIC : ");
                                                NIC = scanner.nextLine();

                                                Demographic_info demographicInfo = Demographic_infoFactory.createDemo_info(raceRepository.read("White"), genderRepository.read("Male"));
                                                Poste poste = PosteFactory.createPoste(posteRepository.read("Reception Desk"));
                                                Emploie emploie = EmploieFactory.createEmploie(emploieRepository.read("Work-Study"));
                                                Identity_Type identityType = Identity_TypeFactory.createIdentity(passport, NIC);
                                                Contact_Details contactDetails = Contact_DetailsFactory.createContact(phoneNumber, email, homeNumber);
                                                AddressDetails addressDetails = AddressDetailsFactory.createAddress(streetAddress, postalAddress);

                                                Employee employee1 = EmployeeFactory.createEmployee(name, demographicInfo, identityType, poste, emploie, contactDetails, addressDetails);
                                                employeeRepository.create(employee1);
                                                System.out.println(employee1);
                                                menu();
                                        }
                                }

                        }

                    case 2:
                        int choice10;
                        System.out.println("DEMOGRAPHIC INFO FINISH");
                        System.out.println("Title of the employee :\n1. Manager / 2. Trainee / 3. Work-Study");
                        choice10 = scanner.nextInt();

                        switch (choice10) {
                            case 1:
                                int choiceJob;
                                System.out.println("Which Job he's doing ?\n1. Seller / 2. Reception Desk");
                                choiceJob = scanner.nextInt();

                                switch (choiceJob) {
                                    case 1:
                                        int choiceName;
                                        System.out.println("Now, Enter your name");
                                        System.out.println("Have a middlename ?\n1. Yes / 2. No");
                                        choiceName = scanner.nextInt();

                                        switch (choiceName) {
                                            case 1:
                                                System.out.println("Enter Firstname : ");
                                                firstname = nameScanner.nextLine();
                                                System.out.println("Enter Middlename : ");
                                                middlename = nameScanner.nextLine();
                                                System.out.println("Enter Lastname : ");
                                                lastname = nameScanner.nextLine();
                                                Name name1 = NameFactory.createName(firstname, middlename, lastname);


                                                System.out.println("Enter contact Details :");
                                                System.out.println("Phone Number : ");
                                                phoneNumber = scanner.nextLine();
                                                System.out.println("Home Number : ");
                                                homeNumber = scanner.nextLine();
                                                System.out.println("Email : ");
                                                email = scanner.nextLine();
                                                System.out.println("Street Address : ");
                                                streetAddress = scanner.nextLine();
                                                System.out.println("Postal Address : ");
                                                postalAddress = scanner.nextLine();
                                                System.out.println("Passport : ");
                                                passport = scanner.nextLine();
                                                System.out.println("NIC : ");
                                                NIC = scanner.nextLine();

                                                Demographic_info demographicInfo1 = Demographic_infoFactory.createDemo_info(raceRepository.read("White"), genderRepository.read("Female"));
                                                Identity_Type identityType1 = Identity_TypeFactory.createIdentity(passport, NIC);
                                                Poste poste1 = PosteFactory.createPoste(posteRepository.read("Seller"));
                                                Emploie emploie1 = EmploieFactory.createEmploie(emploieRepository.read("Manager"));
                                                Contact_Details contactDetails1 = Contact_DetailsFactory.createContact(phoneNumber, email, homeNumber);
                                                AddressDetails addressDetails1 = AddressDetailsFactory.createAddress(streetAddress, postalAddress);

                                                Employee employee = EmployeeFactory.createEmployee(name1, demographicInfo1, identityType1, poste1, emploie1, contactDetails1, addressDetails1);
                                                employeeRepository.create(employee);
                                                System.out.println(employee);
                                                menu();

                                            case 2:
                                                System.out.println("Enter Firstname : ");
                                                firstname = nameScanner.nextLine();
                                                System.out.println("Enter Lastname : ");
                                                lastname = nameScanner.nextLine();
                                                Name name = NameFactory.createName(firstname, lastname);


                                                System.out.println("Enter contact Details :");
                                                System.out.println("Phone Number : ");
                                                phoneNumber = scanner.nextLine();
                                                System.out.println("Home Number : ");
                                                homeNumber = scanner.nextLine();
                                                System.out.println("Email : ");
                                                email = scanner.nextLine();
                                                System.out.println("Street Address : ");
                                                streetAddress = scanner.nextLine();
                                                System.out.println("Postal Address : ");
                                                postalAddress = scanner.nextLine();
                                                System.out.println("Passport : ");
                                                passport = scanner.nextLine();
                                                System.out.println("NIC : ");
                                                NIC = scanner.nextLine();

                                                Demographic_info demographicInfo = Demographic_infoFactory.createDemo_info(raceRepository.read("White"), genderRepository.read("Female"));
                                                Identity_Type identityType = Identity_TypeFactory.createIdentity(passport, NIC);
                                                Poste poste = PosteFactory.createPoste(posteRepository.read("Seller"));
                                                Emploie emploie = EmploieFactory.createEmploie(emploieRepository.read("Manager"));
                                                Contact_Details contactDetails = Contact_DetailsFactory.createContact(phoneNumber, email, homeNumber);
                                                AddressDetails addressDetails = AddressDetailsFactory.createAddress(streetAddress, postalAddress);

                                                Employee employee1 = EmployeeFactory.createEmployee(name, demographicInfo, identityType, poste, emploie, contactDetails, addressDetails);
                                                employeeRepository.create(employee1);
                                                System.out.println(employee1);
                                                menu();
                                        }


                                    case 2:
                                        int choice6;
                                        System.out.println("Now, Enter your name");
                                        System.out.println("Have a middlename ?\n1. Yes / 2. No");
                                        choice6 = scanner.nextInt();

                                        switch (choice6) {
                                            case 1:
                                                System.out.println("Enter Firstname : ");
                                                firstname = nameScanner.nextLine();
                                                System.out.println("Enter Middlename : ");
                                                middlename = nameScanner.nextLine();
                                                System.out.println("Enter Lastname : ");
                                                lastname = nameScanner.nextLine();
                                                Name name1 = NameFactory.createName(firstname, middlename, lastname);


                                                System.out.println("Enter contact Details :");
                                                System.out.println("Phone Number : ");
                                                phoneNumber = scanner.nextLine();
                                                System.out.println("Home Number : ");
                                                homeNumber = scanner.nextLine();
                                                System.out.println("Email : ");
                                                email = scanner.nextLine();
                                                System.out.println("Street Address : ");
                                                streetAddress = scanner.nextLine();
                                                System.out.println("Postal Address : ");
                                                postalAddress = scanner.nextLine();
                                                System.out.println("Passport : ");
                                                passport = scanner.nextLine();
                                                System.out.println("NIC : ");
                                                NIC = scanner.nextLine();

                                                Demographic_info demographicInfo1 = Demographic_infoFactory.createDemo_info(raceRepository.read("White"), genderRepository.read("Female"));
                                                Identity_Type identityType1 = Identity_TypeFactory.createIdentity(passport, NIC);
                                                Poste poste1 = PosteFactory.createPoste(posteRepository.read("Reception Desk"));
                                                Emploie emploie1 = EmploieFactory.createEmploie(emploieRepository.read("Manager"));
                                                Contact_Details contactDetails1 = Contact_DetailsFactory.createContact(phoneNumber, email, homeNumber);
                                                AddressDetails addressDetails1 = AddressDetailsFactory.createAddress(streetAddress, postalAddress);

                                                Employee employee = EmployeeFactory.createEmployee(name1, demographicInfo1, identityType1, poste1, emploie1, contactDetails1, addressDetails1);
                                                employeeRepository.create(employee);
                                                System.out.println(employee);
                                                menu();

                                            case 2:
                                                System.out.println("Enter Firstname : ");
                                                firstname = nameScanner.nextLine();
                                                System.out.println("Enter Lastname : ");
                                                lastname = nameScanner.nextLine();
                                                Name name = NameFactory.createName(firstname, lastname);


                                                System.out.println("Enter contact Details :");
                                                System.out.println("Phone Number : ");
                                                phoneNumber = scanner.nextLine();
                                                System.out.println("Home Number : ");
                                                homeNumber = scanner.nextLine();
                                                System.out.println("Email : ");
                                                email = scanner.nextLine();
                                                System.out.println("Street Address : ");
                                                streetAddress = scanner.nextLine();
                                                System.out.println("Postal Address : ");
                                                postalAddress = scanner.nextLine();
                                                System.out.println("Passport : ");
                                                passport = scanner.nextLine();
                                                System.out.println("NIC : ");
                                                NIC = scanner.nextLine();

                                                Demographic_info demographicInfo = Demographic_infoFactory.createDemo_info(raceRepository.read("White"), genderRepository.read("Female"));
                                                Poste poste = PosteFactory.createPoste(posteRepository.read("Reception Desk"));
                                                Emploie emploie = EmploieFactory.createEmploie(emploieRepository.read("Manage"));
                                                Identity_Type identityType = Identity_TypeFactory.createIdentity(passport, NIC);
                                                Contact_Details contactDetails = Contact_DetailsFactory.createContact(phoneNumber, email, homeNumber);
                                                AddressDetails addressDetails = AddressDetailsFactory.createAddress(streetAddress, postalAddress);

                                                Employee employee1 = EmployeeFactory.createEmployee(name, demographicInfo, identityType, poste, emploie, contactDetails, addressDetails);
                                                employeeRepository.create(employee1);
                                                System.out.println(employee1);
                                                menu();
                                        }
                                }

                            case 2:

                                System.out.println("Which Job he's doing ?\n1. Seller / 2. Reception Desk");
                                choiceJob = scanner.nextInt();

                                switch (choiceJob)
                                {
                                    case 1:
                                        int choiceName;
                                        System.out.println("Now, Enter your name");
                                        System.out.println("Have a middlename ?\n1. Yes / 2. No");
                                        choiceName = scanner.nextInt();

                                        switch (choiceName)
                                        {
                                            case 1:
                                                System.out.println("Enter Firstname : ");
                                                firstname = nameScanner.nextLine();
                                                System.out.println("Enter Middlename : ");
                                                middlename = nameScanner.nextLine();
                                                System.out.println("Enter Lastname : ");
                                                lastname = nameScanner.nextLine();
                                                Name name1 = NameFactory.createName(firstname, middlename, lastname);


                                                System.out.println("Enter contact Details :");
                                                System.out.println("Phone Number : ");
                                                phoneNumber = scanner.nextLine();
                                                System.out.println("Home Number : ");
                                                homeNumber = scanner.nextLine();
                                                System.out.println("Email : ");
                                                email = scanner.nextLine();
                                                System.out.println("Street Address : ");
                                                streetAddress = scanner.nextLine();
                                                System.out.println("Postal Address : ");
                                                postalAddress = scanner.nextLine();
                                                System.out.println("Passport : ");
                                                passport = scanner.nextLine();
                                                System.out.println("NIC : ");
                                                NIC = scanner.nextLine();

                                                Demographic_info demographicInfo1 = Demographic_infoFactory.createDemo_info(raceRepository.read("White"), genderRepository.read("Female"));
                                                Identity_Type identityType1 = Identity_TypeFactory.createIdentity(passport, NIC);
                                                Poste poste1 = PosteFactory.createPoste(posteRepository.read("Seller"));
                                                Emploie emploie1 = EmploieFactory.createEmploie(emploieRepository.read("Trainee"));
                                                Contact_Details contactDetails1 = Contact_DetailsFactory.createContact(phoneNumber, email, homeNumber);
                                                AddressDetails addressDetails1 = AddressDetailsFactory.createAddress(streetAddress, postalAddress);

                                                Employee employee = EmployeeFactory.createEmployee(name1, demographicInfo1, identityType1, poste1, emploie1, contactDetails1, addressDetails1);
                                                employeeRepository.create(employee);
                                                System.out.println(employee);
                                                menu();

                                            case 2:
                                                System.out.println("Enter Firstname : ");
                                                firstname = nameScanner.nextLine();
                                                System.out.println("Enter Lastname : ");
                                                lastname = nameScanner.nextLine();
                                                Name name = NameFactory.createName(firstname, lastname);


                                                System.out.println("Enter contact Details :");
                                                System.out.println("Phone Number : ");
                                                phoneNumber = scanner.nextLine();
                                                System.out.println("Home Number : ");
                                                homeNumber = scanner.nextLine();
                                                System.out.println("Email : ");
                                                email = scanner.nextLine();
                                                System.out.println("Street Address : ");
                                                streetAddress = scanner.nextLine();
                                                System.out.println("Postal Address : ");
                                                postalAddress = scanner.nextLine();
                                                System.out.println("Passport : ");
                                                passport = scanner.nextLine();
                                                System.out.println("NIC : ");
                                                NIC = scanner.nextLine();

                                                Demographic_info demographicInfo = Demographic_infoFactory.createDemo_info(raceRepository.read("White"), genderRepository.read("Female"));
                                                Identity_Type identityType = Identity_TypeFactory.createIdentity(passport, NIC);
                                                Poste poste = PosteFactory.createPoste(posteRepository.read("Seller"));
                                                Emploie emploie = EmploieFactory.createEmploie(emploieRepository.read("Trainee"));
                                                Contact_Details contactDetails = Contact_DetailsFactory.createContact(phoneNumber, email, homeNumber);
                                                AddressDetails addressDetails = AddressDetailsFactory.createAddress(streetAddress, postalAddress);

                                                Employee employee1 = EmployeeFactory.createEmployee(name, demographicInfo, identityType, poste, emploie, contactDetails, addressDetails);
                                                employeeRepository.create(employee1);
                                                System.out.println(employee1);
                                                menu();
                                        }

                                    case 2:
                                        int choice7;
                                        System.out.println("Now, Enter your name");
                                        System.out.println("Have a middlename ?\n1. Yes / 2. No");
                                        choice7 = scanner.nextInt();

                                        switch (choice7)
                                        {
                                            case 1:
                                                System.out.println("Enter Firstname : ");
                                                firstname = nameScanner.nextLine();
                                                System.out.println("Enter Middlename : ");
                                                middlename = nameScanner.nextLine();
                                                System.out.println("Enter Lastname : ");
                                                lastname = nameScanner.nextLine();
                                                Name name1 = NameFactory.createName(firstname, middlename, lastname);


                                                System.out.println("Enter contact Details :");
                                                System.out.println("Phone Number : ");
                                                phoneNumber = scanner.nextLine();
                                                System.out.println("Home Number : ");
                                                homeNumber = scanner.nextLine();
                                                System.out.println("Email : ");
                                                email = scanner.nextLine();
                                                System.out.println("Street Address : ");
                                                streetAddress = scanner.nextLine();
                                                System.out.println("Postal Address : ");
                                                postalAddress = scanner.nextLine();
                                                System.out.println("Passport : ");
                                                passport = scanner.nextLine();
                                                System.out.println("NIC : ");
                                                NIC = scanner.nextLine();

                                                Demographic_info demographicInfo1 = Demographic_infoFactory.createDemo_info(raceRepository.read("White"), genderRepository.read("Female"));
                                                Identity_Type identityType1 = Identity_TypeFactory.createIdentity(passport, NIC);
                                                Poste poste1 = PosteFactory.createPoste(posteRepository.read("Reception Desk"));
                                                Emploie emploie1 = EmploieFactory.createEmploie(emploieRepository.read("Trainee"));
                                                Contact_Details contactDetails1 = Contact_DetailsFactory.createContact(phoneNumber, email, homeNumber);
                                                AddressDetails addressDetails1 = AddressDetailsFactory.createAddress(streetAddress, postalAddress);

                                                Employee employee = EmployeeFactory.createEmployee(name1, demographicInfo1, identityType1, poste1, emploie1, contactDetails1, addressDetails1);
                                                employeeRepository.create(employee);
                                                System.out.println(employee);
                                                menu();

                                            case 2:
                                                System.out.println("Enter Firstname : ");
                                                firstname = nameScanner.nextLine();
                                                System.out.println("Enter Lastname : ");
                                                lastname = nameScanner.nextLine();
                                                Name name = NameFactory.createName(firstname, lastname);


                                                System.out.println("Enter contact Details :");
                                                System.out.println("Phone Number : ");
                                                phoneNumber = scanner.nextLine();
                                                System.out.println("Home Number : ");
                                                homeNumber = scanner.nextLine();
                                                System.out.println("Email : ");
                                                email = scanner.nextLine();
                                                System.out.println("Street Address : ");
                                                streetAddress = scanner.nextLine();
                                                System.out.println("Postal Address : ");
                                                postalAddress = scanner.nextLine();
                                                System.out.println("Passport : ");
                                                passport = scanner.nextLine();
                                                System.out.println("NIC : ");
                                                NIC = scanner.nextLine();

                                                Demographic_info demographicInfo = Demographic_infoFactory.createDemo_info(raceRepository.read("White"), genderRepository.read("Female"));
                                                Identity_Type identityType = Identity_TypeFactory.createIdentity(passport, NIC);
                                                Poste poste = PosteFactory.createPoste(posteRepository.read("Reception Desk"));
                                                Emploie emploie = EmploieFactory.createEmploie(emploieRepository.read("Trainee"));
                                                Contact_Details contactDetails = Contact_DetailsFactory.createContact(phoneNumber, email, homeNumber);
                                                AddressDetails addressDetails = AddressDetailsFactory.createAddress(streetAddress, postalAddress);

                                                Employee employee1 = EmployeeFactory.createEmployee(name, demographicInfo, identityType, poste, emploie, contactDetails, addressDetails);
                                                employeeRepository.create(employee1);
                                                System.out.println(employee1);
                                                menu();
                                        }
                                }


                            case 3:
                                int choice9;
                                System.out.println("Which Job he's doing ?\n1. Seller / 2. Reception Desk");
                                choice9 = scanner.nextInt();

                                switch (choice9) {
                                    case 1:
                                        int choiceName;
                                        System.out.println("Now, Enter your name");
                                        System.out.println("Have a middlename ?\n1. Yes / 2. No");
                                        choiceName = scanner.nextInt();

                                        switch (choiceName) {
                                            case 1:
                                                System.out.println("Enter Firstname : ");
                                                firstname = nameScanner.nextLine();
                                                System.out.println("Enter Middlename : ");
                                                middlename = nameScanner.nextLine();
                                                System.out.println("Enter Lastname : ");
                                                lastname = nameScanner.nextLine();
                                                Name name1 = NameFactory.createName(firstname, middlename, lastname);


                                                System.out.println("Enter contact Details :");
                                                System.out.println("Phone Number : ");
                                                phoneNumber = scanner.nextLine();
                                                System.out.println("Home Number : ");
                                                homeNumber = scanner.nextLine();
                                                System.out.println("Email : ");
                                                email = scanner.nextLine();
                                                System.out.println("Street Address : ");
                                                streetAddress = scanner.nextLine();
                                                System.out.println("Postal Address : ");
                                                postalAddress = scanner.nextLine();
                                                System.out.println("Passport : ");
                                                passport = scanner.nextLine();
                                                System.out.println("NIC : ");
                                                NIC = scanner.nextLine();

                                                Demographic_info demographicInfo1 = Demographic_infoFactory.createDemo_info(raceRepository.read("White"), genderRepository.read("Female"));
                                                Identity_Type identityType1 = Identity_TypeFactory.createIdentity(passport, NIC);
                                                Poste poste1 = PosteFactory.createPoste(posteRepository.read("Seller"));
                                                Emploie emploie1 = EmploieFactory.createEmploie(emploieRepository.read("Work-Study"));
                                                Contact_Details contactDetails1 = Contact_DetailsFactory.createContact(phoneNumber, email, homeNumber);
                                                AddressDetails addressDetails1 = AddressDetailsFactory.createAddress(streetAddress, postalAddress);

                                                Employee employee = EmployeeFactory.createEmployee(name1, demographicInfo1, identityType1, poste1, emploie1, contactDetails1, addressDetails1);
                                                employeeRepository.create(employee);
                                                System.out.println(employee);
                                                menu();


                                            case 2:
                                                System.out.println("Enter Firstname : ");
                                                firstname = nameScanner.nextLine();
                                                System.out.println("Enter Lastname : ");
                                                lastname = nameScanner.nextLine();
                                                Name name = NameFactory.createName(firstname, lastname);


                                                System.out.println("Enter contact Details :");
                                                System.out.println("Phone Number : ");
                                                phoneNumber = scanner.nextLine();
                                                System.out.println("Home Number : ");
                                                homeNumber = scanner.nextLine();
                                                System.out.println("Email : ");
                                                email = scanner.nextLine();
                                                System.out.println("Street Address : ");
                                                streetAddress = scanner.nextLine();
                                                System.out.println("Postal Address : ");
                                                postalAddress = scanner.nextLine();
                                                System.out.println("Passport : ");
                                                passport = scanner.nextLine();
                                                System.out.println("NIC : ");
                                                NIC = scanner.nextLine();

                                                Demographic_info demographicInfo = Demographic_infoFactory.createDemo_info(raceRepository.read("White"), genderRepository.read("Female"));
                                                Identity_Type identityType = Identity_TypeFactory.createIdentity(passport, NIC);
                                                Poste poste = PosteFactory.createPoste(posteRepository.read("Seller"));
                                                Emploie emploie = EmploieFactory.createEmploie(emploieRepository.read("Work-Study"));
                                                Contact_Details contactDetails = Contact_DetailsFactory.createContact(phoneNumber, email, homeNumber);
                                                AddressDetails addressDetails = AddressDetailsFactory.createAddress(streetAddress, postalAddress);

                                                Employee employee1 = EmployeeFactory.createEmployee(name, demographicInfo, identityType, poste, emploie, contactDetails, addressDetails);
                                                employeeRepository.create(employee1);
                                                System.out.println(employee1);
                                                menu();
                                        }


                                    case 2:
                                        int choice6;
                                        System.out.println("Now, Enter your name");
                                        System.out.println("Have a middlename ?\n1. Yes / 2. No");
                                        choice6 = scanner.nextInt();

                                        switch (choice6) {
                                            case 1:
                                                System.out.println("Enter Firstname : ");
                                                firstname = nameScanner.nextLine();
                                                System.out.println("Enter Middlename : ");
                                                middlename = nameScanner.nextLine();
                                                System.out.println("Enter Lastname : ");
                                                lastname = nameScanner.nextLine();
                                                Name name1 = NameFactory.createName(firstname, middlename, lastname);


                                                System.out.println("Enter contact Details :");
                                                System.out.println("Phone Number : ");
                                                phoneNumber = scanner.nextLine();
                                                System.out.println("Home Number : ");
                                                homeNumber = scanner.nextLine();
                                                System.out.println("Email : ");
                                                email = scanner.nextLine();
                                                System.out.println("Street Address : ");
                                                streetAddress = scanner.nextLine();
                                                System.out.println("Postal Address : ");
                                                postalAddress = scanner.nextLine();
                                                System.out.println("Passport : ");
                                                passport = scanner.nextLine();
                                                System.out.println("NIC : ");
                                                NIC = scanner.nextLine();

                                                Demographic_info demographicInfo1 = Demographic_infoFactory.createDemo_info(raceRepository.read("White"), genderRepository.read("Female"));
                                                Identity_Type identityType1 = Identity_TypeFactory.createIdentity(passport, NIC);
                                                Poste poste1 = PosteFactory.createPoste(posteRepository.read("Reception Desk"));
                                                Emploie emploie1 = EmploieFactory.createEmploie(emploieRepository.read("Work-Study"));
                                                Contact_Details contactDetails1 = Contact_DetailsFactory.createContact(phoneNumber, email, homeNumber);
                                                AddressDetails addressDetails1 = AddressDetailsFactory.createAddress(streetAddress, postalAddress);

                                                Employee employee = EmployeeFactory.createEmployee(name1, demographicInfo1, identityType1, poste1, emploie1, contactDetails1, addressDetails1);
                                                employeeRepository.create(employee);
                                                System.out.println(employee);
                                                menu();

                                            case 2:
                                                System.out.println("Enter Firstname : ");
                                                firstname = nameScanner.nextLine();
                                                System.out.println("Enter Lastname : ");
                                                lastname = nameScanner.nextLine();
                                                Name name = NameFactory.createName(firstname, lastname);


                                                System.out.println("Enter contact Details :");
                                                System.out.println("Phone Number : ");
                                                phoneNumber = scanner.nextLine();
                                                System.out.println("Home Number : ");
                                                homeNumber = scanner.nextLine();
                                                System.out.println("Email : ");
                                                email = scanner.nextLine();
                                                System.out.println("Street Address : ");
                                                streetAddress = scanner.nextLine();
                                                System.out.println("Postal Address : ");
                                                postalAddress = scanner.nextLine();
                                                System.out.println("Passport : ");
                                                passport = scanner.nextLine();
                                                System.out.println("NIC : ");
                                                NIC = scanner.nextLine();

                                                Demographic_info demographicInfo = Demographic_infoFactory.createDemo_info(raceRepository.read("White"), genderRepository.read("Female"));
                                                Poste poste = PosteFactory.createPoste(posteRepository.read("Reception Desk"));
                                                Emploie emploie = EmploieFactory.createEmploie(emploieRepository.read("Work-Study"));
                                                Identity_Type identityType = Identity_TypeFactory.createIdentity(passport, NIC);
                                                Contact_Details contactDetails = Contact_DetailsFactory.createContact(phoneNumber, email, homeNumber);
                                                AddressDetails addressDetails = AddressDetailsFactory.createAddress(streetAddress, postalAddress);

                                                Employee employee1 = EmployeeFactory.createEmployee(name, demographicInfo, identityType, poste, emploie, contactDetails, addressDetails);
                                                employeeRepository.create(employee1);
                                                System.out.println(employee1);
                                                menu();
                                        }
                                }
                        }
                }

            case 3:
                break;
        }
    }

    public static void UpdateEmployee() {
        System.out.println(employeeRepository.getAll());

        String id = null;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter ID : ");
        id = scan.nextLine();
        employeeRepository.delete(id);
        AddEmployee();

        System.out.println(employeeRepository.getAll());

        System.exit(0);
    }

    public static void DeleteEmployee() {
        System.out.println("DELETING EMPLOYEE");
        String id = null;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter ID : ");
        id = scan.nextLine();
        employeeRepository.delete(id);
        System.exit(0);

    }

    public static void ReadEmployee() {
        System.out.println("READ EMPLOYEE");
        String id = null;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter ID : ");
        id = scan.nextLine();
        System.out.println(employeeRepository.read(id));
        System.exit(0);


    }

    public static void loadObject() {
        Race race1 = RaceFactory.createRace("Indian");
        Race race2 = RaceFactory.createRace("White");
        raceRepository.create(race1);
        raceRepository.create(race2);

        Gender male = GenderFactory.createSex("Male");
        Gender female = GenderFactory.createSex("Female");
        genderRepository.create(male);
        genderRepository.create(female);

        Poste seller = PosteFactory.createPoste("Seller");
        Poste reception = PosteFactory.createPoste("Reception Desk");
        posteRepository.create(seller);
        posteRepository.create(reception);


        Emploie manager = EmploieFactory.createEmploie("Manager");
        Emploie trainee = EmploieFactory.createEmploie("Trainee");
        Emploie workstudy = EmploieFactory.createEmploie("Work-Study");
        emploieRepository.create(manager);
        emploieRepository.create(trainee);
        emploieRepository.create(workstudy);
    }


    public static void menu() {

        loadObject();

        int choice;

        System.out.println(employeeRepository.getAll());

        System.out.println("Hello !\nWelcome to our APP");
        System.out.println("Select your choice");
        System.out.println("1. Add employee" +
                "\n2. Update an employee" +
                "\n3. Delete an Employee" +
                "\n4. Read an Employee");
        choice = scanner.nextInt();
        System.out.println("Your choice :" + choice);
        switch (choice) {
            case 1:
                System.out.println("Add an Employee");
                Menu.AddEmployee();
                break;

            case 2:
                System.out.println("Update an Employee");
                Menu.UpdateEmployee();
                break;

            case 3:
                System.out.println("Delete an Employee");
                Menu.DeleteEmployee();
                break;

            case 4:
                System.out.println("Read an Employee");
                Menu.ReadEmployee();
                break;
        }
    }

}