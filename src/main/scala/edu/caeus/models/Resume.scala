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

case class Contact(
                    name: Name,
                    email: String,
                    mobile: String,
                    address: Address
                  )

case class Duration(
                     since: YearMonth,
                     until: Option[YearMonth]
                   )

case class Experience()

case class Education()

case class Skill(name: String,
                 level: String,
                 notes: Option[String]
                )

case class References()

case class Resume(
                   contact: Contact,
                   intro: String,
                   experience: Seq[Experience],
                   education: Seq[Education],
                   skills: Seq[Skill]
                 )
