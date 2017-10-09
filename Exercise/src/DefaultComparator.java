
public class DefaultComparator implements java.util.Comparator {
	
	/*
	 * DefaultComparator - comparator object for values that satisfy
	 *                     comparable interface;
	 *
	 * Method Detail
	 *
	 * public int compare(java.lang.Object left, java.lang.Object right)
	 *		determine order of two object; -1, 0 or 1
	 *		Specified by:
	 *			compare in interface java.util.Comparator
	 * 		Parameters:
	 * 			left - first object
	 * 			right - second object
	 * 		Returns:
	 * 			-1 if left less than right, 0 if equal, 1 otherwise equals
	 * 
	 * 	public boolean equals(java.lang.Object obj)
	 * 		Specified by:
	 * 			equals in interface java.util.Comparator
	 * 		Overrides:
	 * 			equals in class java.lang.Object
	 */
	
	public int compare(java.lang.Object left, java.lang.Object right) {
		Event i = (Event) left;
		Event j = (Event) right;
		if (i.time > j.time){
			return 1;
		}
		else if (i.time < j.time){
			return -1;
		}
		else{
			return 0;
		}
	}

	public boolean equals(java.lang.Object obj){
		return 	this.equals(obj);
		
	}
}
