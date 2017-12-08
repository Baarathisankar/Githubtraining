package controllers;

import java.sql.SQLException;
import java.util.List;

import javax.inject.Inject;

import org.springframework.beans.factory.annotation.Autowired;

import com.fasterxml.jackson.databind.JsonNode;

import Models.*;
import play.data.Form;
import play.mvc.Controller;
import play.mvc.Result;
import services.service.UserService;
import services.service.impl.UserServiceImpl;
import util.Constants;
import util.ProjectUtil;
import util.mapper.ControllerRequestMapper;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import play.mvc.Controller;
import play.mvc.Result;
import play.mvc.Controller;
import play.mvc.Result;



/**
 * This controller will handle admin related task
 * 
 * @author jyotsna
 * 
 */


public class UserController extends Controller {
	
    private UserService service;
   
    @Inject
    public UserController(UserServiceImpl service) {
        this.service = service;
    }
    
    @Inject
	private ControllerRequestMapper requestMapper;
   
    
    public Result addUser() throws SQLException{
    	System.out.println("sreevas");
		JsonNode requestData = request().body().asJson();
		User user = (User) requestMapper.mapRequest(requestData, User.class);
		boolean response = service.adduser(user);
		if (response) {
			 return ok(ProjectUtil.successResponse());
		}
		return ok(ProjectUtil.failureResponse());
	}
    
    public Result updateUser() throws SQLException{
		JsonNode requestData = request().body().asJson();
		User user = (User) requestMapper.mapRequest(requestData, User.class);
		boolean response = service.updateUser(user);
		if (response) {
			 return ok(ProjectUtil.successResponse());
		}
		return ok(ProjectUtil.failureResponse());
	}
    
    public Result deleteUser() {
		JsonNode requestData = request().body().asJson();
		User user = (User) requestMapper.mapRequest(requestData, User.class);
		boolean response = service.deleteUser(user);
		if (response) {
			 return ok(ProjectUtil.successResponse());
		}
		return ok(ProjectUtil.failureResponse());
	}
    
    public Result getAllUser() {
//		JsonNode requestData = request().body().asJson();
//		User user = (User) requestMapper.mapRequest(requestData, User.class);
		List<User> response = service.getAllUser();
		for(User user:response){
		System.out.println(user.toString());
		}
		if (response!=null) {
			 return ok(ProjectUtil.successResponse(response));
		}
		return ok(ProjectUtil.failureResponse());
	}
}
