package controllers;

import play.*;

import java.util.*;
import play.data.Form;

import play.mvc.*;
import models.*;

import Util.SessionHandling;
import views.html.*;

import com.avaje.ebean.*;

public class Login extends Controller {

    public Result login() {
        return ok(login.render(Form.form(User.class)));
    }

    public Result validateLogin() {
	    Form<User> form = Form.form(User.class).bindFromRequest();
	    User user = form.get();
	    List<User> userResult = Ebean.find(User.class)
	        .where().like("email", user.email)
	        .where().like("password", user.password)
	        .findList();
	    if (userResult.size() > 0) {
	    	String userLoggedIn = userResult.get(0).email;
	    	SessionHandling.login(userLoggedIn);
	        return redirect(controllers.routes.Home.home());
	    }
	    else {
	        return redirect(controllers.routes.Error.error("Not a valid user:" +user.email + user.password));
	    }


	}
    

}