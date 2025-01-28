  // Default Constructor
  
//   public class Constructor {
//     int   i;
//     String s;
//     public static void main(String args[]){
//     Constructor v = new Constructor();
//     System.out.println(v.i+" "+v.s);
//     }
    
// }

// No Argument Constructor
// Created Programmer

// public class test{
//   test(){
//       System.out.println(" no argument constructor ");
//   }
//   public static void main(String args[]){
//       test maa = new test();
//   }
// }


// Parameterized Constructor
// public class myconstructor{
//     myconstructor (int b){
//         System.out.println("Parameterized constructor ");
//     }
//     public static void main(String args[]){
//         myconstructor naaa = new myconstructor(445);
//     }
// }



public class Employee {  
    String name;
    int employee_id;
    Employee(String name, int employee_id) {  
        this.name = name;
        this.employee_id = employee_id;
    }

    public static void main(String args[]) {  
        Employee e1 = new Employee("Piyush", 654);  
        Employee e2 = new Employee("Ram", 325);  


        System.out.println("Employee 1: " + e1.name + " " + e1.employee_id);  
        System.out.println("Employee 2: " + e2.name + " " + e2.employee_id);  
    }  
}

