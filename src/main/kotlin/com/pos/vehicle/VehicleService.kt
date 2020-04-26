package com.pos.vehicle

import com.pos.vehicle.dto.Vehicle
import org.springframework.stereotype.Service
import java.lang.RuntimeException
import java.util.concurrent.atomic.AtomicLong

@Service
class VehicleService {

    private val vehicles: MutableList<Vehicle> = mutableListOf(
            Vehicle(1L, "152-T-1234", "Opel", "Astra Hatch", "Red"),
            Vehicle(2L, "152-T-1235", "Volkswagon", "Golf Hatch", "Black")
    )

    private val idGenerator = AtomicLong(3L)

    constructor()

    fun create(vehicle: Vehicle): Vehicle {
        vehicle.id = idGenerator.getAndIncrement()
        vehicles.add(vehicle)
        return vehicle
    }

    fun retrieveAll() = vehicles

    fun retrieve(id: Long) = vehicles.firstOrNull<Vehicle> { it.id == id } ?: throw Exception("Vehicle not found.")

    fun update(id: Long, vehicle: Vehicle): Vehicle {
        val foundVehicle = retrieve(id)
        foundVehicle.reg = vehicle.reg
        foundVehicle.color = vehicle.color
        return foundVehicle
    }

    fun delete(id: Long) = vehicles.removeIf { it.id == id }

}