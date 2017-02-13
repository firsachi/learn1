package task3.module3_3;

/**
 * Created by firsov on 08.02.2017.
 */
public class CollegeStudent extends Student {

    private long id;
    private String collegeName;
    private int rating;

    public CollegeStudent(String firstName, String lastName, int group) {
        super(firstName, lastName, group);
    }

    public CollegeStudent(String lastName, Course[] courseTaken) {
        super(lastName, courseTaken);
    }

    public CollegeStudent(String firstName, String lastName, int group, long id, String collegeName, int rating) {
        super(firstName, lastName, group);
        this.id = id;
        this.collegeName = collegeName;
        this.rating = rating;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCollegeName() {
        return collegeName;
    }

    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }
}
