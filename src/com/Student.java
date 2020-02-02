import java.util.List;

public class Student {
    public static List<Student> students;

    private String name;
    private String gruppa;
    private String fukultet;
    private double predmet1;
    private double predmet2;

    public Student(String name, String gruppa, String fuakultet, double predmet1, double predmet2) {
        this.name = name;
        this.gruppa = gruppa;
        this.fukultet = fukultet;
        this.predmet1 = predmet1;
        this.predmet2 = predmet2;
    }


    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public String getGruppa() {

        return gruppa;
    }

    public void setGruppa(String gruppa) {
        this.gruppa = gruppa;    }

    public String getFukultet() {

        return fukultet;
    }

    public void setFukultet(String gruppa) {
        this.fukultet = fukultet;    }


    public double getPredmet1()
    {
        return predmet1;
    }

    public void setPredmet1(double Predmet1) {
        this.predmet1 = predmet1;
    }

    public double getPredmet2()
    {
        return predmet2;
    }

    public void setPredmet1(double Predmet2) {
        this.predmet2 = predmet2;

    }
    public String toString() {
        return "[name=" + name + ", gruppa=" + gruppa + ", fukultet=" + fukultet + ", predmet1=" + predmet1
                + ", predmet2=" + predmet2 + "]";
    }

}