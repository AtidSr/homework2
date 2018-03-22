import java.util.ArrayList;
import java.util.List;

/**
 * This is a homework2 of oop2 
 * @author Atid Srisukhantapuek
 *
 */
public class Recursion {

	/**
	 * Remove duplicate consecutive items from a list, changing the list parameter.
	 * For example, if list = { a, b, b, b, c, b, c, c} then after calling unique
	 * the list will contain {a, b, c, b, c}. Only consecutive duplicates are
	 * removed. Objects are compared using their own equals method.
	 * 
	 * @param list of any kind of object. The elements are not null.
	 * @return reference to the list parameter with consecutive duplicates removed.
	 */

	public static List<?> unique(List<?> list) {
		if (list.size() == 1)
			return list;
		List<?> temp = list.subList(1, list.size());
		if (list.get(0).equals(list.get(1))) {
			list.remove(0);
			unique(list);
		} else {

			unique(temp);
		}
		return list;

	}

	/**
	 * Compute fibonacci by call helper
	 * @param number 
	 * @return  fibonacci's numbers
	 */
	public static long fibonacci(int n) {
		return helper(n, 0, 1);
	}


	/**
	 * Compute fibonacci  
	 * @param n : number of fibonacci.
	 * @param next : next index of fibonacci.
	 * @param start : start index of fibonacci.
	 * @return result of the fibonacci
	 */
	public static long helper(int n, long start, long next) {
		if (n == 0)
			return start;
		if (n == 1)
			return next;
		else
			return helper(n - 1, next, start + next);
	}

	/**
	 * Print item in the list.
	 * @param list
	 */
	public static void printList(List<?> list) {
		for (Object o : list) {
			System.out.print(o);
		}

	}

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		
		list.add("a");
		list.add("a");
		list.add("b");
		list.add("b");
		list.add("b");
		list.add("c");
		list.add("c");
		list.add("b");
		list.add("c");
		list.add("c");

		System.out.println("Problem 3");
		System.out.println("--------------------------------");
		
		printList(list);
		System.out.println();

		printList(unique(list));

		System.out.println();
		System.out.println("--------------------------------");

		System.out.println("Problem 4");
		System.out.println("--------------------------------");

		System.out.println(fibonacci(1));
		System.out.println(fibonacci(3));
		System.out.println(fibonacci(5));
		System.out.println(fibonacci(7));
		System.out.println(fibonacci(9));
		System.out.println(fibonacci(10));
		System.out.println(fibonacci(60));
		System.out.println(fibonacci(80));
	}

}
