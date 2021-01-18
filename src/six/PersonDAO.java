package six;


import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class PersonDAO extends Person {
    String url = "jdbc:mysql://localhost:3306/person?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
    String username = "root";
    String password = "lenovox220i";

    List<Person> personList = new ArrayList<>();


    public List<Person> getAllPersons() {
        try {
            Connection connection = DriverManager.getConnection(url,username,password);
            Statement statement = connection.createStatement();
            String sqlUpit = "SELECT * FROM person.person";
            ResultSet resultSet = statement.executeQuery(sqlUpit);
            while (resultSet.next()){
                int id = resultSet.getInt(1);
                String name = resultSet.getString(2);
                String surename = resultSet.getString(3);
                Person person = new Person(id,name,surename);
                personList.add(person);
            }

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return personList;
    }

}


