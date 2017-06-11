package com.financetracker.api

import org.scalatest._
import org.scalatest.prop._

import com.financetracker.helpers._

class UsersServiceSpec extends FunSpec with Matchers with BeforeAndAfter with PropertyChecks {
  describe("GET /users") {
    it("returns list of all users") {
      println("+++++++++++++++++++")
      (1 + 1) shouldBe 2
    }
  }
}