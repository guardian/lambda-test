package com.gu.microserviceWorkshop

import io.circe.Encoder
import io.circe.syntax._
import io.circe.generic.extras.semiauto._


case class APIResponse(statusCode: Int, headers: Map[String, String], body: String)

object APIResponse {

  implicit val APIResponseEncoder : Encoder[APIResponse] = deriveEncoder

}

case class APIResult(number: Int, isPrime: Boolean)
object APIResult {
  implicit val APIResultEncoder : Encoder[APIResult] = deriveEncoder
}
