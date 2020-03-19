package lesson_9.ITC_1;

import java.sql.*;

public class Main {
    public static void main(String[] args) {

        Connection connection = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/carsshop?serverTimezone=UTC",
                    "root",
                    "notfound"
            );

            Statement stmt = connection.createStatement();
            ResultSet result = stmt.executeQuery("SELECT * FROM cars");

            while (result.next()){
                System.out.println("Номер строки в выборке " + result.getRow() + "\n Марка " + result.getString(2) +
                        " модель " + result.getString("model") +
                        "\n цена " + result.getInt("price"));
            }

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();

        }
    }
}
