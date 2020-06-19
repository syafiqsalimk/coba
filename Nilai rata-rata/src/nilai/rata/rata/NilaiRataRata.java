/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nilai.rata.rata;
import com.opencsv.CSVReader;
import com.sun.org.apache.xml.internal.serializer.utils.StringToIntTable;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class NilaiRataRata {

   
    public static void main(String[] args)throws IOException,FileNotFoundException{
       
       
       
    String CSVFileName = "D:/Syafiq/nilai mahasiswa/Book1";
        
        CSVReader csvReader = new CSVReader(new FileReader(CSVFileName), ';');
        List<String[]> isi = csvReader.readAll(); //isi adalah list dari array string.

        int total =0;
        for (String[] record : isi) {
            System.out.println("Name : " + record[0]);
            System.out.println("Nilai : " + record[1]);
            System.out.println("---------------------------");
       
            total = total + Integer.parseInt(record[1]);
        }
        System.out.println("total : " + total +"\n");
        System.out.println("Rata-rata = " + total/isi.size());
    }
}
