import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.SwingConstants;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

@SuppressWarnings("serial")
public class Devoloper extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Devoloper frame = new Devoloper();
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
	public Devoloper() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 558, 441);
		setLocationRelativeTo(null);
		setResizable(false);
		setUndecorated(true);
		try
		{
			Image image = ImageIO.read(getClass().getResource("calculator.png"));
			Image image2 = image.getScaledInstance(30, 30, Image.SCALE_SMOOTH);
			setIconImage(image2);
		}
		catch (Exception e)
		{
			System.out.println(e);
		}
		setTitle("About Devoloper");
		
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 102));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblPhoto = new JLabel();
		lblPhoto.setBounds(208, 68, 124, 124);
		try
		{
			Image image = ImageIO.read(getClass().getResource("AMJAD KUNNAH.png"));
			Image image2 = image.getScaledInstance(lblPhoto.getWidth(), lblPhoto.getHeight(), Image.SCALE_SMOOTH);
			lblPhoto.setIcon(new ImageIcon(image2));
		}
		catch (Exception e)
		{
			System.out.println(e);
		}
		contentPane.add(lblPhoto);
		
		JLabel lblDeveloperName = new JLabel("Name:");
		lblDeveloperName.setForeground(new Color(255, 204, 102));
		lblDeveloperName.setFont(new Font("Segoe UI", Font.BOLD, 25));
		lblDeveloperName.setBounds(81, 203, 220, 34);
		contentPane.add(lblDeveloperName);
		
		JLabel lblAmjadAazim = new JLabel("Amjad Abdulazim Ahmed");
		lblAmjadAazim.setForeground(new Color(255, 204, 102));
		lblAmjadAazim.setFont(new Font("Segoe UI", Font.ITALIC, 20));
		lblAmjadAazim.setBounds(263, 203, 245, 34);
		contentPane.add(lblAmjadAazim);
		
		JLabel lblEmail = new JLabel("E-Mail:");
		lblEmail.setForeground(new Color(255, 204, 102));
		lblEmail.setFont(new Font("Segoe UI", Font.BOLD, 25));
		lblEmail.setBounds(81, 248, 220, 34);
		contentPane.add(lblEmail);
		
		JLabel lblWhatsapp = new JLabel("Whatsapp:");
		lblWhatsapp.setForeground(new Color(255, 204, 102));
		lblWhatsapp.setFont(new Font("Segoe UI", Font.BOLD, 25));
		lblWhatsapp.setBounds(81, 293, 220, 34);
		contentPane.add(lblWhatsapp);
		
		JLabel lblAmjadaazimaaagmailcom = new JLabel("Amjad.Kunnah@gmail.com");
		lblAmjadaazimaaagmailcom.setForeground(new Color(255, 204, 102));
		lblAmjadaazimaaagmailcom.setFont(new Font("Segoe UI", Font.ITALIC, 20));
		lblAmjadaazimaaagmailcom.setBounds(263, 248, 279, 34);
		contentPane.add(lblAmjadaazimaaagmailcom);
		
		JLabel lblAmjadAazimWhatsapp = new JLabel("00249128597073");
		lblAmjadAazimWhatsapp.setForeground(new Color(255, 204, 102));
		lblAmjadAazimWhatsapp.setFont(new Font("Segoe UI", Font.ITALIC, 20));
		lblAmjadAazimWhatsapp.setBounds(263, 293, 245, 34);
		contentPane.add(lblAmjadAazimWhatsapp);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBorder(null);
		panel.setBackground(new Color(255, 204, 102));
		panel.setBounds(0, 0, 558, 32);
		contentPane.add(panel);
		
		JLabel lblX = new JLabel("X");
		lblX.setForeground(new Color(0, 0, 102));
		lblX.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				
				setVisible(false);
			}
		});
		lblX.setHorizontalAlignment(SwingConstants.CENTER);
		lblX.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblX.setFocusable(false);
		lblX.setBounds(532, 0, 26, 32);
		panel.add(lblX);
		
		JLabel lblX_1 = new JLabel("-");
		lblX_1.setForeground(new Color(0, 0, 102));
		lblX_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				
				setState(ICONIFIED);
			}
		});
		lblX_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblX_1.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblX_1.setFocusable(false);
		lblX_1.setBounds(505, 0, 26, 32);
		panel.add(lblX_1);
		
		JLabel lblHomeAirline = new JLabel("About Devoloper");
		lblHomeAirline.setForeground(new Color(0, 0, 102));
		lblHomeAirline.setHorizontalAlignment(SwingConstants.CENTER);
		lblHomeAirline.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblHomeAirline.setFocusable(false);
		lblHomeAirline.setBounds(81, 0, 394, 32);
		panel.add(lblHomeAirline);
		
		JLabel lblFacebook = new JLabel("Facebook:");
		lblFacebook.setForeground(new Color(255, 204, 102));
		lblFacebook.setFont(new Font("Segoe UI", Font.BOLD, 25));
		lblFacebook.setBounds(81, 338, 220, 34);
		contentPane.add(lblFacebook);
		
		JLabel lblAmjadkunnahFacebook = new JLabel("AmjadKunnah");
		lblAmjadkunnahFacebook.setForeground(new Color(255, 204, 102));
		lblAmjadkunnahFacebook.setFont(new Font("Segoe UI", Font.ITALIC, 20));
		lblAmjadkunnahFacebook.setBounds(263, 338, 279, 34);
		contentPane.add(lblAmjadkunnahFacebook);
		
		JLabel lblTwitter = new JLabel("Twitter:");
		lblTwitter.setForeground(new Color(255, 204, 102));
		lblTwitter.setFont(new Font("Segoe UI", Font.BOLD, 25));
		lblTwitter.setBounds(81, 383, 220, 34);
		contentPane.add(lblTwitter);
		
		JLabel lblAmjadKunnahTwitter = new JLabel("@AmjadKunnah");
		lblAmjadKunnahTwitter.setForeground(new Color(255, 204, 102));
		lblAmjadKunnahTwitter.setFont(new Font("Segoe UI", Font.ITALIC, 20));
		lblAmjadKunnahTwitter.setBounds(263, 383, 245, 34);
		contentPane.add(lblAmjadKunnahTwitter);
	}
}
