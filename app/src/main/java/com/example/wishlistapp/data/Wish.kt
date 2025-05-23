package com.example.wishlistapp.data

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity(tableName = "wish-table")
data class Wish(

    @PrimaryKey(autoGenerate = true)
    val id:Long=0L,
    @ColumnInfo(name = "wish-title")
    val title:String="",
    @ColumnInfo(name = "wish-desc")
    val description: String = ""
)

object DummyWish{

    val wishList= listOf(

        Wish(title = "Android mobile", description = "Best pixel mobile currently"),
        Wish(title = "Android watch", description = "Best pixel watch currently"),
        Wish(title = "sumsung mobile", description = "Best sumsung mobile currently"),
        Wish(title = "sumsung watch", description = "Best sumsung watch currently"),


    )
}
