import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        //students.add(new Student("Kripov Artem", "LA-54", "Pervaya", 4, 4));
//        students.add(new Student("Pasichnik Jenya", "LA-63", "Pervaya", 7, 3));
//        students.add(new Student("Sedaya Ira", "LA-63", "Vtoraya", 9, 4));
//        students.add(new Student("Ostrovskiy German", "LA-54", "Vtoraya", 4, 5))
//        students.add(new Student("Krivcov Egor", "LA-54", "Pervaya", 7, 5));
//        students.add(new Student("Morozov Stas", "LA-63", "Vtoraya", 5, 5));

        Scanner scan = new Scanner(System.in);
        System.out.println("Откуда загрузить данные?");
        System.out.println("1.С массива");
        System.out.println("2.С файла");
        System.out.print("Введите число(0 выход): ");

        Loader studentsData = new Arrayloader(); // загружаем все равно
        switch (scan.next()) {
            case "1":
                System.out.println("1");
                studentsData = new `Arrayloader`(); // загрузили список студентов из массива
                System.out.println("Данные загружены с массива");
                break;
            case "2":
                System.out.println("2");
                studentsData = new Fileloader(); // файл по умолчанию
                System.out.println("Данные загружены с файла");
                break;
            case "0":
                System.out.println("Выход");
                System.exit(0);
                break;
            default:
                System.out.println("Неправильно");
        }

        while (true) {
            System.out.println("\nВыберите пункт:");
            System.out.println("1.Вывести cредний балл по всем предметам студента");
            System.out.println("2.Вывести средний балл по конкретному предмету в конкретной группе и на конкретном факультете");
            System.out.println("3.средний балл по предмету для всего университета");
            System.out.print("Введите число(0 выход): ");

            switch (scan.next()) {
                case "1":
                    studentsData.getSered_ball();
                    break;
                case "2":
                    studentsData.getSered_ball_gruppa();
                    break;
                case "3":
                    studentsData.getSered_ball_univer();
                    break;
                case "0":
                    System.out.println("Выход");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Неправильно");
            }

        }
    }

}