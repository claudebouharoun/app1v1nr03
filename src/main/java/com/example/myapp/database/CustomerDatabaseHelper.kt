
package com.example.myapp.database

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper

class CustomerDatabaseHelper(context: Context) : SQLiteOpenHelper(context, DATABASE_NAME, null, DATABASE_VERSION) {

    override fun onCreate(db: SQLiteDatabase?) {
        val createCustomerTable = "CREATE TABLE $TABLE_CUSTOMERS (" +
                "$COLUMN_ID INTEGER PRIMARY KEY AUTOINCREMENT, " +
                "$COLUMN_NAME TEXT, " +
                "$COLUMN_PHONE TEXT, " +
                "$COLUMN_ADDRESS TEXT, " +
                "$COLUMN_HEIGHT REAL, " +
                "$COLUMN_WAIST REAL, " +
                "$COLUMN_CHEST REAL)"
        db?.execSQL(createCustomerTable)
    }

    override fun onUpgrade(db: SQLiteDatabase?, oldVersion: Int, newVersion: Int) {
        db?.execSQL("DROP TABLE IF EXISTS $TABLE_CUSTOMERS")
        onCreate(db)
    }

    companion object {
        const val DATABASE_NAME = "customers.db"
        const val DATABASE_VERSION = 1
        const val TABLE_CUSTOMERS = "customers"
        const val COLUMN_ID = "id"
        const val COLUMN_NAME = "name"
        const val COLUMN_PHONE = "phone"
        const val COLUMN_ADDRESS = "address"
        const val COLUMN_HEIGHT = "height"
        const val COLUMN_WAIST = "waist"
        const val COLUMN_CHEST = "chest"
    }
}
