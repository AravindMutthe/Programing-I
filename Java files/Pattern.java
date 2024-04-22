public class Pattern {
    public static void main(String[] args) {
        firstpattern(5);
        System.out.println();
        secondpattern(5);
        System.out.println();
        thirdpattern(5);
    }
    public static void firstpattern(int n){
        int i,j;
        for (i = 1; i<=n; i++){
            for(j =1; j<=i ;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void secondpattern(int n){
        int i,j;
        for (i = 1; i<=n; i++){
            for(j =1; j<=n ;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void thirdpattern(int n){
        int i,j;
        for (i = 1; i<=n; i++){
            for(j =1; j<=n-i+1 ;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}