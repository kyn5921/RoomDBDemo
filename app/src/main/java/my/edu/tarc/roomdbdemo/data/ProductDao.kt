package my.edu.tarc.roomdbdemo.data

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query

@Dao
interface ProductDao {

    @Insert
    fun insertProduct(product: Product)

    @Query("select * from product_table")
    fun getProduct() : List<Product>

    @Query("select * from product_table where price < :priceRange")
    fun getPrice(priceRange:Double) : List<Product>
}