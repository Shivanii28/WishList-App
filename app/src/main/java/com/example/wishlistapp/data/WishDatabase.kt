package com.example.wishlistapp.data

import androidx.room.Database
import androidx.room.RoomDatabase


@Database(
    entities = [Wish::class],
    version = 1,
    exportSchema = false
)
abstract class WishDatabase:RoomDatabase() {

    // This is an abstract function that returns an object of WishDao.
    abstract fun wishDao():WishDao
}