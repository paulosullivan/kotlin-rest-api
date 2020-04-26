package com.pos.vehicle.resource

import com.pos.vehicle.VehicleService
import com.pos.vehicle.dto.Vehicle
import org.springframework.web.bind.annotation.*

@RestController
class VehicleResource (val service: VehicleService) {

    @PostMapping("/vehicles")
    fun create(@RequestBody vehicle: Vehicle) = service.create(vehicle)

    @GetMapping("/vehicles")
    fun retrieveAll() = service.retrieveAll()

    @GetMapping("/vehicles/{id}")
    fun retrieve(@PathVariable id: Long) = service.retrieve(id)

    @PutMapping("/vehicles/{id}")
    fun update(@PathVariable id: Long, @RequestBody vehicle: Vehicle) = service.update(id, vehicle)

    @DeleteMapping("/vehicles/{id}")
    fun delete(@PathVariable id: Long) = service.delete(id)
}