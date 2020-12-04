
package election_system;


import java.sql.*;
import java.sql.DriverManager;
import java.util.Random;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.RowFilter;
import javax.swing.table.TableRowSorter;



public final class menu extends javax.swing.JFrame {
    
      
    public menu() {
        initComponents();
        fillJtable_candidate();
        fillJtable_user();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel9 = new javax.swing.JPanel();
        stats = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        users_panel = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        id_tf = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        f_name_tf = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        l_name_tf = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        region_tf = new javax.swing.JTextField();
        code_tf = new javax.swing.JTextField();
        code_b = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        add_b = new javax.swing.JButton();
        update_b = new javax.swing.JButton();
        delete_b = new javax.swing.JButton();
        reset_b = new javax.swing.JButton();
        restart = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        search_tf = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        user_table = new javax.swing.JTable();
        candidate_panel = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        candidate_table = new javax.swing.JTable();
        jPanel7 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        id_tf1 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        f_name_tf1 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        l_name_tf1 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        party_tf = new javax.swing.JTextField();
        jPanel8 = new javax.swing.JPanel();
        add_b1 = new javax.swing.JButton();
        update_b1 = new javax.swing.JButton();
        delete_b1 = new javax.swing.JButton();
        reset_b1 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        jPanel9.setBackground(new java.awt.Color(34, 49, 63));

        stats.setForeground(new java.awt.Color(255, 255, 255));
        stats.setText("stats");
        stats.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                statsMouseClicked(evt);
            }
        });

        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("log out");
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(41, 241, 195));

        jPanel4.setBackground(new java.awt.Color(34, 49, 63));
        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("id");

        id_tf.setBackground(new java.awt.Color(34, 49, 63));
        id_tf.setForeground(new java.awt.Color(255, 255, 255));
        id_tf.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(41, 241, 195)));
        id_tf.setCaretColor(new java.awt.Color(255, 255, 255));
        id_tf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                id_tfActionPerformed(evt);
            }
        });

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("first name");

        f_name_tf.setBackground(new java.awt.Color(34, 49, 63));
        f_name_tf.setForeground(new java.awt.Color(255, 255, 255));
        f_name_tf.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(41, 241, 195)));
        f_name_tf.setCaretColor(new java.awt.Color(255, 255, 255));

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("last name");

        l_name_tf.setBackground(new java.awt.Color(34, 49, 63));
        l_name_tf.setForeground(new java.awt.Color(255, 255, 255));
        l_name_tf.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(41, 241, 195)));
        l_name_tf.setCaretColor(new java.awt.Color(255, 255, 255));

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("region");

        region_tf.setBackground(new java.awt.Color(34, 49, 63));
        region_tf.setForeground(new java.awt.Color(255, 255, 255));
        region_tf.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(41, 241, 195)));
        region_tf.setCaretColor(new java.awt.Color(255, 255, 255));

        code_tf.setBackground(new java.awt.Color(34, 49, 63));
        code_tf.setForeground(new java.awt.Color(255, 255, 255));
        code_tf.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(41, 241, 195)));
        code_tf.setCaretColor(new java.awt.Color(255, 255, 255));

        code_b.setBackground(new java.awt.Color(41, 241, 195));
        code_b.setText("generate code");
        code_b.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                code_bActionPerformed(evt);
            }
        });

        jPanel5.setBackground(new java.awt.Color(34, 49, 63));

        add_b.setBackground(new java.awt.Color(41, 241, 195));
        add_b.setText("insert");
        add_b.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        add_b.setIconTextGap(10);
        add_b.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_bActionPerformed(evt);
            }
        });

        update_b.setBackground(new java.awt.Color(41, 241, 195));
        update_b.setText("update");
        update_b.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        update_b.setIconTextGap(10);
        update_b.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                update_bActionPerformed(evt);
            }
        });

        delete_b.setBackground(new java.awt.Color(41, 241, 195));
        delete_b.setText("delete");
        delete_b.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        delete_b.setIconTextGap(10);
        delete_b.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delete_bActionPerformed(evt);
            }
        });

        reset_b.setBackground(new java.awt.Color(41, 241, 195));
        reset_b.setText("refresh");
        reset_b.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        reset_b.setIconTextGap(10);
        reset_b.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reset_bActionPerformed(evt);
            }
        });

        restart.setBackground(new java.awt.Color(214, 69, 65));
        restart.setText("restart votes");
        restart.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        restart.setIconTextGap(10);
        restart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                restartActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(reset_b, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(restart, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(delete_b, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(update_b, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(add_b, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(add_b)
                .addGap(18, 18, 18)
                .addComponent(update_b)
                .addGap(18, 18, 18)
                .addComponent(delete_b)
                .addGap(18, 18, 18)
                .addComponent(restart)
                .addGap(18, 18, 18)
                .addComponent(reset_b)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jPanel5Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {add_b, delete_b, reset_b, update_b});

        jLabel11.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                search_tfKeyReleased(evt);
            }
        });

        search_tf.setText("search...");
        search_tf.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                search_tfMouseClicked(evt);
            }
        });
        search_tf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                search_tfKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(202, 202, 202)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(region_tf, javax.swing.GroupLayout.DEFAULT_SIZE, 794, Short.MAX_VALUE)
                                .addComponent(f_name_tf)
                                .addComponent(l_name_tf)
                                .addComponent(id_tf))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel3))
                                .addGap(599, 599, 599)))
                        .addGap(102, 102, 102))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(103, 103, 103)
                        .addComponent(code_b)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(code_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(109, 109, 109))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(search_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel11)
                    .addComponent(search_tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(id_tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(f_name_tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(l_name_tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(region_tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(code_b, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(code_tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(36, 36, 36))
        );

        jScrollPane1.setBackground(new java.awt.Color(41, 241, 195));
        jScrollPane1.setForeground(new java.awt.Color(41, 241, 195));

        user_table.setBorder(new javax.swing.border.MatteBorder(null));
        user_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "first name2", "laste name", "region", "vote", "code"
            }
        ));
        user_table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                user_tableMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(user_table);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1078, Short.MAX_VALUE)
                .addGap(216, 216, 216))
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 205, Short.MAX_VALUE)
                .addGap(44, 44, 44))
        );

        javax.swing.GroupLayout users_panelLayout = new javax.swing.GroupLayout(users_panel);
        users_panel.setLayout(users_panelLayout);
        users_panelLayout.setHorizontalGroup(
            users_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        users_panelLayout.setVerticalGroup(
            users_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(users_panelLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("manage users", users_panel);

        jPanel6.setBackground(new java.awt.Color(41, 241, 195));

        candidate_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "first name ", "last name", "party"
            }
        ));
        candidate_table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                candidate_tableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(candidate_table);

        jPanel7.setBackground(new java.awt.Color(34, 49, 63));

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("id");

        id_tf1.setBackground(new java.awt.Color(34, 49, 63));
        id_tf1.setForeground(new java.awt.Color(255, 255, 255));
        id_tf1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(41, 241, 195)));
        id_tf1.setCaretColor(new java.awt.Color(255, 255, 255));
        id_tf1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                id_tf1ActionPerformed(evt);
            }
        });

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("first name");

        f_name_tf1.setBackground(new java.awt.Color(34, 49, 63));
        f_name_tf1.setForeground(new java.awt.Color(255, 255, 255));
        f_name_tf1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(41, 241, 195)));
        f_name_tf1.setCaretColor(new java.awt.Color(255, 255, 255));

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("last name");

        l_name_tf1.setBackground(new java.awt.Color(34, 49, 63));
        l_name_tf1.setForeground(new java.awt.Color(255, 255, 255));
        l_name_tf1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(41, 241, 195)));
        l_name_tf1.setCaretColor(new java.awt.Color(255, 255, 255));

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("party");

        party_tf.setBackground(new java.awt.Color(34, 49, 63));
        party_tf.setForeground(new java.awt.Color(255, 255, 255));
        party_tf.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(41, 241, 195)));
        party_tf.setCaretColor(new java.awt.Color(255, 255, 255));

        jPanel8.setBackground(new java.awt.Color(34, 49, 63));

        add_b1.setBackground(new java.awt.Color(41, 241, 195));
        add_b1.setText("insert");
        add_b1.setToolTipText("");
        add_b1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        add_b1.setIconTextGap(10);
        add_b1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_b1ActionPerformed(evt);
            }
        });

        update_b1.setBackground(new java.awt.Color(41, 241, 195));
        update_b1.setText("update");
        update_b1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        update_b1.setIconTextGap(10);
        update_b1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                update_b1ActionPerformed(evt);
            }
        });

        delete_b1.setBackground(new java.awt.Color(41, 241, 195));
        delete_b1.setText("delete");
        delete_b1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        delete_b1.setIconTextGap(10);
        delete_b1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delete_b1ActionPerformed(evt);
            }
        });

        reset_b1.setBackground(new java.awt.Color(41, 241, 195));
        reset_b1.setText("refresh");
        reset_b1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        reset_b1.setIconTextGap(10);
        reset_b1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reset_b1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(add_b1, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(update_b1)
                    .addComponent(reset_b1)
                    .addComponent(delete_b1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel8Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {add_b1, delete_b1, reset_b1, update_b1});

        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addComponent(add_b1)
                .addGap(18, 18, 18)
                .addComponent(update_b1)
                .addGap(18, 18, 18)
                .addComponent(delete_b1)
                .addGap(18, 18, 18)
                .addComponent(reset_b1)
                .addGap(15, 15, 15))
        );

        jPanel8Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {add_b1, delete_b1, reset_b1, update_b1});

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(201, 201, 201)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(f_name_tf1)
                    .addComponent(l_name_tf1)
                    .addComponent(jLabel5)
                    .addComponent(jLabel7)
                    .addComponent(jLabel6)
                    .addComponent(party_tf)
                    .addComponent(jLabel8)
                    .addComponent(id_tf1, javax.swing.GroupLayout.PREFERRED_SIZE, 662, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 254, Short.MAX_VALUE)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(118, 118, 118))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(12, 12, 12)
                        .addComponent(id_tf1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(f_name_tf1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(l_name_tf1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(party_tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(74, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(161, 161, 161)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 1203, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)
                .addGap(42, 42, 42))
        );

        javax.swing.GroupLayout candidate_panelLayout = new javax.swing.GroupLayout(candidate_panel);
        candidate_panel.setLayout(candidate_panelLayout);
        candidate_panelLayout.setHorizontalGroup(
            candidate_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        candidate_panelLayout.setVerticalGroup(
            candidate_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("manage candidate", candidate_panel);

        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("list");
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(stats)
                .addGap(34, 34, 34)
                .addComponent(jLabel10)
                .addGap(34, 34, 34)
                .addComponent(jLabel9)
                .addGap(56, 56, 56))
            .addComponent(jTabbedPane1)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10)
                    .addComponent(stats, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane1))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void statsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_statsMouseClicked
        stat open=new stat();
        open.setVisible(true);
    }//GEN-LAST:event_statsMouseClicked

    private void id_tfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_id_tfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_id_tfActionPerformed

    private void code_bActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_code_bActionPerformed
        // TODO add your handling code here:
        Random random = new Random();
        int rand= random.nextInt((9999-1000)+1)+1000;

        code_tf.setText(Integer.toString(rand));
    }//GEN-LAST:event_code_bActionPerformed

    private void add_bActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_bActionPerformed
        // TODO add your handling code here:

        if(!id_tf.getText().isEmpty() && !f_name_tf.getText().isEmpty() && !l_name_tf.getText().isEmpty() && !region_tf.getText().isEmpty()&& !code_tf.getText().isEmpty()){
           
            int id=Integer.parseInt(id_tf.getText());
            int k=0;
            try{
                Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/samp", "db","db");
                String SQL ="insert into users values(?,?,?,?,?,?)";
                String sqladd="select * from admin where id="+id;
                PreparedStatement psmt = con.prepareStatement(SQL);
                Statement stmtadd=con.createStatement();
                Statement stmt2=con.createStatement();
                ResultSet rs=stmtadd.executeQuery(sqladd);
                ResultSet rs2=stmt2.executeQuery(sqladd);
                psmt.setInt(1, Integer.parseInt(id_tf.getText()));
                psmt.setString(2,f_name_tf.getText());
                psmt.setString(3, l_name_tf.getText());
                psmt.setString(4, region_tf.getText());
                psmt.setBoolean(5, false);
                psmt.setInt(6, Integer.parseInt(code_tf.getText()));
                
                
                 while(!rs.next()&& k==0){

                    int i= psmt.executeUpdate();
                    k++;
                    if(i>0){
                    fillJtable_user();
                    JOptionPane.showMessageDialog(this, "The user was added successfully!", "Success Message", JOptionPane.INFORMATION_MESSAGE);}}
            while(rs2.next()){
                System.out.println("admin id");
                 JOptionPane.showMessageDialog(this, "Failed to Add\nadmin ID", "Execution Alert", JOptionPane.ERROR_MESSAGE);
            }}
    
            catch(SQLException err)
            {
                System.out.println(err.getMessage());
                JOptionPane.showMessageDialog(this, "Failed to Add\nduplicate ID", "Execution Alert", JOptionPane.ERROR_MESSAGE);
            }

        }
        else{ JOptionPane.showMessageDialog(this, "Failed to add \nAll field are mandatory", "Execution Alert", JOptionPane.ERROR_MESSAGE); }
    }//GEN-LAST:event_add_bActionPerformed

    private void update_bActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_update_bActionPerformed
        // TODO add your handling code here:
        if(!id_tf.getText().isEmpty() && !f_name_tf.getText().isEmpty() && !l_name_tf.getText().isEmpty() && !region_tf.getText().isEmpty()&& !code_tf.getText().isEmpty())
        {
           

            try{
                Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/samp", "db", "db");
                String SQL ="update users set f_name=?, l_name=?, region=?, code=? where id=?";
                PreparedStatement psmt = con.prepareStatement(SQL);

                psmt.setString(1, f_name_tf.getText());
                psmt.setString(2, l_name_tf.getText());
                psmt.setString(3, region_tf.getText());
                psmt.setInt(4, Integer.parseInt(code_tf.getText()));
                psmt.setInt(5, Integer.parseInt(id_tf.getText()));

                int i= psmt.executeUpdate();
                if(i>0)
                {
                    

                    JOptionPane.showMessageDialog(this, "The user has been updated successfully!", "Success Message", JOptionPane.INFORMATION_MESSAGE);
                }
                else
                JOptionPane.showMessageDialog(this, "Update failed\nThere is no user with the entered ID", "Query Execution Failed", JOptionPane.ERROR_MESSAGE);

            }

            catch(SQLException err)
            {
                System.out.println(err.getMessage());
            }

        }
        else{ JOptionPane.showMessageDialog(this, "Failed to update \nAll Fields are Mandatory", "Execution Alert", JOptionPane.ERROR_MESSAGE); }
    }//GEN-LAST:event_update_bActionPerformed

    private void delete_bActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delete_bActionPerformed
        // TODO add your handling code here:
        if(!id_tf.getText().isEmpty())
        {

            try{
                Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/samp", "db", "db");
                String SQL ="delete from users where id=" + Integer.parseInt(id_tf.getText());
                PreparedStatement psmt = con.prepareStatement(SQL);

                int i= psmt.executeUpdate();
                if(i>0)
                {
                   

                    JOptionPane.showMessageDialog(this, "The user wad deleted successfully!", "Success Message", JOptionPane.INFORMATION_MESSAGE);
                }
                else
                JOptionPane.showMessageDialog(this, "Delete operation failed\nThere is no user with the entered ID", "Query Execution Failed", JOptionPane.ERROR_MESSAGE);

            }

            catch(SQLException err)
            {
                System.out.println(err.getMessage());
            }

        }
        else{ JOptionPane.showMessageDialog(this, "Failed to delete \nid Field is Mandatory", "Execution Alert", JOptionPane.ERROR_MESSAGE); }
    }//GEN-LAST:event_delete_bActionPerformed

    private void reset_bActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reset_bActionPerformed
        // TODO add your handling code here:
        id_tf.setText(null);
        f_name_tf.setText(null);
        l_name_tf.setText(null);
        region_tf.setText(null);
        code_tf.setText(null);
        fillJtable_user();
    }//GEN-LAST:event_reset_bActionPerformed

    private void id_tf1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_id_tf1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_id_tf1ActionPerformed

    private void add_b1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_b1ActionPerformed
        // TODO add your handling code here:
        if (!id_tf1.getText().isEmpty() && !f_name_tf1.getText().isEmpty() && !l_name_tf1.getText().isEmpty() && !party_tf.getText().isEmpty())
        {
            try{
                int id = Integer.parseInt(id_tf1.getText());
                String name = f_name_tf1.getText();
                String last = l_name_tf1.getText();
                String party = party_tf.getText();
                int count;

                

                Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/samp", "db", "db");

                String SQL = " INSERT INTO CANDIDATE VALUES (?,?,?,?)";

                PreparedStatement pstmt = con.prepareStatement(SQL);

                pstmt.setInt(1, id);
                pstmt.setString(2, name);
                pstmt.setString(3, last);
                pstmt.setString(4, party);

                count = pstmt.executeUpdate();

                if(count >0)
                {
          
                    fillJtable_candidate();
                    JOptionPane.showMessageDialog(this, "The User was added Successfully !", "Success Message", JOptionPane.INFORMATION_MESSAGE);
                }
                else
                JOptionPane.showMessageDialog(this, "Insert Query Execution Failed", "Execution Alert",JOptionPane.ERROR_MESSAGE);

            }catch (SQLIntegrityConstraintViolationException e) {
                JOptionPane.showMessageDialog(this, "Failed to Add \n Duplicate ID" , "Execution Alert", JOptionPane.ERROR_MESSAGE);
            } catch(SQLException err)
            {
                System.out.println(err.getMessage());
            }
        }
        else{
            JOptionPane.showMessageDialog(this, "All fields are mandatory", "Execution Alert",JOptionPane.ERROR_MESSAGE);}
    }//GEN-LAST:event_add_b1ActionPerformed

    private void update_b1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_update_b1ActionPerformed
        // TODO add your handling code here:
        try {
            if (!id_tf1.getText().isEmpty() && !f_name_tf1.getText().isEmpty() && !l_name_tf1.getText().isEmpty() && !party_tf.getText().isEmpty())
            {
                int id = Integer.parseInt(id_tf1.getText());
                String name = f_name_tf1.getText();
                String last = l_name_tf1.getText();
                String party = party_tf.getText();
                int count;

                Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/samp", "db", "db");

                String SQL1 = "UPDATE candidate SET f_name = ?, l_name = ?, party = ? Where id = ?";

                PreparedStatement pstmt = con.prepareStatement(SQL1);

                

                pstmt.setInt(4, id);
                pstmt.setString (1, name);
                pstmt.setString(2, last);
                pstmt.setString(3, party);

                count = pstmt.executeUpdate();

                if (count>0)
                {
                   
                 
                    JOptionPane.showMessageDialog(this, "The user was updated Successfully !", "Success Message", JOptionPane.INFORMATION_MESSAGE);
                }
                else
                JOptionPane.showMessageDialog(this, "ID not found", "Execution Alert",JOptionPane.ERROR_MESSAGE);

            }
            else
            JOptionPane.showMessageDialog(this, "All fields are mandatory", "Execution Alert",JOptionPane.ERROR_MESSAGE);

        } catch (SQLException err)
        {
            System.out.println(err.getMessage());
        }
    }//GEN-LAST:event_update_b1ActionPerformed

    private void delete_b1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delete_b1ActionPerformed
        // TODO add your handling code here:
        try{
            if (!id_tf1.getText().isEmpty())
            {
                int id = Integer.parseInt(id_tf1.getText());
                String name = f_name_tf1.getText();
                String last = l_name_tf1.getText();
                String party = party_tf.getText();
                int count;

                Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/samp", "db", "db");

                String SQL2 = "DELETE FROM CANDIDATE WHERE ID = ?";

                PreparedStatement pstmt = con.prepareStatement(SQL2);

                

                pstmt.setInt(1, id);

                count = pstmt.executeUpdate();
                if (count>0)
                {
                    
 
                    JOptionPane.showMessageDialog(this, "The user was deleted Successfully !", "Success Message", JOptionPane.INFORMATION_MESSAGE);
                }
                else
                JOptionPane.showMessageDialog(this, "ID not found", "Execution Alert",JOptionPane.ERROR_MESSAGE);

            }
            else
            JOptionPane.showMessageDialog(this, "ID field is mandatory", "Execution Alert",JOptionPane.ERROR_MESSAGE);

        } catch (SQLException err)
        {
            System.out.println(err.getMessage());
        }
    }//GEN-LAST:event_delete_b1ActionPerformed

    private void reset_b1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reset_b1ActionPerformed
        // TODO add your handling code here:
        id_tf1.setText(null);
        f_name_tf1.setText(null);
        l_name_tf1.setText(null);
        party_tf.setText(null);
        fillJtable_candidate();
    }//GEN-LAST:event_reset_b1ActionPerformed

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        // TODO add your handling code here:
        this.dispose();
        login openlogin= new login();
        openlogin.setVisible(true);

    }//GEN-LAST:event_jLabel9MouseClicked

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        fillJtable_user();
    }//GEN-LAST:event_formComponentShown

    private void user_tableMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_user_tableMousePressed
        // TODO add your handling code here:
        
        DefaultTableModel model = (DefaultTableModel) user_table.getModel();
        int selectedrow=user_table.getSelectedRow();
        id_tf.setText(model.getValueAt(selectedrow, 0).toString());
        f_name_tf.setText(model.getValueAt(selectedrow, 1).toString());
        l_name_tf.setText(model.getValueAt(selectedrow, 2).toString());
        region_tf.setText(model.getValueAt(selectedrow, 3).toString());
        code_tf.setText(model.getValueAt(selectedrow, 5).toString());
    }//GEN-LAST:event_user_tableMousePressed

    private void candidate_tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_candidate_tableMouseClicked
        DefaultTableModel model = (DefaultTableModel) candidate_table.getModel();
        int selectedrow=candidate_table.getSelectedRow();
        id_tf1.setText(model.getValueAt(selectedrow, 0).toString());
        f_name_tf1.setText(model.getValueAt(selectedrow, 1).toString());
        l_name_tf1.setText(model.getValueAt(selectedrow, 2).toString());
        party_tf.setText(model.getValueAt(selectedrow, 3).toString());
    }//GEN-LAST:event_candidate_tableMouseClicked

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
        // TODO add your handling code here:
        create_list openlist=new create_list();
        openlist.setVisible(true);
    }//GEN-LAST:event_jLabel10MouseClicked

    private void restartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_restartActionPerformed
            Connection con;
        try {
            con = DriverManager.getConnection("jdbc:derby://localhost:1527/samp", "db", "db");
             String SQL= "delete from votes";
            PreparedStatement pstmt = con.prepareStatement(SQL);
            String SQLU= "update users set vote=false";
            PreparedStatement pstmtu = con.prepareStatement(SQLU);
            int response=JOptionPane.showConfirmDialog(this, "do you want to confirm your action?", "vote",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
            if(response==JOptionPane.YES_OPTION){
            int i=pstmt.executeUpdate();
            int j =pstmtu.executeUpdate();
            fillJtable_user();
               if(i>0 || j>0){
                   JOptionPane.showMessageDialog(this, "data cleared", "reset",JOptionPane.INFORMATION_MESSAGE);;
               }}
           
            }
       catch(SQLException x)
        {
           System.out.println("Exception="+x);
        }
    }//GEN-LAST:event_restartActionPerformed

    private void search_tfMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_search_tfMouseClicked
        //search_tf.setText(null);

    }//GEN-LAST:event_search_tfMouseClicked

    private void search_tfKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_search_tfKeyReleased
                 try
        {
          DefaultTableModel model = new DefaultTableModel();  
            Object[] columnnames = new Object [6];
            columnnames[0]="ID";
            columnnames[1]="First Name";
            columnnames[2]="Last Name";
            columnnames[3]="Region";
            columnnames[4]="Vote";
            columnnames[5]="code";
            model.setColumnIdentifiers(columnnames);
            Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/samp", "db", "db");
            Statement stmt = con.createStatement();
            String SQL= "select * from users";
            ResultSet rs=stmt.executeQuery(SQL);
            while(rs.next())
            {
                int id= rs.getInt("id");
                String fname = rs.getString("f_name");
                String lname = rs.getString("l_name");
                String region = rs.getString("region");
                boolean vote = rs.getBoolean("vote");
                int code= rs.getInt("code");
                Object [] row = {id, fname, lname, region, vote,code};
                model.addRow(row);
            }
                    TableRowSorter <DefaultTableModel> tr= new TableRowSorter <DefaultTableModel> (model);
        user_table.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(search_tf.getText()));
        }       
      catch(SQLException x)
        {
           System.out.println("Exception="+x);
        }
    }//GEN-LAST:event_search_tfKeyReleased

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
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
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new menu().setVisible(true);
            }
        });
    }
           public void fillJtable_user()
    {
        try
        {
          DefaultTableModel model = new DefaultTableModel();  
            Object[] columnnames = new Object [6];
            columnnames[0]="ID";
            columnnames[1]="First Name";
            columnnames[2]="Last Name";
            columnnames[3]="Region";
            columnnames[4]="Vote";
            columnnames[5]="code";
            model.setColumnIdentifiers(columnnames);
            Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/samp", "db", "db");
            Statement stmt = con.createStatement();
            String SQL= "select * from users";
            ResultSet rs=stmt.executeQuery(SQL);
            while(rs.next())
            {
                int id= rs.getInt("id");
                String fname = rs.getString("f_name");
                String lname = rs.getString("l_name");
                String region = rs.getString("region");
                boolean vote = rs.getBoolean("vote");
                int code= rs.getInt("code");
                Object [] row = {id, fname, lname, region, vote,code};
                model.addRow(row);
            }
            user_table.setModel(model);
        }
        catch(SQLException x)
        {
           System.out.println("Exception="+x);
        }
    }
             public void fillJtable_candidate()
    {
        try
        {
            DefaultTableModel modell = new DefaultTableModel();
            Object[] columnnames = new Object [4];
            columnnames[0]="ID";
            columnnames[1]="First Name";
            columnnames[2]="Last Name";
            columnnames[3]="party";
            modell.setColumnIdentifiers(columnnames);
            
            Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/samp", "db", "db");
            Statement stmt = con.createStatement();
            String SQL= "select * from candidate";
            ResultSet rs=stmt.executeQuery(SQL);
            while(rs.next())
            {
                int id= rs.getInt("id");
                String fname = rs.getString("f_name");
                String lname = rs.getString("l_name");
                String party = rs.getString("party");
                Object [] row = {id, fname, lname, party};
                modell.addRow(row);
            }
              
            candidate_table.setModel(modell);
            
        }
        catch(SQLException x)
        {
           System.out.println("Exception="+x);
        }}
       


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add_b;
    private javax.swing.JButton add_b1;
    private javax.swing.JPanel candidate_panel;
    private javax.swing.JTable candidate_table;
    private javax.swing.JButton code_b;
    private javax.swing.JTextField code_tf;
    private javax.swing.JButton delete_b;
    private javax.swing.JButton delete_b1;
    private javax.swing.JTextField f_name_tf;
    private javax.swing.JTextField f_name_tf1;
    private javax.swing.JTextField id_tf;
    private javax.swing.JTextField id_tf1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField l_name_tf;
    private javax.swing.JTextField l_name_tf1;
    private javax.swing.JTextField party_tf;
    private javax.swing.JTextField region_tf;
    private javax.swing.JButton reset_b;
    private javax.swing.JButton reset_b1;
    private javax.swing.JButton restart;
    private javax.swing.JTextField search_tf;
    private javax.swing.JLabel stats;
    private javax.swing.JButton update_b;
    private javax.swing.JButton update_b1;
    private javax.swing.JTable user_table;
    private javax.swing.JPanel users_panel;
    // End of variables declaration//GEN-END:variables
}