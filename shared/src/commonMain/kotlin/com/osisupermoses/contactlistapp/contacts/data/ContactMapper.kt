package com.osisupermoses.contactlistapp.contacts.data

import com.osisupermoses.contactlistapp.contacts.domain.Contact
import database.ContactEntity

fun ContactEntity.toContact(): Contact {
    return Contact(
        id = id,
        firstName = firstName,
        lastName = lastName,
        email = email,
        phoneNumber = phoneNumber,
        photoBytes = null // TODO: Get the image
    )
}