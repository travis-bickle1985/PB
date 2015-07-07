package ru.levelp.java.PhoneBook;


public class MyArrayList {
    Contact[] objects = null;
    int size;

    public MyArrayList() {
        size = 0;
    }

    public void add(Contact obj) {
        if (size == 0) {
            objects = new Contact[1];
            objects[0] = obj;
        } else {
            Contact[] newObjects = new Contact[size + 1];
            for (int i = 0; i < objects.length; i++) {
                newObjects[i] = objects[i];
            }
            newObjects[size] = obj;
            objects = newObjects;
        }
        size++;
    }

    public Contact get(int index) {
        return objects[index];
    }

    public boolean remove(int index) {
        if (size == 0 || index < 0 || index >= size)
            return false;
        Contact[] newObjects = new Contact[size - 1];
        for (int i = 0; i < index; i++) {
            newObjects[i] = objects[i];
        }//
        for (int i = index + 1; i < size; i++) {
            newObjects[i - 1] = objects[i];
        }
        objects = newObjects;
        size--;
        return true;
    }

    public void clear() {
        size = 0;
        objects = null;
    }


    public boolean add(Contact obj, int index) {
        if (index < 0 || index > size)
            return false;
        if (index == size) {
            add(obj);
            return true;
        }

        Contact[] newObjects = new Contact[size + 1];
        for (int i = 0; i < index; i++) {
            newObjects[i] = objects[i];
        }
        newObjects[index] = obj;
        for (int i = index + 1; i < size + 1; i++) {
            newObjects[i] = objects[i - 1];
        }
        objects = newObjects;
        size++;
        return true;
    }
}