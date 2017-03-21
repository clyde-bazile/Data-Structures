import java.lang.Comparable;
import java.util.List;
import java.util.LinkedList;


/** 
  * Searches the specified list for the specified key using the binary search algorithm. 
  *
  * @author	Clyde Bazile
  * @since	2017-03-20
  */
public class BinarySearch {

	/**
     * This class should not be instantiated.
     */
    private BinarySearch() { }

	/**
	  * Searches the specified list for the specified key using the binary search algorithm.
	  * 
	  * @param 	list the the list to be searched
	  * @param 	key the value to be searched for
	  * @param 	error the error code to return if the key is not found.
	  * @return	the index of the key or the specified error code if the key is 
	  *			not present.
	  */
	public static <T extends Comparable<T>> int binarySearch( final List<? extends T> list,
			final T key, final Integer errorCode){ 

		int low = 0;
		int high = list.size() - 1;

		while(low <= high) {
			int mid = (low + high) / 2;
			int compare = key.compareTo(list.get(mid));
				
			if ( compare < 0) {
				high = mid - 1;
			} else if ( compare > 0) {
				low = mid + 1;
			} else {
				return mid;
			}
		}
		return errorCode;
	}

	/**
	  * Searches the specified list for the specified key using the binary search algorithm.
	  * 
	  * @param 	list the the list to be searched
	  * @param 	key the value to be searched for
	  * @return	the index of the key or {@code -1} if the key is not present.
	  */
	public static <T extends Comparable<T>> int binarySearch( final List<? extends T> list,
			final T key){ 
		
		return binarySearch(list, key, -1);
	}
} 

