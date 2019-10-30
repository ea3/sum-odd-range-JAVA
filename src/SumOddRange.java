public class SumOddRange {

    public static boolean isOdd(int number){

        if( number <= 0){

            return false;
        }


        if ( number % 2 ==0 ){

            return false;
        }else{
            return true;
        }
    }


    public static int sumOdd(int start, int end){

        if( (end <start) || (end <=0) || (start <=0) ){

            return -1;

        }

        int oddNumberSum= 0;
        for(int i = start; i<=end ; i++  ){

            if(isOdd(i) == true){

                oddNumberSum += i;



            }
        }


        System.out.println(oddNumberSum);
        return oddNumberSum;


    }

}
