package db;

public class DbException extends RuntimeException {
//Padrão é deixar apenas uma linha
	private static final long serialVersionUID = 1L;

	public DbException(String msg) {
		super(msg);
	}


}
