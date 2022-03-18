package com.enesakkal.retrofitkotlin.model

import com.google.gson.annotations.SerializedName

data class CryptoModel(
   // @SerializedName("currency")   //Java'da serializedname kullanmamız gerekiyordu.Bunu kullanıp değer verince, bu bir tane değer gelecek parametresi currency olacak.
    // Cektıgımız datadakı ısımle bire bir aynı olması lazım onu al ve burada currency ısımlı degıskene ata anlamına geliyor.
    //Fakat kotlin'de çektiğim datadaki isim ile burada kullandıgım degısken ısımlerını bıre bır aynı yaparsam serializedname kullanmama gerek kalmıyor.
    val currency :String,
    // @SerializedName("price")
    val price : String )
