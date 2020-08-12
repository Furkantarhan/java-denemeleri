
package tcdogrulama;

import java.util.Scanner;

public class tcDogrulama {

   public boolean kimlikDogrulama(String id){
       if (id == null){
           System.out.println("kimlik boş olamaz");
          return false;
       }
       if(id.length() !=11){
           System.out.println("fazla veya eksik rakam girildi");
       }
       char[] chars = id.toCharArray();
       int [] a= new int[11];
       
       for (int i=0; i<1; i++){
           a[i] = chars[i]-'0';
       }
       if(a[0]==0){
           
          
           System.out.println("0 ile başlama");
           
           
       }
         if(a[10]%2==1){
           System.out.println("çift bitmeli"); 
           return false;
         }
           
          
       
       
       
       if(((a[0]+a[2]+a[4]+a[6]+a[8])*7-(a[1]+a[3]+a[5]+a[7])*9)%10 !=a[9])
       if((a[0]+a[1]+a[2]+a[3]+a[4]+a[5]+a[6]+a[7]+a[8]+a[9])%10 !=a[10]){
           System.out.println("Türk vatandaşı değil");
           return false;
       }
       
       System.out.println("türkiye vatandaşısınız");
       return true;
      
   }
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        String id = s.next();
        tcDogrulama x = new tcDogrulama();
        x.kimlikDogrulama(id);
    }
    
}