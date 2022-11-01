package repo;

import db.DbConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class AccountRepo {

    public boolean createAccount(String username,String password,String role) throws SQLException {
        Connection connection = DbConnection.getInstance().getConnection();
        String query="INSERT INTO account (username,password,role) VALUES (?,?,?)";
        PreparedStatement stm = connection.prepareStatement(query);
        stm.setObject(1,username);
        stm.setObject(2,password);
        stm.setObject(3,role);
        return stm.executeUpdate()>0;
    }
}
