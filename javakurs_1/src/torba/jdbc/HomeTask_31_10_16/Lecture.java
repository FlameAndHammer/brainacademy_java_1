package torba.jdbc.HomeTask_31_10_16;

import java.util.UUID;

public class Lecture {

    private String id;
    private String name, lecturer;

    public Lecture(String name, String lecturer) {
        this.name = name;
        this.lecturer = lecturer;
        id = UUID.randomUUID().toString();
    }

    public String toString() {
        return "lecture of " + name + " by " + lecturer;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLecturer() {
        return lecturer;
    }

    public String getName() {
        return name;
    }

    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + lecturer.hashCode();
        return result;
    }

    public boolean equals(Object l) {
        if ( (name.equals(((Lecture) l).getName())) && (lecturer.equals(((Lecture) l).getLecturer())) ) {
            return true;
        }
        else {
            return false;
        }
    }

}
