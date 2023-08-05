package com.osisupermoses.contactlistapp.di

import com.osisupermoses.contactlistapp.contacts.domain.ContactDataSource

expect class AppModule {
    val contactDataSource: ContactDataSource
}