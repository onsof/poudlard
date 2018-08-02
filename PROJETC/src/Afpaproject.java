import java.awt.EventQueue;

import java.awt.BorderLayout;


import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.Button;
import java.awt.SystemColor;
import javax.swing.JTextField;
import javax.swing.JSeparator;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;



public class Afpaproject {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JPasswordField passwordField;
	private JPasswordField passwordField_1;
	int xx,xy;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Afpaproject window = new Afpaproject();
					window.frame.setUndecorated(true);
					window.frame.setVisible(true);
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Afpaproject() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setBounds(100, 100, 700, 360);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.DARK_GRAY);
		panel.setBounds(0, 0, 367, 387);
		frame.getContentPane().add(panel);
		
		JLabel lblNewLabel = new JLabel("");
		
		lblNewLabel.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				xx = e.getX();
				xy = e.getY();
			}
		});
		lblNewLabel.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseDragged(MouseEvent arg0) {
				int x = arg0.getXOnScreen();
				int y = arg0.getYOnScreen();
				Afpaproject.this.frame.setLocation(x - xx, y-xy);				
			}
		});
		lblNewLabel.setIcon(new ImageIcon(Afpaproject.class.getResource("/image/cerf4.jpg")));
		panel.add(lblNewLabel);
		
		Button button = new Button("SignUp");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		button.setForeground(Color.BLACK);
		button.setBackground(new Color(241 , 57 , 83));
		button.setBounds(449, 221, 150, 50);
		frame.getContentPane().add(button);
		
		JLabel lblNom = new JLabel("Nom :");
		lblNom.setBounds(420, 51, 46, 14);
		frame.getContentPane().add(lblNom);
		
		textField = new JTextField();
		textField.setBounds(420, 66, 205, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(420, 84, 205, 2);
		frame.getContentPane().add(separator);
		
		JLabel lblEmail = new JLabel("Email :");
		lblEmail.setBounds(420, 97, 46, 14);
		frame.getContentPane().add(lblEmail);
		
		textField_1 = new JTextField();
		textField_1.setBounds(420, 111, 205, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(420, 131, 205, 0);
		frame.getContentPane().add(separator_1);
		
		JLabel lblMotDePasse = new JLabel("Mot de passe :");
		lblMotDePasse.setBounds(420, 138, 91, 14);
		frame.getContentPane().add(lblMotDePasse);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(420, 153, 205, 20);
		frame.getContentPane().add(passwordField);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(420, 184, 205, 0);
		frame.getContentPane().add(separator_2);
		
		JLabel lblConfirmationMotDe = new JLabel("Confirmation mot de passe :");
		lblConfirmationMotDe.setBounds(420, 180, 161, 14);
		frame.getContentPane().add(lblConfirmationMotDe);
		
		passwordField_1 = new JPasswordField();
		passwordField_1.setBounds(420, 195, 205, 20);
		frame.getContentPane().add(passwordField_1);
		
		JSeparator separator_3 = new JSeparator();
		separator_3.setBounds(420, 227, 205, 0);
		frame.getContentPane().add(separator_3);
		
		JLabel lblX = new JLabel("X");
		lblX.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				System.exit(0);
			}
		});
		lblX.setHorizontalAlignment(SwingConstants.CENTER);
		lblX.setBounds(668, 0, 26, 14);
		frame.getContentPane().add(lblX);
		
		Button button_1 = new Button("deja inscrit ? ");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				
			}
		});
		button_1.setForeground(Color.BLACK);
		button_1.setBackground(new Color(241, 57, 83));
		button_1.setBounds(583, 302, 91, 20);
		frame.getContentPane().add(button_1);
		
		Button button_2 = new Button("Visiteur ?");
		button_2.setForeground(Color.BLACK);
		button_2.setBackground(new Color(241, 57, 83));
		button_2.setBounds(375, 302, 91, 20);
		frame.getContentPane().add(button_2);
	}
	}

