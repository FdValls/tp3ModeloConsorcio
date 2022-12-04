package com.example.projectchantadmin.entities

class User {

    var name: String = ""
    var phone: String = ""
    var photo: String = ""
    var email: String
    var rol: String
    var passwd: String = ""

    companion object {
        val customer: String = "customer"
        val admin: String = "admin"
    }

    constructor(email: String) {
        this.email = email
        this.rol = customer
    }

    constructor(email: String, passwd: String) {
        this.email = email
        this.rol = customer
        this.passwd = passwd
    }

    override fun toString(): String {
        return "Nombre: " + this.name + " " + "Email: " + this.email + " " + " Rol: " + this.rol
    }


}