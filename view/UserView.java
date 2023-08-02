package java_OOP_sem_5.view;

import java.util.Calendar;
import java.util.Scanner;

public class UserView {
    public  addUser(){
        Scanner scan = new Scanner(System.in);
        boolean noExit =true;
        int inCommand;

        String name;
        String LastName;
        Calendar birthday;
        String temp;
        String[] tempDate;

        while(noExit){
            System.out.println("Выбор типа пользователя: ");
            System.out.println("[1] Учитель");
            System.out.println("[2] Студент");
            System.out.println("[0] Выход");
            inCommand = scan.nextInt();
            scan.nextLine();

            if (inCommand ==1){

                System.out.print("Имя:");
                name = scan.nextLine();
                System.out.print("Фамилия:");
                LastName = scan.nextLine();
                System.out.print("День рождения В формате: YEAR;MONTH;DATE");
                temp = scan.nextLine();
                tempDate = temp.split(";");
                birthday = new Calendar(tempDate[0],tempDate[1],tempDate[2]);
                public final void set(int year, int month, int date)
                {
                    set(YEAR, year);
                    set(MONTH, month);
                    set(DATE, date);
                }
                
            }


            if(inCommand==0){
                noExit=false;
            }

        }

    }
}
