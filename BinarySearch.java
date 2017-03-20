import java.lang.Comparable;
import java.util.List;
import java.util.LinkedList;

public class BinarySearch {
	
	public static void main(String[] args){ 
		List<Integer> list = new LinkedList<>();
		
		for(int i = 1; i <= 1234; i++) {
			list.add(i);
		} 
		for(int i = 1; i <= 1234; i++) {
			System.out.println(binarySearch(list, i));
		} 

		System.out.println(binarySearch(list, -5000));
		System.out.println(binarySearch(list, 5000));

		
	}

	public static <T extends Comparable<T>> int binarySearch( final List<? extends T> list,
			final T key){ 
		
		final int NOT_FOUND = -1;

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

		return NOT_FOUND;
	}

} 

