package tw.work;

public class Work99 {

    public static void main(String[] args) {
    	final int ROWS = 2;
    	final int COLS = 4;
    	final int START = 1;
    		
    	
    		// -------------------
        for (int k = 0; k < ROWS ; k++) {
            for (int j = 1; j <= 9; j++) {
                for (int i = START; i <START+COLS; i++) {
                    int newi = i + k * COLS; 
                    int r = newi * j;
                    System.out.printf("%d x %d = %2d\t", newi, j, r);
                }
                System.out.println();
            }
            System.out.println("----------------------------------------------------------");
        }
    }
}
