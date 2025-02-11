public class Compare {
    //functions - In Java Methods

    public static void printsum(int a, int b){
        System.out.println(a+b);
    }

    public static int numDivisor(int n){

        int result=0;
        for(int i=1; i<=n; i++){
            if(n%i==0)
                result++;
        }

        return result;
    }


    public static boolean check(StringBuilder sb1, StringBuilder sb2){

        if( sb1.compareTo(sb2)==0)
                return true;
        else
                return false;

    }

    public static void main(String[] args) {

        StringBuilder sb1 = new StringBuilder("Hello");
        StringBuilder sb2 = new StringBuilder("Hello");


        if ( check(sb1,sb2) == true ){
            System.out.println("They are equal");
        }
        else{
            System.out.println("Not equal");
        }

        printsum(23, 45);
        System.out.println( numDivisor(45) );

    }

}
