package com.osisupermoses.contactlistapp.di

import android.content.Context
import com.osisupermoses.contactlistapp.contacts.data.SqlDelightContactDataSource
import com.osisupermoses.contactlistapp.contacts.domain.ContactDataSource
import com.osisupermoses.contactlistapp.core.data.DatabaseDriverFactory
import com.osisupermoses.contactlistapp.database.ContactDatabase

actual class AppModule(
    private val context: Context
) {
    actual val contactDataSource: ContactDataSource by lazy {
        SqlDelightContactDataSource(
            db = ContactDatabase(
                driver = DatabaseDriverFactory(context).create()
            )
        )
    }
}