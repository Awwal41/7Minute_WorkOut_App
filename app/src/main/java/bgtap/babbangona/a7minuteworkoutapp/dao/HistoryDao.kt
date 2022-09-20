package bgtap.babbangona.a7minuteworkoutapp.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import bgtap.babbangona.a7minuteworkoutapp.entity.HistoryEntity
import kotlinx.coroutines.flow.Flow

//create a dao interface with insert method
@Dao
interface HistoryDao {

    @Insert
    suspend fun insert(historyEntity: HistoryEntity)

    @Query("Select * from `history-table`")
    fun fetchALlDates():Flow<List<HistoryEntity>>
}