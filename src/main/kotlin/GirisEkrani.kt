
val kayitliKullaniciAdi = "aleyna.berfe"
val kayitliKullaniciSifre = 1234

fun main(){



    println("-----------[HOSGELDINIZ EKRANI]-----------")
    println("Yapmak istediğiniz işlemi seçiniz..")
    println("Giriş: 1   Kayıt: 2 ")
    val secim = readln().toInt()

    when(secim){
        1->giris()
        2->kayit()
        else -> {
            println("Yanlış tuşlama yaptınız")
            0
        }
    }
}

fun kayit(){

    println("--------------[KAYIT EKRANİ]-------------")
    print("Kullanici adi belirleyiniz: ")
    var kullaniciAdi = readln()
    print("Şifre belirleyiniz: ")
    var sifre = readln()
    print("Kayıt başarıyla oluşturuldu. $kullaniciAdi Giriş ekranına yönlendiriliyorsunuz. ")

}

fun giris(){

    println("-----------------[GİRİŞ EKRANI]--------------")

    var girisBasarili = false

    while (!girisBasarili){
        print("Kullanıcı adı: ")
        var kullaniciAdi = readln()
        print("Şifre: ")
        var sifre= readln().toInt()




        if (kullaniciAdi == kayitliKullaniciAdi && sifre == kayitliKullaniciSifre ){
            println("Giriş Başarıldı anasayfaya yönlendiriliyor ")
            println("----------[ANASAYFA]---------------")
            girisBasarili = true
        }
        else{

            if (kullaniciAdi != kayitliKullaniciAdi && sifre != kayitliKullaniciSifre){
                println("Böyle bir kullanıcı bulunamadı")
            }
            else if (kullaniciAdi != kayitliKullaniciAdi){
                println("Yanlış Kullanıcı adı ")
            }
            else{
                println("Şifre yanlış")
            }
        }

    }


}