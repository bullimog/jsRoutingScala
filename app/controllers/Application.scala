package controllers

import play.api._
import play.api.mvc._
import forms.MyForms.loginForm

object Application extends Controller {

  def index = Action {implicit request =>
    Ok(views.html.index(loginForm))
  }


  def usernameValid(username: String) = Action { implicit request =>
    Ok("Length of username was " + username.length)
  }


  def javascriptRoutes = Action { implicit request =>
      Ok(Routes.javascriptRouter("jsRoutes") (routes.javascript.Application.usernameValid)).as("text/javascript")
  }


}