package Example_01

 class Studant {

     private String name = "";
     private int ston = 0;
     private double gpa = 0.35;

     Studant(String n, int s, double g) {
         System.out.println("object is created");
         name = n;
         ston = s;
         gpa = g;
     }

     void setName(String name, int p) {
         if (p == 1234)
             this.name = name;
     }
     
     void setSton(int e) {
         this.ston = e;
     }

     void setGPA(double g) {
         gpa = g;
     }

     String getName(int p) {
         if (p == 1234)
             return name;
         else
             return "Invalid pin code";
     }
     
     double getGPA() {
         return gpa;
     }
}

public class Main {
    public static void main(String[] aaaa) {
        int x;
        String y;
        Studant s1;
        s1 = new Studant("Baraa", 123, 2.1);

        s1.setName("Khamaysa", 1234);
        System.out.println(s1.getName(1234));

        int arr[] = new int[10];

        Studant Sarr[] = new Studant[5];
        
        double sum = 0;
        for (int i = 0; i < Sarr.length; i++) {
            Sarr[i] = new Studant("baraa" + i, i + 100, i + 0.5);
            sum += Sarr[i].getGPA();
        }
        
        System.out.println(sum);
        
    }
}