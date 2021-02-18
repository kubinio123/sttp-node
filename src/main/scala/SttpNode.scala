import sttp.client3._

import scala.scalajs.concurrent.JSExecutionContext.Implicits.queue

object SttpNode extends App {

  val g = scalajs.js.Dynamic.global.globalThis

  val nodeFetch = g.require("node-fetch")

  g.fetch = nodeFetch
  g.Headers = nodeFetch.Headers
  g.Request = nodeFetch.Request

  val backend = FetchBackend()

  val request = basicRequest.get(uri"https://jsonplaceholder.typicode.com/posts")

  request.send(backend)
    .onComplete(response => {
      println(s"I am completed: $response")
      response.get
    })

}
