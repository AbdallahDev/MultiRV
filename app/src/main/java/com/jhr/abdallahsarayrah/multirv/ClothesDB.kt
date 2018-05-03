package com.jhr.abdallahsarayrah.multirv

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper

/**
 * Created by abdallah.sarayrah on 1/26/2018.
 */
class ClothesDB(context: Context) : SQLiteOpenHelper(context, "clothes.db", null,
        1) {
    override fun onCreate(db: SQLiteDatabase?) {
        db?.execSQL("create table clothes(name string, price int, image1 string, " +
                "image2 string, image3 string, image4 string)")
        db?.execSQL("insert into clothes values('jacket', '20', 'image1', 'image12', " +
                "'image13', 'image14')")
        db?.execSQL("insert into clothes values('T-Shirt', '5', 'image2', 'image22', " +
                "'image23', 'image24')")
        db?.execSQL("insert into clothes values('Clothes11', '11', 'image11', 'image112', " +
                "'image113', 'image114')")
        db?.execSQL("insert into clothes values('Clothes22', '22', 'image22', 'image112', " +
                "'image113', 'image114')")
        db?.execSQL("insert into clothes values('Clothes22', '22', 'image22', 'image112', " +
                "'image113', 'image114')")
        db?.execSQL("insert into clothes values('Clothes22', '22', 'image22', 'image112', " +
                "'image113', 'image114')")
        db?.execSQL("insert into clothes values('Clothes22', '22', 'image22', 'image112', " +
                "'image113', 'image114')")
        db?.execSQL("insert into clothes values('Clothes22', '22', 'image22', 'image112', " +
                "'image113', 'image114')")
        db?.execSQL("insert into clothes values('Clothes22', '22', 'image22', 'image112', " +
                "'image113', 'image114')")
    }

    override fun onUpgrade(db: SQLiteDatabase?, oldVersion: Int, newVersion: Int) {

    }
}