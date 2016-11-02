package udovenko.practice.university;

import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;

/**
 * Created by gladi on 02.11.2016.
 */
public interface DatabaseObject {
    public void addBase() throws SQLException;
}
