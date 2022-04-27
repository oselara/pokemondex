package com.jlara.pokedex

data class Pokemon(val id: Long,val nombre: String, val hp: Int, val attack: Int, val defense: Int, val speed: Int, val type: PokemonType, val urlImage: String, val sound: Int) {
    enum class PokemonType{
        GRASS, FIRE, WATER, FIGHTER, ELECTRIC
    }
}

