package com.example.lksqu.model

class User {

    private var username: String = ""
    private var fullname: String = ""
    private var email: String = ""
    private var status: String = ""
    private var image: String = ""
    private var imageurl: String = ""
    private var adress: String = ""
    private var uid: String = ""
    private var number: Int = 0




    constructor()
    constructor(username: String, email: String, status: String, image: String, uid: String,number:Int,adress: String,fullname: String) {
        this.username = username
        this.email = email
        this.status = status
        this.image = image
        this.uid = uid
        this.fullname = fullname
        this.adress = adress
    }


    fun getUsername() : String{
        return username
    }

    fun setUsername(username : String) {
        this.username = username
    }

    fun getFulname() : String{
        return fullname
    }

    fun setFullname(fullname : String) {
        this.fullname = fullname
    }

    fun getEmail() : String{
        return email
    }

    fun setEmail(email: String){
        this.email = email
    }

    fun getImage() : String{
        return image
    }

    fun setImage(image: String){
        this.image = image
    }

    fun getStatus() : String{
        return status
    }

    fun setBio(status: String){
        this.status = status
    }

    fun getUID() : String{
        return uid
    }

    fun setUID(uid: String){
        this.uid = uid
    }

    fun getNumber() : Int{
        return number
    }

    fun setNumber(number : Int) {
        this.number = number
    }


    fun getImageUrl() : String{
        return imageurl
    }

    fun setImageUrl(imageurl : String) {
        this.imageurl = imageurl
    }

    fun getAdress() : String{
        return adress
    }

    fun setAdress(adress: String) {
        this.adress = adress
    }




}