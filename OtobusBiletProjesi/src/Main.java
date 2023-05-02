public class Main {
    public static void main(String[] args) {
        YolcuDatabase yolcuDatabase = new YolcuDatabase();
        YolcuManager yolcuManager= new YolcuManager("Mustafa ÇİL", "22849380860","Erkek", 19,2,true,4);
        OtobusDatabase otobusDatabase = new OtobusDatabase();
        OtobusManager otobusManager = new OtobusManager();
        BiletSatis biletSatis = new BiletSatis(yolcuDatabase, otobusDatabase, yolcuManager, otobusManager);

        biletSatis.biletAl();





    }
}