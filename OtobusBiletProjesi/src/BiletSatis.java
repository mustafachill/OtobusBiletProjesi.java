public class BiletSatis {

    private YolcuManager yolcuManager;
    private YolcuDatabase yolcuDatabase;
    private OtobusDatabase otobusDatabase;
    private OtobusManager otobusManager;

    public BiletSatis(YolcuDatabase yolcuDatabase, OtobusDatabase otobusDatabase, YolcuManager yolcuManager, OtobusManager otobusManager) {
        this.yolcuDatabase = yolcuDatabase;
        this.otobusDatabase = otobusDatabase;
        this.yolcuManager = yolcuManager;
        this.otobusManager = otobusManager;
        System.out.println("Bilet satış işlemi başlatılıyor...");
    }

    public void biletAl() {
        double islemTutari;
        int kalanKoltuk;
        if (yolcuManager.yolcu_EkBagajVarMi == true) {
            islemTutari = yolcuManager.yolcu_KoltukSayisi * otobusDatabase.otobus_BiletFiyati + otobusDatabase.otobus_EkBagajFiyati * yolcuManager.yolcu_EkbagajSayisi;
            kalanKoltuk = otobusDatabase.otobus_KoltukSayisi - yolcuManager.yolcu_KoltukSayisi;
            System.out.println("Kalan koltuk sayısı: "+kalanKoltuk);
            System.out.println("Toplam ücret: " + islemTutari);
            System.out.println("------------------------------------");
            System.out.println("Satın alım başarılı!");
        } else {
            islemTutari = yolcuManager.yolcu_KoltukSayisi * otobusDatabase.otobus_BiletFiyati;
            kalanKoltuk = otobusDatabase.otobus_KoltukSayisi - yolcuManager.yolcu_KoltukSayisi;
            System.out.println("Kalan koltuk sayısı: "+kalanKoltuk);
            System.out.println("Toplam ücret: " + islemTutari);
            System.out.println("------------------------------------");
            System.out.println("Satın alım başarılı!");
        }
    }
    public int KoltukGuncelle(){
        return otobusDatabase.otobus_KoltukSayisi- yolcuManager.yolcu_KoltukSayisi;
    }
}
