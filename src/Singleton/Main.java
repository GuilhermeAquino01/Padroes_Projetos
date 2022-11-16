package Singleton;

public class Main {
    public static void main(String[] args){
        ConnectionDatabase conn1 = ConnectionDatabase.getInstance("db_padrão");
        System.out.println("Requisição 1 " + conn1.connectionDatabase);
        ConnectionDatabase.reset();
        System.out.println("-------------------------------------------");

        ConnectionDatabase conn2 = ConnectionDatabase.getInstance("db_2");
        System.out.println("Requisição 2 " + conn2.connectionDatabase);
        System.out.println("-------------------------------------------");

        ConnectionDatabase conn3 = ConnectionDatabase.getInstance("db_3");
        System.out.println("Requisição 3 " + conn3.connectionDatabase);
        System.out.println("-------------------------------------------");
        ConnectionDatabase.reset();

        ConnectionDatabase conn4 = ConnectionDatabase.getInstance("db_4");
        System.out.println("Requisição 4 " + conn4.connectionDatabase);


        //ConnectionDatabase conn4 = new ConnectionDatabase();
    }
}
