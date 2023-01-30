package agritech;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import java.awt.Dimension;

public class AboutPage extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AboutPage frame = new AboutPage();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public AboutPage() {
		setMinimumSize(new Dimension(1240, 680));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 568, 411);
		contentPane = new JPanel();
		contentPane.setMinimumSize(new Dimension(1240, 680));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		setLocationRelativeTo(null);
		
		JLabel lblNewLabel = new JLabel("About AgriTech");
		lblNewLabel.setBackground(new Color(255, 228, 181));
		lblNewLabel.setOpaque(true);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Algerian", Font.ITALIC , 35));
		lblNewLabel.setBounds(250, 0, 704, 51);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel1 = new JLabel(" TERMS OF SERVICES : No need of any license or permission to use this.Easy access & user friendly system. ");
		lblNewLabel1.setFont(new Font("Tahoma", Font.BOLD , 17));
		lblNewLabel1.setBounds(30, 88, 999, 44);
		contentPane.add(lblNewLabel1);
		
		JLabel lblNewLabel2 = new JLabel(" PRIVACY POLICY : Here your all personal or non personal informations are reserved carefully. ");
		lblNewLabel2.setFont(new Font("Tahoma", Font.BOLD , 17));
		lblNewLabel2.setBounds(30, 148, 999, 44);
		contentPane.add(lblNewLabel2);
		
		JLabel lblNewLabel3 = new JLabel(" COPYRIGHT reserved by: Tamanna Ferdaus ");
		lblNewLabel3.setFont(new Font("Tahoma", Font.BOLD , 17));
		lblNewLabel3.setBounds(30, 208, 999, 44);
		contentPane.add(lblNewLabel3);
		
		JLabel lblNewLabel4 = new JLabel(" HELP & FEEDBACK : Email: ferdaustamanna.cse4.bu@gmail.com. ");
		lblNewLabel4.setFont(new Font("Tahoma", Font.BOLD , 17));
		lblNewLabel4.setBounds(30, 268, 999, 44);
		contentPane.add(lblNewLabel4);
		
		JButton btnHome = new JButton("Home");
		btnHome.setBounds(529, 421, 206, 55);
		btnHome.setIconTextGap(8);
		btnHome.setIcon(new ImageIcon("src\\img\\69524.png"));
		btnHome.setHorizontalAlignment(SwingConstants.LEFT);
		btnHome.setHorizontalTextPosition(SwingConstants.LEFT);
		btnHome.setForeground(new Color(245, 245, 220));
		btnHome.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnHome.setBackground(new Color(0, 0, 205));
		btnHome.setFocusable(false);
		btnHome.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				@SuppressWarnings("unused")
				MainPage mp=new MainPage();
				MainPage.main(null);
				dispose();
			}
			
		});
		contentPane.setLayout(null);
		contentPane.add(btnHome);
	}

}
