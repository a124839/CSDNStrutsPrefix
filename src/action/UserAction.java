package action;

import java.util.Comparator;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import entity.Users;

public class UserAction extends ActionSupport implements ModelDriven<Users>,Comparator<Users> {

	private static final long serialVersionUID = 1L;
	private Users users;
	
	
	
	@Override
	public String execute() throws Exception {
		
		return "success";
	}



	@Override
	public Users getModel() {
	
		return users;
	}



	@Override
	public int compare(Users o1, Users o2) {
		
		return o1.getName().compareTo(o2.getName());
	}

}
