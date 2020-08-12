
package furhazine;


public class Furhazine {
      //     "1"ler AĞIRLIK        -       "2"ler  FİYAT    //
        
      static  double Sabun1=0.25;
      static    double Kitap1=3;
      static      double Deterjan1=5;
      static     double Cikolata1=1.25;
      static     double Dondurma1=1;
      static     double Dondurma2=2;
      static     double Deterjan2=1;
      static     double Sabun2=0.25;
      static     double Kitap2=5;
      static     double Cikolata2=0.75;
      static     double Canta=20;
      static     double  kaçsabun;
      static    double kaçkitap;
      static    double  kaçciko;
      static    double kaçdeter;
      static    double kaçdondurma;

        public static void main(String[] args) {

        kaçsabun=(Canta/Sabun1*Sabun2);
            System.out.println("bir valize"+kaçsabun+"kadar sabun sığar");
     
       kaçkitap=  (Canta/Kitap1*Kitap2);
       System.out.println("bir valize"+kaçkitap+"kadar sabun sığar");
       
       kaçciko= (Canta/Cikolata1*Cikolata2);
 
       kaçdeter =(Canta/Deterjan1*Deterjan2);
       
       kaçdondurma= (Canta/Dondurma1*Dondurma2);    
       
       System.out.println(kaçdondurma+"  "+kaçciko+"  "+kaçdeter+"  "+kaçkitap+"  "+kaçsabun);
        System.out.println("Dondurmanın değeri en fazla çıkar");
    
        }
    
}