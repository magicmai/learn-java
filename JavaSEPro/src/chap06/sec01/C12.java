package chap06.sec01;

public class C12 {

	private Object object;

	public C12(Object object) {
		super();
		this.object = object;
	}

	public Object getObject() {
		return object;
	}

	public void setObject(Object object) {
		this.object = object;
	}
	
	/**
	 * 打印 object 的类型
	 */
	public void print() {
		System.out.println("a的类型是："+object.getClass().getName());
	}
}
