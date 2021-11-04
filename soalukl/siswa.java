
package soalukl;

public class siswa {
    private int idSiswa;
    private String nama, alamat, telepon;
    boolean status;
    public siswa(int idSiswa, String nama, String alamat, String telepon, boolean status){
       this.idSiswa = idSiswa;
        this.nama = nama;
        this.alamat = alamat;
        this.telepon = telepon;
        this.status = status;
    }
     /** implementasi enkapsulasi dengan pembuatan method utk mengakses data private "idSiswa" */
    public int getIdSiswa() {
        return idSiswa;
    }

    /** implementasi enkapsulasi dengan pembuatan method utk mengakses data private "nama" */
    public String getNama() {
        return nama;
    }

    /** implementasi enkapsulasi dengan pembuatan method utk mengakses data private "alamat" */
    public String getAlamat() {
        return alamat;
    }

    /** implementasi enkapsulasi dengan pembuatan method utk mengakses data private "telepon" */
    public String getTelepon() {
        return telepon;
    }
    
    /** method untuk mengubah status peminjaman siswa */
    public void changeStatus(){
        this.status = !this.status;
    }

    /** method untuk mendapatkan status peminjaman */
    public String getStatus() {
        if (status) {
            return "Diijinkan meminjam";
        }
        else{
            return "Tidak Diijinkan meminjam";
        }
    
    }

    boolean isStatus() {
        return status; //To change body of generated methods, choose Tools | Templates.
    }
}
