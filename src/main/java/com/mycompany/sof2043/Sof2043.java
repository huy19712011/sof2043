package com.mycompany.sof2043;

import com.mycompany.sof2043.entity.Category;
import com.mycompany.sof2043.util.XJdbc;
import com.mycompany.sof2043.util.XQuery;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

public class Sof2043 {

    public static void main(String[] args) throws SQLException {
//        System.out.println("Hello World!");
//        String sql = "INSERT INTO Categories (Id, Name) VALUES(?, ?)";
//        XJdbc.executeUpdate(sql, "C01", "Loại 1");
//        XJdbc.executeUpdate(sql, "C02", "Loại 2");
//        String sql = "SELECT * FROM Categories WHERE Name LIKE ?";
//        ResultSet resultSet = XJdbc.executeQuery(sql, "%Loại%");
//        while(resultSet.next()) {
//            System.out.println(resultSet.getString(2));
//        }
//
//        List<Category> categories = XQuery.getBeanList(Category.class, sql, "%Loại%");
//        categories.stream().forEach(c -> System.out.println(c));

        // Create table students: id, name, email, phone
        // Insert into students: 3 students (3 rows)
        // CRUD: getAllStudents(); getStudentById(id); updateStudent(...); deleteStudent(...)
        // UI: table of students; buttons (add, delete, edit/update
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        Statement statement = null;
        ResultSet resultSet = null;

//        try {
//
//            connection = XJdbc.openConnection();
//            System.out.println("Connected...");
//
//            String sql = """
//                            CREATE TABLE students(
//                                id BIGINT NOT NULL PRIMARY KEY,
//                                name NVARCHAR(30) NOT NULL,
//                                email NVARCHAR(50) NOT NULL,
//                                phone NVARCHAR(10) NOT NULL
//                            );
//                         """;
//
//            preparedStatement = connection.prepareStatement(sql);
//
//            preparedStatement.execute();
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
//        try {
//
//            connection = XJdbc.openConnection();
//            System.out.println("Connected...");
//
//            String sql = """
//                            INSERT INTO students(id, name, email, phone)
//                            VALUES(?, ?, ?, ?);
//                         """;
//
//            preparedStatement = connection.prepareStatement(sql);
//
//            preparedStatement.setInt(1, 1003);
//            preparedStatement.setString(2, "Student 3");
//            preparedStatement.setString(3, "Email 3");
//            preparedStatement.setString(4, "Phone 3");
//
//            preparedStatement.execute();
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
//                System.out.println("Student Id: " + resultSet.getInt("id"));
//                System.out.println("Student Name: " + resultSet.getString("name"));
//                System.out.println("Student Email: " + resultSet.getString("email"));
//                System.out.println("Student Phone: " + resultSet.getString("phone"));
//            }
//
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

//        try {
//
//            connection = XJdbc.openConnection();
//            System.out.println("Connected...");
//
//            String sql = """
//                            SELECT * FROM students WHERE id = ?;
//                         """;
//
//            preparedStatement = connection.prepareStatement(sql);
//
//            preparedStatement.setInt(1, 1001);
//
//            resultSet = preparedStatement.executeQuery();
//
//            while (resultSet.next()) {
//                System.out.println("Student Id: " + resultSet.getInt("id"));
//                System.out.println("Student Name: " + resultSet.getString("name"));
//                System.out.println("Student Email: " + resultSet.getString("email"));
//                System.out.println("Student Phone: " + resultSet.getString("phone"));
//            }
//
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

        try {

            connection = XJdbc.openConnection();
            System.out.println("Connected...");

            String sql = """
                            UPDATE students
                            SET name = ?, email = ?, phone = ?
                            WHERE id = ?;
                         """;

            preparedStatement = connection.prepareStatement(sql);

            preparedStatement.setString(1, "Student 11");
            preparedStatement.setString(2, "Email 11");
            preparedStatement.setString(3, "Phone 11");
            preparedStatement.setInt(4, 1001);

            preparedStatement.executeUpdate();


            System.out.println("done...");

        } catch (Exception e) {

            e.printStackTrace();

        } finally {
            // close connection, prepatedStatement, resulSet
        }



    }
}
