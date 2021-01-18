package five;


import java.sql.*;

public class StudentTester {
    public static void main(String[] args) {
        String username = "root";
        String password = "lenovox220i";
        String url = "jdbc:mysql://localhost:3306/person?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";

        try (Connection connection = DriverManager.getConnection(url, username, password)) {
            Statement statement = connection.createStatement();
            String sqlQuery = "SELECT * FROM students";
            ResultSet resultSet = statement.executeQuery(sqlQuery);
            while (resultSet.next()) {
                int id = resultSet.getInt(1);
                String name = resultSet.getString(2);
                String surename = resultSet.getString(3);
                Student student = new Student(id, name, surename);
                System.out.println(student);
            }
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }
}
