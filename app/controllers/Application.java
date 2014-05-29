package controllers;

import play.*;
import play.mvc.*;

import views.html.*;

public class Application extends Controller {

    public static Result index() {
    	   System.out.print("aliu"); 
    	   
    	   System.out.print("aeyy rajoooooooooooooooooooooooooooooooooooooooooooooo"); 
         return ok(index.render("Sajjad Ali 123"));
         
     
    }

}
