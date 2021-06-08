package GestionBancaire;


import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.border.LineBorder;


public class GestionBancaire {
  private JFrame frame;
  
  public static void main(String[] args) {
    EventQueue.invokeLater(new Runnable() {
          public void run() {
            try {
            	GestionBancaire window = new GestionBancaire();
              window.frame.setVisible(true);
            } catch (Exception e) {
              e.printStackTrace();
            } 
          }
        });
  }
  
  public GestionBancaire() {
    initialize();
  }
  
  private void initialize() {
    this.frame = new JFrame();
    this.frame.getContentPane().setBackground(SystemColor.inactiveCaptionBorder);
    this.frame.setBackground(SystemColor.inactiveCaptionBorder);
    this.frame.setBounds(100, 100, 678, 483);
    this.frame.setDefaultCloseOperation(2);
    JPanel panel = new JPanel();
    panel.setForeground(Color.GRAY);
    panel.setBackground(SystemColor.inactiveCaptionBorder);
    panel.setBorder(new LineBorder(new Color(0, 0, 0)));
    this.frame.getContentPane().add(panel, "Center");
    panel.setLayout(null);
    
    JLabel lblNewLabel = new JLabel("");
   
    lblNewLabel.setBounds(42, 8, 95, 99);
    panel.add(lblNewLabel);
    
    JLabel label_1 = new JLabel("MOLOTO BANK");
    label_1.setForeground(Color.DARK_GRAY);
    label_1.setFont(new Font("Rockwell", Font.BOLD, 53));
    label_1.setBounds(118, 8, 471, 87);
    panel.add(label_1);
    
    JLabel label_2 = new JLabel("Bienvenue a notre banque Moloto. ");
    label_2.setFont(new Font("Sitka Display", Font.PLAIN, 18));
    label_2.setBounds(232, 94, 252, 77);
    panel.add(label_2);
    
    JLabel label_3 = new JLabel("Faites votre choix en utilisant les differentes options disponible");
    label_3.setFont(new Font("Sitka Display", Font.PLAIN, 18));
    label_3.setBounds(118, 130, 458, 41);
    panel.add(label_3);
    
    JLabel label_4 = new JLabel("Pour une avenir meilleur");
    label_4.setForeground(Color.GREEN);
    label_4.setFont(new Font("Sitka Text", Font.PLAIN, 19));
    label_4.setBounds(269, 66, 228, 41);
    panel.add(label_4);
    JMenuBar menuBar = new JMenuBar();
    menuBar.setBackground(SystemColor.inactiveCaptionBorder);
    this.frame.setJMenuBar(menuBar);
    
    JLabel label = new JLabel("");
    menuBar.add(label);
    JMenu mnNewMenu = new JMenu("Créer");
    mnNewMenu.setFont(new Font("Segoe UI", 0, 15));
    mnNewMenu.setBackground(SystemColor.inactiveCaptionBorder);
    menuBar.add(mnNewMenu);
    JMenuItem NouveauCompte = new JMenuItem("Nouveau Compte");
    NouveauCompte.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent e) {
        	  GestionBancaire.this.frame.setVisible(false);
        	  Créer_compte.main(null);
          }
        });
    NouveauCompte.setFont(new Font("Segoe UI", 0, 15));
    mnNewMenu.add(NouveauCompte);
    JMenu mnNewMenu_2 = new JMenu("Afficher");
    mnNewMenu_2.setFont(new Font("Segoe UI", 0, 15));
    mnNewMenu_2.setBackground(SystemColor.inactiveCaptionBorder);
    menuBar.add(mnNewMenu_2);
    JMenuItem AffichertToutCompte = new JMenuItem("Tous les comptes");
    AffichertToutCompte.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent e) {
        	  GestionBancaire.this.frame.setVisible(false);
        	  Affichage.main(null);
          }
        });
    AffichertToutCompte.setFont(new Font("Segoe UI", 0, 15));
    mnNewMenu_2.add(AffichertToutCompte);
    JSeparator separator_2 = new JSeparator();
    mnNewMenu_2.add(separator_2);
    JMenuItem AfficherTypeCompte = new JMenuItem("Un type de compte / un compte sp");
    AfficherTypeCompte.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent e) {
        	  GestionBancaire.this.frame.setVisible(false);
        	  TypeDeCompte.main(null);
          }
        });
    AfficherTypeCompte.setFont(new Font("Segoe UI", 0, 15));
    mnNewMenu_2.add(AfficherTypeCompte);
    JMenu mnNewMenu_3 = new JMenu("Supprimer");
    mnNewMenu_3.setFont(new Font("Segoe UI", 0, 15));
    mnNewMenu_3.setBackground(SystemColor.inactiveCaptionBorder);
    menuBar.add(mnNewMenu_3);
    JSeparator separator_3 = new JSeparator();
    mnNewMenu_3.add(separator_3);
    JMenuItem SupprimerCompte = new JMenuItem("Supprimer un compte");
    SupprimerCompte.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent e) {
        	  GestionBancaire.this.frame.setVisible(false);
        	  Supprimer.main(null);
          }
        });
    SupprimerCompte.setFont(new Font("Segoe UI", 0, 15));
    mnNewMenu_3.add(SupprimerCompte);
  }
}
