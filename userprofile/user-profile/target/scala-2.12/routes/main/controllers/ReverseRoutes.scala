
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/Varun/Desktop/play-2.6/user-profile/conf/routes
// @DATE:Wed Dec 06 11:27:28 IST 2017

import play.api.mvc.Call


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:6
package controllers {

  // @LINE:6
  class ReverseHomeController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:6
    def index(): Call = {
      
      Call("GET", _prefix)
    }
  
  }

  // @LINE:9
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:9
    def versioned(file:Asset): Call = {
      implicit lazy val _rrc = new play.core.routing.ReverseRouteContext(Map(("path", "/public"))); _rrc
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[play.api.mvc.PathBindable[Asset]].unbind("file", file))
    }
  
  }

  // @LINE:13
  class ReverseUserController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:13
    def addUser(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "training/user/addUser")
    }
  
    // @LINE:15
    def deleteUser(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "training/user/deleteUser")
    }
  
    // @LINE:14
    def updateUser(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "training/user/updateUser")
    }
  
    // @LINE:16
    def getAllUser(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "training/user/getAllUser")
    }
  
  }


}
