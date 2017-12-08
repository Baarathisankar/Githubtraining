
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/Varun/Desktop/play-2.6/user-profile/conf/routes
// @DATE:Wed Dec 06 11:27:28 IST 2017


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
