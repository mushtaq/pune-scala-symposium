package utils

import scala.concurrent.duration.Duration
import scala.concurrent.{Future, Promise}
import scala.util.Try
import rx.lang.scala.Observable
import utils.Config.executionContext

object Scheduler {

  def asFuture[T](delay: Duration)(block: =>T): Future[T] = {

    val promise = Promise[T]()

    Config.threadPool.schedule(

      new Runnable {
        def run() = promise.complete(Try(block))
      },

      delay.length,

      delay.unit
    )

    promise.future
  }

  def asObservable[T](delay: Duration)(block: =>T): Observable[T] = {

    val future = asFuture(delay)(block)

    Observable.from(future)
  }

}
