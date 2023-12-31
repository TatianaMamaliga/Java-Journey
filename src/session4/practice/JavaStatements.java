package session4.practice;

public class JavaStatements {

    public static void main(String[] args) {
        int currentYear = 2023;
        int birthday = 1990;
        int age = currentYear - birthday;
        System.out.println("Age is: " + age);

        if(age >= 18){
            System.out.println("Eligible to vote");
        }

        int number = 15;
        if (number > 0){
            System.out.println("Number is positive.");
        } else if (number < 0) {
            System.out.println("Number is negative.");
        } else {
            System.out.println("Number is zero.");
        }

        printName();
    }

    public static void printName(){
        String name = "Ioana";
        String city = "Cluj";
        String sex = "F";
        int age = 20;

        if(city.equals("Cluj")){
            if(sex.equals("F")){
                if(age == 20){
                    System.out.println(name);
                }
            }
        }
        if(city.equals("Cluj") && sex.equals("F") && age == 20){
            System.out.println(name);
        }
    }
}
