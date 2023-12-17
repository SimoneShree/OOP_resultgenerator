
import models.Mammalia;
import models.Result;
import models.Student;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Mammalia human = new Mammalia();
        Mammalia dog = new Mammalia();

        System.out.println(human);
        System.out.println(dog);

        //using getter to pint value

        int HeartChamberHuman = human.getNumberheartchamber();
        boolean HumanBlood = human.isWarmblooded();

        human.setEats("Rice");
        String foodHuman = human.getEats();

        int HeartchamberDog = dog.getNumberheartchamber();
        boolean DogBlood = dog.isWarmblooded();

        dog.setEats("Dog food");
        String foodDog = dog.getEats();

        System.out.println(HeartChamberHuman);
        System.out.println(HumanBlood);
        System.out.println(foodHuman);

        System.out.println(HeartchamberDog);
        System.out.println(DogBlood);
        System.out.println(foodDog);
        /////
        //ARRAY//
        int [] marks1= {40, 39, 43, 45, 47};
        int [] marks2 = { 40, 39, 47, 43, 45};
        int [] marks3 = {42, 45, 37, 42, 39};

        Student std1 = new Student("Simone",16, marks1);
        Student std2 = new Student("Muskan",17, marks2);
        Student std3 = new Student("Ram" , 17, marks3);


        std1.displayInformation();
        std2.displayInformation();
        std3.displayInformation();

        String [] subject = {"Physics", "Chemistry", "Maths", "English", "Nepali"};

        Result r1 = new Result ("Ram Pathak", 103, subject, marks1);
        Result r2 = new Result ("Shyam Sharma", 140, subject, marks2);
        Result r3 = new Result ("Tilu Rai", 179, subject, marks3);

        r1.displayInformation();
        r2.displayInformation();
        r3.displayInformation();



    }
}