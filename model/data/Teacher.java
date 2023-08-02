package java_sem_5.model.data;

import java.util.ArrayList;
import java.util.Calendar;

public class Teacher extends User{
     
    private ArrayList <String> disciplines;
    private double rating;
    private String department;
    public Teacher(int id, String name, String lastName, Calendar birthday, ArrayList <String> disciplines, double rating,
            String department) {
        super(id, name, lastName, birthday);
        this.disciplines = disciplines;
        this.rating = rating;
        this.department = department;
    }
    public ArrayList <String> getDiscipline() {
        return disciplines;
    }
    public double getRating() {
        return rating;
    }
    public String getDepartment() {
        return department;
    }
    public void setRating(double rating) {
        this.rating = rating;
    }
    @Override
    public String toString(){
            return "Преподаватель: Имя: " + getName() + "  Фамилия: " + getLastName() + " Дисциплины: " + disciplines + " Рейтинг: " + rating;
    }

    
}
