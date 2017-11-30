/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practice;

import java.util.*;

/**
 *
 * @author mattkirchner
 */
public class Startup {
    public static void main(String[] args) {
        Course c1 = new Course("22","Advanced Java",4);
        Course c2 = new Course("11","Intro Java",4);
        Course c3 = new Course("44","Dist. Java",4);
        
        List<Course> courses = new ArrayList<>();
        courses.add(c1);
        courses.add(c2);
        courses.add(c3);
        
        Collections.sort(courses, new CourseByName());
        
        
        
        
        
//        Map<String,Course> courses = new TreeMap<>();
//        courses.put("Fav", c1);
//        courses.put("Simple", c2);
//        courses.put("Web", c3);
//        
//        Collection<Course> col = courses.values();
//        List<Course> list = new ArrayList<>(col);
//        Collections.sort(list);
//        
//        for(Course c : list){
//            System.out.println(c);
//        }
        
        
        
        
        
        //good use of list and sets
//        //unsorted list
//        List<Course> courses = new ArrayList<>();
//        courses.add(c1);
//        courses.add(c2);
//        courses.add(c3);
//        
//        //sorted set
//        Set<Course> set = new TreeSet<>(courses);
//        courses = new ArrayList(set);
//        
//        for(Course c : courses){
//            System.out.println(c);
//        }
    }
}
