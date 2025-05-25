package com.mycompany.sof2043.dao;

import com.mycompany.sof2043.entity.Student;
import com.mycompany.sof2043.util.XJdbc;
import com.mycompany.sof2043.util.XQuery;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class StudentDao {

    String FIND_ALL_SQL = "SELECT * FROM students;";
    String CREATE_SQL = "INSERT INTO students(id, name, email, phone) VALUES(?, ?, ?, ?);";

    public List<Student> getAll() throws SQLException {

        return XQuery.getBeanList(Student.class, FIND_ALL_SQL);
    }

    public Student create(Student e) throws SQLException {

        Object[] values = {
            e.getId(),
            e.getName(),
            e.getEmail(),
            e.getPhone()
        };

        XJdbc.executeUpdate(CREATE_SQL, values);

        return e;
    }
}
