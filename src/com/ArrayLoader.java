package com;

public class ArrayLoader extends StudentLoader {


    public ArrayLoader() {
        openFile();                     // загружаем во внутренний массив
        Student.students = students;    // заполнили массив в Student.students
    }

    @Override
    public void openFile() { // вернуть массив студентов
        students.add(new Student("Kripov Artem", "LA-54", "Pervaya", 4, 4));
        students.add(new Student("Pasichnik Jenya", "LA-63", "Pervaya", 7, 3));
        students.add(new Student("Sedaya Ira", "LA-63", "Vtoraya", 9, 4));
        students.add(new Student("Ostrovskiy German", "LA-54", "Vtoraya", 4, 5))
        students.add(new Student("Krivcov Egor", "LA-54", "Pervaya", 7, 5));
        students.add(new Student("Morozov Stas", "LA-63", "Vtoraya", 5, 5));
    }
    @Override
    public void openFile() {
        System.out.println(" ");
    }


    public void getSered_ball() {


    }

    public void getSered_ball_gruppa() {

    }

    public void getSered_ball_univer() {

    }


}
