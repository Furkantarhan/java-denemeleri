
package xmodel;



    class televizyon{
        public void sesAc(){
            System.out.println(" televizyonun sesAc()");
        }
        public void sesKapa(){
            System.out.println(" televizyon sesKapa()");
        }
        public void kanalDegistir(){
            System.out.println(" televizyon kanalDegistir()");
        }
        
    }
    class bilgisayar extends televizyon {
        public void sesAc(){
            System.out.println("bilgisayarın  sesAc()");
        }
        public void sesKapa(){
            System.out.println("bilgisayarın televizyonun sesKapa()");
        }
        public void kanalDegistir() {
            System.out.println("bilgisayarın kanalDegistir()");
        }
        public void netflix(){
            System.out.println("bilgisayarın netflix()");
        }
    }

     public class Xmodel {
    
    public static void main(String[] args) {
        televizyon x=new bilgisayar ();
        x.sesAc();
        x.sesKapa();
        x.kanalDegistir();
        
    }
    
   }
