import com.formdev.flatlaf.FlatIntelliJLaf;
import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvException;
import java.util.List;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.UIManager;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;

public class Main extends javax.swing.JFrame {

    public Main() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbTitle = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        censusTab = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        censusTable = new javax.swing.JTable();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jLabel1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        tfFNameC = new javax.swing.JTextField();
        tfCity = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        tfPIN = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        tfReligion = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        tfLNameC = new javax.swing.JTextField();
        tfState = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        cbGender = new javax.swing.JComboBox<>();
        tfDistrict = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        ftfDOB = new javax.swing.JFormattedTextField();
        jLabel3 = new javax.swing.JLabel();
        tfAadhaar = new javax.swing.JTextField();
        btDeleteC = new javax.swing.JButton();
        btClearC = new javax.swing.JButton();
        tbtUpdateC = new javax.swing.JToggleButton();
        btAddC = new javax.swing.JButton();
        loadCsvC = new javax.swing.JButton();
        exportCsvC = new javax.swing.JButton();
        salaryTab = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        salaryTable = new javax.swing.JTable();
        jDesktopPane2 = new javax.swing.JDesktopPane();
        jLabel4 = new javax.swing.JLabel();
        tfFNameS = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        tfLNameS = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        tfPAN = new javax.swing.JTextField();
        btDeleteS = new javax.swing.JButton();
        btClearS = new javax.swing.JButton();
        tbtUpdateS = new javax.swing.JToggleButton();
        btAddS = new javax.swing.JButton();
        tfBasic = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        tfHRA = new javax.swing.JTextField();
        tfLTA = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        tfMA = new javax.swing.JTextField();
        loadCsvS = new javax.swing.JButton();
        exportCsvS = new javax.swing.JButton();
        employmentTab = new javax.swing.JPanel();
        btExit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Data Collection System");
        setMaximizedBounds(new java.awt.Rectangle(0, 0, 0, 0));
        setMinimumSize(new java.awt.Dimension(1154, 870));
        setPreferredSize(new java.awt.Dimension(1154, 870));

        lbTitle.setFont(new java.awt.Font("Meera", 1, 36)); // NOI18N
        lbTitle.setText("DATA COLLECTION SYSTEM");

        jTabbedPane1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTabbedPane1.setFont(new java.awt.Font("C059", 0, 18)); // NOI18N

        jScrollPane1.setFont(new java.awt.Font("Liberation Sans", 0, 15)); // NOI18N

        censusTable.setFont(new java.awt.Font("Liberation Sans Narrow", 0, 15)); // NOI18N
        censusTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Aadhaar", "First Name", "Last Name", "Date of Birth", "Gender", "Religion", "City/Town/Village", "PIN", "District", "State"
            }
        ));
        censusTable.setGridColor(new java.awt.Color(102, 102, 102));
        censusTable.setSelectionBackground(new java.awt.Color(51, 153, 255));
        jScrollPane1.setViewportView(censusTable);

        jLabel1.setFont(new java.awt.Font("C059", 0, 18)); // NOI18N
        jLabel1.setText("First Name");

        jLabel8.setFont(new java.awt.Font("C059", 0, 18)); // NOI18N
        jLabel8.setText("City/Town/Village");

        tfFNameC.setFont(new java.awt.Font("C059", 0, 18)); // NOI18N

        tfCity.setFont(new java.awt.Font("C059", 0, 18)); // NOI18N

        jLabel2.setFont(new java.awt.Font("C059", 0, 18)); // NOI18N
        jLabel2.setText("Last Name");

        tfPIN.setFont(new java.awt.Font("C059", 0, 18)); // NOI18N

        jLabel9.setFont(new java.awt.Font("C059", 0, 18)); // NOI18N
        jLabel9.setText("District");

        jLabel7.setFont(new java.awt.Font("C059", 0, 18)); // NOI18N
        jLabel7.setText("Date of Birth");

        tfReligion.setFont(new java.awt.Font("C059", 0, 18)); // NOI18N

        jLabel11.setFont(new java.awt.Font("C059", 0, 18)); // NOI18N
        jLabel11.setText("PIN");

        tfLNameC.setFont(new java.awt.Font("C059", 0, 18)); // NOI18N

        tfState.setFont(new java.awt.Font("C059", 0, 18)); // NOI18N

        jLabel13.setFont(new java.awt.Font("C059", 0, 18)); // NOI18N
        jLabel13.setText("Religion");

        cbGender.setFont(new java.awt.Font("C059", 0, 18)); // NOI18N
        cbGender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Female", "Male", "Others" }));

        tfDistrict.setFont(new java.awt.Font("C059", 0, 18)); // NOI18N

        jLabel10.setFont(new java.awt.Font("C059", 0, 18)); // NOI18N
        jLabel10.setText("State");

        jLabel12.setFont(new java.awt.Font("C059", 0, 18)); // NOI18N
        jLabel12.setText("Gender");

        ftfDOB.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("dd/MM/yyyy"))));
        ftfDOB.setToolTipText("Format: dd/MM/yyyy");
        ftfDOB.setFont(new java.awt.Font("C059", 0, 18)); // NOI18N

        jLabel3.setFont(new java.awt.Font("C059", 0, 18)); // NOI18N
        jLabel3.setText("Aadhaar Number");

        tfAadhaar.setFont(new java.awt.Font("C059", 0, 18)); // NOI18N

        btDeleteC.setFont(new java.awt.Font("C059", 0, 18)); // NOI18N
        btDeleteC.setText("DELETE");
        btDeleteC.setAlignmentY(0.0F);
        btDeleteC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDeleteCActionPerformed(evt);
            }
        });

        btClearC.setFont(new java.awt.Font("C059", 0, 18)); // NOI18N
        btClearC.setText("CLEAR");
        btClearC.setAlignmentY(0.0F);
        btClearC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btClearCActionPerformed(evt);
            }
        });

        tbtUpdateC.setFont(new java.awt.Font("C059", 0, 18)); // NOI18N
        tbtUpdateC.setText("UPDATE");
        tbtUpdateC.setAlignmentY(0.0F);
        tbtUpdateC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbtUpdateCActionPerformed(evt);
            }
        });

        btAddC.setFont(new java.awt.Font("C059", 0, 18)); // NOI18N
        btAddC.setText("ADD");
        btAddC.setAlignmentY(0.0F);
        btAddC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAddCActionPerformed(evt);
            }
        });

        jDesktopPane1.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel8, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(tfFNameC, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(tfCity, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(tfPIN, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel9, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel7, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(tfReligion, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel11, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(tfLNameC, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(tfState, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel13, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(cbGender, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(tfDistrict, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel10, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel12, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(ftfDOB, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(tfAadhaar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(btDeleteC, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(btClearC, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(tbtUpdateC, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(btAddC, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10)
                            .addComponent(jLabel7)
                            .addComponent(jLabel11)
                            .addComponent(jLabel12)
                            .addComponent(jLabel13)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tfDistrict)
                            .addComponent(tfState)
                            .addComponent(tfPIN)
                            .addComponent(tfCity)
                            .addComponent(tfLNameC)
                            .addComponent(tfFNameC)
                            .addComponent(cbGender, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tfReligion)
                            .addComponent(ftfDOB, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfAadhaar, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(28, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jDesktopPane1Layout.createSequentialGroup()
                        .addGap(127, 127, 127)
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(tbtUpdateC)
                            .addComponent(btAddC, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btClearC)
                            .addComponent(btDeleteC))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        jDesktopPane1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btAddC, btClearC, btDeleteC, tbtUpdateC});

        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(tfAadhaar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tfFNameC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tfLNameC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(ftfDOB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(cbGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(tfReligion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(tfCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(tfPIN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(tfDistrict, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(tfState, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btAddC, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btClearC))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tbtUpdateC)
                    .addComponent(btDeleteC))
                .addGap(12, 12, 12))
        );

        jDesktopPane1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btAddC, btClearC, btDeleteC, tbtUpdateC});

        loadCsvC.setFont(new java.awt.Font("C059", 0, 15)); // NOI18N
        loadCsvC.setText("Load CSV");
        loadCsvC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loadCsvCActionPerformed(evt);
            }
        });

        exportCsvC.setFont(new java.awt.Font("C059", 0, 15)); // NOI18N
        exportCsvC.setText("Export as CSV");
        exportCsvC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exportCsvCActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout censusTabLayout = new javax.swing.GroupLayout(censusTab);
        censusTab.setLayout(censusTabLayout);
        censusTabLayout.setHorizontalGroup(
            censusTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(censusTabLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(censusTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(censusTabLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(loadCsvC)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(exportCsvC))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 663, Short.MAX_VALUE))
                .addContainerGap())
        );

        censusTabLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {exportCsvC, loadCsvC});

        censusTabLayout.setVerticalGroup(
            censusTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(censusTabLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(censusTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(censusTabLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 540, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(censusTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(loadCsvC)
                            .addComponent(exportCsvC))))
                .addContainerGap(74, Short.MAX_VALUE))
        );

        censusTabLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {exportCsvC, loadCsvC});

        jTabbedPane1.addTab("CENSUS", censusTab);

        jScrollPane2.setFont(new java.awt.Font("Liberation Sans", 0, 15)); // NOI18N

        salaryTable.setFont(new java.awt.Font("Liberation Sans Narrow", 0, 15)); // NOI18N
        salaryTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "PAN", "First Name", "Last Name", "Basic", "HRA", "LTA", "MA"
            }
        ));
        salaryTable.setGridColor(new java.awt.Color(102, 102, 102));
        salaryTable.setSelectionBackground(new java.awt.Color(51, 153, 255));
        jScrollPane2.setViewportView(salaryTable);

        jLabel4.setFont(new java.awt.Font("C059", 0, 18)); // NOI18N
        jLabel4.setText("First Name");

        tfFNameS.setFont(new java.awt.Font("C059", 0, 18)); // NOI18N

        jLabel5.setFont(new java.awt.Font("C059", 0, 18)); // NOI18N
        jLabel5.setText("Last Name");

        jLabel16.setFont(new java.awt.Font("C059", 0, 18)); // NOI18N
        jLabel16.setText("Basic Pay");

        tfLNameS.setFont(new java.awt.Font("C059", 0, 18)); // NOI18N

        jLabel6.setFont(new java.awt.Font("C059", 0, 18)); // NOI18N
        jLabel6.setText("PAN");

        tfPAN.setFont(new java.awt.Font("C059", 0, 18)); // NOI18N

        btDeleteS.setFont(new java.awt.Font("C059", 0, 18)); // NOI18N
        btDeleteS.setText("DELETE");
        btDeleteS.setAlignmentY(0.0F);
        btDeleteS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDeleteSActionPerformed(evt);
            }
        });

        btClearS.setFont(new java.awt.Font("C059", 0, 18)); // NOI18N
        btClearS.setText("CLEAR");
        btClearS.setAlignmentY(0.0F);
        btClearS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btClearSActionPerformed(evt);
            }
        });

        tbtUpdateS.setFont(new java.awt.Font("C059", 0, 18)); // NOI18N
        tbtUpdateS.setText("UPDATE");
        tbtUpdateS.setAlignmentY(0.0F);
        tbtUpdateS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbtUpdateSActionPerformed(evt);
            }
        });

        btAddS.setFont(new java.awt.Font("C059", 0, 18)); // NOI18N
        btAddS.setText("ADD");
        btAddS.setAlignmentY(0.0F);
        btAddS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAddSActionPerformed(evt);
            }
        });

        tfBasic.setFont(new java.awt.Font("C059", 0, 18)); // NOI18N

        jLabel21.setFont(new java.awt.Font("C059", 0, 18)); // NOI18N
        jLabel21.setText("HRA");

        tfHRA.setFont(new java.awt.Font("C059", 0, 18)); // NOI18N

        tfLTA.setFont(new java.awt.Font("C059", 0, 18)); // NOI18N

        jLabel22.setFont(new java.awt.Font("C059", 0, 18)); // NOI18N
        jLabel22.setText("LTA");

        jLabel23.setFont(new java.awt.Font("C059", 0, 18)); // NOI18N
        jLabel23.setText("MA");

        tfMA.setFont(new java.awt.Font("C059", 0, 18)); // NOI18N

        jDesktopPane2.setLayer(jLabel4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(tfFNameS, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(jLabel5, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(jLabel16, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(tfLNameS, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(jLabel6, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(tfPAN, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(btDeleteS, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(btClearS, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(tbtUpdateS, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(btAddS, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(tfBasic, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(jLabel21, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(tfHRA, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(tfLTA, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(jLabel22, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(jLabel23, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(tfMA, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane2Layout = new javax.swing.GroupLayout(jDesktopPane2);
        jDesktopPane2.setLayout(jDesktopPane2Layout);
        jDesktopPane2Layout.setHorizontalGroup(
            jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jDesktopPane2Layout.createSequentialGroup()
                        .addGap(127, 127, 127)
                        .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(tbtUpdateS)
                            .addComponent(btAddS, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btClearS)
                            .addComponent(btDeleteS))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jDesktopPane2Layout.createSequentialGroup()
                        .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel16)
                            .addComponent(jLabel6)
                            .addComponent(jLabel21)
                            .addComponent(jLabel22)
                            .addComponent(jLabel23))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 69, Short.MAX_VALUE)
                        .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfFNameS, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfPAN, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfLNameS, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfBasic, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfHRA, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfLTA, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfMA, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27))))
        );

        jDesktopPane2Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btAddS, btClearS, btDeleteS, tbtUpdateS});

        jDesktopPane2Layout.setVerticalGroup(
            jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane2Layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(tfPAN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(tfFNameS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(tfLNameS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfBasic, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16))
                .addGap(18, 18, 18)
                .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfHRA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21))
                .addGap(18, 18, 18)
                .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfLTA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel22))
                .addGap(18, 18, 18)
                .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfMA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel23))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btAddS, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btClearS))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tbtUpdateS)
                    .addComponent(btDeleteS))
                .addGap(12, 12, 12))
        );

        jDesktopPane2Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btAddS, btClearS, btDeleteS, tbtUpdateS});

        loadCsvS.setFont(new java.awt.Font("C059", 0, 15)); // NOI18N
        loadCsvS.setText("Load CSV");
        loadCsvS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loadCsvSActionPerformed(evt);
            }
        });

        exportCsvS.setFont(new java.awt.Font("C059", 0, 15)); // NOI18N
        exportCsvS.setText("Export as CSV");
        exportCsvS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exportCsvSActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout salaryTabLayout = new javax.swing.GroupLayout(salaryTab);
        salaryTab.setLayout(salaryTabLayout);
        salaryTabLayout.setHorizontalGroup(
            salaryTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(salaryTabLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jDesktopPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(salaryTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(salaryTabLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(loadCsvS)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(exportCsvS))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 665, Short.MAX_VALUE))
                .addContainerGap())
        );

        salaryTabLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {exportCsvS, loadCsvS});

        salaryTabLayout.setVerticalGroup(
            salaryTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(salaryTabLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(salaryTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jDesktopPane2)
                    .addGroup(salaryTabLayout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 543, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(salaryTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(exportCsvS)
                            .addComponent(loadCsvS))))
                .addContainerGap(89, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("SALARY", salaryTab);

        javax.swing.GroupLayout employmentTabLayout = new javax.swing.GroupLayout(employmentTab);
        employmentTab.setLayout(employmentTabLayout);
        employmentTabLayout.setHorizontalGroup(
            employmentTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1140, Short.MAX_VALUE)
        );
        employmentTabLayout.setVerticalGroup(
            employmentTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 689, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("EMPLOYMENT", employmentTab);

        btExit.setFont(new java.awt.Font("C059", 0, 18)); // NOI18N
        btExit.setText("EXIT");
        btExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTabbedPane1)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(lbTitle)
                        .addGap(389, 389, 389))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btExit, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(513, 513, 513))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 723, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btExit, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    private void btExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExitActionPerformed
        if (changedC == true && censusTable.getModel().getRowCount() > 0) {
            int result = JOptionPane.showConfirmDialog(this,"You have an unsaved census data table. Do you want to save it before exiting?", "Question", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
            switch (result) {
                case JOptionPane.YES_OPTION:
                    exportCsvCActionPerformed(evt);
                    break;
                case JOptionPane.NO_OPTION:
                    break;
                default:
                    return;
            }
        } else if (changedS == true && salaryTable.getModel().getRowCount() > 0) {
            int result = JOptionPane.showConfirmDialog(this,"You have an unsaved salary data table. Do you want to save it before exiting?", "Question", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
            switch (result) {
                case JOptionPane.YES_OPTION:
                    exportCsvSActionPerformed(evt);
                    break;
                case JOptionPane.NO_OPTION:
                    break;
                default:
                    return;
            }
        }
        System.exit(0);
    }//GEN-LAST:event_btExitActionPerformed

    private void btAddCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAddCActionPerformed
        if (tfAadhaar.getText().isBlank() || 
                tfFNameC.getText().isBlank() || 
                tfLNameC.getText().isBlank() || 
                ftfDOB.getText().isBlank() || 
                cbGender.getSelectedIndex() == 0 ||
                tfReligion.getText().isBlank() ||
                tfCity.getText().isBlank() ||
                tfPIN.getText().isBlank() ||
                tfDistrict.getText().isBlank() ||
                tfState.getText().isBlank()) {
            JOptionPane.showMessageDialog(this, "Invalid Input. Please check if any one of the inputs are empty or of invalid format and try again.", "Error", JOptionPane.ERROR_MESSAGE);
            
        } else {
            Object[] dataRow = new Object[10];
            dataRow[0] = tfAadhaar.getText();
            dataRow[1] = tfFNameC.getText();
            dataRow[2] = tfLNameC.getText();
            dataRow[3] = ftfDOB.getText();
            dataRow[4] = cbGender.getSelectedItem();
            dataRow[5] = tfReligion.getText();
            dataRow[6] = tfCity.getText();
            dataRow[7] = tfPIN.getText();
            dataRow[8] = tfDistrict.getText();
            dataRow[9] = tfState.getText();
            DefaultTableModel model = (DefaultTableModel) censusTable.getModel();
            model.addRow(dataRow);
            changedC = true;
            btClearCActionPerformed(evt);
            JOptionPane.showMessageDialog(this, "Data point added successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btAddCActionPerformed

    private void btClearCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btClearCActionPerformed
        tfAadhaar.setText("");
        tfFNameC.setText("");
        tfLNameC.setText("");
        ftfDOB.setText("");
        cbGender.setSelectedIndex(0);
        tfReligion.setText("");
        tfCity.setText("");
        tfPIN.setText("");
        tfDistrict.setText("");
        tfState.setText("");
    }//GEN-LAST:event_btClearCActionPerformed

    private void btDeleteCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDeleteCActionPerformed
        int row = censusTable.getSelectedRow();
        if (row < 0) {
            JOptionPane.showMessageDialog(this, "No data point is selected to be deleted! Please select one and continue.", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            DefaultTableModel model = (DefaultTableModel) censusTable.getModel();
            model.removeRow(row);
            changedC = true;
            JOptionPane.showMessageDialog(this, "Data point removed successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btDeleteCActionPerformed

    private void tbtUpdateCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbtUpdateCActionPerformed
        if (tbtUpdateC.isSelected()) {
            selectedRowC = censusTable.getSelectedRow();
            if (selectedRowC < 0) {
                tbtUpdateC.setSelected(false);
                JOptionPane.showMessageDialog(this, "No data point is selected to be updated! Please select one and continue.", "Error", JOptionPane.ERROR_MESSAGE);
            } else {
                tbtUpdateC.setText("SAVE");
                btAddC.setEnabled(false);
                btDeleteC.setEnabled(false);
                censusTable.setEnabled(false);
                loadCsvC.setEnabled(false);
                exportCsvC.setEnabled(false);
                DefaultTableModel model = (DefaultTableModel) censusTable.getModel();
                tfAadhaar.setText(model.getValueAt(selectedRowC, 0).toString());
                tfFNameC.setText(model.getValueAt(selectedRowC, 1).toString());
                tfLNameC.setText(model.getValueAt(selectedRowC, 2).toString());
                ftfDOB.setText(model.getValueAt(selectedRowC, 3).toString());
                cbGender.setSelectedItem(model.getValueAt(selectedRowC, 4).toString());
                tfReligion.setText(model.getValueAt(selectedRowC, 5).toString());
                tfCity.setText(model.getValueAt(selectedRowC, 6).toString());
                tfPIN.setText(model.getValueAt(selectedRowC, 7).toString());
                tfDistrict.setText(model.getValueAt(selectedRowC, 8).toString());
                tfState.setText(model.getValueAt(selectedRowC, 9).toString());
            }
        } else if (!tbtUpdateC.isSelected()) {
            if (tfAadhaar.getText().isBlank() || 
                tfFNameC.getText().isBlank() || 
                tfLNameC.getText().isBlank() || 
                ftfDOB.getText().isBlank() || 
                cbGender.getSelectedIndex() == 0 ||
                tfReligion.getText().isBlank() ||
                tfCity.getText().isBlank() ||
                tfPIN.getText().isBlank() ||
                tfDistrict.getText().isBlank() ||
                tfState.getText().isBlank()) {
                JOptionPane.showMessageDialog(this, "Invalid Input! Please check if any one of the inputs are empty or is of invalid format, and try again.", "Error", JOptionPane.ERROR_MESSAGE);
            } else {      
                censusTable.setEnabled(true);
                DefaultTableModel model = (DefaultTableModel) censusTable.getModel();
                model.setValueAt(tfAadhaar.getText(), selectedRowC, 0);
                model.setValueAt(tfFNameC.getText(), selectedRowC, 1);
                model.setValueAt(tfLNameC.getText(), selectedRowC, 2);
                model.setValueAt(ftfDOB.getText(), selectedRowC, 3);
                model.setValueAt(cbGender.getSelectedItem(), selectedRowC, 4);
                model.setValueAt(tfReligion.getText(), selectedRowC, 5);
                model.setValueAt(tfCity.getText(), selectedRowC, 6);
                model.setValueAt(tfPIN.getText(), selectedRowC, 7);
                model.setValueAt(tfDistrict.getText(), selectedRowC, 8);
                model.setValueAt(tfState.getText(), selectedRowC, 9);
                changedC = true;
                tbtUpdateC.setText("UPDATE");
                btClearCActionPerformed(evt);
                btAddC.setEnabled(true);
                btDeleteC.setEnabled(true);
                loadCsvC.setEnabled(true);
                exportCsvC.setEnabled(true);
                JOptionPane.showMessageDialog(this, "Data point updated successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }//GEN-LAST:event_tbtUpdateCActionPerformed

    private void exportCsvCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exportCsvCActionPerformed
        if (changedC == true && censusTable.getModel().getRowCount() > 0) {
            JFileChooser fileChooser = new JFileChooser();
            int option = fileChooser.showSaveDialog(null);
            if (option == JFileChooser.APPROVE_OPTION) {
                if (fileChooser.getSelectedFile().exists()) {
                    int result = JOptionPane.showConfirmDialog(this,"Another file with the same name exists in the desired directory. Do you want to overwrite it?", "Question", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
                    switch (result) {
                        case JOptionPane.YES_OPTION:
                            break;
                        case JOptionPane.NO_OPTION:
                            return;
                        default:
                            return;
                    }
                }
                exportToCSV(censusTable, fileChooser.getSelectedFile().getAbsolutePath());
            }
            changedC = false;
        } else {
            JOptionPane.showMessageDialog(this, "Can't export an empty dataset or a dataset that has not been updated.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_exportCsvCActionPerformed
    
    private void loadCsvCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loadCsvCActionPerformed
        if (changedC == true && censusTable.getModel().getRowCount() > 0) {
            int result = JOptionPane.showConfirmDialog(this,"You have an unsaved census data table. Do you want to save it before loading another CSV dataset?", "Question", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
            switch (result) {
                case JOptionPane.YES_OPTION:
                    exportCsvCActionPerformed(evt);
                    break;
                case JOptionPane.NO_OPTION:
                    break;
                default:
                    return;
            }
        }
        String filePath = "";
        FileNameExtensionFilter fileFilter = new FileNameExtensionFilter(null, "csv");
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setFileFilter(fileFilter);
        fileChooser.setDialogTitle("Choose CSV file to load");
        if (fileChooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
            filePath = fileChooser.getSelectedFile().getAbsolutePath();
        }
        if (filePath.isBlank()) {
            return;
        }
        try {
            Object[] columnNames;
            CSVReader CSVFileReader;
            CSVFileReader = new CSVReader(new FileReader(filePath));
            List myEntries = CSVFileReader.readAll();
            columnNames = (String[]) myEntries.get(0);
            String[] origColumnNames = new String[censusTable.getModel().getColumnCount()];
            for (int i = 0; i < censusTable.getModel().getColumnCount(); i++) {
                origColumnNames[i] = censusTable.getModel().getColumnName(i);
            }            
            if (!Arrays.equals(origColumnNames, columnNames)) {
                JOptionPane.showMessageDialog(this, "Can't load a dataset that has some different template as that of \"Census\".", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            DefaultTableModel tableModel = new DefaultTableModel(columnNames, myEntries.size()-1) {};
            int rowCount = tableModel.getRowCount();
            for (int i = 0; i < rowCount + 1; i++) {
                int columnNum = 0;
                if (i > 0) {
                    for (String thisCellValue : (String[])myEntries.get(i)) {
                        tableModel.setValueAt(thisCellValue, i - 1, columnNum);
                        columnNum++;
                    }
                }
            }
            censusTable.setModel(tableModel);
            JOptionPane.showMessageDialog(this, "CSV imported successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);
        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(this, ex, "Error", JOptionPane.ERROR_MESSAGE);
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(this, ex, "Error", JOptionPane.ERROR_MESSAGE);
        } catch (CsvException ex) {
            JOptionPane.showMessageDialog(this, ex, "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_loadCsvCActionPerformed

    private void loadCsvSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loadCsvSActionPerformed
        if (changedS == true && salaryTable.getModel().getRowCount() > 0) {
            int result = JOptionPane.showConfirmDialog(this,"You have an unsaved salary data table. Do you want to save it before loading another CSV dataset?", "Question", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
            switch (result) {
                case JOptionPane.YES_OPTION:
                    exportCsvSActionPerformed(evt);
                    break;
                case JOptionPane.NO_OPTION:
                    break;
                default:
                    return;
            }
        }
        String filePath = "";
        FileNameExtensionFilter fileFilter = new FileNameExtensionFilter(null, "csv");
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setFileFilter(fileFilter);
        fileChooser.setDialogTitle("Choose CSV file to load");
        if (fileChooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
            filePath = fileChooser.getSelectedFile().getAbsolutePath();
        }
        if (filePath.isBlank()) {
            return;
        }
        try {
            Object[] columnNames;
            CSVReader CSVFileReader;
            CSVFileReader = new CSVReader(new FileReader(filePath));
            List myEntries = CSVFileReader.readAll();
            columnNames = (String[]) myEntries.get(0);
            String[] origColumnNames = new String[salaryTable.getModel().getColumnCount()];
            for (int i = 0; i < salaryTable.getModel().getColumnCount(); i++) {
                origColumnNames[i] = salaryTable.getModel().getColumnName(i);
            }            
            if (!Arrays.equals(origColumnNames, columnNames)) {
                JOptionPane.showMessageDialog(this, "Can't load a dataset that has some different template as that of \"Salary\".", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            DefaultTableModel tableModel = new DefaultTableModel(columnNames, myEntries.size()-1) {};
            int rowCount = tableModel.getRowCount();
            for (int i = 0; i < rowCount + 1; i++) {
                int columnNum = 0;
                if (i > 0) {
                    for (String thisCellValue : (String[])myEntries.get(i)) {
                        tableModel.setValueAt(thisCellValue, i - 1, columnNum);
                        columnNum++;
                    }
                }
            }
            salaryTable.setModel(tableModel);
            JOptionPane.showMessageDialog(this, "CSV imported successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);
        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(this, ex, "Error", JOptionPane.ERROR_MESSAGE);
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(this, ex, "Error", JOptionPane.ERROR_MESSAGE);
        } catch (CsvException ex) {
            JOptionPane.showMessageDialog(this, ex, "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_loadCsvSActionPerformed

    private void exportCsvSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exportCsvSActionPerformed
        if (changedS == true && salaryTable.getModel().getRowCount() > 0) {
            JFileChooser fileChooser = new JFileChooser();
            int option = fileChooser.showSaveDialog(null);
            if (option == JFileChooser.APPROVE_OPTION) {
                if (fileChooser.getSelectedFile().exists()) {
                    int result = JOptionPane.showConfirmDialog(this,"Another file with the same name exists in the desired directory. Do you want to overwrite it?", "Question", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
                    switch (result) {
                        case JOptionPane.YES_OPTION:
                            break;
                        case JOptionPane.NO_OPTION:
                            return;
                        default:
                            return;
                    }
                }
                exportToCSV(salaryTable, fileChooser.getSelectedFile().getAbsolutePath());
            }
            changedS = false;
        } else {
            JOptionPane.showMessageDialog(this, "Can't export an empty dataset or a dataset that has not been updated.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_exportCsvSActionPerformed

    private void btDeleteSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDeleteSActionPerformed
        int row = salaryTable.getSelectedRow();
        if (row < 0) {
            JOptionPane.showMessageDialog(this, "No data point is selected to be deleted! Please select one and continue.", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            DefaultTableModel model = (DefaultTableModel) salaryTable.getModel();
            model.removeRow(row);
            changedS = true;
            JOptionPane.showMessageDialog(this, "Data point removed successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btDeleteSActionPerformed

    private void btClearSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btClearSActionPerformed
        tfPAN.setText("");
        tfFNameS.setText("");
        tfLNameS.setText("");
        tfBasic.setText("");
        tfHRA.setText("");
        tfLTA.setText("");
        tfMA.setText("");
    }//GEN-LAST:event_btClearSActionPerformed

    private void tbtUpdateSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbtUpdateSActionPerformed
        if (tbtUpdateS.isSelected()) {
            selectedRowS = salaryTable.getSelectedRow();
            if (selectedRowS < 0) {
                tbtUpdateS.setSelected(false);
                JOptionPane.showMessageDialog(this, "No data point is selected to be updated! Please select one and continue.", "Error", JOptionPane.ERROR_MESSAGE);
            } else {
                tbtUpdateS.setText("SAVE");
                btAddS.setEnabled(false);
                btDeleteS.setEnabled(false);
                salaryTable.setEnabled(false);
                loadCsvS.setEnabled(false);
                exportCsvS.setEnabled(false);
                DefaultTableModel model = (DefaultTableModel) salaryTable.getModel();
                tfPAN.setText(model.getValueAt(selectedRowS, 0).toString());
                tfFNameS.setText(model.getValueAt(selectedRowS, 1).toString());
                tfLNameS.setText(model.getValueAt(selectedRowS, 2).toString());
                tfBasic.setText(model.getValueAt(selectedRowS, 3).toString());
                tfHRA.setText(model.getValueAt(selectedRowS, 4).toString());
                tfLTA.setText(model.getValueAt(selectedRowS, 5).toString());
                tfMA.setText(model.getValueAt(selectedRowS, 6).toString());
            }
        } else if (!tbtUpdateS.isSelected()) {
            if (tfPAN.getText().isBlank() || 
                tfFNameS.getText().isBlank() || 
                tfLNameS.getText().isBlank() || 
                tfBasic.getText().isBlank() || 
                tfHRA.getText().isBlank() ||
                tfLTA.getText().isBlank() ||
                tfMA.getText().isBlank()) {
                JOptionPane.showMessageDialog(this, "Invalid Input! Please check if any one of the inputs are empty or is of invalid format, and try again.", "Error", JOptionPane.ERROR_MESSAGE);
            } else {      
                salaryTable.setEnabled(true);
                DefaultTableModel model = (DefaultTableModel) salaryTable.getModel();
                model.setValueAt(tfPAN.getText(), selectedRowS, 0);
                model.setValueAt(tfFNameS.getText(), selectedRowS, 1);
                model.setValueAt(tfLNameS.getText(), selectedRowS, 2);
                model.setValueAt(tfBasic.getText(), selectedRowS, 3);
                model.setValueAt(tfHRA.getText(), selectedRowS, 4);
                model.setValueAt(tfLTA.getText(), selectedRowS, 5);
                model.setValueAt(tfMA.getText(), selectedRowS, 6);
                changedS = true;
                tbtUpdateS.setText("UPDATE");
                btClearSActionPerformed(evt);
                btAddS.setEnabled(true);
                btDeleteS.setEnabled(true);
                loadCsvS.setEnabled(true);
                exportCsvS.setEnabled(true);
                JOptionPane.showMessageDialog(this, "Data point updated successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }//GEN-LAST:event_tbtUpdateSActionPerformed

    private void btAddSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAddSActionPerformed
        if (tfPAN.getText().isBlank() || 
                tfFNameS.getText().isBlank() || 
                tfLNameS.getText().isBlank() || 
                tfBasic.getText().isBlank() || 
                tfHRA.getText().isBlank() ||
                tfLTA.getText().isBlank() ||
                tfMA.getText().isBlank()) {
            JOptionPane.showMessageDialog(this, "Invalid Input. Please check if any one of the inputs are empty or of invalid format and try again.", "Error", JOptionPane.ERROR_MESSAGE);
            
        } else {
            Object[] dataRow = new Object[7];
            dataRow[0] = tfPAN.getText();
            dataRow[1] = tfFNameS.getText();
            dataRow[2] = tfLNameS.getText();
            dataRow[3] = tfBasic.getText();
            dataRow[4] = tfHRA.getText();
            dataRow[5] = tfLTA.getText();
            dataRow[6] = tfMA.getText();
            DefaultTableModel model = (DefaultTableModel) salaryTable.getModel();
            model.addRow(dataRow);
            changedS = true;
            btClearSActionPerformed(evt);
            JOptionPane.showMessageDialog(this, "Data point added successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btAddSActionPerformed
            
    private void exportToCSV(JTable tableToExport, String pathToExportTo) {
        try {
            DefaultTableModel model = (DefaultTableModel) tableToExport.getModel();
            try (FileWriter csv = new FileWriter(new File(pathToExportTo))) {
                for (int i = 0; i < model.getColumnCount() - 1; i++) {
                    csv.write(model.getColumnName(i) + ",");
                }
                csv.write(model.getColumnName(model.getColumnCount() - 1) + '\n');
                for (int i = 0; i < model.getRowCount(); i++) {
                    for (int j = 0; j < model.getColumnCount() - 1; j++) {
                        csv.write(model.getValueAt(i, j).toString() + ",");
                    }
                    csv.write(model.getValueAt(i, model.getColumnCount() - 1).toString() + '\n');
                }
            }
            JOptionPane.showMessageDialog(this, "CSV File saved successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);
        } catch (IOException e) {
            JOptionPane.showMessageDialog(this, e, "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public static void main(String args[]) {
        try {
            UIManager.setLookAndFeel(new FlatIntelliJLaf());
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }
    
    private int selectedRowC = -1;
    private int selectedRowS = -1;
    private int selectedRowE = -1;
    private boolean changedC = false;
    private boolean changedS = false;
    private boolean changedE = false;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAddC;
    private javax.swing.JButton btAddS;
    private javax.swing.JButton btClearC;
    private javax.swing.JButton btClearS;
    private javax.swing.JButton btDeleteC;
    private javax.swing.JButton btDeleteS;
    private javax.swing.JButton btExit;
    private javax.swing.JComboBox<String> cbGender;
    private javax.swing.JPanel censusTab;
    private javax.swing.JTable censusTable;
    private javax.swing.JPanel employmentTab;
    private javax.swing.JButton exportCsvC;
    private javax.swing.JButton exportCsvS;
    private javax.swing.JFormattedTextField ftfDOB;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JDesktopPane jDesktopPane2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lbTitle;
    private javax.swing.JButton loadCsvC;
    private javax.swing.JButton loadCsvS;
    private javax.swing.JPanel salaryTab;
    private javax.swing.JTable salaryTable;
    private javax.swing.JToggleButton tbtUpdateC;
    private javax.swing.JToggleButton tbtUpdateS;
    private javax.swing.JTextField tfAadhaar;
    private javax.swing.JTextField tfBasic;
    private javax.swing.JTextField tfCity;
    private javax.swing.JTextField tfDistrict;
    private javax.swing.JTextField tfFNameC;
    private javax.swing.JTextField tfFNameS;
    private javax.swing.JTextField tfHRA;
    private javax.swing.JTextField tfLNameC;
    private javax.swing.JTextField tfLNameS;
    private javax.swing.JTextField tfLTA;
    private javax.swing.JTextField tfMA;
    private javax.swing.JTextField tfPAN;
    private javax.swing.JTextField tfPIN;
    private javax.swing.JTextField tfReligion;
    private javax.swing.JTextField tfState;
    // End of variables declaration//GEN-END:variables
}
