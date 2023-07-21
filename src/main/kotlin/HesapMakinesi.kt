
    fun main(){
        val sonuc = hesapMakinesi(1, 8, 4)
        val sonucDouble = hesapMakinesi(2, 8.45, 8.12)
        val sonucFloat = hesapMakinesi(1, 23.0f, 12.1f)
        println("sonuc: $sonuc")
        println("sonuc: $sonucDouble")
        println("sonuc: $sonucFloat")
    }

    fun hesapMakinesi(secenek: Int, vararg sayilar: Int): Number {
        return when (secenek) {
            1 -> toplama(*sayilar)
            2 -> carp(*sayilar)
            3 -> cikarma(*sayilar)
            4 -> bolme(*sayilar)
            else -> {
                print("işlem geçersiz")
                0
            }
        }

    }

    fun hesapMakinesi(secenek: Int, vararg sayilar: Double): Number {
        return when (secenek) {
            1 -> toplama(*sayilar)
            2 -> carp(*sayilar)
            3 -> cikarma(*sayilar)
            4 -> bolme(*sayilar)
            else -> {
                print("işlem geçersiz")
                0
            }
        }

    }

    fun hesapMakinesi(secenek: Int, vararg sayilar: Float): Number {
        return when (secenek) {
            1 -> toplama(*sayilar)
            2 -> carp(*sayilar)
            3 -> cikarma(*sayilar)
            4 -> bolme(*sayilar)
            else -> {
                print("işlem geçersiz")
                0
            }
        }

    }


    fun toplama(vararg sayilar: Int): Number {

        var toplam = 0
        sayilar.forEach { sayi ->
            toplam = toplam + sayi
        }
        return toplam

    }

    fun toplama(vararg sayilar: Double): Number {
        var toplam = 0.0
        sayilar.forEach { sayi ->
            toplam = toplam + sayi
        }
        return toplam
    }

    fun toplama(vararg sayilar: Float): Number {
        var toplam = 0.0f
        sayilar.forEach { sayi ->
            toplam = toplam + sayi
        }
        return toplam
    }

    fun carp(vararg sayilar: Int): Number {
        var carpim = 1
        sayilar.forEach { sayi ->
            carpim = carpim * sayi
        }
        return carpim
    }

    fun carp(vararg sayilar: Double): Number {
        var carpim = 1.0
        sayilar.forEach { sayi ->
            carpim = carpim * sayi
        }
        return carpim
    }

    fun carp(vararg sayilar: Float): Number {
        var carpim = 1.0f
        sayilar.forEach { sayi ->
            carpim = carpim * sayi
        }
        return carpim
    }


    fun cikarma(vararg sayilar: Int): Number {
        var cikar = sayilar[0]
        sayilar.drop(1).forEach { sayi ->
            cikar = cikar - sayi
        }
        return cikar
    }

    fun cikarma(vararg sayilar: Double): Number {
        var cikar = sayilar[0]
        sayilar.drop(1).forEach { sayi ->
            cikar = cikar - sayi
        }
        return cikar
    }

    fun cikarma(vararg sayilar: Float): Number {
        var cikar = sayilar[0]
        sayilar.drop(1).forEach { sayi ->
            cikar = cikar - sayi
        }
        return cikar
    }

    fun bolme(vararg sayilar: Int): Number {

        var bol = sayilar[0]
        sayilar.drop(1).forEach { sayi ->
            bol = bol / sayi
        }
        return bol
    }

    fun bolme(vararg sayilar: Double): Number {

        var bol = sayilar[0]
        sayilar.drop(1).forEach { sayi ->
            bol = bol / sayi
        }
        return bol
    }

    fun bolme(vararg sayilar: Float): Number {

        var bol = sayilar[0]
        sayilar.drop(1).forEach { sayi ->
            bol = bol / sayi
        }
        return bol
    }

