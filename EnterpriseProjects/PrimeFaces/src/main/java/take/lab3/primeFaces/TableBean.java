/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package take.lab3.primeFaces;

import java.util.ArrayList;
import java.util.List;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
/**
 *
 * @author Miket
 */
@Named(value = "tableBean")
@RequestScoped
public class TableBean {

    private List<Student> students;
    
    public TableBean() {
        students = new ArrayList<Student>();
        students.add(new Student("Misha", "Andrew", 6.0));
        students.add(new Student("Usama", "Mullen", 5.5));
        students.add(new Student("Aden" ,"Griffith", 4.4));
        students.add(new Student("Arielle" ,"Senior", 5.0));
        students.add(new Student("Judy", "Kay", 2.0));
        students.add(new Student("Susannah", "Montgomery", 6.4));
        students.add(new Student("Skylar", "Barrett", 5.2));
        students.add(new Student("Kelvin", "Monaghan", 2.3));
    }

    /**
     * @return the students
     */
    public List<Student> getStudents() {
        return students;
    }

    /**
     * @param students the students to set
     */
    public void setStudents(List<Student> students) {
        this.students = students;
    }
    
}
