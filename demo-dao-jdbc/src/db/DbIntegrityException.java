package db;

public class DbIntegrityException extends RuntimeException{		//Excecao para o Bd.
	
	private static final long serialVersionUID = 1L;
	
	public DbIntegrityException(String msg) {
		super(msg);
	}

}
