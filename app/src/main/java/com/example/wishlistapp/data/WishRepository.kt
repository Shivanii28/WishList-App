package com.example.wishlistapp.data

import kotlinx.coroutines.flow.Flow


class WishRepository(private val wishDao: WishDao) {

    suspend fun addWish(wish: Wish){
        wishDao.addWish(wish)
    }

    fun getWishes(): Flow<List<Wish>> = wishDao.getAllWishes()

    fun getAWishesbyid(id:Long) : Flow<Wish>{
        return wishDao.getAWishById(id)
    }

    suspend fun updateAWish(wish: Wish){
        wishDao.updateWish(wish)
    }

    suspend fun deleteWish(wish: Wish){
        wishDao.deleteWish(wish)
    }

}



