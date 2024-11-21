package OOPs;

public class MethodOverloading {

	static class Database {

		public void connect(String host, int port, String database, String user, String password) {
			System.out.println("Connecting to MySQL at " + host + ":" + port);
		}

		public void connect(String host, int port, String database, String user, String password, boolean useSSL) {
			System.out.println("Connecting to PostgreSQL at " + host + ":" + port + " with SSL: " + useSSL);
		}

		public void connect(String connectionString) {
			System.out.println("Connecting with connection string: " + connectionString);
		}
	}

	public static void main(String[] args) {
		Database db = new Database();

		db.connect("localhost", 3306, "mydb", "user", "password");
		db.connect("localhost", 5432, "mydb", "user", "password", true);
		db.connect("jdbc:mysql://localhost:3306/mydb?user=user&password=password");
	}
}
