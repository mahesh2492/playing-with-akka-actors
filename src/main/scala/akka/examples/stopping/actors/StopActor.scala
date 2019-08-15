package akka.examples.stopping.actors

import akka.actor.{Actor, ActorSystem, Props}

class StopActor extends Actor {

  override def receive: Receive = {
    case _ => println("Message has been received")
  }
}

object StopActorTest extends App {

  val system = ActorSystem("StoppingActor")
  val actor = system.actorOf(Props[StopActor], name = "KillActor")

  actor ! "hello"

  //We can kill this method to stop the actor
  system.stop(actor)
  println("An actor has been killed")
  system.terminate()
}