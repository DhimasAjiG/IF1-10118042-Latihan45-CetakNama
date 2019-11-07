
package if1.pkg10118042.latihan45.cetaknama;


public class Printer {
private int jmlCetak;
    private String nama;


    public int getJmlCetak() {
        return jmlCetak;
    }

    public void setJmlCetak(int jmlCetak) {
        this.jmlCetak = jmlCetak;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
    
    public void cetak(String nama){
        

        
        System.out.println("Nama Anda : "+nama);
        
    }
    
    public void cetak(int jmlCetak, String nama){
        int i = 1;
        while(i<=jmlCetak){
            
            System.out.println(i+". "+nama);
            
            i++;
        }   
    }
    
}
