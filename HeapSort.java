//ALISA SU
//APCS2 pd9
//HW41
//2014-05-20

/**********************************
O(n log n)
 **********************************/

public class HeapSort {

    private ALHeap _heap;
    
    public HeapSort () {
	
	_heap = new ALHeap();
	
    }

    public Integer[] sort( Integer[] data ){
	
	Integer[] ans = new Integer[data.length];

	for (int i = 0; i < data.length; i++){
	    
	    ans[i] = _heap.removeMin();

	}
	
	return ans;

    }

}
