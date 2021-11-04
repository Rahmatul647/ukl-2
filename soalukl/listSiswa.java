
package soalukl;



public class listSiswa {
    //pemeberian nilai pada array "listSiswa" dengan tipe class Siswa
    siswa[] listSiswa = {
        new siswa(1, "Yoongi", "Malang", "0001", true),
        new siswa(2, "Felix", "Malang", "0002", false
        ),
        new siswa(3, "Taehyung", "Malang", "0003", true),
    };
    
    //method untuk menampilkan data list siswa
    public void viewSiswa(){
        System.out.println("--- List Siswa ---");
        System.out.println("ID \t Nama \t\t Alamat \t\t Status");
        for (int i = 0; i < listSiswa.length; i++) {
            System.out.println(listSiswa[i].getIdSiswa() +" \t "+
                    listSiswa[i].getNama()+" \t\t "+
                    listSiswa[i].getAlamat() +" \t\t "+
                    listSiswa[i].getStatus());
        }
    }
    
    public int cariSiswa(int id){
        int found = 0;
        //pencarian data berdasarkan id
        for (int i = 0; i < listSiswa.length; i++) {
            if (listSiswa[i].getIdSiswa() == id) {
                found = i; 
                //menyimpan nilai index dari data yg ditemukan
            }
        }
        return found;
    }

   
}
