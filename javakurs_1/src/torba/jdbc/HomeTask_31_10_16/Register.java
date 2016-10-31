package torba.jdbc.HomeTask_31_10_16;

import java.sql.Date;
import java.util.UUID;

public class Register implements Comparable {

    private String id;
    private Date date;
    private Lecture lecture;
    private Student student;

    public Register(Date date, Lecture lecture, Student student) {
        this.date = date;
        this.lecture = lecture;
        this.student = student;
        id = UUID.randomUUID().toString();
    }

    public String toString() {
        return "" + date + " " + lecture + " " + student;
    }

    public Date getDate() {
        return date;
    }

    public Student getStudent() {
        return student;
    }

    public Lecture getLecture() {
        return lecture;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int hashCode() {
        int result = date.hashCode();
        result = 31 * result + lecture.hashCode();
        result = 31 * result + student.hashCode();
        return result;
    }

    public boolean equals(Object r) {
        if ( (date.equals(((Register) r).getDate())) && (lecture.equals(((Register) r).getLecture()))
                && (student.equals(((Register) r).getStudent())) ) {
            return true;
        }
        else {
            return false;
        }
    }

    public int compareTo(Object o) {
        return date.compareTo(((Register) o).date);
    }

}
