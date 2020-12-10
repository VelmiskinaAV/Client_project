import java.sql.*;

public class ClientQueries extends DatabaseConnection {

    public void addClientToTable(Client client) throws SQLException, ClassNotFoundException {

        String insert = "INSERT INTO client_data_tbl(client_age, gender, is_smoke, duration_AG, CAD, DAD, " +
                        "cholesterol, interleukin, TNF, neopterin, lactic_acid, alpha_linolenic_acid," +
                        "arachidonic_acid, MDA, COD, IMMLG, blood_reduction) VALUES(" + client.clientAge +
                        "," + client.gender + "," + client.isSmoke + "," + client.durationAG + "," + client.CAD +
                        "," + client.DAD + "," + client.cholesterol +  "," + client.interleukin + "," + client.TNF +
                        "," + client.neopterin + "," + client.lacticAcid + "," + client.alphaLinolenicAcid +
                        "," + client.arachidonicAcid + "," + client.MDA + "," + client.COD + "," + client.IMMLG +
                        "," + client.bloodReduction +")";

        Statement p = getConnection().createStatement();
        p.execute(insert);
        p.close();
    }

    public void addPointsToTable(Points points) throws SQLException, ClassNotFoundException {
        String insert = "INSERT INTO client_points_tbl(age_points, gender_points, is_smoke_points," +
                        " duration_AG_points, CAD_points, DAD_points, cholesterol_points, " +
                        "interleukin_points, TNF_points, neopterin_points, lactic_acid_points, " +
                        "alpha_linolenic_acid_points, arachidonic_acid_points, " +
                        "MDA_points, COD_points, IMMLG_points, blood_reduction_points) VALUES(" +
                        points.clientAge + "," + points.gender + "," +
                        points.isSmoke +"," + points.durationAG + "," + points.CAD + "," + points.DAD + "," +
                        points.cholesterol + "," + points.interleukin + "," + points.TNF + ","+ points.neopterin +
                        "," + points.lacticAcid + "," + points.alphaLinolenicAcid + "," + points.arachidonicAcid +
                        "," + points.MDA + "," + points.COD + "," + points.IMMLG + "," + points.bloodReduction +")";

        Statement p = getConnection().createStatement();
        p.execute(insert);
        p.close();
    }

    public void createClientPointsTbl() throws SQLException, ClassNotFoundException {

        String s = "CREATE TABLE client_points_tbl(\n" +
                "client_points_id INT NOT NULL AUTO_INCREMENT,\n" +
                "age_points TINYINT UNSIGNED NOT NULL,\n" +
                "gender_points TINYINT UNSIGNED NOT NULL,\n" +
                "is_smoke_points TINYINT UNSIGNED NOT NULL,\n" +
                "duration_AG_points TINYINT UNSIGNED NOT NULL,\n" +
                "CAD_points TINYINT UNSIGNED NOT NULL,\n" +
                "DAD_points TINYINT UNSIGNED NOT NULL,\n" +
                "cholesterol_points TINYINT UNSIGNED NOT NULL,\n" +
                "interleukin_points TINYINT UNSIGNED NOT NULL,\n" +
                "TNF_points TINYINT UNSIGNED NOT NULL,\n" +
                "neopterin_points TINYINT UNSIGNED NOT NULL,\n" +
                "lactic_acid_points TINYINT UNSIGNED NOT NULL,\n" +
                "alpha_linolenic_acid_points TINYINT UNSIGNED NOT NULL,\n" +
                "arachidonic_acid_points TINYINT UNSIGNED NOT NULL,\n" +
                "MDA_points TINYINT UNSIGNED NOT NULL,\n" +
                "COD_points TINYINT UNSIGNED NOT NULL,\n" +
                "IMMLG_points TINYINT UNSIGNED NOT NULL,\n" +
                "blood_reduction_points TINYINT UNSIGNED NOT NULL,\n" +
                "PRIMARY KEY (client_points_id));";
        Statement p = getConnection().createStatement();
        p.execute(s);
        p.close();
    }

    public void createClientDataTbl() throws SQLException, ClassNotFoundException{
        String s = "CREATE TABLE client_data_tbl(" +
                "client_id INT NOT NULL AUTO_INCREMENT," +
                "client_age TINYINT UNSIGNED NOT NULL," +
                "gender TINYINT UNSIGNED NOT NULL," +
                "is_smoke BOOL NOT NULL," +
                "duration_AG TINYINT UNSIGNED NOT NULL," +
                "CAD FLOAT NOT NULL," +
                "DAD FLOAT NOT NULL," +
                "cholesterol FLOAT NOT NULL," +
                "interleukin FLOAT NOT NULL," +
                "TNF FLOAT NOT NULL," +
                "neopterin FLOAT NOT NULL," +
                "lactic_acid FLOAT NOT NULL," +
                "alpha_linolenic_acid FLOAT NOT NULL," +
                "arachidonic_acid FLOAT NOT NULL," +
                "MDA FLOAT NOT NULL," +
                "COD FLOAT NOT NULL," +
                "IMMLG FLOAT NOT NULL," +
                "blood_reduction BOOL NOT NULL," +
                "PRIMARY KEY (client_id));";
        Statement p = getConnection().createStatement();
        p.execute(s);
        p.close();
    }

    public void showClientDataTbl() throws SQLException, ClassNotFoundException{

        String query = "SELECT * FROM client_data_tbl";

        Statement statement = getConnection().createStatement();
        ResultSet result = statement.executeQuery(query);

        System.out.println("Данные таблицы client_data_tbl");

        while(result.next()) {
            int age = result.getInt("client_age");
            int gender = result.getInt("gender");
            boolean smoke = result.getBoolean("is_smoke");
            int durationAG = result.getInt("duration_AG");
            float CAD = result.getFloat("CAD");
            float DAD = result.getFloat("DAD");
            float cholesterol = result.getFloat("cholesterol");
            float interleukin = result  .getFloat("interleukin");
            float TNF = result.getFloat("TNF");
            float neopterin = result.getFloat("neopterin");
            float lacticAcid = result.getFloat("lactic_acid");
            float alphaLinolenicAcid = result  .getFloat("alpha_linolenic_acid");
            float arachidonicAcid = result.getFloat("arachidonic_acid");
            float MDA = result.getFloat("MDA");
            float COD = result.getFloat("COD");
            float IMMLG = result  .getFloat("IMMLG");
            boolean bloodReduction = result  .getBoolean("blood_reduction");

            Client client = new Client(age, gender, smoke, durationAG, CAD, DAD, cholesterol,
                    interleukin, TNF, neopterin, lacticAcid, alphaLinolenicAcid, arachidonicAcid,
                    MDA, COD, IMMLG, bloodReduction);
            client.show();

        }

        result.close();
    }

    public void showClientPointsTbl() throws SQLException, ClassNotFoundException {
        
        String query = "SELECT * FROM client_points_tbl";

        Statement statement = getConnection().createStatement();
        ResultSet result = statement.executeQuery(query);

        System.out.println("Данные таблицы client_points_tbl");

        while (result.next()) {
            int age = result.getInt("age_points");
            int gender = result.getInt("gender_points");
            int smoke = result.getInt("is_smoke_points");
            int durationAG = result.getInt("duration_AG_points");
            int CAD = result.getInt("CAD_points");
            int DAD = result.getInt("DAD_points");
            int cholesterol = result.getInt("cholesterol_points");
            int interleukin = result.getInt("interleukin_points");
            int TNF = result.getInt("TNF_points");
            int neopterin = result.getInt("neopterin_points");
            int lacticAcid = result.getInt("lactic_acid_points");
            int alphaLinolenicAcid = result.getInt("alpha_linolenic_acid_points");
            int arachidonicAcid = result.getInt("arachidonic_acid_points");
            int MDA = result.getInt("MDA_points");
            int COD = result.getInt("COD_points");
            int IMMLG = result.getInt("IMMLG_points");
            int bloodReduction = result.getInt("blood_reduction_points");

            Points points = new Points(age, gender, smoke, durationAG, CAD, DAD, cholesterol,
                    interleukin, TNF, neopterin, lacticAcid, alphaLinolenicAcid, arachidonicAcid,
                    MDA, COD, IMMLG, bloodReduction);
            points.show();
            points.sum(points);
        }
    }
}
