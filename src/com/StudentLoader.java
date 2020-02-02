import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

abstract public class StudentLoader implements Loader {
    public List<Student> students = new ArrayList<>();// встроенный массив студентов

    @Override
    public void getSered_ball() { // средний балл студента
        System.out.println("средний балл студента:");
        double sered_ball = ((String)students.get(3)+(String)students.get(4))/2;
        System.out.println(sered_ball);
    }
    @Override
    public void getSered_ball_gruppa() {// средний балл группа
        System.out.println("Средний балл группы:");
                for (Student student : students) {
            if (student.getSered_ball_gruppa().equals("LA-63")||student.getSered_ball_gruppa().equals("Pervaya")) {
                double sered_ball_gruppa = ((String)students.get(3)+(String)students.get(4))/2;
                System.out.println(sered_ball_gruppa);            }

            }
        }

    @Override
    public void getSered_ball_univer() {// средний балл универ
        System.out.println("Средний балл факультета:");
               for (Student student : students) {
                  double sered_ball_univer = ((String)students.get(3)+(String)students.get(4))/2/6;
                System.out.println(sered_ball_univer);
            }