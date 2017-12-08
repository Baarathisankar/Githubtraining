package dataAccess.dao;

import java.sql.SQLException;
import java.util.List;

import org.springframework.stereotype.Repository;

import Models.User;


/**
 * 
 * @author jyotsna
 *
 */

public interface UserDao {

	long checkUserSession(String sessionId);

	boolean adduser(User user) throws SQLException;

	boolean updateUser(User user) throws SQLException;

	boolean deleteUser(User user);

	List<User> getAllUser();
    
}
