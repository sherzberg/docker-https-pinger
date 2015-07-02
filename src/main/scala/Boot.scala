import scalaj.http._


object Boot {

  def main(args: Array[String]) = {
    val url = sys.env("PING_URL")
    val response: HttpResponse[String] = Http(url).asString
    println(response.code)
    println(response.body)
  }

}
