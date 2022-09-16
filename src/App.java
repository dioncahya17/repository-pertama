// membuat class sebagai template
class Mahasiswa{
    String nama;
    String NIM;

    // constructor
    Mahasiswa(String nama, String NIM){
        this.nama = nama;
        this.NIM = NIM;
    }

    // method tanpa return dan tanpa parameter
    void show(){
        System.out.println("Nama : " + this.nama);
        System.out.println("NIM  : " + this.NIM);
    }

    // method tanpa return dan dengan parameter
    void setNama(String nama){
        this.nama = nama;
    }

    // method dengan return tanpa parameter
    String getNama(){
        return this.nama;
    }
    String getNIM(){
        return this.NIM;
    }

    // method dengan return dan parameter
    String konfirm(String pesan){
        return pesan + this.nama +"! NIM Anda adalah : " + this.NIM;
    }
}


public class App {
    public static void main(String[] args) throws Exception {
        Mahasiswa mahasiswa1 = new Mahasiswa("dion","123456");
        mahasiswa1.show();
        mahasiswa1.setNama("jojo");
        mahasiswa1.show();
        System.out.println("===========");
        System.out.println(mahasiswa1.getNama());
        System.out.println(mahasiswa1.getNIM());

        String data = mahasiswa1.konfirm("Hi, ");
        System.out.println(data);
    }

    
}
