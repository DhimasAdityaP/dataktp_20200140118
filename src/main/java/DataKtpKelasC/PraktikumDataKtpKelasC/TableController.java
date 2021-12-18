/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DataKtpKelasC.PraktikumDataKtpKelasC;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author Dimas
 */
@Controller
public class TableController {
    @RequestMapping("/dataktp")
       //@ResponseBody
       public String getTable(Model isi){
           String result ="Data KTP";
           isi.addAttribute("dataktp", result);
           
           // DataKtp data = new DataKtp();
         ArrayList<List<String>> data = new ArrayList<>();
           data.add(0,Arrays.asList("ID","Nomer KTP","Nama","Alamat"));
           data.add(1,Arrays.asList("1","20200140118","Dimas","Yogyakarta"));
           data.add(2,Arrays.asList("2","20200140119","Dika","Surabaya"));
           data.add(3,Arrays.asList("3","20200140120","Deka","Jakarta"));
           data.add(4,Arrays.asList("4","20200140121","Diki","Malang"));
           data.add(5,Arrays.asList("5","20200140122","Dicky","Yogyakarta"));
           data.add(6,Arrays.asList("6","20200140123","Denise","Palembang"));
           data.add(7,Arrays.asList("7","20200140124","Denisa","Bandung"));
           data.add(8,Arrays.asList("8","20200140125","Dandi","Malang"));
           data.add(9,Arrays.asList("9","20200140126","Dendi","Bali"));
           data.add(10,Arrays.asList("10","20200140127","Dudung","Lombok"));
           data.add(11,Arrays.asList("11","20200140128","Dama","Bima"));
           data.add(12,Arrays.asList("12","20200140129","Dima","Sumbawa"));
           data.add(13,Arrays.asList("13","20200140130","Dina","Depok"));
           data.add(14,Arrays.asList("14","20200140131","Dinda","Tangerang"));
           data.add(15,Arrays.asList("15","20200140132","Delima","Bekasi"));
           data.add(16,Arrays.asList("16","20200140133","Delisa","Padang"));
           data.add(17,Arrays.asList("17","20200140134","Deren","Wonosobo"));
           data.add(18,Arrays.asList("18","20200140135","Dara","Kulon Progo"));
           data.add(19,Arrays.asList("19","20200140136","Defano","Bantul"));
           data.add(20,Arrays.asList("20","20200140137","Danendra","Sragen"));
           
           
           isi.addAttribute("tabel",data);
           
           return "tableviewer";
       }
}
    
