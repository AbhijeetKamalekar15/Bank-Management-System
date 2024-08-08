package bank.management.system;

import java.sql.*;

public class Con {
    Statement statement;
    public Con(){
        try{
            Connection connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/banksystem","root","Rajashree@123"
            );

            statement = connection.createStatement();

            }catch (SQLException p){
            p.printStackTrace();
        }
    }
}
