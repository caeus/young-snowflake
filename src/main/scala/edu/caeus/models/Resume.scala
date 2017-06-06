package edu.caeus.models

import java.time.YearMonth

/**
  * Created by undertrail on 5/06/17.
  */

case class Address(
                    value: String,
                    outer: Option[Address]
                  )

case class Name(
                 first: String,
                 middle: String,
                 last: String
               )

case class Company(name: String,
                   location: Address)

case class Contact(
                    name: Name,
                    email: String,
                    mobile: String,
                    address: Address
                  )

case class Period(
                   since: YearMonth,
                   until: Option[YearMonth]
                 )

case class Experience(position: String,
                      company: Company,
                      period: Period,
                      description: String,
                      story: Option[String])

case class Education(
                      degree: String,
                      focus: Option[String],
                      period: Period,
                      notes: Option[String] = None
                    ) {


}

case class Skill(name: String,
                 relevance: Int,
                 proficiency: Double,
                 tags: Set[String],
                 notes: Option[String] = None
                ) {
  if (!(1 to 10 contains relevance)) throw new IllegalArgumentException("Relevance is a number between 1 and 10")
  if (!(1 to 10 contains proficiency)) throw new IllegalArgumentException("proficiency is a number between 1 and 10")
}

case class References()

case class Resume(
                   contact: Contact,
                   intro: String,
                   experience: Seq[Experience],
                   education: Seq[Education],
                   skills: Seq[Skill]
                 )
