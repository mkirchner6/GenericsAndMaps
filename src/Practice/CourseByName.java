/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practice;

import java.util.Comparator;

/**
 *
 * @author mattkirchner
 */
public class CourseByName implements Comparator<Course> {

    @Override
    public int compare(Course o1, Course o2) {
        return o1.getCourseName().compareTo(o2.getCourseName());
    }
    
}
