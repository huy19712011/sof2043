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
    String UPDATE_SQL = "UPDATE students SET name = ?, email = ?, phone = ? WHERE id = ?";
    String DELETE_SQL = "DELETE FROM students WHERE id = ?";

    public List<Student> getAll()  {

        return XQuery.getBeanList(Student.class, FIND_ALL_SQL);
    }

    public Student create(Student e)  {

        Object[] values = {
            e.getId(),
            e.getName(),
            e.getEmail(),
            e.getPhone()
        };

        XJdbc.executeUpdate(CREATE_SQL, values);

        return e;
    }

    public Student update(Student e)  {

        Object[] values = {
            e.getName(),
            e.getEmail(),
            e.getPhone(),
            e.getId()
        };

        XJdbc.executeUpdate(UPDATE_SQL, values);

        return e;
    }

    public Student delete(Student e)  {

        Object[] values = {
            e.getId()
        };

        XJdbc.executeUpdate(DELETE_SQL, values);

        return e;
    }

}
