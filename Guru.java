//Object Class
public class Guru {
    //variabel
    private int nip;
    private String nama, mapel, status;

    
    //Constructor Parameter
    public Guru(int i, String n, String m, String l) {
        nip = i;
        nama = n;
        mapel = m;
        status = l;


    }

    //Getter
    //Setter
    //Method
    public void print() {
        System.out.println("NIP : " + nip);
        System.out.println("Nama : " + nama);
        System.out.println("Mapel : " + mapel);
        System.out.println("Status : " + status);
    }
}