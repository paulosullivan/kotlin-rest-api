package com.pos.vehicle.dto

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class VehicleTest {

    @Test
    fun test() {
        val vehicle = Vehicle("152-T-1234", "Opel", "Astra Hatch", "Red")
        assertEquals("152-T-1234", vehicle.reg)
        assertEquals("Opel", vehicle.make)
        assertEquals("Astra Hatch", vehicle.model)
        assertEquals("Red", vehicle.color)

        val vehicle2 = Vehicle(1L, "152-T-1234", "Opel", "Astra Hatch", "Red")
        assertEquals(1L, vehicle2.id)
        assertEquals("152-T-1234", vehicle2.reg)
        assertEquals("Opel", vehicle2.make)
        assertEquals("Astra Hatch", vehicle2.model)
        assertEquals("Red", vehicle2.color)
    }

}