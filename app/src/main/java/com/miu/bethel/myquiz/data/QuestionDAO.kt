package com.miu.bethel.myquiz.data

import androidx.room.*
import com.miu.bethel.myquiz.data.Question

@Dao
interface QuestionDAO {


    @Query("SELECT * FROM quiz ORDER BY id")
    suspend fun getAllQuizzes(): List<Question>

    @Update
    suspend fun updateQuiz(question: Question)

    @Query("DELETE FROM quiz WHERE 1=1")
    suspend fun deleteAllQuiz()

    @Delete
    suspend fun deleteQuiz(question: Question)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun addQuiz(question: Question)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun addQuizzes(vararg questions: Question)


}
