package com.example.recipeapp.entities

import androidx.room.ColumnInfo
import androidx.room.PrimaryKey
import androidx.room.Entity
import java.io.Serializable

@Entity(tableName = "Recipes")
data class Recipies(
    @PrimaryKey(autoGenerate = true)
    var id: Int,

    @ColumnInfo(name = "dishName")
    var dishName: String
) : Serializable

