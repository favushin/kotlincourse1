package com.example.myfirstapp
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import kotlinx.coroutines.flow.Flow

@Dao
interface Dao {
    @Insert
    fun insertItems(item: Item)
    @Query("SELECT * FROM items")
    fun getAllItems(): Flow<List<Item>>
}