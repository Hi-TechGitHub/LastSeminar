package org.example;

public class Class {
    int id;
    int RAM;
    int price;
    String name;

    @Override
    public String toString() {
        return String.format("name=%s, price=%d, RAM=%s, id=%d;", name, price, RAM ,id);
    }

    @Override
    public boolean equals(Object obj) {
        Class t = (Class) obj;
        return id == t.id && name == t.name;
    }

    @Override
    public int hashCode() {
        return id;
    }

}
