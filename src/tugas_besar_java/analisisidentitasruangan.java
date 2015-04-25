
package tugas_besar_java;

import java.util.*;

public class analisisidentitasruangan {

ruangan obj =new ruangan();
    
    public void insertdatabuku() {
        Scanner one=new Scanner(System.in);
   
        System.out.println("kunci pintu : 0 atau 1  (ada = 1 tidak ada = 0) ");
       obj.setKunci_pintu(one.nextInt());
        System.out.println("intensitas kebahayaan : 0 atau 1 (bahaya = 0 aman =1) ");
       obj.setBahaya(one.nextInt());
        System.out.println("masukkan jumlah jendela : 0 atau 1 (tidak ada = 0 ada = 1 ");
        obj.setJendela(one.nextInt());
        
        
    }
    public void cetakdatabuku(){
        
        System.out.println("Judul : "+obj.getKunci_pintu());
        System.out.println("Penulis : "+obj.getBahaya());
        System.out.println("Jumlah Halaman : "+obj.getJendela()+"\n");
    }
void analisiskuncipintu(){
         if(obj.getKunci_pintu()==1)
     {System.out.println("sesuai"); 
             }
     else if(obj.getKunci_pintu()==0){
         System.out.println("tidak sesuai");
     }
     else{System.out.println("masukkan yang sesuai aturan!!");
     }
     }
void bahaya(){
    if(obj.getBahaya()==1){
        System.out.println("sesuai");
    }
    else if(obj.getBahaya()==0)
    {
        System.out.println("tidak sesuai");
    }
    else{System.out.println("masukkan yang sesuai aturan!!");}


   
}
void jendela(){
    if(obj.getJendela()==1){
        System.out.println("sesuai");
    }
    else if(obj.getJendela()==0){
        System.out.println("tidak sesuai");
    }
    else{System.out.println("masukkan yang sesuai aturan!!");}

}

}