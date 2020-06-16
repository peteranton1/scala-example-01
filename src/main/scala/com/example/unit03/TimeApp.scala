package com.example.unit03

import cats.effect.IO
import fs2.StreamApp
import org.http4s.HttpService
import org.http4s.server.blaze.BlazeBuilder

import scala.concurrent.ExecutionContext.Implicits.global

object TimeApp extends StreamApp[IO] {

  def stream(args: List[String], requestShutdown: IO[Unit]): fs2.Stream[IO, StreamApp.ExitCode] =
    BlazeBuilder[IO]
      .bindHttp(8080, "0.0.0.0")
      .mountService(timeService, "/")
      .serve

  def timeService: HttpService[IO] = (new TimeService).service
}