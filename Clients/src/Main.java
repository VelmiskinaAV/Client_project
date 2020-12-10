import java.sql.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {


        new ClientQueries().showClientDataTbl();
        new ClientQueries().showClientPointsTbl();

       /* for(Client client: newClientsData()){
           new ClientQueries().addClientToTable(client);
        }*/

        /*for(Points points: newClientsPoints(newClientsData())){
            new ClientQueries().addPointsToTable(points);
        }*/
    }

    static public ArrayList<Client> newClientsData() {
        ArrayList dataClients =  new ArrayList<Client>();
        // 0 - female
        dataClients.add(new Client(54, 0, false,  3, 170, 105,
                        6, 6.4, 9.0, 3.5, 1.9, 190,
                        1045, 2.3, 110, 5.1, false));
        dataClients.add(new Client(65, 0, false, 10, 165, 100,
                4.9, 7.8, 7.5, 2.1, 3.5, 280,
                1050, 2.2, 5.8,  115, true));
        dataClients.add(new Client(58, 0, false, 5, 155, 105,
                4.8, 6.5, 9.2, 4.1, 3.7, 250,
                1300, 4.2, 5.2, 119, false));

        return dataClients;

    }

    static public ArrayList<Points> newClientsPoints(ArrayList<Client> newClientsData) {

        ArrayList clientsPoints = new ArrayList<Points>();

        for (Client client: newClientsData) {
                clientsPoints.add(client.convertClientsDataToPoints(client));
        }

        return clientsPoints;
    }
}
