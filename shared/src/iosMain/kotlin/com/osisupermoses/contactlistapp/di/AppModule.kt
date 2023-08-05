package com.osisupermoses.contactlistapp.di

import com.osisupermoses.contactlistapp.contacts.data.SqlDelightContactDataSource
import com.osisupermoses.contactlistapp.contacts.domain.ContactDataSource
import com.osisupermoses.contactlistapp.core.data.DatabaseDriverFactory
import com.osisupermoses.contactlistapp.database.ContactDatabase

actual class AppModule {
    actual val contactDataSource: ContactDataSource by lazy {
        SqlDelightContactDataSource(
            db = ContactDatabase(
                driver = DatabaseDriverFactory().create()
            )
        )
    }
}