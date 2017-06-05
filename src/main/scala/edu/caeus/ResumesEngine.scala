package edu.caeus

import edu.caeus.models._

/**
  * Created by undertrail on 5/06/17.
  */
object ResumesEngine {


  val caeus = Resume(contact = Contact(name = Name(
    first = "Camilo": String,
    middle = "Alejandro": String,
    last = "Navas Mosquera": String): Name,
    email = "camilo.a.navas@gmail.com": String,
    mobile = "+573123084691": String,
    address = Address(
      value = "Calle 10sur # 35a 55",
      outer = Some(Address(
        value = "Bogotá",
        outer = Some(Address(value = "Colombia", outer = None))
      ))
    ): Address): Contact,
    intro = """I started as the first developer here in Colombia, mainly dealing with legacy code in Python. I was literally sold the idea that it was an amazing platform and I was excited to learn a new language. It was all lies (sorry guys). At the end I proposed an extreme architectural change which is what Undertrail is mainly using right now. At the end I got to learn a new language (Scala, which I chose for the new backend implementations), also learnt about Akka, AWS, Redis, RabbitMQ, Kafka, Javascript development (typescript, webpack, React, Vue, etc), and last but not least, I sharpened my knowledge in RESTful architectures which I deeply love.""": String,
    experience = Nil: Seq[Experience],
    education = Nil: Seq[Education],
    skills = Nil: Seq[Skill])


}
