/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum1.demo;

/**
 *
 * @author asus
 */
public class file2 {
   int totaljumlah;
    int Totaldisc;
    
  
    public int Total(String hargabangunan, String jumlahbangunan){
        
        int totalyl;
     
        int hargabarang = Integer.parseInt(hargabangunan);
        int jumlahbarang = Integer.parseInt(jumlahbangunan);
        
        totalyl =  hargabarang * jumlahbarang;
        totaljumlah = totalyl;
        return totalyl;
      
        
       
        
        
    }
    
    
    
    public int disc(){
        
        int totalbelanja;
         
        
        if(totaljumlah <= 10000){
            
           
  
           totalbelanja = totaljumlah-(totaljumlah * 0/100);
           Totaldisc= totalbelanja;
           return totalbelanja;
           
           
        }
        else if( totaljumlah <= 50000){
            
            
            
           totalbelanja = totaljumlah-(totaljumlah * 5/100);
           Totaldisc = totalbelanja;
           return totalbelanja;
        
        
           
        }
        else if(totaljumlah == 100000){
            
            
            
           totalbelanja = totaljumlah-(totaljumlah*10/100);
           Totaldisc = totalbelanja;
           return totalbelanja;
           
          
        }
        return 0;
    } 
      public String gtx(){
        String Disc = "";


        if(totaljumlah <= 10000){

            Disc = "0%";
            return Disc;




        }
        else if(totaljumlah > 50000  ){

            Disc = "10%";
            return Disc;



        }

        else if(totaljumlah == 100000){

            Disc = "15%";
            return Disc;

        }
        return null;

    }
}
