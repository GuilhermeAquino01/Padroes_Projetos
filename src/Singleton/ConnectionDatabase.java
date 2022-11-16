package Singleton;

public class ConnectionDatabase {

    private static ConnectionDatabase instance;
    public String connectionDatabase;
    //Atributo criado apenas para escrever na tela qual instancia está sendo usada

    private ConnectionDatabase(String DB) {
        this.connectionDatabase = "Conexão estabelecida com banco de dados " + DB;
    }

    public static ConnectionDatabase getInstance(String DB_client) {
        if (instance == null) {
            System.out.println("Nova instância");
            instance = new ConnectionDatabase(DB_client);
            return instance;
        }else {
            System.out.println("Utilizou instância existente");
            return instance;
        }
    }

    public static ConnectionDatabase reset(){
        System.out.println("Fechou requisição");
        return instance = null;
    }
}
