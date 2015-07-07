package ru.levelp.java.PhoneBook;

public class Contact {

    private static int count = 0;
    private String name;
    private String phone_number;
    private String email;

    public Contact(String name, String phone_number, String email){
        this.setName(name);
        this.setPhone_number(phone_number);
        this.setEmail(email);
        count++;
    }

    public void show(String field){
        if (field.equals("name")){
            System.out.println();
            System.out.println(this.getName());
            System.out.println();
        }
        else if (field.equals("phone")){
            System.out.println();
            System.out.println(this.getPhone_number());
            System.out.println();
        }
        else if (field.equals("email")){
            System.out.println();
            System.out.println(this.getEmail());
            System.out.println();
        }
        else System.out.println("incorrect field name: for name - enter \"name\"; for phone number - enter \"phone\"; for e-mail - enter \"email\" or \"0\" to enter without parameters");
    }

    public void show(){
        System.out.println(this.getName() +" "+ this.getPhone_number() +" "+ this.getEmail());
    }

    public void edit(String field, String newValue) {
        if (field.equals("name")){
            this.setName(newValue);
        }
        else if (field.equals("phone")){
            this.setPhone_number(newValue);
        }
        else if (field.equals("email")){
            this.setEmail(newValue);
        }
        else System.out.println("incorrect field name: for name - enter \"name\"; for phone number - enter \"phone\"; for e-mail - enter \"email\"");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public static int getCount() {
        return count;
    }
}