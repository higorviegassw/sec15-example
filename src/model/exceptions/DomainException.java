package model.exceptions;

// Exception: o compilador obriga a tratar / RuntimeException: o compilador n�o obriga a tratar
public class DomainException extends RuntimeException {

	private static final long serialVersionUID = 1L;
	
	public DomainException(String msg) {
		super(msg);
	}

}
