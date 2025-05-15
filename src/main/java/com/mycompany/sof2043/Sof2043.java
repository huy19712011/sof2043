package com.mycompany.sof2043;

import com.mycompany.sof2043.entity.Category;
import com.mycompany.sof2043.util.XJdbc;
import com.mycompany.sof2043.util.XQuery;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class Sof2043 {

    public static void main(String[] args) throws SQLException {
        //        System.out.println("Hello World!");
//        String sql = "INSERT INTO Categories (Id, Name) VALUES(?, ?)";
//        XJdbc.executeUpdate(sql, "C01", "Loại 1");
//        XJdbc.executeUpdate(sql, "C02", "Loại 2");
        String sql = "SELECT * FROM Categories WHERE Name LIKE ?";
        ResultSet resultSet = XJdbc.executeQuery(sql, "%Loại%");
        while(resultSet.next()) {
            System.out.println(resultSet.getString(2));
        }

        List<Category> categories = XQuery.getBeanList(Category.class, sql, "%Loại%");
        categories.stream().forEach(c -> System.out.println(c));
    }
}
