
public class StringWorker<K,V> {

//	private Object obj1;
//	private Object obj2;
//
//	public StringWorker(Object obj1, Object obj2) {
//		this.obj1 = obj1;
//		this.obj2 = obj2;
//	}

	private K obj1;
	private V obj2;

	public StringWorker(K obj1, V obj2) {
		this.obj1 = obj1;
		this.obj2 = obj2;
	}

	@Override
	public String toString() {
		return "StringWorker: " + obj1.toString() + " : " +obj2.toString();
	}
}
