//developer fatihdemirag\fxd
package stoktakip;

import java.awt.KeyboardFocusManager;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import net.proteanit.sql.DbUtils;

public class main extends javax.swing.JFrame {

    public main() 
    {
        initComponents();
        connection();
        tablo();
    }
    Connection con;
    ResultSet rs;
    PreparedStatement prs;
    Statement st;
    String dbUrl="jdbc:mysql://localhost:3306/stokTakip";
    public void connection()
    {
        try {
            con = (com.mysql.jdbc.Connection) DriverManager.getConnection(dbUrl, "root", "root");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Veritabanı Bağlantısı Başarısız");
        }
    }
    public void tablo()
    {
     try 
        {
            String sql="select * from ürünler";
            prs=con.prepareStatement(sql);
            rs=prs.executeQuery();
            tablo.setModel(DbUtils.resultSetToTableModel(rs));
            
        } catch (Exception ex)
        {
            JOptionPane.showMessageDialog(null, ex);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        kasaToplamSayiLabel = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        kasaToplamParaLabel = new javax.swing.JLabel();
        günlükKarSayi = new javax.swing.JLabel();
        günlükKarLabel = new javax.swing.JLabel();
        jScrollPane18 = new javax.swing.JScrollPane();
        sorterText = new javax.swing.JTextPane();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablo = new javax.swing.JTable();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        alisFiyatiText = new javax.swing.JTextPane();
        alisFiyatiLabel = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        satisMiktariText = new javax.swing.JTextPane();
        ürünAdiLabel = new javax.swing.JLabel();
        satisButon = new javax.swing.JButton();
        satisFiyatiLabel = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        ürünAdiText = new javax.swing.JTextPane();
        stokMiktariLabel = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        stokMiktariText = new javax.swing.JTextPane();
        jScrollPane4 = new javax.swing.JScrollPane();
        satisFiyatiText = new javax.swing.JTextPane();
        jScrollPane7 = new javax.swing.JScrollPane();
        ürünGrubuText = new javax.swing.JTextPane();
        ürünGrubuLabel = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        ürünGüncelle = new javax.swing.JButton();
        jScrollPane15 = new javax.swing.JScrollPane();
        güncelleSatisFiyati = new javax.swing.JTextPane();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane13 = new javax.swing.JScrollPane();
        güncelleStokMiktari = new javax.swing.JTextPane();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane14 = new javax.swing.JScrollPane();
        güncelleÜrünGrubu = new javax.swing.JTextPane();
        jScrollPane17 = new javax.swing.JScrollPane();
        güncelleÜrünAdi = new javax.swing.JTextPane();
        jLabel8 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane16 = new javax.swing.JScrollPane();
        güncelleAlisFiyati = new javax.swing.JTextPane();
        jLabel11 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        ürünEkle = new javax.swing.JButton();
        jScrollPane11 = new javax.swing.JScrollPane();
        ekleAlisFiyati = new javax.swing.JTextPane();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane9 = new javax.swing.JScrollPane();
        ekleÜrünAdi = new javax.swing.JTextPane();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane10 = new javax.swing.JScrollPane();
        ekleÜrünGrubu = new javax.swing.JTextPane();
        jScrollPane12 = new javax.swing.JScrollPane();
        ekleSatisFiyati = new javax.swing.JTextPane();
        jScrollPane8 = new javax.swing.JScrollPane();
        ekleStokMiktari = new javax.swing.JTextPane();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        logo = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Stok Takip Programı 1.0");
        setIconImages(null);
        setPreferredSize(new java.awt.Dimension(1366, 1000));

        kasaToplamSayiLabel.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        kasaToplamSayiLabel.setText("0");

        jButton1.setText("PARAYI SIFIRLA");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        kasaToplamParaLabel.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        kasaToplamParaLabel.setText("Kasadaki Toplam Para");

        günlükKarSayi.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        günlükKarSayi.setText("0");

        günlükKarLabel.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        günlükKarLabel.setText("Günlük Kar ");

        sorterText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                sorterTextKeyPressed(evt);
            }
        });
        jScrollPane18.setViewportView(sorterText);

        jLabel12.setFont(new java.awt.Font("Dialog", 0, 10)); // NOI18N
        jLabel12.setText("ÜRÜN BUL");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(kasaToplamParaLabel)
                            .addComponent(günlükKarLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(64, 64, 64)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(günlükKarSayi)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 259, Short.MAX_VALUE)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(kasaToplamSayiLabel)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane18, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(kasaToplamParaLabel)
                    .addComponent(kasaToplamSayiLabel))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(günlükKarLabel)
                    .addComponent(günlükKarSayi)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 6, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        tablo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tablo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabloMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablo);

        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jScrollPane3.setViewportView(alisFiyatiText);

        alisFiyatiLabel.setText("ALIŞ FİYATI");

        jLabel7.setText("Satış Miktarı");

        jScrollPane6.setViewportView(satisMiktariText);

        ürünAdiLabel.setText("ÜRÜN ADI");

        satisButon.setText("SATIŞ");
        satisButon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                satisButonActionPerformed(evt);
            }
        });

        satisFiyatiLabel.setText("SATIŞ FİYATI");

        jScrollPane2.setViewportView(ürünAdiText);

        stokMiktariLabel.setText("Stok Miktarı");

        jScrollPane5.setViewportView(stokMiktariText);

        jScrollPane4.setViewportView(satisFiyatiText);

        jScrollPane7.setViewportView(ürünGrubuText);

        ürünGrubuLabel.setText("ÜRÜN GRUBU");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(ürünGrubuLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 430, Short.MAX_VALUE)
                                .addComponent(stokMiktariLabel))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jScrollPane7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane2))
                        .addGap(194, 194, 194))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(40, 40, 40)
                                        .addComponent(jLabel7))
                                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(satisButon, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(ürünAdiLabel)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(satisFiyatiLabel)
                                    .addComponent(alisFiyatiLabel))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ürünAdiLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(alisFiyatiLabel)
                .addGap(5, 5, 5)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(satisFiyatiLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(stokMiktariLabel)
                            .addComponent(ürünGrubuLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(satisButon, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(54, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Ürün Satış", jPanel1);

        jPanel5.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        ürünGüncelle.setText("ÜRÜN GÜNCELLE");
        ürünGüncelle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ürünGüncelleActionPerformed(evt);
            }
        });

        jScrollPane15.setViewportView(güncelleSatisFiyati);

        jLabel10.setText("ALIŞ FİYATI");

        güncelleStokMiktari.setLogicalStyle(null);
        jScrollPane13.setViewportView(güncelleStokMiktari);

        jLabel9.setText("SATIŞ FİYATI");

        jScrollPane14.setViewportView(güncelleÜrünGrubu);

        jScrollPane17.setViewportView(güncelleÜrünAdi);

        jLabel8.setText("ÜRÜN GRUBU");

        jLabel6.setText("STOK MİKTARI");

        jScrollPane16.setViewportView(güncelleAlisFiyati);

        jLabel11.setText("ÜRÜN ADI");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11)
                    .addComponent(jLabel9)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jScrollPane15, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 570, Short.MAX_VALUE)
                        .addComponent(jScrollPane16, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane17, javax.swing.GroupLayout.Alignment.LEADING))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane14, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addComponent(jLabel6))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane13, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(ürünGüncelle, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(195, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel10)
                .addGap(10, 10, 10)
                .addComponent(jScrollPane16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ürünGüncelle, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Ürün Güncelleme", jPanel5);

        jPanel3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        ürünEkle.setText("ÜRÜN EKLE");
        ürünEkle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ürünEkleActionPerformed(evt);
            }
        });

        ekleAlisFiyati.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                ekleAlisFiyatiKeyPressed(evt);
            }
        });
        jScrollPane11.setViewportView(ekleAlisFiyati);

        jLabel4.setText("STOK MİKTARI");

        jLabel5.setText("ÜRÜN GRUBU");

        ekleÜrünAdi.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                ekleÜrünAdiKeyPressed(evt);
            }
        });
        jScrollPane9.setViewportView(ekleÜrünAdi);

        jLabel1.setText("ÜRÜN ADI");

        ekleÜrünGrubu.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                ekleÜrünGrubuKeyPressed(evt);
            }
        });
        jScrollPane10.setViewportView(ekleÜrünGrubu);

        ekleSatisFiyati.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                ekleSatisFiyatiKeyPressed(evt);
            }
        });
        jScrollPane12.setViewportView(ekleSatisFiyati);

        ekleStokMiktari.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                ekleStokMiktariKeyPressed(evt);
            }
        });
        jScrollPane8.setViewportView(ekleStokMiktari);

        jLabel2.setText("ALIŞ FİYATI");

        jLabel3.setText("SATIŞ FİYATI");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addContainerGap(695, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel5)
                                        .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(18, 18, 18)
                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel4))
                                    .addGap(27, 27, 27))
                                .addComponent(jScrollPane12, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 570, Short.MAX_VALUE)
                                .addComponent(jScrollPane11, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jScrollPane9, javax.swing.GroupLayout.Alignment.LEADING))
                            .addComponent(ürünEkle, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addGap(10, 10, 10)
                .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4))
                .addGap(7, 7, 7)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ürünEkle, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 27, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Yeni Ürün Ekleme", jPanel3);

        logo.setFont(new java.awt.Font("Dialog", 0, 60)); // NOI18N
        logo.setText("STOK TAKİP");
        logo.setToolTipText("LOGO GEÇİCİDİR");

        jLabel13.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel13.setText("1.0");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(logo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel13)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(18, 18, 18)
                        .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 788, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 387, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(logo, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 866, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tabloMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabloMouseClicked
        try 
        {
            int row=tablo.getSelectedRow();
            String tableClick=(tablo.getModel().getValueAt(row, 0).toString());
            String sqlString="select * from ürünler where ürün_adi='"+tableClick+"'  ";
            prs=con.prepareStatement(sqlString);
            rs=prs.executeQuery();
            if (rs.next())
            {
                String add1=rs.getString("ürün_adi");
                ürünAdiText.setText(add1);
                String add2=rs.getString("alis_fiyati");
                alisFiyatiText.setText(add2);
                String add3=rs.getString("satis_fiyati");
                satisFiyatiText.setText(add3);
                String add4=rs.getString("ürün_grubu");
                ürünGrubuText.setText(add4);
                String add5=rs.getString("ürün_adedi");
                stokMiktariText.setText(add5);    
                
                String aadd1=rs.getString("ürün_adi");
                güncelleÜrünAdi.setText(aadd1);
                String aadd2=rs.getString("alis_fiyati");
                güncelleAlisFiyati.setText(aadd2);
                String aadd3=rs.getString("satis_fiyati");
                güncelleSatisFiyati.setText(aadd3);
                String aadd4=rs.getString("ürün_grubu");
                güncelleÜrünGrubu.setText(aadd4);
                String aadd5=rs.getString("ürün_adedi");
                güncelleStokMiktari.setText(aadd5);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_tabloMouseClicked
            //Günlük Kar Hesaplaması
            //------------
            String txt;
            int adetint;
            int karToplam;
            int kar;
            //-------------
            
            //Günlük Kar Hesaplaması
            //------------
            String ttxt;
            int toplamInt;
            int kasaToplam;
            int kasaHesap;
            //-------------
    private void satisButonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_satisButonActionPerformed
        
        try {
              //-------------------------------------------------------------------------------------------//    
              //String urun=(String) urunSatCombo.getSelectedItem().toString();
              String urun=ürünAdiText.getText();
              String geciciUrunAdeti=stokMiktariText.getText();
              int gecici=Integer.parseInt(geciciUrunAdeti);
              
              String satilacakAdet=satisMiktariText.getText();
              int geciciSatilacakAdet=Integer.parseInt(satilacakAdet);
              
              //-------------------------------------------------------------------------------------------//
              int stokMiktar=Integer.parseInt(stokMiktariText.getText());
              int satisMiktar=Integer.parseInt(satisMiktariText.getText());
                  //Stok durumu kontrol
              if (satisMiktar>stokMiktar) 
              {
                  JOptionPane.showMessageDialog(null, "Stokta o kadar ürün yok\nStoktaki Ürün Adedi : "+stokMiktar,"Stok Yetersiz",HEIGHT);
                      
              }else{
                      
                   int kalanAdet=gecici-geciciSatilacakAdet;
                   //----------------------
                   String al=alisFiyatiText.getText();
                   String sat=satisFiyatiText.getText();
                   int alis=Integer.parseInt(al);
                   int satis=Integer.parseInt(sat);
                   kar=(satis-alis)*geciciSatilacakAdet;
                   //------------------------ 
                   txt=satisMiktariText.getText();
                   adetint=Integer.parseInt(txt);
                   karToplam+=kar;
                   günlükKarSayi.setText("");
                   günlükKarSayi.setText(String.valueOf(karToplam));
                   //------------------------
                   //------------------------
                   String satisF=satisFiyatiText.getText();
                   int satiss=Integer.parseInt(satisF);
                   kasaHesap=satiss*geciciSatilacakAdet;
                   //------------------------  
                   txt=satisMiktariText.getText();
                   toplamInt=Integer.parseInt(txt);
                   kasaToplam+=kasaHesap;
                   kasaToplamSayiLabel.setText(String.valueOf(kasaToplam));
                   //-------------------------
                   String query=("update ürünler set ürün_adedi='" + kalanAdet + "' where ürün_adi='" + urun + "'");
                   st=(com.mysql.jdbc.Statement) con.createStatement();
                   st.executeUpdate(query);
                   JOptionPane.showMessageDialog(null, "Ürün Satıldı","Ürün Satıldı",HEIGHT);
                  }
           
                
              tablo();
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"ürün satılamadı");
            e.printStackTrace();
        }
    }//GEN-LAST:event_satisButonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        kasaToplam=0;
        kasaToplamSayiLabel.setText(String.valueOf(kasaToplam));
        karToplam=0;
        günlükKarSayi.setText(String.valueOf(karToplam));
    }//GEN-LAST:event_jButton1ActionPerformed
    
    private void ürünGüncelleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ürünGüncelleActionPerformed
        // TODO add your handling code here:
        try
        {
            String ürünAdi=güncelleÜrünAdi.getText();
            String alisFiyat=güncelleAlisFiyati.getText();
            String satisFiyati=güncelleSatisFiyati.getText();
            String ürünGrubu=güncelleÜrünGrubu.getText();
            String ürünAdedi=güncelleStokMiktari.getText();
            String query=("update ürünler set ürün_adi='" + ürünAdi + "',alis_fiyati='" + alisFiyat + "',satis_fiyati='" + satisFiyati
                + "',ürün_adedi='" + ürünAdedi + "',satis_fiyati='" + satisFiyati + "',ürün_grubu='" + ürünGrubu + "' where ürün_adi='" + ürünAdi + "'");

            st=(com.mysql.jdbc.Statement) con.createStatement();
            st.executeUpdate(query);
            JOptionPane.showMessageDialog(null,"Ürün Başarılı Bir Şekilde Güncellendi","Ürün Güncellendi",HEIGHT);

            güncelleÜrünAdi.setText("");
            güncelleAlisFiyati.setText("");
            güncelleSatisFiyati.setText("");
            güncelleÜrünGrubu.setText("");
            güncelleStokMiktari.setText("");
            tablo();
        } catch (Exception e)
        {
            JOptionPane.showMessageDialog(null, "Ürün Güncellenemedi Bilgileri Kontrol Ediniz veya Listeden Yeniden Seçiniz","Ürün Güncellenemedi",HEIGHT);
        }
    }//GEN-LAST:event_ürünGüncelleActionPerformed

    private void sorterTextKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_sorterTextKeyPressed
        TableRowSorter<TableModel> sorter=new TableRowSorter<>((DefaultTableModel) tablo.getModel());
        sorter.setRowFilter(RowFilter.regexFilter(this.sorterText.getText()));
        tablo.setRowSorter(sorter);
        tablo();
    }//GEN-LAST:event_sorterTextKeyPressed

    private void ürünEkleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ürünEkleActionPerformed
        try
        {
            String ürünAdi=ekleÜrünAdi.getText();
            String alisFiyati=ekleAlisFiyati.getText();
            String satisFiyati=ekleSatisFiyati.getText();
            String ürünGrubu=ekleÜrünGrubu.getText();
            String stokMiktari=ekleStokMiktari.getText();
            
            String query=("insert into ürünler(ürün_adi,alis_fiyati,satis_fiyati,ürün_grubu,ürün_adedi) "
                + "values('" + ürünAdi + "','" + alisFiyati + "','" + satisFiyati + "','" + ürünGrubu + "','" + stokMiktari + "')");

            st=(com.mysql.jdbc.Statement) con.createStatement();
            st.executeUpdate(query);

            ekleÜrünAdi.setText("");
            ekleAlisFiyati.setText("");
            ekleSatisFiyati.setText("");
            ekleÜrünGrubu.setText("");
            ekleStokMiktari.setText("");
            JOptionPane.showMessageDialog(null, "Ürün Başarılı Bir Şekilde Eklendi", "Ürün Eklendi", HEIGHT);
            tablo();
        } catch (Exception e)
        {

            JOptionPane.showMessageDialog(null, "Ürün Eklenemedi Lütfen Ürün Bilgilerini Kontrol Ediniz","Ürün Ekleme Başarısız",HEIGHT);
        }
        tablo();

    }//GEN-LAST:event_ürünEkleActionPerformed

    private void ekleÜrünAdiKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ekleÜrünAdiKeyPressed
            ekleÜrünAdi.setFocusTraversalKeys(KeyboardFocusManager.FORWARD_TRAVERSAL_KEYS,null); 
    }//GEN-LAST:event_ekleÜrünAdiKeyPressed

    private void ekleAlisFiyatiKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ekleAlisFiyatiKeyPressed
        ekleAlisFiyati.setFocusTraversalKeys(KeyboardFocusManager.FORWARD_TRAVERSAL_KEYS,null);
    }//GEN-LAST:event_ekleAlisFiyatiKeyPressed

    private void ekleSatisFiyatiKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ekleSatisFiyatiKeyPressed
        ekleSatisFiyati.setFocusTraversalKeys(KeyboardFocusManager.FORWARD_TRAVERSAL_KEYS,null);
    }//GEN-LAST:event_ekleSatisFiyatiKeyPressed

    private void ekleÜrünGrubuKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ekleÜrünGrubuKeyPressed
        ekleÜrünGrubu.setFocusTraversalKeys(KeyboardFocusManager.FORWARD_TRAVERSAL_KEYS,null);
    }//GEN-LAST:event_ekleÜrünGrubuKeyPressed

    private void ekleStokMiktariKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ekleStokMiktariKeyPressed
        ekleStokMiktari.setFocusTraversalKeys(KeyboardFocusManager.FORWARD_TRAVERSAL_KEYS,null);
    }//GEN-LAST:event_ekleStokMiktariKeyPressed

    public static void main(String args[]) {
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(() -> {
            new main().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel alisFiyatiLabel;
    private javax.swing.JTextPane alisFiyatiText;
    private javax.swing.JTextPane ekleAlisFiyati;
    private javax.swing.JTextPane ekleSatisFiyati;
    private javax.swing.JTextPane ekleStokMiktari;
    private javax.swing.JTextPane ekleÜrünAdi;
    private javax.swing.JTextPane ekleÜrünGrubu;
    private javax.swing.JTextPane güncelleAlisFiyati;
    private javax.swing.JTextPane güncelleSatisFiyati;
    private javax.swing.JTextPane güncelleStokMiktari;
    private javax.swing.JTextPane güncelleÜrünAdi;
    private javax.swing.JTextPane güncelleÜrünGrubu;
    private javax.swing.JLabel günlükKarLabel;
    private javax.swing.JLabel günlükKarSayi;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane13;
    private javax.swing.JScrollPane jScrollPane14;
    private javax.swing.JScrollPane jScrollPane15;
    private javax.swing.JScrollPane jScrollPane16;
    private javax.swing.JScrollPane jScrollPane17;
    private javax.swing.JScrollPane jScrollPane18;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel kasaToplamParaLabel;
    private javax.swing.JLabel kasaToplamSayiLabel;
    private javax.swing.JLabel logo;
    private javax.swing.JButton satisButon;
    private javax.swing.JLabel satisFiyatiLabel;
    private javax.swing.JTextPane satisFiyatiText;
    private javax.swing.JTextPane satisMiktariText;
    private javax.swing.JTextPane sorterText;
    private javax.swing.JLabel stokMiktariLabel;
    private javax.swing.JTextPane stokMiktariText;
    private javax.swing.JTable tablo;
    private javax.swing.JLabel ürünAdiLabel;
    private javax.swing.JTextPane ürünAdiText;
    private javax.swing.JButton ürünEkle;
    private javax.swing.JLabel ürünGrubuLabel;
    private javax.swing.JTextPane ürünGrubuText;
    private javax.swing.JButton ürünGüncelle;
    // End of variables declaration//GEN-END:variables
}
