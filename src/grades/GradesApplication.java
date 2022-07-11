package grades;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class GradesApplication {

    public static void main(String[] args) {

        Student alex = new Student("Alex");
        Student tony = new Student("Tony");
        Student brandon = new Student("Brandon");
        Student steve = new Student("Steve");

        brandon.addGrade(95);
        brandon.addGrade(100);
        brandon.addGrade(90);
        alex.addGrade(90);
        alex.addGrade(92);
        alex.addGrade(88);
        tony.addGrade(87);
        tony.addGrade(85);
        tony.addGrade(94);
        steve.addGrade(100);
        steve.addGrade(98);
        steve.addGrade(99);


        HashMap<String, Student> students = new HashMap<>();
        students.put("Sbuschemi", steve);
        students.put("Cordero1", alex);
        students.put("Cordero2", tony);
        students.put("Kohleractual", brandon);

        //command line output
        System.out.println("Welcome!\n");
        System.out.println("Here are the Github usernames of our students:\n");
        //this is how to loop a hashmap do not forget the .entryset()
        for (Map.Entry<String, Student> student :
                students.entrySet()) {
            System.out.print("|" + student.getKey() + "|" + " ");
        }
        Scanner scanner = new Scanner(System.in);
        String continueGrades;
        do {
            System.out.println("\n\nWhat students would you like to see more information on?\n\n >");
            String input = scanner.next() + scanner.nextLine();
            if (students.containsKey(input)) {
                System.out.println("\nName: " + students.get(input).getName() + " - Github Username: " + input + "\nCurrent Average: " + students.get(input).getGradeAverage());
            } else {
                System.out.println("Sorry, no student found with the GitHub username of " + input + ".");
            }
            System.out.println("\nWould you like to see another student? (y/n) \n\n >");
            continueGrades = scanner.next();
        }while (continueGrades.equalsIgnoreCase("y"));
    }
}