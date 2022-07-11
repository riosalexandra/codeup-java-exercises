package grades;

import java.util.ArrayList;

public class Student {

    private String name;
    private ArrayList<Integer> grades;

    public Student(String name){
        this.name = name;
        this.grades = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addGrade(int grade){
        grades.add(grade);
    }

    public double getGradeAverage(){
        double total = 0;
        double length = grades.size();
        for(Integer grade: grades){
            total += grade;
        }
        return Double.parseDouble(String.format("%.2f", total / length));
    } // the parseDouble with string.format is to limit the spaces after the decimal without using souf

}