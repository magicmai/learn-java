package chap06.sec01;

/**
 * ���巺����
 * @author Magic
 *
 * @param <T>
 */
public class CC<T> {
	
	private T ob;

	public CC(T ob) {
		super();
		this.ob = ob;
	}

	public T getOb() {
		return ob;
	}

	public void setOb(T ob) {
		this.ob = ob;
	}
	
	/**
	 * ��ӡ T ������
	 */
	public void print() {
		System.out.println("T��ʵ�������ǣ�"+ob.getClass().getName());
	}
}
