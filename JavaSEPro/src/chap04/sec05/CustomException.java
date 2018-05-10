package chap04.sec05;

/**
 * 自定义异常，继承自 Exception
 * @author Magic
 *
 */
public class CustomException extends Exception {

	public CustomException(String message) {
		super(message);
	}
}
