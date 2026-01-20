class Solution {
    public boolean checkStraightLine(int[][] coordinates) {
        int n = coordinates.length;
        
        int deltaY = coordinates[1][1] - coordinates[0][1];   // y2 - y1
        int deltaX = coordinates[1][0] - coordinates[0][0];   // x2 - x1

        /*
            slop = deltaY / deltaX
        */



        for( int i = 2; i < n; i++ ) {
            int deltaY_i = coordinates[i][1] - coordinates[0][1];   
            int deltaX_i = coordinates[i][0] - coordinates[0][0];

            /*
                and to avoid the  division by zero   what  we  are doing is :

                    ( y2 - y1 )      (y3 - y1)    
                    -----------  ==  --------
                    ( x2 - x1 )      (x3 - x1)

                    we  can  write it as ( to avoid the divide by zero error in our  code )
                    ( y2 - y1 )  * (x3 - x1) == ( x2 - x1 ) * (y3 - y1) 

                    so now, let  we  apply on our code :- 

                    deltaY          deltaY_i
                    ------   ==     --------
                    deltaX          deltaX_i

                    ---> deltaY * deltaX_i == deltaX * deltaY_i
            */
            
            if( ( deltaY * deltaX_i ) != ( deltaY_i * deltaX ) ) {
                return false;
            }
        }
        return true;
    }
}