
package tcnotest;
    import java.util.Scanner;

public class TcnoTest {
    public boolean test(String tcno){
        if(tcno==null){
            System.out.println("Tc kimlik numranız boş olamaz.");
            return false;
        }
        if(tcno.length()!=11){
            System.out.println("Fazla veya Eksik hane girdiniz. tekrar deneyiniz.");
            return false;
        }
        char [] chars=tcno.toCharArray();
        int []a=new int[11];
        
        for(int i =0;i<11;i++){
            a[i]=chars[i]-'0';
        }
        if(a[0]==0){
            System.out.println("Tc kimlik numaranız 0 ile başlayamaz");
            return false;
        }
        if(a[10]%2==1){
            System.out.println("tc kimliğiniz son hanesi asla tek sayı ile bitemez");
            return false;
        }
        if(((a[0]+a[2]+a[4]+a[6]+a[8])*7-(a[1]+a[3]+a[5]+a[7])*9)%10 !=a[9])
        if((a[0]+a[1]+a[2]+a[3]+a[4]+a[5]+a[6]+a[7]+a[8]+a[9])%10 !=a[10]){
           System.out.println("Türk vatandaşı değil");
        
        }
        System.out.println("Tebrikler TÜrksünüz");
        return false;
        
    }
        
    public static void main(String[] args) {
       Scanner s=new Scanner(System.in);
       String tcno=s.next();
       TcnoTest x=new TcnoTest();
       x.test(tcno);
       
    }
    

}
