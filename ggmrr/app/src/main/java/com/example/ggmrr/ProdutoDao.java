package com.example.ggmrr;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import java.util.List;

@Dao
public interface ProdutoDao {
    @Insert
    void insert(Produto produto);

    @Delete
    void delete(Produto produto);

    /** @noinspection AndroidUnresolvedRoomSqlReference*/
    @Query("SELECT * FROM Produto")
    List<Produto> getAllSenhas();
}