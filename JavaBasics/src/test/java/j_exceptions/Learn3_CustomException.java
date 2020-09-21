package j_exceptions;

public class Learn3_CustomException extends StringIndexOutOfBoundsException {

	Learn3_CustomException() {
		super();
	}

	Learn3_CustomException(String error) {
		super();
		System.out.println(error);

	}

}
