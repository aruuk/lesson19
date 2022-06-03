package com.company;

import static com.company.Car.carClose;

public class Main {

    public static void main(String[] args) {

        //Try with resources-те колдоно ала турган Car деген класс тузунуз
        //close() деген метод "Машина жабылып жатат" деп консольго чыгаруусу керек.
        //try unchecked exceptionдарды кармап аларды игнор кылыш керек.
        //main методдо try блоктун ичинде drive() деген методду чакырыныз, ал консольго "Машина журуп жатат" деп чыгаруусу керек


        try(Car2 car2 = new Car2()) {
            car2.drive();
            car2.stop();
        } catch (RuntimeException e) {
        } catch (Error error){
        }


//       App app =  new App();
//       App.returnMethod();


        /*Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        int age = scanner.nextInt();
        String password = scanner.next();

                try {
                    System.out.println("write your name: ");
                    if (!name.matches("^[a-zA-Z]*$")) {
                        System.out.println("it is wrong");
                        throw new MyExpaction();
                    } else {
                        System.out.println("unknown command, write help!");
                    }

                    System.out.println("write your age: ");
                    if (age < 0) {
                        System.out.println("it is wrong");
                        throw new MyExpaction();
                    } else {
                        System.out.println("unknown command, write help!");
                    }

                    System.out.println("write your password: ");
                    if (password.length() < 6) {
                        System.out.println("it is wrong");
                        throw new MyExpaction();
                    } else {
                        System.out.println("unknown command, write help!");
                    }
                } catch (MyExpaction e) {
                    e.printStackTrace();
                }

                Person person = new Person();
                person.setName(name);
                person.setAge(age);
                person.setPassword(password);
                person.print();

         */


        /*double a = scanner.nextDouble();
        try{
            if (Math.sqrt(a) % 1 == 0) {
                System.out.println(a + " is sqrt of num: " + Math.sqrt(a));
            }else {
                throw new Error("this num don't have a sqrt");
            }
        } catch(Error e){
            e.printStackTrace();
        }

         */
    }
}








