/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum1.demo;

import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author asus
 */
@Controller
public class praktikum1 {
 @RequestMapping ("/ctrl")
     
    
    public String harga(HttpServletRequest data, Model barangbangunan){
    
        
        String bangunan = data.getParameter("nama ");
        String Harga = data.getParameter("harga ");
        String jumlah = data.getParameter("jumlah ");
     
        
        
        file2 agoy = new file2();
        
        
         int totalbarang = agoy.Total(Harga, jumlah);
         int totaldisc = agoy.disc();
         
        
         
        
        barangbangunan.addAttribute("bangunan", bangunan);
        barangbangunan.addAttribute("harga", Harga);
        barangbangunan.addAttribute("jumlah", jumlah);
        barangbangunan.addAttribute("totalbarang",totaldisc);
        barangbangunan.addAttribute("disc",agoy.gtx());
        
       
        return "view";
    }
    
    
}   