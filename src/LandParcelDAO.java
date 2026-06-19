import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;

public class LandParcelDAO {

    // ADD LAND PARCEL
    public void addLandParcel(
            double area,
            String landType,
            int ownerId
    ) {

        try {

            Connection con =
                    DBConnection.getConnection();

            String query =
                    "INSERT INTO land_parcel(area, land_type, owner_id) VALUES(?,?,?)";

            PreparedStatement ps =
                    con.prepareStatement(query);

            ps.setDouble(1, area);

            ps.setString(2, landType);

            ps.setInt(3, ownerId);

            ps.executeUpdate();

            System.out.println("Land Parcel Added!");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // VIEW LAND PARCELS
    public DefaultTableModel getLandParcels() {

        DefaultTableModel model =
                new DefaultTableModel();

        model.addColumn("Parcel ID");
        model.addColumn("Area");
        model.addColumn("Land Type");
        model.addColumn("Owner ID");

        try {

            Connection con =
                    DBConnection.getConnection();

            String query =
                    "SELECT * FROM land_parcel";

            Statement st =
                    con.createStatement();

            ResultSet rs =
                    st.executeQuery(query);

            while (rs.next()) {

                model.addRow(new Object[]{

                        rs.getInt("parcel_id"),

                        rs.getDouble("area"),

                        rs.getString("land_type"),

                        rs.getInt("owner_id")
                });
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return model;
    }
}