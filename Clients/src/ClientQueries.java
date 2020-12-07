import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class ClientQueries extends DatabaseConnection {

    public void addClientToTable(Client client) throws SQLException, ClassNotFoundException {

        String insert = "INSERT INTO client_data_tbl(client_age, gender, is_smoke, duration_AG, CAD, DAD, " +
                        "cholesterol, interleukin, TNF, neopterin, lactic_acid, alpha_linolenic_acid," +
                        "arachidonic_acid, MDA, COD, IMMLG, blood_reduction) VALUES(" + client.clientAge +
                        "," + client.gender +"," + client.isSmoke +"," + client.durationAG + "," + client.CAD +
                        "," + client.DAD + "," + client.cholesterol + "," + client.interleukin + "," + client.TNF +
                        ","+ client.neopterin + "," + client.lacticAcid + "," + client.alphaLinolenicAcid +
                        "," + client.arachidonicAcid + "," + client.MDA + "," + client.COD + "," + client.IMMLG +
                        "," + client.bloodReduction +")";

        Statement p =  getConnection().createStatement();
        p.execute(insert);
        p.close();
    }


    public void addPointsToTable(Points points) throws SQLException, ClassNotFoundException {
        String insert = "INSERT INTO client_points_tbl(age_points, gender_points, is_smoke_points," +
                        " duration_AG_points, CAD_points, DAD_points, cholesterol_points, " +
                        "interleukin_points, TNF_points, neopterin_points, lactic_acid_points, " +
                        "alpha_linolenic_acid_points, arachidonic_acid_points, " +
                        "MDA_points, COD_points, IMMLG_points, blood_reduction_points) VALUES(" +
                        points.clientAge + "," + points.gender +"," +
                        points.isSmoke +"," + points.durationAG + "," + points.CAD + "," + points.DAD + "," +
                        points.cholesterol + "," + points.interleukin + "," + points.TNF + ","+ points.neopterin +
                        "," + points.lacticAcid + "," + points.alphaLinolenicAcid + "," + points.arachidonicAcid +
                        "," + points.MDA + "," + points.COD + "," + points.IMMLG + "," + points.bloodReduction +")";

        Statement p =  getConnection().createStatement();
        p.execute(insert);
        p.close();
    }
}
