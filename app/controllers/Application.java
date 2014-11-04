package controllers;

import com.feth.play.module.pa.PlayAuthenticate;
import com.feth.play.module.pa.user.AuthUser;

import models.User;
import play.*;
import play.mvc.*;
import views.html.*;

@Security.Authenticated(Secured.class)
public class Application extends Controller {

    public static Result index() {
        return ok(index.render("Your new application is ready."));
    }
    
	public static User getLocalUser() {
		final AuthUser currentAuthUser = PlayAuthenticate.getUser(session());
		final User localUser = User.findByAuthUserIdentity(currentAuthUser);
		return localUser;
	}
}
