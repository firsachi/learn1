package task3.module3_3;

/**
 * Created by firsov on 08.02.2017.
 */
public class SpecialStudent extends CollegeStudent {

    private long secretKey;
    private String email;

    public SpecialStudent(String firstName, String lastName, int group) {
        super(firstName, lastName, group);
    }

    public SpecialStudent(String lastName, Course[] courseTaken) {
        super(lastName, courseTaken);
    }

    public SpecialStudent(String firstName, String lastName, int group, long secretKey, String email) {
        super(firstName, lastName, group);
        this.secretKey = secretKey;
        this.email = email;
    }

    public long getSecretKey() {
        return secretKey;
    }

    public void setSecretKey(long secretKey) {
        this.secretKey = secretKey;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
