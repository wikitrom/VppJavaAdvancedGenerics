
/**
 * A Generic class.
 * 
 * @author User
 *
 * @param <K>
 *            an object of any type (implementing toString() method)
 * @param <V>
 *            an object of any type (implementing toString() method)
 */
public class StringWorker<K, V> {

	// private Object obj1;
	// private Object obj2;
	//
	// public StringWorker(Object obj1, Object obj2) {
	// this.obj1 = obj1;
	// this.obj2 = obj2;
	// }

	private K obj1;
	private V obj2;

	// static methods
	public static <T, U> String getString(T obj1, U obj2) {
		return obj1.toString() + " : " + obj2.toString();
	}

	public static <T> String getString2(T obj1, T obj2) {
		return obj1.toString() + " : " + obj2.toString();
	}

	// constructor
	public StringWorker(K obj1, V obj2) {
		this.obj1 = obj1;
		this.obj2 = obj2;
	}

	@Override
	public String toString() {
		return "StringWorker: " + obj1.toString() + " : " + obj2.toString();
	}

}
