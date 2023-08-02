package java_sem_5.model.service;

import java.util.ArrayList;
import java.util.Calendar;

import java_sem_5.model.data.User;

public class UserService<T extends User> implements DataService<T> {

    @Override
    public T createUser(int id, String name, String lastName, Calendar birthday) {
        

    }
    @Override
    public ArrayList<T> readData() {
    }

}
