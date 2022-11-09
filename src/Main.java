import com.formdev.flatlaf.FlatIntelliJLaf;
import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;
import com.opencsv.exceptions.CsvException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.filechooser.FileNameExtensionFilter;

public class Main extends javax.swing.JFrame {

    public Main() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rbgOpt = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        rbNewTemp = new javax.swing.JRadioButton();
        rbTempCSV = new javax.swing.JRadioButton();
        rbDataset = new javax.swing.JRadioButton();
        btSelCSV = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        taTemp = new javax.swing.JTextArea();
        btCont = new javax.swing.JButton();
        btExit = new javax.swing.JButton();
        lbSel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Data Collection System");

        jLabel1.setFont(new java.awt.Font("Manjari", 1, 24)); // NOI18N
        jLabel1.setText("Data Collection System");

        rbgOpt.add(rbNewTemp);
        rbNewTemp.setText("Create New Template");
        rbNewTemp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbNewTempActionPerformed(evt);
            }
        });

        rbgOpt.add(rbTempCSV);
        rbTempCSV.setText("Load Template From CSV");
        rbTempCSV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbTempCSVActionPerformed(evt);
            }
        });

        rbgOpt.add(rbDataset);
        rbDataset.setText("Load Dataset from CSV");
        rbDataset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbDatasetActionPerformed(evt);
            }
        });

        btSelCSV.setText("Select CSV File");
        btSelCSV.setEnabled(false);
        btSelCSV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSelCSVActionPerformed(evt);
            }
        });

        taTemp.setEditable(false);
        taTemp.setColumns(20);
        taTemp.setLineWrap(true);
        taTemp.setRows(5);
        jScrollPane1.setViewportView(taTemp);

        btCont.setText("Continue");
        btCont.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btContActionPerformed(evt);
            }
        });

        btExit.setText("Exit");
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(rbNewTemp)
                        .addGap(60, 60, 60)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(rbTempCSV))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(273, 273, 273)
                        .addComponent(btSelCSV)
                        .addGap(25, 25, 25)
                        .addComponent(lbSel, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(rbDataset)
                        .addGap(184, 184, 184)
                        .addComponent(btCont)
                        .addGap(52, 52, 52)
                        .addComponent(btExit, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(48, 48, 48))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(209, 209, 209))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1)
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rbNewTemp)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(rbTempCSV)
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btSelCSV)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(lbSel, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rbDataset)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btCont, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btExit, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(41, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void rbNewTempActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbNewTempActionPerformed
        if(btSelCSV.isEnabled()) {
            btSelCSV.setEnabled(false);
        }
        taTemp.setEditable(true);
    }//GEN-LAST:event_rbNewTempActionPerformed

    private void rbTempCSVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbTempCSVActionPerformed
        if (taTemp.isEditable()) {
            taTemp.setText("");
            taTemp.setEditable(false);
        }
        btSelCSV.setEnabled(true);
    }//GEN-LAST:event_rbTempCSVActionPerformed

    private void rbDatasetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbDatasetActionPerformed
        if (taTemp.isEditable()) {
            taTemp.setText("");
            taTemp.setEditable(false);
        }
        btSelCSV.setEnabled(true);
    }//GEN-LAST:event_rbDatasetActionPerformed

    private void btContActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btContActionPerformed
        if(rbNewTemp.isSelected()) {
            if (taTemp.getText().isBlank() | taTemp.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Error: Text Area for the template is empty. Please enter the template in the required format.", "Error", 0);
            } else {
                createNewTemp(taTemp.getText());
            }
        } else if (rbTempCSV.isSelected() | rbDataset.isSelected()) {
            if (csvFilePath.isBlank() | csvFilePath.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Error: No CSV File has been selected. Please select one and continue.", "Error", 0);
            } else {
                if (rbTempCSV.isSelected()) {
                    loadTemp();
                } else if (rbDataset.isSelected()) {
                    loadDataset();
                }
            }
        } else {
            JOptionPane.showMessageDialog(this, "Error: No option is selected. Please select one and continue.", "Error", 0);
        }
    }//GEN-LAST:event_btContActionPerformed
    
    private void createNewTemp(String data) {
        String[] headerData = data.split("\n");
        headers = new String[headerData.length][2];
        for (int i = 0; i < headerData.length; i++) {
            String[] headerComponents = headerData[i].split(",");
            headers[i] = headerComponents;
        }
        for (int i = 0; i < headers.length; i++) {
            for (int j = 0; j < headers[i].length; j++) {
                System.out.print(headers[i][j] + "\t");
            }
            System.out.println();
        }
    }
    
    private void loadTemp() {
        try {
            FileReader filereader = new FileReader(csvFilePath);
            CSVReader csvReader = new CSVReaderBuilder(filereader).withSkipLines(0).build();
            List<String[]> headerData = csvReader.readAll();
            headers = new String[headerData.size()][2];
            for (int i = 0; i < headerData.size(); i++) {
                headers[i][0] = headerData.get(i)[0];
                headers[i][1] = headerData.get(i)[1];
            }
            for (int i = 0; i < headers.length; i++) {
                for (int j = 0; j < headers[i].length; j++) {
                    System.out.print(headers[i][j] + "\t");
                }
                System.out.println();
            }
	}
	catch (CsvException | IOException e) {
            e.printStackTrace();
	}
    }
    
    private void loadDataset() {
        JOptionPane.showMessageDialog(this, "Loading dataset from CSV is still in developement :)", "Message", 1);
    }

    private void btExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btExitActionPerformed

    private void btSelCSVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSelCSVActionPerformed
        FileNameExtensionFilter fileFilter = new FileNameExtensionFilter(null, "csv");
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setFileFilter(fileFilter);
        fileChooser.setDialogTitle("Choose CSV file");
        if (fileChooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
            csvFilePath = fileChooser.getSelectedFile().getAbsolutePath();
            lbSel.setText(fileChooser.getSelectedFile().getName());
        }
    }//GEN-LAST:event_btSelCSVActionPerformed
    
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
    private String csvFilePath = "";
    private String[][] headers;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCont;
    private javax.swing.JButton btExit;
    private javax.swing.JButton btSelCSV;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbSel;
    private javax.swing.JRadioButton rbDataset;
    private javax.swing.JRadioButton rbNewTemp;
    private javax.swing.JRadioButton rbTempCSV;
    private javax.swing.ButtonGroup rbgOpt;
    private javax.swing.JTextArea taTemp;
    // End of variables declaration//GEN-END:variables
}
