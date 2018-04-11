package PCD_4_ppt;

import java.awt.Color;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;

/////////////////////////////////
// Prewitt HighPass Filtering  //
// PCD - A                     //
// Created by :                //
// Anissa Amalia N             //
// Frisma Yessy Nabella        //
// Luthfi Maulana              //
/////////////////////////////////

public class GUI_4_ppt extends javax.swing.JFrame {
    protected String filename, filepath, name, prewittx, prewitty, prewittg;
    protected int filewidth, fileheight;
    
    public GUI_4_ppt() {
        initComponents();
        // Cetak Copyright...
        jTextArea1.append("-------------------------------------------\n");
        jTextArea1.append(" Prewitt Highpass Filtering \n");
        jTextArea1.append(" PCD - A \n");
        jTextArea1.append("-------------------------------------------\n");
        jTextArea1.append(" Created by : \n");
        jTextArea1.append("-------------------------------------------\n");
        jTextArea1.append(" Anissa Amalia N \n");
        jTextArea1.append(" Frisma Yessy Nabella \n");
        jTextArea1.append(" Luthfi Maulana \n");
        jTextArea1.append("-------------------------------------------\n");
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jLabel1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Menu"));

        jButton1.setText("Open ");
        jButton1.setActionCommand("jButton1 ");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Process");
        jButton2.setActionCommand("jButton2");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Exit");
        jButton3.setActionCommand("jButton3");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(108, 108, 108)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 108, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jButton1)
                .addGap(18, 18, 18)
                .addComponent(jButton2)
                .addGap(18, 18, 18)
                .addComponent(jButton3)
                .addGap(30, 30, 30)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Image"));

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Before"));
        jPanel3.setPreferredSize(new java.awt.Dimension(302, 23));

        jScrollPane2.setViewportView(jLabel1);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 287, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2)
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("After"));

        jScrollPane3.setViewportView(jLabel2);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 290, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3)
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 363, Short.MAX_VALUE)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
// Button 'Exit'
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton3ActionPerformed
// Button 'Open'
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // Menggunakan FileChooser untuk memilih File 
        JFileChooser fileChooser = new JFileChooser();
        jTextArea1.setVisible(true);
        int returnValue = fileChooser.showOpenDialog(null);
        if (returnValue == JFileChooser.APPROVE_OPTION) {
            // Kalau misal buka File baru lagi, bakal dicetak Copyright lagi.
            if (jTextArea1.getText() != null) {
                jTextArea1.setText(null);
                jTextArea1.append("----------------------------------------"
                        + "---\n");
                jTextArea1.append(" Prewitt High Pass Filtering \n");
                jTextArea1.append(" PCD - A \n");
                jTextArea1.append("----------------------------------------"
                        + "---\n");
                jTextArea1.append(" Created by : \n");
                jTextArea1.append("----------------------------------------"
                        + "---\n");
                jTextArea1.append(" Anissa Amalia N \n");
                jTextArea1.append(" Frisma Yessy Nabella \n");
                jTextArea1.append(" Luthfi Maulana \n");
                jTextArea1.append("----------------------------------------"
                        + "---\n");
            }
            // Setting Image untuk jadi Icon dan menyimpan data-data gambar.
            File selectedFile = fileChooser.getSelectedFile();
            this.filename = selectedFile.getName();
            this.name = this.filename.substring(0, 
                    this.filename.lastIndexOf('.'));
            this.filepath = selectedFile.getPath();
            ImageIcon icon = new ImageIcon(this.filepath);
            Image img = icon.getImage();
            icon = new ImageIcon(img);
            jLabel1.setIcon(icon);
            this.fileheight = icon.getIconHeight();
            this.filewidth =  icon.getIconWidth();
            jTextArea1.append("Open     : " + this.filename + "\n");
            jTextArea1.append("Location : " + this.filepath + "\n");
            jTextArea1.append("Size     : " + this.fileheight + "x" 
                    + this.filewidth + "\n");
            
            // Untuk print nilai gambar per pixel di console...
            System.out.println("-----------------------------------------");
            System.out.println("----------- Nilai Gambar Asli -----------");
            System.out.println("-----------------------------------------");
            try {
                BufferedImage gmbr = ImageIO.read(new File(this.filepath));
                for (int i = 0; i < this.fileheight; i++) {
                    for (int j = 0; j < this.filewidth; j++) {
                        int val = new Color(gmbr.getRGB(j, i)).getRed();
                        System.out.print("x : " + i);
                        System.out.print("  y : " + j);
                        System.out.print("  v : " + val);
                        System.out.println();
                    }
                }
                System.out.println("-----------------------------------------");
            } catch (IOException ex) {
                Logger.getLogger(GUI_4_ppt.class.getName()).
                        log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed
// Button 'Process'
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        jTextArea1.append("Processing...\n");
        BufferedImage data;
        try {
            // Proses Filtering
            // Mengisi var data dengan Gambar.
            data = ImageIO.read(new File(this.filepath));
            // Memanggil method detectEdges dgn params data, dikembalikan sbg -
            // - array 2 dimensi.
            int[][] data1 = filtering(data);
            // Mengubah format array 2 dimensi -> gambar.
            BufferedImage img = convert(data1);
            ImageIcon icon = new ImageIcon(img);
            
            jTextArea1.append("Process Finished...\n");
            jTextArea1.append("Saving...\n");
            // Proses menyimpan gambar
            String nama = this.name + "_prewitt.jpg";
            File gmbrprewitt = new File(nama);
            ImageIO.write(img, "jpg", gmbrprewitt);
            
            jTextArea1.append("Processed Image : \n");
            jTextArea1.append(gmbrprewitt.getPath() + "\n");
            jTextArea1.append("Showing Processed Image...");
            jLabel2.setIcon(icon);
            
            // Untuk print nilai gambar per pixel di console...
            System.out.println("------------------------------------------");
            System.out.println("----------- Nilai Gambar Hasil -----------");
            System.out.println("------------------------------------------");
            BufferedImage gmbr = ImageIO.read(new File(nama));
            for (int i = 0; i < this.fileheight; i++) {
                   for (int j = 0; j < this.filewidth; j++) {
                       int val = new Color(gmbr.getRGB(j, i)).getRed();
                       System.out.print("x : " + i);
                       System.out.print("  y : " + j);
                       System.out.print("  v : " + val);
                       System.out.println();
                   }
               }
            
            System.out.println("-----------------------------------------");
            
        } catch (IOException ex) {
            Logger.getLogger(GUI_4_ppt.class.getName()).
                    log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.
                    UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GUI_4_ppt.class.getName()).
                    log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI_4_ppt.class.getName()).
                    log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI_4_ppt.class.getName()).
                    log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI_4_ppt.class.getName()).
                    log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI_4_ppt().setVisible(true);
            }
        });
        
    }
    // Method untuk proses Filtering.
    private static int[][] filtering(BufferedImage data) {
        int height = data.getHeight(); 
        int width = data.getWidth(); 
        // Prewitt Mask.
        int[][] deriv_x_mask = { 
            {-1,0,1},
            {-1,0,1},
            {-1,0,1}
        };
        int[][] deriv_y_mask = { 
            {1,1,1},
            {0,0,0},
            {-1,-1,-1}
        };
        // Konversi Gambar -> array 2 dimensi getImageValue();
        int[][] map = getImageValue(data);
        // Deklarasi 3 Array 2 dimensi utk X, Y, dan Gradien.
        int[][] grad_x = new int[height][width];
        int[][] grad_y = new int[height][width];
        int[][] grad_mag = new int[height][width];  
        // For-Loop untuk proses Filtering.
        for(int x = 0; x < width; x++){
            for(int y = 0; y < height; y++){
                // Seleksi Kondisi If-Else utk Edge Detection.
                if(x == 0 || x == width - 1 || y == 0 || y == height - 1){
                    // Apabila berada diujung.
                    grad_x[y][x] = 0;
                    grad_y[y][x] = 0;
                }
                else{
                    int x_sum = 0, y_sum = 0;
                    // For-Loop untuk proses Filtering menggunakan Mask.
                    for(int i =- 1; i < 2; i++){
                        for(int j =- 1; j < 2; j++){
                            // Perkalian antara Matriks Gambar dan Mask.
                            x_sum+=map[y+i][x+j] * deriv_x_mask[i+1][j+1] / 3;
                            y_sum+=map[y+i][x+j] * deriv_y_mask[i+1][j+1] / 3;
                        }
                    }
                    // Memasukkan Hasil Penghitungan.
                    grad_x[y][x] = x_sum;
                    grad_y[y][x] = y_sum;
                    // Menghitung Hypotenusa untuk Gradien.
                    int hyp = (int)Math.hypot(grad_x[y][x], grad_y[y][x]); 
                    // Menghindari Nilai > 255.
                    grad_mag[y][x] = (hyp > 255) ? 255 : hyp;
                }
            }
        }
        
        return (grad_mag); 
    }
    
// Konversi Array 2 Dimensi -> Image.
    private static BufferedImage convert(int[][] map) {
        BufferedImage img = new BufferedImage(map[0].length,map.length,
                BufferedImage.TYPE_INT_RGB);
        // For-Loop untuk memasukkan nilai pixel.
        for(int i = 0; i < map.length; i++){
            for(int j = 0; j < map[0].length; j++){
                int val = Math.abs(map[i][j]); 
                Color c = new Color(val,val,val); 
                int rgb = c.getRGB();
                img.setRGB(j, i, rgb);
            }
        }
        return img;
    }

    // Koonversi Gambar -> array 2 dimensi.
	private static int[][] getImageValue(BufferedImage data) {
            int[][] returnArray = new int[data.getHeight()][data.getWidth()];
            for(int i = 0; i < data.getHeight(); i++){
                for(int j = 0; j < data.getWidth(); j++){
                    returnArray[i][j] = new Color(data.getRGB(j, i)).getRed();
                }
            }
            return returnArray;
	}
        

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
