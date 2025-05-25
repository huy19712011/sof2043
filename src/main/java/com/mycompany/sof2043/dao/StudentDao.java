package com.mycompany.sof2043.dao;

import com.mycompany.sof2043.entity.Student;
import com.mycompany.sof2043.util.XJdbc;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class StudentDao {

    public List<Student> getAll() throws SQLException {

        List<Student> students = new ArrayList<>();

//        Connection connection = null;
//        PreparedStatement preparedStatement = null;
//        Statement statement = null;
//        ResultSet resultSet = null;
//
//        try {
//
//            connection = XJdbc.openConnection();
//            System.out.println("Connected...");
//
//            String sql = """
//                            SELECT * FROM students;
//                         """;
//
//            statement = connection.createStatement();
//
//            resultSet = statement.executeQuery(sql);
//
//            while (resultSet.next()) {
//
//                Student student = new Student();
//                student.setId(resultSet.getInt("id"));
//                student.setName(resultSet.getString("name"));
//                student.setEmail(resultSet.getString("email"));
//                student.setPhone(resultSet.getString("phone"));
//
//                students.add(student);
//
//
//            }
//
//            System.out.println("done...");
//
//        } catch (Exception e) {
//
//            e.printStackTrace();
//
//        } finally {
//            // close connection, prepatedStatement, resulSet
//        }



        String sql = "SELECT * FROM students;";

        ResultSet resultSet = XJdbc.executeQuery(sql);

        while (resultSet.next()) {

            Student student = new Student();
            student.setId(resultSet.getInt("id"));
            student.setName(resultSet.getString("name"));
            student.setEmail(resultSet.getString("email"));
            student.setPhone(resultSet.getString("phone"));

            students.add(student);

        }

        return students;
    }
}
