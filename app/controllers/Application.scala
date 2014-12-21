package controllers

import play.api._
import play.api.mvc._
import models.LoginModel
import forms.MyForms.loginForm

object Application extends Controller {

  def index = Action {implicit request =>
    Ok(views.html.index(loginForm))
  }


  def isEmailExist(email: String) = Action { implicit request =>

    System.out.println("######### 1")
    email.contains('@') match {
      case true => Ok("true")
      case false => Ok("false")
    }
  }


  def javascriptRoutes = Action { implicit request =>
      //import routes.javascript._
      Ok(
        Routes.javascriptRouter("jsRoutes") (routes.javascript.Application.isEmailExist)).as("text/javascript")
  }


}