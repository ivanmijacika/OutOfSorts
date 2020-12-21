import java.util.Arrays;

public class Sorts{

  /**Bubble sort of an int array.
  *Upon completion, the elements of the array will be in increasing order.
  *@param data  the elements to be sorted.
  */
  public static void bubbleSort(int[] data){
    boolean isSorted = false;
    int temp = 0;
    while (!isSorted){
      isSorted = true;
      for (int i=0; i<data.length-1; i++){
	if (data[i]>data[i+1]){
	  temp = data[i];
	  data[i] = data[i+1];
	  data[i+1] = temp;
	  isSorted = false;
	  //System.out.println(Arrays.toString(data));
	}
      }
    }
  }

  public static void selectionSort(int[] data){
    int smallest;
    int temp;
    for (int i=0; i<data.length-1; i++){
      smallest = i;
      for (int c=i; c<data.length; c++){
	if (data[c] < data[smallest]) smallest = c;
      }
      temp = data[i];
      data[i] = data[smallest];
      data[smallest] = temp;
      //System.out.println(Arrays.toString(data));
    }
  }

}
