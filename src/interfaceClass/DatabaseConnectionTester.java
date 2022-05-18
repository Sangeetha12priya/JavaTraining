package interfaceClass;

public class DatabaseConnectionTester {

	public static void main(String[] args) {
		
		DatabaseConnector oDatabaseConnector = new OracleDataBase();
		oDatabaseConnector.connectToDataBase();
		
		oDatabaseConnector = new MongoDataBase();
		oDatabaseConnector.connectToDataBase();
		
		oDatabaseConnector = new SqlServerDataBase();
		oDatabaseConnector.connectToDataBase();
		

	}

}
