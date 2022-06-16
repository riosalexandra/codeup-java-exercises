import oop.Person;

import java.util.Arrays;

public class ArraysExercises {

    public static Person[] addPerson(Person newPerson, Person[] persons){
        Person[] newPersonArray;
        newPersonArray = Arrays.copyOf(persons, persons.length + 1);
        newPersonArray[newPersonArray.length-1] = newPerson;
        return newPersonArray;
    }

    public static void main(String[] args) {
        Person[] persons;
        persons = new Person[3];
        persons[0] = new Person("Justin");
        persons[1] = new Person("Dane");
        persons[2] = new Person("Javier");

//        for (Person person: persons){
//            person.sayHello();
//        }

        Person[] newPersonsArray = ArraysExercises.addPerson(new Person("Gonzalo"), persons);

        for (Person person: newPersonsArray){
            person.sayHello();
        }
    }

}
