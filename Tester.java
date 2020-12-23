import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
public class Tester{
  public static void main(String args[]){
    System.out.println("Bubble Sort Tests:"); //BUBBLESORT TESTS

    int [] array1 = new int[]{1,1,1,1,1,1,1,1,1,1,1};
    System.out.println(Arrays.toString(array1));
    Sorts.bubbleSort(array1);
    System.out.println(Arrays.toString(array1));
    System.out.println("====================");

    int [] array2 = new int[]{2,5,6,7,-3};
    System.out.println(Arrays.toString(array2));
    Sorts.bubbleSort(array2);
    System.out.println(Arrays.toString(array2));
    System.out.println("====================");

    int [] array3 = new int[]{1,2,3,4,5,6,7,8,9,10};
    System.out.println(Arrays.toString(array3));
    Sorts.bubbleSort(array3);
    System.out.println(Arrays.toString(array3));
    System.out.println("====================");

    int [] array4 = new int[]{10,9,8,7,6,5,4,3,2,1};
    System.out.println(Arrays.toString(array4));
    Sorts.bubbleSort(array4);
    System.out.println(Arrays.toString(array4));
    System.out.println("====================");

    int [] arrayE = new int[]{};
    System.out.println(Arrays.toString(arrayE));
    Sorts.bubbleSort(arrayE);
    System.out.println(Arrays.toString(arrayE));
    System.out.println("====================");

    Random rngSeed = new Random();
    int seed = rngSeed.nextInt();
    System.out.print("seed used: ");
    System.out.println(seed);
    System.out.println();
    Random rng = new Random(seed);
    int [] arrayR = new int [20];
    for(int i =  0; i < 20; i++ ){
      arrayR[i] = (rng.nextInt() % 100);
    }
    int[] randomKey = arrayR.clone();
    System.out.println(Arrays.toString(randomKey));
    Arrays.sort(randomKey);
    System.out.println(Arrays.toString(randomKey));
    System.out.println("==========");
    System.out.println(Arrays.toString(arrayR));
    Sorts.bubbleSort(arrayR);
    System.out.println(Arrays.toString(arrayR));
    System.out.println(Arrays.equals(randomKey, arrayR));
    System.out.println("====================");

    //SELECTION SORT TESTS
    System.out.println();
    System.out.println("Selection Sort Tests:");
    System.out.println();
    int [] array5 = new int[]{10,9,8,7,6,5,4,3,2,1};
    Sorts.selectionSort(array5);
    System.out.println(Arrays.toString(array5));
    System.out.println("====================");
    int [] array6 = new int[]{1,2,3,4,5,6,7,8,9,10};
    Sorts.selectionSort(array6);
    System.out.println(Arrays.toString(array6));
    System.out.println("====================");
    Sorts.selectionSort(arrayE);
    System.out.println(Arrays.toString(arrayE));
    System.out.println("====================");
    System.out.print("seed used: ");
    System.out.println(seed);
    System.out.println();
    int [] arrayR2 = new int [20];
    for(int i =  0; i < 20; i++ ){
      arrayR2[i] = (rng.nextInt() % 100);
    }
    int[] randomKey2 = arrayR2.clone();
    System.out.println(Arrays.toString(randomKey2));
    Arrays.sort(randomKey2);
    System.out.println(Arrays.toString(randomKey2));
    System.out.println("==========");
    System.out.println(Arrays.toString(arrayR2));
    Sorts.selectionSort(arrayR2);
    System.out.println(Arrays.toString(arrayR2));
    System.out.println(Arrays.equals(randomKey2, arrayR2));
    System.out.println("====================");

    //INSRTION SORT TESTS
    System.out.println();
    System.out.println("Insertion Sort Tests:");
    System.out.println();
    int [] array7 = new int[]{1,2,3,4,5,6,7,8,9,10};
    Sorts.insertionSort(array7);
    System.out.println(Arrays.toString(array7));
    System.out.println("====================");
    int [] array8 = new int[]{10,9,8,7,6,5,4,3,2,1};
    Sorts.insertionSort(array8);
    System.out.println(Arrays.toString(array8));
    System.out.println("====================");
    Sorts.insertionSort(arrayE);
    System.out.println(Arrays.toString(arrayE));
    System.out.println("====================");
    System.out.print("seed used: ");
    System.out.println(seed);
    System.out.println();
    int [] arrayR3 = new int [20];
    for(int i =  0; i < 20; i++ ){
      arrayR3[i] = (rng.nextInt() % 100);
    }
    int[] randomKey3 = arrayR3.clone();
    System.out.println(Arrays.toString(randomKey3));
    Arrays.sort(randomKey3);
    System.out.println(Arrays.toString(randomKey3));
    System.out.println("==========");
    System.out.println(Arrays.toString(arrayR3));
    Sorts.insertionSort(arrayR3);
    System.out.println(Arrays.toString(arrayR3));
    System.out.println(Arrays.equals(randomKey3, arrayR3));
  }
}
