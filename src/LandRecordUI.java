import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class LandRecordUI extends JFrame {

    JTextField nameField, addressField,
            phoneField, aadhaarField,
            areaField, landTypeField,
            ownerIdField;

    JButton saveButton, viewButton,
            viewLandButton,
            updateButton,
            deleteButton;

    public LandRecordUI() {

        setTitle("Land Record Management System");

        setSize(850, 750);

        setLocationRelativeTo(null);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setLayout(null);

        // Sage Green Background
        getContentPane().setBackground(
                new Color(167, 196, 188));

        JPanel card = new JPanel();

        card.setLayout(null);

        card.setBounds(170, 20, 500, 650);

        // Card Background
        card.setBackground(
                new Color(242, 245, 242));

        // Border
        card.setBorder(
                BorderFactory.createCompoundBorder(
                        BorderFactory.createLineBorder(
                                new Color(210, 220, 215), 1),
                        BorderFactory.createEmptyBorder(
                                10,10,10,10)
                )
        );

        add(card);

        // TITLE
        JLabel title = new JLabel(
                "Land Record System");

        title.setBounds(110, 20, 320, 40);

        title.setFont(
                new Font("Segoe UI", Font.BOLD, 30));

        title.setForeground(
                new Color(93, 128, 117));

        card.add(title);

        // SUBTITLE
        JLabel subtitle = new JLabel(
                "Manage Land & Owner Records");

        subtitle.setBounds(130, 60, 250, 20);

        subtitle.setFont(
                new Font("Segoe UI", Font.PLAIN, 13));

        subtitle.setForeground(
                new Color(120, 120, 120));

        card.add(subtitle);

        Font labelFont =
                new Font("Segoe UI", Font.BOLD, 15);

        Font fieldFont =
                new Font("Segoe UI", Font.PLAIN, 14);

        // OWNER NAME
        JLabel nameLabel =
                new JLabel("Owner Name");

        nameLabel.setBounds(50, 110, 120, 30);

        nameLabel.setFont(labelFont);

        card.add(nameLabel);

        nameField = new JTextField();

        nameField.setBounds(220, 110, 220, 35);

        nameField.setFont(fieldFont);

        card.add(nameField);

        // ADDRESS
        JLabel addressLabel =
                new JLabel("Address");

        addressLabel.setBounds(50, 160, 120, 30);

        addressLabel.setFont(labelFont);

        card.add(addressLabel);

        addressField = new JTextField();

        addressField.setBounds(220, 160, 220, 35);

        addressField.setFont(fieldFont);

        card.add(addressField);

        // PHONE
        JLabel phoneLabel =
                new JLabel("Phone Number");

        phoneLabel.setBounds(50, 210, 120, 30);

        phoneLabel.setFont(labelFont);

        card.add(phoneLabel);

        phoneField = new JTextField();

        phoneField.setBounds(220, 210, 220, 35);

        phoneField.setFont(fieldFont);

        card.add(phoneField);

        // AADHAAR
        JLabel aadhaarLabel =
                new JLabel("Aadhaar Number");

        aadhaarLabel.setBounds(50, 260, 140, 30);

        aadhaarLabel.setFont(labelFont);

        card.add(aadhaarLabel);

        aadhaarField = new JTextField();

        aadhaarField.setBounds(220, 260, 220, 35);

        aadhaarField.setFont(fieldFont);

        card.add(aadhaarField);

        // LAND TITLE
        JLabel landTitle = new JLabel(
                "Land Parcel Details");

        landTitle.setBounds(130, 320, 250, 30);

        landTitle.setFont(
                new Font("Segoe UI", Font.BOLD, 22));

        landTitle.setForeground(
                new Color(93, 128, 117));

        card.add(landTitle);

        // AREA
        JLabel areaLabel =
                new JLabel("Area");

        areaLabel.setBounds(50, 370, 120, 30);

        areaLabel.setFont(labelFont);

        card.add(areaLabel);

        areaField = new JTextField();

        areaField.setBounds(220, 370, 220, 35);

        areaField.setFont(fieldFont);

        card.add(areaField);

        // LAND TYPE
        JLabel landTypeLabel =
                new JLabel("Land Type");

        landTypeLabel.setBounds(50, 420, 120, 30);

        landTypeLabel.setFont(labelFont);

        card.add(landTypeLabel);

        landTypeField = new JTextField();

        landTypeField.setBounds(220, 420, 220, 35);

        landTypeField.setFont(fieldFont);

        card.add(landTypeField);

        // OWNER ID
        JLabel ownerIdLabel =
                new JLabel("Owner ID");

        ownerIdLabel.setBounds(50, 470, 120, 30);

        ownerIdLabel.setFont(labelFont);

        card.add(ownerIdLabel);

        ownerIdField = new JTextField();

        ownerIdField.setBounds(220, 470, 220, 35);

        ownerIdField.setFont(fieldFont);

        card.add(ownerIdField);

        // SAVE BUTTON
        saveButton = new JButton("SAVE");

        saveButton.setBounds(30, 530, 100, 40);

        saveButton.setBackground(
                new Color(123, 160, 145));

        saveButton.setForeground(Color.WHITE);

        saveButton.setFont(
                new Font("Segoe UI", Font.BOLD, 14));

        saveButton.setFocusPainted(false);

        saveButton.setBorderPainted(false);

        saveButton.setCursor(
                new Cursor(Cursor.HAND_CURSOR));

        card.add(saveButton);

        // VIEW OWNER BUTTON
        viewButton = new JButton("VIEW OWNERS");

        viewButton.setBounds(145, 530, 130, 40);

        viewButton.setBackground(
                new Color(188, 204, 198));

        viewButton.setForeground(Color.BLACK);

        viewButton.setFont(
                new Font("Segoe UI", Font.BOLD, 13));

        viewButton.setFocusPainted(false);

        viewButton.setBorderPainted(false);

        viewButton.setCursor(
                new Cursor(Cursor.HAND_CURSOR));

        card.add(viewButton);

        // VIEW LAND BUTTON
        viewLandButton = new JButton("VIEW LAND");

        viewLandButton.setBounds(290, 530, 130, 40);

        viewLandButton.setBackground(
                new Color(140, 170, 160));

        viewLandButton.setForeground(Color.WHITE);

        viewLandButton.setFont(
                new Font("Segoe UI", Font.BOLD, 13));

        viewLandButton.setFocusPainted(false);

        viewLandButton.setBorderPainted(false);

        viewLandButton.setCursor(
                new Cursor(Cursor.HAND_CURSOR));

        card.add(viewLandButton);

        // UPDATE BUTTON
        updateButton = new JButton("UPDATE");

        updateButton.setBounds(90, 590, 130, 40);

        updateButton.setBackground(
                new Color(93, 128, 117));

        updateButton.setForeground(Color.WHITE);

        updateButton.setFont(
                new Font("Segoe UI", Font.BOLD, 14));

        updateButton.setFocusPainted(false);

        updateButton.setBorderPainted(false);

        updateButton.setCursor(
                new Cursor(Cursor.HAND_CURSOR));

        card.add(updateButton);

        // DELETE BUTTON
        deleteButton = new JButton("DELETE");

        deleteButton.setBounds(260, 590, 130, 40);

        deleteButton.setBackground(
                new Color(180, 80, 80));

        deleteButton.setForeground(Color.WHITE);

        deleteButton.setFont(
                new Font("Segoe UI", Font.BOLD, 14));

        deleteButton.setFocusPainted(false);

        deleteButton.setBorderPainted(false);

        deleteButton.setCursor(
                new Cursor(Cursor.HAND_CURSOR));

        card.add(deleteButton);

        // SAVE ACTION
        saveButton.addActionListener(
                new ActionListener() {

            public void actionPerformed(
                    ActionEvent e) {

                LandDAO ownerDao = new LandDAO();

                ownerDao.addOwner(
                        nameField.getText(),
                        addressField.getText(),
                        phoneField.getText(),
                        aadhaarField.getText()
                );

                LandParcelDAO parcelDao =
                        new LandParcelDAO();

                parcelDao.addLandParcel(
                        Double.parseDouble(
                                areaField.getText()),

                        landTypeField.getText(),

                        Integer.parseInt(
                                ownerIdField.getText())
                );

                JOptionPane.showMessageDialog(
                        null,
                        "Record Saved Successfully!");

                // CLEAR FIELDS
                nameField.setText("");
                addressField.setText("");
                phoneField.setText("");
                aadhaarField.setText("");
                areaField.setText("");
                landTypeField.setText("");
                ownerIdField.setText("");
            }
        });

        // VIEW OWNERS
        viewButton.addActionListener(
                new ActionListener() {

            public void actionPerformed(
                    ActionEvent e) {

                LandDAO dao = new LandDAO();

                JTable table =
                        new JTable(dao.getOwners());

                JScrollPane scrollPane =
                        new JScrollPane(table);

                JFrame tableFrame =
                        new JFrame("Owner Records");

                tableFrame.add(scrollPane);

                tableFrame.setSize(700, 300);

                tableFrame.setLocationRelativeTo(null);

                tableFrame.setVisible(true);
            }
        });

        // VIEW LAND
        viewLandButton.addActionListener(
                new ActionListener() {

            public void actionPerformed(
                    ActionEvent e) {

                LandParcelDAO dao =
                        new LandParcelDAO();

                JTable table =
                        new JTable(
                                dao.getLandParcels());

                JScrollPane scrollPane =
                        new JScrollPane(table);

                JFrame tableFrame =
                        new JFrame("Land Parcel Records");

                tableFrame.add(scrollPane);

                tableFrame.setSize(700, 300);

                tableFrame.setLocationRelativeTo(null);

                tableFrame.setVisible(true);
            }
        });

        // UPDATE ACTION
        updateButton.addActionListener(
                new ActionListener() {

            public void actionPerformed(
                    ActionEvent e) {

                LandDAO dao = new LandDAO();

                dao.updateOwner(
                        Integer.parseInt(
                                ownerIdField.getText()),

                        nameField.getText(),

                        addressField.getText(),

                        phoneField.getText()
                );

                JOptionPane.showMessageDialog(
                        null,
                        "Owner Updated Successfully!");
            }
        });

        // DELETE ACTION
        deleteButton.addActionListener(
                new ActionListener() {

            public void actionPerformed(
                    ActionEvent e) {

                LandDAO dao = new LandDAO();

                dao.deleteOwner(
                        Integer.parseInt(
                                ownerIdField.getText())
                );

                JOptionPane.showMessageDialog(
                        null,
                        "Owner Deleted Successfully!");

                // CLEAR FIELDS
                nameField.setText("");
                addressField.setText("");
                phoneField.setText("");
                aadhaarField.setText("");
                areaField.setText("");
                landTypeField.setText("");
                ownerIdField.setText("");
            }
        });

        setVisible(true);
    }

    public static void main(String[] args) {

        new LandRecordUI();

    }
}