package library

object WebClient {
  val builder = new (com.ning.http.client.AsyncHttpClientConfig.Builder)()
  val client = new play.api.libs.ws.ning.NingWSClient(builder.build())
  def url(url: String) = client.url(url)
}
