package controllers;

import play.mvc.Controller;
import play.mvc.Result;
import views.html.*;

public class TestController extends Controller {
    public Result test1() {
        return ok(test1.render());
    }
}
