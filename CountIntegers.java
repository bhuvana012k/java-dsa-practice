import java.util.*;

public class Main {
    public static void main(String[] args) {
      int arr[]={-5,10,0,-2,8,0};
      int positive=0;
      int negative=0;
      int zero=0;
      for(int i=0;i<arr.length;i++){
        if(arr[i]>0){
          positive++;
        }
        else if(arr[i]<0){
          negative++;
        }
        else{
          zero++;
        }
      }
      System.out.println("positive number: "+positive);
      System.out.println("negative number: "+negative);
      System.out.println("zero number: "+zero);
      
    }
}
