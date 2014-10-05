package chess

import play.api.libs.json.{JsObject, Json}

case class ChessMove(country: String, lat: Double, lon: Double)

object ChessMove {

  class ChessParseException(record: String) extends RuntimeException(s"Error in parsing $record")

  def make(record: String) = {
    val jsObject = Json.parse(record.stripPrefix("data: ")).as[JsObject]
    ChessMove(
      (jsObject \ "country").as[String],
      (jsObject \ "lat").as[Double],
      (jsObject \ "lon").as[Double]
    )
  }
}
