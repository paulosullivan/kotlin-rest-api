package com.pos.vehicle.dto

class Vehicle (var reg: String, val make: String, val model: String, var color: String) {

    var id: Long? = null

    constructor(id: Long, reg: String, make: String, model: String, color: String): this(reg, make, model, color) {
        this.id = id
    }

}