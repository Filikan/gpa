import java.util.Scanner;

public class GPA {
    private double Midterm;
    private double Final;
    private double GPA;

    public void setMidterm(){
        System.out.print("Enter Midterm:");
        Scanner sc = new Scanner(System.in);
        Midterm = sc.nextDouble();
    }

    public void setFinal(){
        System.out.print("Enter Final:");
        Scanner sc = new Scanner(System.in);
        Final = sc.nextDouble();
    }

    public double getGPA(){
        return 0.4*Midterm + 0.6*Final;
    }
}
