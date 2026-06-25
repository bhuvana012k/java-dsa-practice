mport java.util.*;

public class Main {
    public static void main(String[] args) {
      int arr[]={10,20,30,80,50};
      int target=100;
      boolean found=false;
      for(int i=0;i<arr.length;i++){
        if(arr[i]==target){
          found=true;
          System.out.println("Element is founded at index "+i);
        }
      }
      if(!found){
        System.out.println("element is not found");
      }
    }
}
