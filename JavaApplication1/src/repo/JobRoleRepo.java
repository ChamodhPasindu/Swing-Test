package repo;

import db.DbConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class JobRoleRepo {

    public String userLoginVerify(String username,String password) throws SQLException {
        Connection connection = DbConnection.getInstance().getConnection();
        String query="SELECT role FROM account WHERE username=? AND password=?";
        PreparedStatement stm = connection.prepareStatement(query);
        stm.setObject(1,username);
        stm.setObject(2,password);
        ResultSet resultSet = stm.executeQuery();
        if (resultSet.next()){
            return resultSet.getString(1);
        }else {
            return null;
        }
    }

    public boolean addJobRole(String role) throws SQLException {
        Connection connection = DbConnection.getInstance().getConnection();
        String query="INSERT INTO jobRole (jobRole) VALUES (?)";
        PreparedStatement stm = connection.prepareStatement(query);
        stm.setObject(1,role);
        return stm.executeUpdate()>0;
    }

    public boolean deleteJobRole(String role) throws SQLException {
        Connection connection = DbConnection.getInstance().getConnection();
        String query="DELETE FROM jobRole WHERE jobRole=?";
        PreparedStatement stm = connection.prepareStatement(query);
        stm.setObject(1,role);
        return stm.executeUpdate()>0;
    }

    public ArrayList<String> getAllJobRole() throws SQLException {
        Connection connection = DbConnection.getInstance().getConnection();
        String query="SELECT * FROM jobRole";
        PreparedStatement stm = connection.prepareStatement(query);
        ResultSet resultSet = stm.executeQuery();
        ArrayList<String> roles = new ArrayList();
        while (resultSet.next()){
            roles.add(
                    resultSet.getString(2)
            );

        }
        return roles;
    }
}
