/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package common;

import java.lang.*;
import java.util.*;

/**
 *
 * @author mattkirchner
 */
public class Startup {
    public static void main(String[] args) {
        //#1
        System.out.println("#1\n");
        Dog d1 = new Dog("Buddy",5,"15");
        Dog d2 = new Dog("Buddy",5,"15");
        Dog d3 = new Dog("Fido",9,"7");
        Dog d4 = new Dog("Pete",11,"21");
        
        Set<Dog> set = new TreeSet<>();
        set.add(d1);
        set.add(d2);
        set.add(d3);
        set.add(d4);
        
        for(Dog d : set){
            System.out.println(d);
        }
        //#2
        System.out.println("#2\n");
        List<Dog> list = new ArrayList<>(set);
        Collections.sort(list, new DogByName());
        for(Dog d : list){
            System.out.println(d);
        }
        //#3
        System.out.println("#3\n");
        Map<String,Dog> dogs = new TreeMap<>();
        dogs.put("dog 1", d1);
        dogs.put("dog 2", d2);
        dogs.put("dog 3", d3);
        dogs.put("dog 4", d4);
        Collection<Dog> col = dogs.values();
        List<Dog> dogList = new ArrayList<>(col);
        Collections.sort(dogList);
        for(Dog d : dogList){
            System.out.println(d);
        }
        //#4
        System.out.println("#4\n");
        Dog[] dogArray = new Dog[]{d1,d2,d3,d4};
        Arrays.sort(dogArray);
        for(Dog d : dogArray){
            System.out.println(d);
        }
    }
}
