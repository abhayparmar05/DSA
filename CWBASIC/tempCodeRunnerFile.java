            }
            System.out.println();
        }
    }
    static void pattten9(int n ){
        // *
        //*** 
        //*****
        // *****
        //  ***
        //   * 
        pattern7(n);
        pattern8(n);
    }
    static void pattern10(int n){
        for(int i=1; i<=2*n-1 ; i++){
            int stared = i;
            if(i > n) stared =2*n-i;