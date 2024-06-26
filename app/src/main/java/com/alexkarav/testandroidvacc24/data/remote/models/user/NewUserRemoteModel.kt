package com.alexkarav.testandroidvacc24.data.remote.models.user


import com.alexkarav.testandroidvacc24.data.remote.models.user.Address
import com.alexkarav.testandroidvacc24.data.remote.models.user.Name
import com.google.gson.annotations.SerializedName

data class NewUserRemoteModel(
    @SerializedName("address")
    val address: Address,
    @SerializedName("email")
    val email: String,
    @SerializedName("name")
    val name: Name,
    @SerializedName("password")
    val password: String,
    @SerializedName("phone")
    val phone: String,
    @SerializedName("username")
    val username: String
)