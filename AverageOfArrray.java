import java.util.*;

public class Main {
    public static void main(String[] args) {
      int arr[]={10,20,30,40,50};
      int leng=arr.length;
      int max=0;
      int sum=0;
      for(int i=0;i<arr.length;i++){
        sum=sum+arr[i];
      }
      max=sum/leng;
      System.out.println(max);
    }
}
