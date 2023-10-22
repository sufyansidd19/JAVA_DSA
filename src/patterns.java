public class patterns{
    public static void main(String [] args){
        // pattern1(5);
        // pattern2(5);
        // pattern3(5);
        // pattern4(5);
        // pattern5(5);
        // pattern6(5);
        // pattern7(5);
        // pattern8(6);
        // pattern9(5);
        pattern30(5);
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
        // System.out.println("pattern 5");
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



    
    static void pattern6(int n){
        System.out.println("pattern 6");
    

        for(int row=1;row<2*n;row++){
            int totalcolsInRow=row>n ? 2*n-row:row;
            int totalSpaces=n-totalcolsInRow;
            for(int s=0;s<totalSpaces;s++){
                System.out.print(" ");
            }
            for (int col=1;col<totalcolsInRow;col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern7(int n){
        System.out.println("pattern 7");
    

        for(int row=1;row<n;row++){
            for(int s=1;s<row;s++){
                System.out.print(" ");
            }
            for(int col=1;col<=n-row;col++){
                System.out.print("* ");
            }
            System.out.println();
        }}


    static void pattern8(int n){
        System.out.println("pattern 8");
    
        for(int row=n;row>=1;row--){

            for(int j=1;j<row;j++){
                System.out.print(" ");
            }
            for(int j=0;j<=n-row;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void pattern9(int n) 
    { 
        int i, j; 
  
        // outer loop to handle rows 
        for (i = n; i >= 1; i--) { 
  
            // inner loop to print spaces. 
            for (j = 1; j < i; j++) { 
                System.out.print(" "); 
            } 
  
            // inner loop to print stars. 
            for (j = 0; j <= n - i; j++) { 
                System.out.print("*"); 
            } 
  
            // printing new line for each row 
            System.out.println(); 
        } 
    } 

    public static void pattern30(int n){
        for(int row=1;row<=2*n;row++){
            int c= row>n ? 2*n - row : row;
            for(int space=0;space<n-c;space++){
                System.out.print(" ");
            }
            for(int col=c;col>=1;col--){
                System.out.print(col);
            }
            for(int col=2;col<=c;col++){
                System.out.print(col);
            }
            System.out.println();
                
    } 
}
}