package task3.module3_3;

import java.util.Date;

/**
 * Created by firsov on 08.02.2017.
 */
public class Solution {

    public static void main(String[] args) {
        Course fromtend = new Course(new Date(10022017), "Fromt-End");
        Course javaBeginer = new Course(new Date(12022017), "Java Beginer");
        Course turner = new Course(12, "turner", "William Henry Gate");
        Course seamstress = new Course(48, "seamstress", "Franklin Delano Roosevelt");
        Course course =  new Course(new Date(10032017), "Database developer");
        Student student1 = new Student("Vova", "Pupkin", 1);
        Student student2 = new Student("Karas", new Course[]{fromtend, javaBeginer});
        CollegeStudent collegeStudent1 = new CollegeStudent("Pupkin",  "Vova", 1);
        CollegeStudent collegeStudent2 = new CollegeStudent("Karas", new Course[]{fromtend, javaBeginer});
        CollegeStudent collegeStudent3 = new CollegeStudent( "Adolf", "Hitler", 13, 1,
                "University of Cambridge", 6);
        SpecialStudent specialStudent1 = new SpecialStudent("Adolf", "Hitler", 6);
        SpecialStudent specialStudent2 = new SpecialStudent("Stalin", new Course[]{course, seamstress});
        SpecialStudent specialStudent3 = new SpecialStudent("Benya", "Rabinovich", 1, 314159265,
                "Rabinovich@gmail.com");
     }
}
