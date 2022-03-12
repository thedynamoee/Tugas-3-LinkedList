import java.util.LinkedList;

public class daffa {
    public static void main(String[] args) throws Exception {
        System.out.println("====== TUGAS 3 : LINKED LIST ======");
        System.out.println(" Nama\t: Daffa Abdillah ");
        System.out.println(" NIM\t: 2111521001 ");
        System.out.println("===================================\n");
        
        //LinkedList
        LinkedList<String> nama = new LinkedList<>();
        LinkedList<String> nim = new LinkedList<>();
        LinkedList<String> alamat = new LinkedList<>();

        nama.add("Daffa Abdillah");
        nim.add("2111521001");
        alamat.add("Padang Panjang");
        System.out.println("Nama Mahasiswa\t: " + nama);
        System.out.println("NIM Mahasiswa\t: " + nim);
        System.out.println("Alamat Mahasiswa: " + alamat + "\n");

        //Fungsi Add
        System.out.println("1. Menambah Data Mahasiswa");
        nama.addFirst("Fajri");
        nama.add("Lisa");

        nim.addFirst("2111522001");
        nim.add("2111524001");

        alamat.addFirst("Jakarta");
        alamat.add("Bandung");

        System.out.println("Nama Mahasiswa\t: " + nama);
        System.out.println("NIM Mahasiswa\t: " + nim);
        System.out.println("Alamat Mahasiswa: " + alamat + "\n");

        //Fungsi Set
        System.out.println("2. Menyisipkan Data Mahasiswa");
        nama.set(1, "Kim");
        nim.set(1, "2011521001");
        alamat.set(1, "Bali");

        System.out.println("Nama Mahasiswa\t: " + nama);
        System.out.println("NIM Mahasiswa\t: " + nim);
        System.out.println("Alamat Mahasiswa: " + alamat + "\n");

        //Fungsi Remove
        System.out.println("3. Menghapus Data Mahasiswa");
        nama.remove(0);
        nim.remove(0);
        alamat.remove(0);

        System.out.println("Nama Mahasiswa\t: " + nama);
        System.out.println("NIM Mahasiswa\t: " + nim);
        System.out.println("Alamat Mahasiswa: " + alamat + "\n");

        //Fungsi Push
        System.out.println("4. Memasukkan (Push) Data Mahasiswa");
        nama.push("New");
        nim.push("2111125014");
        alamat.push("Padang");

        System.out.println("Nama Mahasiswa\t: " + nama);
        System.out.println("NIM Mahasiswa\t: " + nim);
        System.out.println("Alamat Mahasiswa: " + alamat + "\n");

        //Fungsi Pop
        System.out.println("5. Mengeluarkan (Pop) Data Mahasiswa");
        nama.pop();
        nama.pop();
        nim.pop();
        nim.pop();
        alamat.pop();
        alamat.pop();

        System.out.println("Nama Mahasiswa\t: " + nama);
        System.out.println("NIM Mahasiswa\t: " + nim);
        System.out.println("Alamat Mahasiswa: " + alamat + "\n");

        //Fungsi isEmpty()
        System.out.println("6. Mengecek Data Mahasiswa");
        System.out.println("Apakah data Nama kosong? "+nama.isEmpty());
        System.out.println("Apakah data NIM kosong?\t"+nim.isEmpty());
        System.out.println("Apakah data Alamat kosong? "+alamat.isEmpty());

    }
}   