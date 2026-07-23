public static void main(String[] args) {
     int arr[]={1,2,3,4};
     for(int i=0;i<arr.length;i++){
      int product=1;
      for(int j=0;j<arr.length;j++){
        if(i!=j){
          product=product*arr[j];
        }
      }
      System.out.print(product+" ");
     }

    }
Output:24,12,8,6
