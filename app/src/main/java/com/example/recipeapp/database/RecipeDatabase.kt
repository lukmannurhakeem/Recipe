package com.example.recipeapp.database

import android.content.Context
import androidx.room.*
import com.example.recipeapp.dao.RecipeDao
import com.example.recipeapp.entities.Category
import com.example.recipeapp.entities.Recipies
import java.security.AccessControlContext

@Database(entities = [Recipies::class, Category::class, Meal::class,MealItems:
@TypeConverters(CategoryListConverter::class,MealListConverter::class)
abstract class RecipeDatabase: RoomDatabase(){
    companion object{
        var recipeDatabase:RecipeDatabase? = null
        @Synchronized
        fun  getDatabase(context: Context): RecipeDatabase{
            if (recipeDatabase == null)
            {
                recipeDatabase = Room.databaseBuilder(
                    context,
                    RecipeDatabase::class.java,
                    "recipe.db"
                ).build()
            }
            return recipeDatabase!!
        }
    }
    abstract fun recipeDao():RecipeDao
}
