public class Sorts{

  public static void swap(int a, int b){
    int temp = a;
    a = b;
    b = temp;
  }

  /**Bubble sort of an int array.
  *Upon completion, the elements of the array will be in increasing order.
  *@param data  the elements to be sorted.
  */
  public static void bubbleSort(int[] data){
    boolean isSorted = false;
    while (!isSorted){
      isSorted = true;
      for (int i=0; i<data.length-1; i++){
	if (data[i]>data[i+1]){
	  swap(data[i], data[i+1]);
	  isSorted = false;
	}
      }
    }
  }

}
