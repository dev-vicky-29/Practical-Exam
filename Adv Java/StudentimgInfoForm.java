import java.io.*;
import java.sql.*;
import java.sql.*;
import javax.swing.*;
import javax.swing.filechooser.*;Gui and 

public class StudentimgInfoForm extends javax.swing.JFrame {    
    Connection con = null; 
    PreparedStatement  pstmt = null; 
    File file;
    String driverName = "com.mysql.jdbc.Driver";
    String conUrl = "jdbc:mysql://localhost:3306/";
    String databaseName = "bsccsty";
    String usrName = "root";
    String usrPass = "root"; 
    public StudentimgInfoForm() {
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
        btnsave = new javax.swing.JButton();
        lblimage = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btnbrowse = new javax.swing.JButton();
        btnsave1 = new javax.swing.JButton();
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
                .addContainerGap()                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        btnsave.setBackground(new java.awt.Color(255, 255, 255));
        btnsave.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        btnsave.setForeground(new java.awt.Color(204, 0, 51));
        btnsave.setText("Save Image to Databse");
        btnsave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsaveActionPerformed(evt);
            }
        });
        jLabel7.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel7.setText("Photo");
        btnbrowse.setBackground(new java.awt.Color(255, 255, 255));
        btnbrowse.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        btnbrowse.setForeground(new java.awt.Color(204, 0, 51));
        btnbrowse.setText("Browse");
        btnbrowse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbrowseActionPerformed(evt);
            }
        });
btnsave1.setBackground(new java.awt.Color(255, 255, 255));
        btnsave1.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        btnsave1.setForeground(new java.awt.Color(204, 0, 51));
        btnsave1.setText("Retrive Image from Database");
        btnsave1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsave1ActionPerformed(evt);
            }
        });
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addComponent(jLabel7)
                        .addGap(28, 28, 28)
                        .addComponent(btnbrowse)
                        .addGap(18, 18, 18)
                        .addComponent(btnsave))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(113, 113, 113)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnsave1)
                            .addComponent(lblimage, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(btnbrowse)
                    .addComponent(btnsave))
                .addGap(22, 22, 22)
                .addComponent(lblimage, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnsave1)
                .addContainerGap(55, Short.MAX_VALUE))
        );
        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>                        

    private void btnsaveActionPerformed(java.awt.event.ActionEvent evt) {                                        
        try {
            connetDB();
            pstmt = con.prepareStatement("select img_id from tbl_image ");
	    ResultSet rset=pstmt.executeQuery();
            int i=0;
            if(rset.last())
               i =rset.getInt(1);
            System.out.println("img_id"+i);
            pstmt = con.prepareStatement("insert into tbl_image values( ?,?) ");
            FileInputStream fin=new FileInputStream(file.getAbsolutePath());  
            pstmt.setInt(1, ++i);
        




    pstmt.setBinaryStream(2,fin);  
            pstmt.executeUpdate();  
            System.out.println("New Row added Successfully....");
        } 
        catch (SQLException ex) {
           ex.printStackTrace();
        }  catch (FileNotFoundException ex) {
               ex.printStackTrace();
        }
        finally {
            try {
                pstmt.close();
                con.close();
              } catch (SQLException ex) {
                ex.printStackTrace();
                }
            }
    } 
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
    dispose();
    }
    private void btnbrowseActionPerformed(java.awt.event.ActionEvent evt) {
        JFileChooser jf = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());
        jf.setDialogTitle("Choose Image");
        jf.addChoosableFileFilter(new FileNameExtensionFilter("Image Files(*.jpg)", "jpg"));
        jf.setAcceptAllFileFilterUsed(true);
        int ans=jf.showOpenDialog(this);
       if(ans==JFileChooser.APPROVE_OPTION){
             file = jf.getSelectedFile();
             lblimage.setIcon(new ImageIcon(file.getAbsolutePath()));

        }
    }                        
    private void btnsave1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
         FileOutputStream fs=null;
	PreparedStatement ps=null;
	try 
	{
	    connetDB();
            pstmt = con.prepareStatement("select * from tbl_image ");
	    ResultSet rset=pstmt.executeQuery();
	    byte b[];
	    Blob blob;
	    int i=1;
	    while(rset.next())
	    {
	    	i = rset.getInt(1);
	    	System.out.print("ID: " + rset.getInt(1));
                File f=new File("./img" + i + ".jpg");
                fs=new FileOutputStream(f);
	    	blob=rset.getBlob("image");
	    	b=blob.getBytes(1, (int)blob.length());
	    	fs.write(b);
	    }
	} 
	catch (SQLException e) 
	{
	    System.err.println("Cannot connect ! ");
	    e.printStackTrace();
	}  catch (FileNotFoundException ex) {
               ex.printStackTrace();
           } catch (IOException ex) {
                ex.printStackTrace();
           }
	finally {
	     if (con != null) try { pstmt.close();con.close(); } catch (SQLException ignore) {}
	}
    public static void main(String args[]) {
        new StudentimgInfoForm().setVisible(true);
   }
// Variables declaration - do not modify                     
    private javax.swing.JButton btnbrowse;
    private javax.swing.JButton btnsave;
    private javax.swing.JButton btnsave1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblimage;
    // End of variables declaration                   
}

