package ru.levelp.java.PhoneBook;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        PhoneBook phonebook = new PhoneBook();

        while (true) {
            System.out.println("1 - add contact");
            System.out.println("2 - delete contact");
            System.out.println("3 - show contacts");
            System.out.println("4 - edit contact");
            System.out.println("0 - exit");

            Scanner sc = new Scanner(System.in);
            int answer = -1;

            try {
                answer = sc.nextInt();
            }
            catch (InputMismatchException e){
            }

            if (answer == 1) {
                System.out.println("Enter name:");
                String name = sc.next();
                System.out.println("Enter phone number:");
                String phone_number = sc.next();
                System.out.println("Enter email:");
                String email = sc.next();
                phonebook.add(name, phone_number, email);
            }

            else if (answer == 2){
                System.out.println("Enter name of record to delete it");
                String name = sc.next();
                phonebook.delete(name);
            }

            else if (answer == 3){
                System.out.println("Enter name to show record or \"1\" to show all records");
                String show_what = sc.next();
                if (show_what.equals("1")) {
                    System.out.println();
                    phonebook.show_all();
                    System.out.println();
                }
                else{
                    System.out.println("Choose field for show: for name - enter \"name\"; for phone number - enter \"phone\"; for e-mail - enter \"email\" or \"0\" to enter without parameters");
                    String field = sc.next();
                    if (field.equals("0")){
                        System.out.println();
                        phonebook.show(show_what);
                        System.out.println();
                    }
                    else{
                        phonebook.show(show_what, field);
                    }
                }
            }

            else if (answer==4){
                System.out.println("Enter name of record for edit");
                String name = sc.next();
                System.out.println("Enter field of record for edit: for name - enter \"name\"; for phone number - enter \"phone\"; for e-mail - enter \"email\"");
                String field = sc.next();
                System.out.println("Enter new value");
                String newValue = sc.next();
                phonebook.edit(name, field, newValue);
            }

            else if (answer==0){
                break;
            }

            else{
                System.out.println("Incorrect");
            }
        }
    }



}