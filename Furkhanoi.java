package furkhanoi;

import java.util.Scanner;


public class Furkhanoi {

    static int sayac=1;
  

public static void main(String[] args) {
  int secim;
 
  
  System.out.println("Secim yapiniz (1) veya (2) ye basiniz\n"+"Olayın perde arkası için yani taşıma işlemi için (1)i, hikayesini okumak için lütfen (2)ye basınız");
  Scanner oku = new Scanner(System.in);
  secim=oku.nextInt();
  System.out.println("Taşıma işlemi için '1' ");
  
  System.out.println("Secim yapiniz (1) veya (2) ye basiniz\n"+"Olayın perde arkası için (1)i hikayesini okumak için lütfen (2)ye basınız");
  switch(secim){
     case 1:System.out.println("Taşıma işlemi başlıyooor");
     basla(5,"A","B","C");
     break;
     case 2 : System.out.println("Hikaye soyle gecmektedir"+
"zamanın birinde öğretmenin bir tanesi " +
"sınıfta şu soruyu sorar: önümüzde 3 tane " +
"çubuk bulunmaktadır ve bir tanesinde sırasıyla" +
" 5 farklı blok vardır nasıl bir işlem uygulayarak " +
"1. çubuktan 3. çubuğa aktarabilriz" +
"öğrencilerden bir tanesi çıkıp der ki " +
"hocam 1. bloktakileri küçükten büyüğe 2. " +
"çubuğa aktarırız ardından ise 3.çubuğun üstüne " +
"annemin yaptığı perdeli pilav gibi kapatırız der" +
" hoca da bu cevaba bayılır ve aranızdan kim bu işlemi " +
"basitçe koda dönüştürürse benim tarafımdan sınav notuyla " +
"mukafatlandırılacaktır der ve aynı çocuk düşündüğünü bildiği kadarıylakoda döker ve"+
" ortaya böyle bir olay sarması" +
" cıkar ");break;
         
     default :   System.out.println("Program sonlanıyor.. ! ");
     
  }
}
  public static void basla(int n, String basla, String gecici, String son){
if (n==1){
    System.out.println(sayac+" . "+basla+" to "+son);
            sayac++;
}    
else{
    basla(n-1,basla,son,gecici);
    System.out.println(sayac+" . "+basla+" to "+son);
    sayac++;
     basla(n-1,gecici,basla,son);
}
}  
}