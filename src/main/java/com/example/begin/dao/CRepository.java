package com.example.begin.dao;

import com.example.begin.dto.DBoxDTO;
import com.example.begin.model.DBox;
import org.springframework.stereotype.Repository;
import java.sql.*;

@Repository
public class CRepository {
    public DBoxDTO Repository(String id) throws ClassNotFoundException, SQLException{
        //DBoxDTO가 원래는 DBox였다.
        Class.forName("org.mariadb.jdbc.Driver");                       // mysql로 하면 바꿔야됨
        Connection c= DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "1234");
                                                            // 이거도 바꿔야됨
        PreparedStatement user_id=c.prepareStatement("select * from user where user_id=?");
        user_id.setString(1, id);

        ResultSet rs=user_id.executeQuery();

        //DBox dbox=new DBox();
        DBoxDTO dbox=new DBoxDTO();
        while(rs.next()) {
            dbox.setUser_id(rs.getString("user_id"));
            dbox.setUser_name(rs.getString("name"));
        }
        rs.close();
        user_id.close();
        c.close();

        return dbox;
    }
}
