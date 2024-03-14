import java.sql.*;
import java.sql.DriverManager;
import java.sql.SQLException;
public class StudentInfoForm extends javax.swing.JFrame {
   
    Connection con = null; 
    PreparedStatement  pstmt = null; 
    
    String driverName = "com.mysql.jdbc.Driver";
    String conUrl = "jdbc:mysql://localhost:3306/";
    String databaseName = "bsccsty";
    String usrName = "root";
    String usrPass = "root";
   
    
    public StudentInfoForm() {
        initComponents();
        connetDB();
    }

    void connetDB(){
        
        try {
            Class.forName(driverName);
	} catch (ClassNotFoundException e) {
			System.out.println(e.toString());
	}
	
        try {
            con = DriverManager.getConnection(conUrl + databaseName, usrName,
					usrPass);
			
        } catch (Exception e) {
            System.out.println(e.toString());
	} 
    } 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtno = new javax.swing.JTextField();
        txtname = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtaddress = new javax.swing.JTextArea();
        cmbsub = new javax.swing.JComboBox();
        btnsave = new javax.swing.JButton();
        btnreset = new javax.swing.JButton();
        btnedit = new javax.swing.JButton();
        btndelete = new javax.swing.JButton();
        btnSearch = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 51, 0));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Student Form");

        jButton1.setText("x");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(138, 138, 138)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jLabel2.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel2.setText("RollNo");

        jLabel3.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel3.setText("Name");

        jLabel4.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel4.setText("Address");

        jLabel5.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel5.setText("Subject");

        txtaddress.setColumns(20);
        txtaddress.setRows(5);
        jScrollPane1.setViewportView(txtaddress);

        cmbsub.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Linux", "Java", "C#", "Python" }));

        btnsave.setBackground(new java.awt.Color(255, 255, 255));
        btnsave.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        btnsave.setForeground(new java.awt.Color(204, 0, 51));
        btnsave.setText("Save");
        btnsave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsaveActionPerformed(evt);
            }
        });

        btnreset.setBackground(new java.awt.Color(255, 255, 255));
        btnreset.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        btnreset.setForeground(new java.awt.Color(204, 0, 51));
        btnreset.setText("Reset");
        btnreset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnresetActionPerformed(evt);
            }
        });

        btnedit.setBackground(new java.awt.Color(255, 255, 255));
        btnedit.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        btnedit.setForeground(new java.awt.Color(204, 0, 51));
        btnedit.setText("Update");
        btnedit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneditActionPerformed(evt);
            }
        });

        btndelete.setBackground(new java.awt.Color(255, 255, 255));
        btndelete.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        btndelete.setForeground(new java.awt.Color(204, 0, 51));
        btndelete.setText("Delete");
        btndelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndeleteActionPerformed(evt);
            }
        });

        btnSearch.setBackground(new java.awt.Color(255, 255, 255));
        btnSearch.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        btnSearch.setForeground(new java.awt.Color(204, 0, 51));
        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(31, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 74, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtname, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbsub, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtno, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnSearch)))
                .addGap(97, 97, 97))
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(btnsave)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnreset)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnedit)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btndelete)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearch))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cmbsub, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnsave)
                    .addComponent(btnreset)
                    .addComponent(btnedit)
                    .addComponent(btndelete))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>                        

    private void btnsaveActionPerformed(java.awt.event.ActionEvent evt) {                                        
        // save
        int rollno=Integer.parseInt(txtno.getText());
        String name=txtname.getText();
        String address=txtaddress.getText().trim();
        String subject=cmbsub.getSelectedItem()+"";
             
        try {
            connetDB();
            pstmt = con.prepareStatement("insert into student_info values( ?,?,?,?) ");
            pstmt.setInt(1,rollno);  
            pstmt.setString(2,name); 
            pstmt.setString(3,address); 
            pstmt.setString(4,subject); 
            pstmt.executeUpdate();
            System.out.println("New Row added Successfully....");

        } 
        catch (SQLException ex) {
           ex.printStackTrace();
        }
        finally {
            try {

                con.close();
                pstmt.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
            }
        
    }                                       

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // 
       dispose();
    }                                        

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {                                          

         int rollno=Integer.parseInt(txtno.getText());
          try {
            connetDB();
            pstmt = con.prepareStatement("select * from student_info where rollno =?  ");
            pstmt.setInt(1,rollno);  
           
            ResultSet rs=pstmt.executeQuery();  
            while(rs.next()){  
             System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4));  
             
            txtname.setText(rs.getString(2));
            txtaddress.setText(rs.getString(3));
            cmbsub.setSelectedItem(rs.getString(4));
            }  
            
        } 
        catch (SQLException ex) {
            ex.printStackTrace();
        }
        finally {
            try {

                con.close();
                pstmt.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
            }
         
    }                                         

    private void btnresetActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
        txtno.setText("");
        txtname.setText("");
        txtaddress.setText("");
        
    }                                        

    private void btneditActionPerformed(java.awt.event.ActionEvent evt) {                                        

        int rollno=Integer.parseInt(txtno.getText());
        String name=txtname.getText();
        String address=txtaddress.getText().trim();
        String subject=cmbsub.getSelectedItem()+"";
             
        try {
            connetDB();
            pstmt = con.prepareStatement("update student_info set name=?, address=?,subject=? where rollno=?  ");
            
            pstmt.setString(1,name); 
            pstmt.setString(2,address); 
            pstmt.setString(3,subject);
            pstmt.setInt(4,rollno);  
            pstmt.executeUpdate();
            System.out.println("Record updated Successfully....");

        } 
        catch (SQLException ex) {
            ex.printStackTrace();
        }
        finally {
            try {

                con.close();
                pstmt.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
            }
    }                                       

    private void btndeleteActionPerformed(java.awt.event.ActionEvent evt) {                                          
        
        int rollno=Integer.parseInt(txtno.getText());
        
             
        try {
            connetDB();
            pstmt = con.prepareStatement("delete from student_info where rollno=?  ");
            pstmt.setInt(1,rollno);  
            pstmt.executeUpdate();
            System.out.println("Record deleted Successfully....");
        } 
        catch (SQLException ex) {
            ex.printStackTrace();
        }
        finally {
            try {
                con.close();
                pstmt.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
            }
    }                                         

    
    public static void main(String args[]) {

        new StudentInfoForm().setVisible(true);
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btndelete;
    private javax.swing.JButton btnedit;
    private javax.swing.JButton btnreset;
    private javax.swing.JButton btnsave;
    private javax.swing.JComboBox cmbsub;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txtaddress;
    private javax.swing.JTextField txtname;
    private javax.swing.JTextField txtno;
    // End of variables declaration                   
}

