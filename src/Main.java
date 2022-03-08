
public class Main {

    public static void main(String[] args) {
        GPA g = new GPA();

        /*for(int i=1;i<=10;i++)
        {
            System.out.println("Student "+i);
            g.setMidterm();
            g.setFinal();
            System.out.println(g.getGPA());
        }*/
        g.setMidterm();
        g.setFinal();
        System.out.println(g.getGPA());
    }
}
