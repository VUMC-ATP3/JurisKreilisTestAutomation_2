package classroomSix;

import com.github.javafaker.Faker;

public class Example {
    public static void main(String[] args) {
        System.out.println("This is maven project");
        Employee employeeOne = new Employee("Janis","Programmetajs",1000.32);
        System.out.println(employeeOne.toString());
        Faker faker = new Faker();
        Employee employeeTwo = new Employee(faker.name().firstName(),faker.company().profession(),
                faker.number().randomDouble(4,100,2000));
        System.out.println(employeeTwo.toString());
        System.out.println(faker.name().firstName());
        System.out.println(faker.name().lastName());
        System.out.println(faker.company().profession());
        //Izvadit tris lietas uz ekrana random
        System.out.println("ancient hero: " + faker.ancient().hero());
        System.out.println("frienmds quote: " + faker.friends().quote());
        System.out.println("citats no Hamleta: " + faker.shakespeare().hamletQuote());

        Employee employeeThree = new Employee();
        System.out.println(employeeThree);

        //uztaisit ciklu, kas uztaisis 100 jaunus employees un katru izvadis uz ekrana
//        for (int i = 0; i < 100; i++) {
//            Employee employee = new Employee();
//            System.out.println(employee.toString());
//        }



    }
}
