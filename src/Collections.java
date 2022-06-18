import oop.Monster;

import java.util.ArrayList;
import java.util.HashMap;

public class Collections {

//    private String name;
//    private ArrayList<Integer> grades;
//
//    public Student(String name){
//        this.name = name;
//        this.grades = new ArrayList<>();
//
//    }


    public static void main(String[] args) {

        Monster orc = new Monster(13, 15, 9, "Orc");
        Monster blueDragon = new Monster(19, 225, 23, "Blue Dragon");
        Monster ogre = new Monster(11, 59, 13, "Ogre");

        Monster[] monsters = {orc, blueDragon, ogre};
        //Arrays.sort(monster);

        // Basic ArrayList methods:
        // add(), size(), contains(), remove()
        ArrayList<Monster> monsterArrayList = new ArrayList<>();
        monsterArrayList.add(orc);
//        System.out.println(monsterArrayList.size());
        monsterArrayList.add(blueDragon);
//        System.out.println(monsterArrayList.size());
        monsterArrayList.add(ogre);
//        System.out.println(monsterArrayList.size());
//        System.out.println(monsterArrayList.contains(blueDragon));
        boolean dragonRemoved = monsterArrayList.remove(blueDragon);
//        System.out.println("Dragon Removed: " + dragonRemoved);
//        System.out.println(monsterArrayList.size());
//        System.out.println(monsterArrayList.contains(blueDragon));
        boolean wasDragonRemoved = monsterArrayList.remove(blueDragon);
//        System.out.println("Dragon Removed: " + wasDragonRemoved);

        // For primitive data types, use the object wrapper
        ArrayList<Integer> myNumbers = new ArrayList<>();
        myNumbers.add(42);
        myNumbers.add(23);
        myNumbers.add(418);
        // Pull out an element: .get(index) -- use the index of the element you want
        // If you do this inside a loop, you use .get(i)
//        System.out.println(myNumbers.get(1));

        // Loop over an ArrayList using an enhanced for loop
        int total = 0;
        for (Integer number: myNumbers) {
            total += number;
        }
//        System.out.println(total/myNumbers.size());

        // To sort an ArrayList, use Collections.sort
        java.util.Collections.sort(myNumbers);
        for (Integer number: myNumbers) {
//            System.out.println(number);
        }

        int elementRemoved = myNumbers.remove(1);
//        System.out.println(elementRemoved);

       // HashMaps

        HashMap<String, Integer> careerWins = new HashMap<>();
        careerWins.put("Gregg Popovich", 1344);
        careerWins.put("Don Nelson", 1335);
        careerWins.put("Lenny Wilkens", 1332);

        System.out.println(careerWins.get("Gregg Popovich"));
        System.out.println(careerWins);
        System.out.println(myNumbers);
        System.out.println(monsterArrayList);

        careerWins.replace("Gregg Popovich", 1345);
        System.out.println(careerWins.get("Gregg Popovich"));



    }
}
