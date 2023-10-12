public class patterns{
    public static void main(String [] args){
        pattern1(5);
        pattern2(5);
        pattern3(5);
        pattern4(5);
        pattern5(5);
        // pattern6(5);
    }


    static void pattern1(int n){        
        System.out.println("pattern 1");
        for(int row=1;row<=n;row++){
            for (int col=1;col<=n;col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern2(int n){
        System.out.println("pattern 2");

        for(int row=1;row<=n;row++){
            for (int col=1;col<=row;col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern3(int n){
        System.out.println("pattern 3");
        for(int row=n;row>=1;row--){
            for (int col=row;col>=1;col--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }


    static void pattern4(int n){
        System.out.println("pattern 4");
        for(int row=1;row<=n;row++){
            for (int col=1;col<=row;col++){
                System.out.print(col +" ");
            }
            System.out.println();
        }
        System.out.println();
    }


     static void pattern5(int n){
        System.out.println("pattern 5");
        // Cheap method
        // for(int row=1;row<=n;row++){
        //     for (int col=1;col<=row;col++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        // for(int row2=n;row2>=1;row2--){
        //     for(int col2=row2;col2>=1;col2--){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }
        //}

        // Professional method

          
        System.out.println("pattern 5");

        for(int row=1;row<2*n;row++){
            int totalcolsInRow=row>n ? 2*n-row:row;
            for (int col=1;col<totalcolsInRow;col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    


//     static void pattern6(int n){
//         System.out.println("pattern 6");

//         for(int row=n;row>=1;row--){
//             for (int col=1;col<=row;col++){
//                 if(row==col){
//                     System.out.print("* ");
            
//             }
//             System.out.println();
//         }
// }

}