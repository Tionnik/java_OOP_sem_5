package java_OOP_sem_5.model.service;

import java.util.ArrayList;
import java.util.Calendar;

import java_OOP_sem_5.model.data.User;

public interface DataService<T extends User> {
    T createUser(int id, String name, String lastName, Calendar birthday);
    ArrayList <T> readData();
}
