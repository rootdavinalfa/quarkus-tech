package xyx.dvnlabs

import io.quarkus.test.common.http.TestHTTPEndpoint
import io.quarkus.test.junit.QuarkusTest
import io.restassured.RestAssured.`when`
import io.restassured.RestAssured.given
import io.restassured.http.ContentType
import org.hamcrest.CoreMatchers.`is`
import org.hamcrest.CoreMatchers.notNullValue
import org.junit.jupiter.api.MethodOrderer
import org.junit.jupiter.api.Order
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestMethodOrder
import xyx.dvnlabs.controller.AnythingController
import xyx.dvnlabs.entity.Anything
import java.math.BigDecimal

@QuarkusTest
@TestHTTPEndpoint(AnythingController::class)
@TestMethodOrder(value = MethodOrderer.OrderAnnotation::class)
class AnythingResourceTest {

    @Test
    @Order(1)
    fun testSave() {
        val anything = Anything()
        anything.kindName = "Quarkus"
        anything.qty = BigDecimal(2.0)
        given()
            .contentType(ContentType.JSON)
            .body(anything)
            .accept(ContentType.JSON)
            .post()
            .then()
            .statusCode(200)
    }

    @Test
    @Order(2)
    fun testGetAll() {

        given()
        `when`()
            .get("/list")
            .then()
            .statusCode(200)
            .body(`is`(notNullValue()))
    }

    @Test
    @Order(3)
    fun testGetIdOne() {
        given()
        `when`()
            .get("/1")
            .then()
            .statusCode(200)
    }

}