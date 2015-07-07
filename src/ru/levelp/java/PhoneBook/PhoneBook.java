package ru.levelp.java.PhoneBook;

public class PhoneBook {

    int size=0;
    MyArrayList phone_book = new MyArrayList();

    public void add(String name, String phone_number, String email){
        Contact contact = new Contact(name, phone_number, email);
        phone_book.add(contact, size);
        size++;
    }

    public boolean delete(String name){
        int position = -1;
        for (int i=0; i<size; i++){
            if (phone_book.get(i).getName().equals(name)){
                phone_book.remove(i);
                size--;
                return true;
            }
        }

        System.out.println("Can't find record");
        return false;
    }

    public void show(String show_what, String field) {
        Contact contact = findByName(show_what);
        try {
            contact.show(field);
        }
        catch (NullPointerException e){
            System.out.println("Contact doesn't exist or contact list is empty");
        }
    }

    public void show(String show_what) {
        Contact contact = findByName(show_what);
        try {
            contact.show();
        }
        catch (NullPointerException e){
            System.out.println("Contact doesn't exist or contact list is empty");
        }
    }

    public void show_all() {
        for (int i = 0; i < size; i++) {
            phone_book.get(i).show();
        }
    }

    public boolean edit(String name, String field, String newValue) {
        for (int i = 0; i<size; i++){
            if (phone_book.get(i).getName().equals(name))
                phone_book.get(i).edit(field, newValue);
            return true;
        }
        System.out.println("Contact doesn't exist or contact list is empty");
        return false;
    }

    private Contact findByName(String name){
        for (int i=0;i<size;i++){
            if (phone_book.get(i).getName().equals(name))
                return phone_book.get(i);
        }
        return null;
    }

}