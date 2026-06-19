import java.sql.*;
import javax.swing.table.DefaultTableModel;

public class LandDAO {

    // ADD OWNER
    public void addOwner(
            String name,
            String address,
            String phoneNo,
            String aadhaarNo
    ) {

        try {

            Connection con =
                    DBConnection.getConnection();

            String query =
                    "INSERT INTO owner(name,address,phone_no,aadhaar_no) VALUES(?,?,?,?)";

            PreparedStatement ps =
                    con.prepareStatement(query);

            ps.setString(1, name);
            ps.setString(2, address);
            ps.setString(3, phoneNo);
            ps.setString(4, aadhaarNo);

            ps.executeUpdate();

            System.out.println("Owner Added!");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // VIEW OWNERS
    public DefaultTableModel getOwners() {

        DefaultTableModel model =
                new DefaultTableModel();

        model.addColumn("Owner ID");
        model.addColumn("Name");
        model.addColumn("Address");
        model.addColumn("Phone");
        model.addColumn("Aadhaar");

        try {

            Connection con =
                    DBConnection.getConnection();

            String query =
                    "SELECT * FROM owner";

            Statement st =
                    con.createStatement();

            ResultSet rs =
                    st.executeQuery(query);

            while (rs.next()) {

                model.addRow(new Object[]{

                        rs.getInt("owner_id"),

                        rs.getString("name"),

                        rs.getString("address"),

                        rs.getString("phone_no"),

                        rs.getString("aadhaar_no")
                });
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return model;
    }

    // UPDATE OWNER
    public void updateOwner(
            int ownerId,
            String name,
            String address,
            String phoneNo
    ) {

        try {

            Connection con =
                    DBConnection.getConnection();

            String query =
                    "UPDATE owner SET name=?, address=?, phone_no=? WHERE owner_id=?";

            PreparedStatement ps =
                    con.prepareStatement(query);

            ps.setString(1, name);

            ps.setString(2, address);

            ps.setString(3, phoneNo);

            ps.setInt(4, ownerId);

            ps.executeUpdate();

            System.out.println("Owner Updated!");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // DELETE OWNER
    public void deleteOwner(int ownerId) {

        try {

            Connection con =
                    DBConnection.getConnection();

            String query =
                    "DELETE FROM owner WHERE owner_id=?";

            PreparedStatement ps =
                    con.prepareStatement(query);

            ps.setInt(1, ownerId);

            ps.executeUpdate();

            System.out.println("Owner Deleted!");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}