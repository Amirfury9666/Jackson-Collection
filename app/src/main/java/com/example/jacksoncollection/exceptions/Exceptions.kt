package com.example.jacksoncollection.exceptions

import java.io.IOException


/***
 * Created By Amir Fury on April 6 2021
 *
 * Email: Fury.amir93@gmail.com
 * */

class ApiException(message : String) : IOException(message)

class NoInternetException(message: String) : IOException(message)