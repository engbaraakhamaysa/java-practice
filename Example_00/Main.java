package Example_00;
 class Employee {
        
        private String name;
        private double salary;
        private int eno;

        void setName(String name, int pass) {
            if (pass == 1257)
                this.name = name;
        }

        void setEno(int eno, int pass) {
            if (pass == 1234)
                this.eno = eno;
        }
    }


public class Main {
    public static void main(String[] args ) {

      

        Employee e1 = new Employee();

        e1.setName("baraa", 1257);
        e1.setEno(12, 1234);

        // e1.eno = 12;

        int x;
        String y;
        for (int i = 0; i < 10; i++) {
            System.out.println("Hi theree" + i + i);
            System.out.println(i+i);
        }
      
    }
}