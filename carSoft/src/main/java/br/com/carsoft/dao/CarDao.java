package br.com.carsoft.dao;

import br.com.carsoft.model.Car;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class CarDao {

    public void createCar(Car car) {
        String SQL = "INSERT INTO CAR (NAME) VALUES (?)";

        try {
            Connection connection = DriverManager.getConnection("jbdc:h2:~/test","sa","sa");
            PreparedStatement preparedStatement = connection.prepareStatement(SQL);;
            preparedStatement.setString(1, car.getName());
            preparedStatement.execute();
            System.out.println("Sucess in Connection");
            connection.close();
        } catch (Exception e) {
            System.out.println("Fail in Connection ");

        }
    }

}
