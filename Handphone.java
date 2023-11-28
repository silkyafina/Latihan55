package pkg22166017.pbo.lat55;

/**
 *
 * Nama : Silky Afina Saly 
 * NIM : 22166017 
 * Mata Kuliah : Pemrograman Berorientasi Objek 1 
 * Program Studi: Sistem Informasi 
 * Semester : 3
 */
// membuat super class handphone
public class Handphone {
// deklarasi variabel
    private String manufacture;
    private String operatingSystem;
    private String model;
    private int harga;
// konstruktor
    public Handphone(String manufacture, String operatingSystem, String model, int harga) {
        this.manufacture = manufacture;
        this.operatingSystem = operatingSystem;
        this.model = model;
        this.harga = harga;
    }
// metode untuk memanggil display pada produk
    public void displayProduk(){
        System.out.println("Manufaktur: "+manufacture);
        System.out.println("OS: "+operatingSystem);
        System.out.println("Model: "+model);
        System.out.println("Harga: "+harga);        
    }
}
// sub class kelas android, turunan dari kelas handphone
class Android extends Handphone {
    private String keyStore;
    
// konstruktor
    public Android(String manufacture, String operatingSystem, String model, int harga, String keyStore) {
        super(manufacture, operatingSystem, model, harga);
        this.keyStore = keyStore;
    }
// metode getter dan setter
    public String getKeyStore(){
        return keyStore;
    }
    public void setKeyStore(String keyStore){
        this.keyStore = keyStore;
    }
}
// sub class blackberry
class Blackberry extends Handphone {
    private String pinBB;

// konstruktor 
    public Blackberry(String manufacture, String operatingSystem, String model, int harga, String pinBB) {
        super(manufacture, operatingSystem, model, harga);
        this.pinBB = pinBB;
        
// metode getter dan setter
    }
    public String getPinBB(){
        return pinBB;
    }
    public void setPinBB(String pinBB){
        this.pinBB = pinBB;
    }

}
// sub class windows phone
class WindowsPhone extends Handphone {
    private String wpKeyStore;

// konstruktor
    public WindowsPhone(String manufacture, String operatingSystem, String model, int harga, String wpKeyStore) {
        super(manufacture, operatingSystem , model, harga);
        this.wpKeyStore = wpKeyStore;
    }
// metode getter dan setter
    public String getWpKeyStore(){
        return wpKeyStore;
    }
    public void setWpKeyStore(String WpKeyStore){
        this.wpKeyStore = wpKeyStore;
    }
    public static void main(String[] args) {
       Android android = new Android("Samsung","Android", "Grand", 3000000, "234ibfd3840fo");
       android.displayProduk();
       System.out.println("Android key store: "+android.getKeyStore());
       System.out.println("");
       Blackberry blackberry = new Blackberry("BlackB","RIM","Curve", 2000000, "BHS 249");
       blackberry.displayProduk();
       System.out.println("Pin BB: "+blackberry.getPinBB());
        System.out.println("");
       WindowsPhone windows = new WindowsPhone("Nokia", "Wins", "Lumia", 1000000, "UUUQIWRJ");
       windows.displayProduk();
       System.out.println("Wp key store : "+windows.getWpKeyStore());
    }
}
