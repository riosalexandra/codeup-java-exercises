package grades;

public class StudentTest {

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

        System.out.println(steve.getGradeAverage());


    }

}