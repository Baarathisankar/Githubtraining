package services.service.impl;

import java.sql.SQLException;
import java.util.List;

import javax.inject.Inject;

import Models.User;
import dataAccess.dao.UserDao;
import dataAccess.dao.impl.UserDaoImpl;
//import models.user.User;
//import services.service.AdminService;
import play.inject.ApplicationLifecycle;
import play.libs.F;
import services.service.UserService;

/**
 * @author jyotsna
 *
 */

public class UserServiceImpl implements UserService {

	private UserDao dao;
	
	@Inject
    public UserServiceImpl(UserDaoImpl dao) {
        this.dao = dao;
    }

	@Override
	public long checkUserSession(String sessionId) {
		return dao.checkUserSession(sessionId);
	}

	@Override
	public boolean adduser(User user) throws SQLException{
		return dao.adduser(user);
	}

	@Override
	public boolean updateUser(User user) throws SQLException{
		return dao.updateUser(user);
	}

	@Override
	public boolean deleteUser(User user) {
		return dao.deleteUser(user);
	}

	@Override
	public List<User> getAllUser() {
		return dao.getAllUser();
	}

}
