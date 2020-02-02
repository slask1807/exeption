import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Workbook;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileLoader extends StudentLoader{
    private String fileName = "E:\\Книга1.xls";
    // private String fileName = "D:\\temp2\\Книга1.xls";

    public FileLoader() {
        openFile(); // загрузить файл в массив
        Student.students = students;        // скопировать и пробросить
    }

    public FileLoader(String fileName) {
        this.fileName = fileName;
        openFile();                         // загрузить файл в массив
        Student.students = students;        // скопировать и пробросить
    }


    public String getInfoInName(int i) throws IOException {
        FileInputStream fis = new FileInputStream(fileName);
        Workbook wb = new HSSFWorkbook(fis);
        String Name = wb.getSheetAt(0).getRow(i).getCell(0).getStringCellValue();
        wb.close();
        return Name;
    }

    public String getInfoGruppa(int i) throws IOException {
        FileInputStream fis = new FileInputStream(fileName);
        Workbook wb = new HSSFWorkbook(fis);
        String Gruppa = wb.getSheetAt(0).getRow(i).getCell(1).getStringCellValue();
        wb.close();
        return Gruppa;
    }

    public String getInfoFukultet(int i) throws IOException {
        FileInputStream fis = new FileInputStream(fileName);
        Workbook wb = new HSSFWorkbook(fis);
        String Fukultet = wb.getSheetAt(0).getRow(i).getCell(2).getStringCellValue();
        wb.close();
        return Fukultet;
    }


    public double getInfoSered_ball_gruppa(double i) throws IOException {
        FileInputStream fis = new FileInputStream(fileName);
        Workbook wb = new HSSFWorkbook(fis);
        double Sered_ball_gruppa = wb.getSheetAt(0).getRow((int) i).getCell(4).getNumericCellValue();
        wb.close();
        return Sered_ball_gruppa;
    }
    public double getInfoSered_ball(double i) throws IOException {
        FileInputStream fis = new FileInputStream(fileName);
        Workbook wb = new HSSFWorkbook(fis);
        double Sered_ball = wb.getSheetAt(0).getRow((int) i).getCell(4).getNumericCellValue();
        wb.close();
        return Sered_ball;
    }
    public double getInfoSered_ball_univer(double i) throws IOException {
        FileInputStream fis = new FileInputStream(fileName);
        Workbook wb = new HSSFWorkbook(fis);
        double Sered_ball_univer = wb.getSheetAt(0).getRow((int) i).getCell(4).getNumericCellValue();
        wb.close();
        return Sered_ball_univer;
    }

    @Override
    public void openFile() {   // загрузить массив из файла
        try {
            FileInputStream fis = new FileInputStream(fileName);
            Workbook wb = new HSSFWorkbook(fis);
            List<Student> list = new ArrayList<>();
            int firstRow = wb.getSheetAt(0).getFirstRowNum()+1;  // начинаем с второй строки
            int nRows = wb.getSheetAt(0).getLastRowNum();        // число строк

            for (int i = firstRow; i <= nRows ; i++) {
                String Name = wb.getSheetAt(0).getRow(i).getCell(0).getStringCellValue();
                String Gruppa = wb.getSheetAt(0).getRow(i).getCell(1).getStringCellValue();
                String Fukultet = wb.getSheetAt(0).getRow(i).getCell(2).getStringCellValue();
                double Predmet1 = (int) wb.getSheetAt(0).getRow(i).getCell(3).getNumericCellValue();
                double Predmet2 = (int) wb.getSheetAt(0).getRow(i).getCell(4).getNumericCellValue();
                double Sredniy_ball = wb.getSheetAt(0).getRow(i).getCell(5).getNumericCellValue();
                double getSered_ball_fakultet = wb.getSheetAt(0).getRow(i).getCell(6).getNumericCellValue();
                 if (Name.length() <= 0) {  // имя пустое, записи кончились
                    break; // завершить ввод данных
                }
                list.add(new Student(Name,Gruppa,Fukultet,Predmet1,Predmet2,Sredniy_ball,getSered_ball_fakultet));
            }
            wb.close();
            students = list; // скопировали список

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
