package dataAccess.dao.impl;



import java.util.ArrayList;
import java.util.List;

import Models.User;
//import models.user.User;
//import util.date.DateUtil;
//import util.sql.Sql;
import dataAccess.dao.UserDao;
//import dataAccess.dao.BaseDao;
//import dataAccess.dao.mapper.UserMapper;
import play.db.NamedDatabase;
import play.db.Database;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionStage;

import javax.inject.Inject;

/**
 * This dao will keep all
 * @author jyotsna
 */
public class UserDaoImpl implements UserDao {

	private Database db;
	//private DatabaseExecutionContext executionContext;

	@Inject
	public UserDaoImpl(Database db) {
		this.db = db;
		//this.executionContext = executionContext;
	}

	@Override
	public long checkUserSession(String sessionId) {
		return 1;
	}

	@Override
	public boolean adduser(User user) throws SQLException{
		System.out.println("vamshi");
		Connection connection = db.getConnection();
		System.out.println("varun"+connection);
		try{
        PreparedStatement preparedStmt = connection.prepareStatement("insert into User(First_name,Last_name) values(?,?)");
        preparedStmt.setString(1, user.getFirstname());
        preparedStmt.setString(2, user.getLastname());
        preparedStmt.executeUpdate();
        connection.close();
        return true;
		}catch(Exception e){
			e.printStackTrace();
			if(connection!=null){
				connection.close();
			}
			return false;
		}
	}

	@Override
	public boolean updateUser(User user) throws SQLException{
		Connection connection = db.getConnection();
		try{
        PreparedStatement preparedStmt = connection.prepareStatement("update user set firstname=anuja,lastname=sree where id=2");
        preparedStmt.setString(1, user.getFirstname());
        preparedStmt.setString(2, user.getLastname());
        preparedStmt.setLong(3, user.getId());
        preparedStmt.executeUpdate();
        connection.close();
        return true;
		}catch(Exception e){
			e.printStackTrace();
			if(connection!=null){
				connection.close();
			}
			return false;
		}
	}
	
	/*public CompletionStage<Void> updateUser(User user) {
        return CompletableFuture.runAsync(() -> {
            // get jdbc connection
            Connection connection = db.getConnection();
            PreparedStatement preparedStmt = connection.prepareStatement("update user set name=?,dob=?,password=? where id=?");
            preparedStmt.setInt   (1, "");
            preparedStmt.setString(2, "Fred");

            // execute the java preparedstatement
            preparedStmt.executeUpdate();
            
            conn.close();
            // do whatever you need with the db connection
            return;
        }, executionContext);
    }
*/
	@Override
	public boolean deleteUser(User user) {
		return true;
	}

	@Override
	public List<User> getAllUser() {
		List<User> userList = new ArrayList<User>();
		Connection connection = db.getConnection();
		ResultSet rs = null;
		try{
        PreparedStatement preparedStmt = connection.prepareStatement("select * from User where id=3");
        rs = preparedStmt.executeQuery();
        System.out.println("Result set object : "+rs);
        while(rs.next()){
        	User user2 = new User();
        	user2.setFirstname(rs.getString("First_name"));
        	user2.setLastname(rs.getString("Last_name"));
        	userList.add(user2);
        }
		}catch(Exception e){
			e.printStackTrace();
			}
		finally{
		try {
			if(connection!=null){
			connection.close();}
			if(rs!=null){
				rs.close();
			}
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}}
		return userList;
		
	}

//	@Override
//	public List<User> getAllUser() {
//		List<User> userList = new ArrayList<User>();
//		Connection connection = db.getConnection();
//		try{
//        PreparedStatement preparedStmt = connection.prepareStatement("select * from user_personal_info");
//        ResultSet rs = preparedStmt.executeQuery();
//        while(rs.next()){
//        	User user2 = new User();
//        	user2.setFirstname(rs.getString("firstname"));
//        	user2.setLastname(rs.getString("lastname"));
//        	userList.add(user2);
//        }
//        connection.close();
//        return null;
//		}catch(Exception e){
//			e.printStackTrace();
//			if(connection!=null){
//				try {
//					connection.close();
//				} catch (SQLException e1) {
//					// TODO Auto-generated catch block
//					e1.printStackTrace();
//				}
//			}
//		}
//		return userList;
//	}

}
