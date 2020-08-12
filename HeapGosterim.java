public class HeapGosterim {

	public static void main(String args[]) {
		for (int y=0 ; y<100000 ;y++) {
			new String("Yer Kaplamak icin");
			new String("Yer Kaplamak icin");
			new String("Yer Kaplamak icin");
			if ( (y%10000) ==0 ) {
			    System.gc();
			}
		}
	}
}

