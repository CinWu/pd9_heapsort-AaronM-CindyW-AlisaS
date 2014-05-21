//Cindy Wu
//pd9
//HW41
//2014-05-19

import java.util.ArrayList;

public class HeapSort {
    
    public static Integer[] sheapSort( Integer[] a ) {
	ALHeap sheap = new ALHeap();
	int i = 0;

	for ( Integer q : a ) {
	    sheap.add(q);
	}
	while ( !sheap.isEmpty() ) {
	    a[i] = sheap.removeMin();
	    i++;
	}
	// for ( int e : a ) 
	//     System.out.println(e);
	return a;
    } //O(nlogn)
    
    public static void main( String[] args ) {
	Integer[] test = { 1, 7, 2, 4, 3, 6, 5 };
	Integer[] copy = sheapSort(test);
	for ( int i : copy ) {
	    System.out.println( i );
	}
    }
}
