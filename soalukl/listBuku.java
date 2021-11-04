
package soalukl;


public class listBuku {
     //pemeberian nilai pada array "listBuku" dengan tipe class Buku
    buku[] listBuku = {
        new buku(1, "Fisika", 45),
        new buku(2, "Bahasa", 61),
        new buku(3, "Sosial", 16),
        new buku(4, "Pemrograman Web", 27),
    };
    
    //method untuk menampilkan data list buku
    public void viewBuku(){
        System.out.println("--- List Buku ---");
        System.out.println("ID \t Judul \t\t Stok");
        for (int i = 0; i < listBuku.length; i++) {
            System.out.println(listBuku[i].getIdBuku() + " \t " +
                    listBuku[i].getJudulBuku() + " \t\t " +
                    listBuku[i].getStok());
        }
    }
    
    public int cariBuku(int id){
        int found = 0;
        //pencarian data berdasarkan id
        for (int i = 0; i < listBuku.length; i++) {
            if (listBuku[i].getIdBuku()== id) {
                found = i; 
                //menyimpan nilai index dari data yg ditemukan
            }
        }
        return found;        
    }

    
    
}


