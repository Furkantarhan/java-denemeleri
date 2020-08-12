
package polimorfin;

public class PoliMorfin {
    abstract class Cizim{
        public abstract void noktaCiz(int x,int y);
        public void cizgiCiz(int x1,int y1,int x2,int y2){
            noktaCiz(x1,y1);
        }
    }
    class CepTelefonuCizim extends Cizim{
        public void noktaCiz(int x,int y){
            
    }
    }
    class MonitorCizim extends Cizim{
        public void noktaCiz(int x,int y){
          
        }
    }
        public class CizimProgrami{
            public void baslat (int x1,int y1,int x2,int y2){
                Cizim c1=new CepTelefonuCizim();
                c1.cizgiCiz(x1, y1, x2, y2);
                  System.out.println("Monitora çizgi çizildi");
                Cizim c2= new MonitorCizim();
                c2.cizgiCiz(x1, y1, x2, y2);
                  System.out.println("Monitora çizgi çizildi");
            }
        }
    
    

  
    public static void main(String[] args) {
        
    }
    
}
