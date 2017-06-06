package edu.caeus

import java.io.{BufferedWriter, File, FileWriter}
import java.time.YearMonth

import edu.caeus.models._

/**
  * Created by undertrail on 5/06/17.
  */
object ResumesEngine {


  private val bogotaAddress = Address(
    value = "Bogotá",
    outer = Some(Address(value = "Colombia", outer = None))
  )
  val caeus = Resume(contact = Contact(name = Name(
    first = "Camilo": String,
    middle = "Alejandro": String,
    last = "Navas Mosquera": String): Name,
    email = "camilo.a.navas@gmail.com": String,
    mobile = "+573123084691": String,
    address = Address(
      value = "Calle 10sur # 35a 55",
      outer = Some(bogotaAddress)
    ): Address): Contact,
    intro =
      """Computer Engineer with vast experience as full stack developer and software architect. Committed to RESTful principles, functional programming principles and fascinated about Scala's type system. Eager to work in environments where I can apply my knowledge and learn new skills. Passionate, thorough and resourceful in regards to problem solving. Willing to take a step towards academia and research, mainly in the field of complex systems and artificial intelligence.""",
    experience = Seq(
      Experience(
        position = "Software architect",
        company = Company(name = "GDX Travel/Undertrail",
          location = bogotaAddress
        ),
        period = Period(
          since = YearMonth.parse("2015-09"),
          until = None
        ),
        description =
          """I started as the first developer here in Colombia, mainly mantaining a django based ill designed solution. I got involved in the task to design and implement a new architecture which could scale to the needs of the company. The current architecture is based on many play framework/scala based services and with extensive use of RabbitMQ and Akka Streams. At the end I got to learn a new language (Scala, which I chose for the new backend implementations), also learnt about Akka, AWS, Redis, RabbitMQ, Kafka, Javascript development (typescript, webpack, React, Vue, etc), and last but not least, I sharpened my knowledge in RESTful architectures.""",
        story = None
      ),
      Experience(
        position = "CTO",
        company = Company(name = "Kiido SAS & ODA SAS",
          location = bogotaAddress
        ),
        period = Period(
          since = YearMonth.parse("2014-01"),
          until = Some(YearMonth.parse("2015-08"))
        ),
        description =
          """I quit my previous job in order to become an entrepreneur. During this time I learned RESTful architectures and got involved with the new technologies regarding web development and mobile development. Many projects, mainly using Heroku, Play framework (Scala and Java), MongoDB, PostgresSQL, AngularJS, and Android (Java and Kotlin).""",
        story = None
      ),
      Experience(
        position = "Software developer",
        company = Company(name = "Innerconsulting",
          location = bogotaAddress
        ),
        period = Period(
          since = YearMonth.parse("2012-03"),
          until = Some(YearMonth.parse("2013-12"))
        ),
        description =
          """Just after arriving from Australia. Worked here mainly as product owner/architect/developer of the software called Cajapagos. A software developed in a monolithic J2EE architecture, using GWT, EJB and Hibernate. Its purpose was to process payments for the software SIPE (Sistema integrado de prestaciones económicas) of the Caja de seguro social de Panamá. I left this job intending to create my own startup.""",
        story = None
      ),
      Experience(
        position = "Software developer",
        company = Company(name = "Heinsohn software house",
          location = bogotaAddress
        ),
        period = Period(
          since = YearMonth.parse("2011-01"),
          until = Some(YearMonth.parse("2015-08"))
        ),
        description =
          """I worked here right after finishin college. As a software house my tasks were usually implement very well defined requirements. Nómina, the software developed there used J2EE architecture and JSF.
Very little space to be creative.""",
        story = None
      ),
      Experience(
        position = "Supervisor",
        company = Company(name = "Universidad de los Andes",
          location = bogotaAddress
        ),
        period = Period(
          since = YearMonth.parse("2007-01"),
          until = Some(YearMonth.parse("2010-12"))
        ),
        description =
          """In many occasions during my studies, I was supervisor of a certain class, mainly Computer Programming and fundamentals of computer science. I had to assist the main teacher to grade students and advice students when needed.""",
        story = None
      )
    ): Seq[Experience],
    education = Seq(
      Education(degree = "Bachelor of engineering, Computer engineering",
        focus = None,
        period = Period(
          since = YearMonth.parse("2007-01"),
          until = Some(YearMonth.parse("2010-12"))
        )),
      Education(degree = "Highschool diploma",
        focus = Some("Computer engineering"),
        period = Period(
          since = YearMonth.parse("2000-01"),
          until = Some(YearMonth.parse("2006-12"))
        ))
    ): Seq[Education],
    skills = Seq(
      Skill(name = "Scala": String,
        relevance = 10: Int,
        proficiency = 9: Int,
        tags = Set("programming-language", "jvm"): Set[String]
      ),
      Skill(name = "sbt": String,
        relevance = 9: Int,
        proficiency = 6: Int,
        tags = Set("build-system", "jvm", "scala"): Set[String]
      ),
      Skill(name = "Akka": String,
        relevance = 6: Int,
        proficiency = 7: Int,
        tags = Set("toolkit", "library", "jvm", "scala"): Set[String]
      ),
      Skill(name = "akka-streams": String,
        relevance = 9: Int,
        proficiency = 6: Int,
        tags = Set("toolkit", "library", "jvm", "scala"): Set[String]
      ),
      Skill(name = "RabbitMQ": String,
        relevance = 6: Int,
        proficiency = 6: Int,
        tags = Set("message-broker"): Set[String]
      ),
      Skill(name = "Kafka": String,
        relevance = 6: Int,
        proficiency = 6: Int,
        tags = Set("message-broker"): Set[String]
      ),
      Skill(name = "Category Theory": String,
        relevance = 7: Int,
        proficiency = 6: Int,
        tags = Set("programming-language", "jvm", "scala"): Set[String]
      ),
      Skill(name = "RESTful architectures": String,
        relevance = 10: Int,
        proficiency = 6: Int,
        tags = Set("programming-language", "jvm", "scala"): Set[String]
      ),
      Skill(name = "Functional programming": String,
        relevance = 10: Int,
        proficiency = 6: Int,
        tags = Set("programming-language", "jvm", "scala"): Set[String]
      ),
      Skill(name = "JVM": String,
        relevance = 9: Int,
        proficiency = 6: Int,
        tags = Set("programming-language", "jvm", "scala"): Set[String]
      ),
      Skill(name = "Java": String,
        relevance = 6: Int,
        proficiency = 6: Int,
        tags = Set("programming-language", "jvm", "scala"): Set[String]
      ),
      Skill(name = "Kotlin": String,
        relevance = 8: Int,
        proficiency = 6: Int,
        tags = Set("programming-language", "jvm", "scala"): Set[String]
      ),
      Skill(name = "PostgresSQL": String,
        relevance = 8: Int,
        proficiency = 6: Int,
        tags = Set("programming-language", "jvm", "scala"): Set[String]
      ),
      Skill(name = "Redis": String,
        relevance = 7: Int,
        proficiency = 6: Int,
        tags = Set("programming-language", "jvm", "scala"): Set[String]
      ),
      Skill(name = "MongoDB": String,
        relevance = 7: Int,
        proficiency = 6: Int,
        tags = Set("programming-language", "jvm", "scala"): Set[String]
      ),
      Skill(name = "JavaScript": String,
        relevance = 6: Int,
        proficiency = 6: Int,
        tags = Set("programming-language", "jvm", "scala"): Set[String]
      ),
      Skill(name = "Webpack": String,
        relevance = 7: Int,
        proficiency = 6: Int,
        tags = Set("programming-language", "jvm", "scala"): Set[String]
      ),
      Skill(name = "React.js": String,
        relevance = 6: Int,
        proficiency = 6: Int,
        tags = Set("programming-language", "jvm", "scala"): Set[String]
      ),
      Skill(name = "Vue.js": String,
        relevance = 6: Int,
        proficiency = 6: Int,
        tags = Set("programming-language", "jvm", "scala"): Set[String]
      ),
      Skill(name = "AngularJS": String,
        relevance = 3: Int,
        proficiency = 6: Int,
        tags = Set("programming-language", "jvm", "scala"): Set[String]
      ),
      Skill(name = "Typescript": String,
        relevance = 2: Int,
        proficiency = 6: Int,
        tags = Set("programming-language", "jvm", "scala"): Set[String]
      ),
      Skill(name = "Android development": String,
        relevance = 2: Int,
        proficiency = 6: Int,
        tags = Set("programming-language", "jvm", "scala"): Set[String]
      ),
      Skill(name = "MySQL/MariaDB": String,
        relevance = 3: Int,
        proficiency = 6: Int,
        tags = Set("programming-language", "jvm", "scala"): Set[String]
      ),
      Skill(name = "Eclipse": String,
        relevance = 1: Int,
        proficiency = 6: Int,
        tags = Set("programming-language", "jvm", "scala"): Set[String]
      ),
      Skill(name = "Intellij": String,
        relevance = 6: Int,
        proficiency = 6: Int,
        tags = Set("programming-language", "jvm", "scala"): Set[String]
      ),
      Skill(name = "Maven": String,
        relevance = 3: Int,
        proficiency = 6: Int,
        tags = Set("programming-language", "jvm", "scala"): Set[String]
      ),
      Skill(name = "Gradle": String,
        relevance = 5: Int,
        proficiency = 6: Int,
        tags = Set("programming-language", "jvm", "scala"): Set[String]
      ),
      Skill(name = "Ant": String,
        relevance = 1: Int,
        proficiency = 6: Int,
        tags = Set("programming-language", "jvm", "scala"): Set[String]
      ),
      Skill(name = "Linux": String,
        relevance = 4: Int,
        proficiency = 6: Int,
        tags = Set("programming-language", "jvm", "scala"): Set[String]
      ),
      Skill(name = "Windows": String,
        relevance = 1: Int,
        proficiency = 6: Int,
        tags = Set("programming-language", "jvm", "scala"): Set[String]
      ),
      Skill(name = "AWS": String,
        relevance = 7: Int,
        proficiency = 6: Int,
        tags = Set("programming-language", "jvm", "scala"): Set[String]
      ),
      Skill(name = "Heroku": String,
        relevance = 6: Int,
        proficiency = 6: Int,
        tags = Set("programming-language", "jvm", "scala"): Set[String]
      ),
      Skill(name = "SCRUM": String,
        relevance = 5: Int,
        proficiency = 6: Int,
        tags = Set("programming-language", "jvm", "scala"): Set[String]
      ),
      Skill(name = "Jenkins": String,
        relevance = 6: Int,
        proficiency = 6: Int,
        tags = Set("programming-language", "jvm", "scala"): Set[String]
      ),
      Skill(name = "git": String,
        relevance = 8: Int,
        proficiency = 6: Int,
        tags = Set("programming-language", "jvm", "scala"): Set[String]
      ),
      Skill(name = "svn": String,
        relevance = 1: Int,
        proficiency = 6: Int,
        tags = Set("programming-language", "jvm", "scala"): Set[String]
      ),
      Skill(name = "Python": String,
        relevance = 2: Int,
        proficiency = 6: Int,
        tags = Set("programming-language", "jvm", "scala"): Set[String]
      ),
      Skill(name = "Pip": String,
        relevance = 1: Int,
        proficiency = 6: Int,
        tags = Set("programming-language", "jvm", "scala"): Set[String]
      ),
      Skill(name = "Play framework": String,
        relevance = 9: Int,
        proficiency = 6: Int,
        tags = Set("programming-language", "jvm", "scala"): Set[String]
      ),
      Skill(name = "Django": String,
        relevance = 4: Int,
        proficiency = 6: Int,
        tags = Set("programming-language", "jvm", "scala"): Set[String]
      ),
      Skill(name = "Express.js": String,
        relevance = 2: Int,
        proficiency = 6: Int,
        tags = Set("programming-language", "jvm", "scala"): Set[String]
      ),
      Skill(name = "Slick": String,
        relevance = 7: Int,
        proficiency = 6: Int,
        tags = Set("programming-language", "jvm", "scala"): Set[String]
      ),
      Skill(name = "Processing": String,
        relevance = 1: Int,
        proficiency = 6: Int,
        tags = Set("programming-language", "jvm", "scala"): Set[String]
      ),
      Skill(name = "npm": String,
        relevance = 2: Int,
        proficiency = 6: Int,
        tags = Set("programming-language", "jvm", "scala"): Set[String]
      ),
      Skill(name = "yarn": String,
        relevance = 2: Int,
        proficiency = 6: Int,
        tags = Set("programming-language", "jvm", "scala"): Set[String]
      ),
      Skill(name = "Groovy": String,
        relevance = 5: Int,
        proficiency = 6: Int,
        tags = Set("programming-language", "jvm", "scala"): Set[String]
      ),
      Skill(name = "Netlogo": String,
        relevance = 2: Int,
        proficiency = 6: Int,
        tags = Set("programming-language", "jvm", "scala"): Set[String]
      )

    ).sortBy(-_.relevance): Seq[Skill])

  def main(args: Array[String]): Unit = {

    val intro = caeus.intro
    val experience = caeus.experience.map {
      experience =>
        s"""<tr><td><h3>${experience.position}</h3>
            <h4>${experience.company.name}</h4>
            <h5>${experience.period.since} - ${experience.period.until.getOrElse("present")}</h5>
            <p>${experience.description}</p></td></tr>"""
    }.mkString("")
    val skills = caeus.skills.map {
      skill =>
        s"""<span style="font-size:${skill.relevance.toDouble * 1.4 + 12.0}px">${skill.name}</span>"""
    }.mkString(" | ")

    val education = caeus.education.map {
      education =>
        s"""<tr><td><h3>${education.degree}</h3>
            ${education.focus.map { focus => s"<h4>$focus</h4>" }.getOrElse("")}
            <h5>${education.period.since} - ${education.period.until.getOrElse("present")}</h5>
            ${education.notes.map { notes => s"<p>$notes</p>" }.getOrElse("")}</td></tr>"""
    }.mkString("")


    val file = new File("cv.html")
    val bw = new BufferedWriter(new FileWriter(file))
    bw.write(
      s"""
         <html>
         <body>
         <h2>Profile</h2>
         <p>${caeus.intro}</p>
         <h2>Experience</h2>
         <table><tbody>
         $experience</tbody></table>
         <h2>Education</h2>
         <table><tbody>
         $education</tbody></table>
         <h2>Technical skills</h2>
         $skills
         </body>
         </html>
       """)
    bw.close()
  }

}
