package com.example.kotlinintermedio

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Enum Clases
        enumClases()
        //Instancias
        instancias()
    }
    private fun instancias(){

    }
    enum class Direction(val dir:Int){

        NORTH(1),SOUTH(-1),WEST(-1), EAST(1);

        fun description() : String{

            return when (this){
                NORTH -> "La dirección es norte"
                SOUTH -> "La dirección es sur"
                //else -> "No sabemos la dirección"

                EAST -> "La dirección es este"
                WEST -> "La dirección es oeste"
            }
        }
    }
    private fun enumClases(){
        //Asignacion de variables
        var userDirection: Direction? = null
        println("Direccion: $userDirection")

        userDirection = Direction.NORTH
        println("Direccion: $userDirection")

        userDirection = Direction.SOUTH
        println("Direccion: $userDirection")
        //Propiedades por defecto
        println("Propiedad name: ${userDirection.name}")
        println("Propiedad ordinal: ${userDirection.ordinal}")
        // Funciones
        println(userDirection.description())

        //Inicializacion
        println(userDirection.dir)
    }
}