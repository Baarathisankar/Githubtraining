package services.service;

import java.sql.SQLException;
import java.util.List;


import Models.User;

/**
 * This interface will contains all admin service except
 * common service like login, logout,forgot password ect.
 * @author Manzarul
 *
 */
public interface UserService {

	long checkUserSession(String sessionId);

	boolean adduser(User user) throws SQLException;

	boolean updateUser(User user) throws SQLException;

	boolean deleteUser(User user);

	List<User> getAllUser();

    
}
