public class YolcuManager extends YolcuDatabase{
    public YolcuManager(String yolcuAdSoyad, String yolcuTcKimlik, String yolcuCinsiyet, int yolcuYas, int yolcuKoltukSayisi, boolean yolcuEkBagajVarMi, int yolcuEkbagajSayisi) {
        yolcu_AdSoyad= yolcuAdSoyad;
        yolcu_TcKimlik= yolcuTcKimlik;
        yolcu_Cinsiyet= yolcuCinsiyet;
        yolcu_Yas= yolcuYas;
        yolcu_KoltukSayisi= yolcuKoltukSayisi;
        yolcu_EkBagajVarMi = yolcuEkBagajVarMi;
        yolcu_EkbagajSayisi = yolcuEkbagajSayisi;
        System.out.println("------------------------------------");
        System.out.println("YOLCU AD-SOYAD : "+ yolcu_AdSoyad);
        System.out.println("YOLCU TC KİMLİK NO: "+ yolcu_TcKimlik);
        System.out.println("YOLCU CİNSİYET: "+ yolcu_Cinsiyet);
        System.out.println("YOLCU YAŞ: "+ yolcu_Yas);
        System.out.println("YOLCU KOLTUK SAYISI: "+ yolcu_KoltukSayisi);
        System.out.println("YOLCU EK BAGAJ VAR MI? : "+ yolcu_EkBagajVarMi);
        System.out.println("YOLCU EK BAGAJ SAYISI: "+ yolcu_EkbagajSayisi);
        System.out.println("------------------------------------");

    }

    }

