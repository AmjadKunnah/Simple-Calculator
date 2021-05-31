import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import java.awt.Font;
import java.awt.Image;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.imageio.ImageIO;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class Main_Calculator {

	private JFrame frame;
	private JTextField textFieldN1;
	private JTextField textFieldN2;
	private JTextField textFieldResault;
	private JLabel labelMiddle;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main_Calculator window = new Main_Calculator();
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
	public Main_Calculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 485);
		frame.setUndecorated(true);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Calculator");
		try
		{
			Image image = ImageIO.read(getClass().getResource("calculator.png"));
			Image image2 = image.getScaledInstance(30, 30, Image.SCALE_SMOOTH);
			frame.setIconImage(image2);
		}
		catch (Exception e)
		{
			System.out.println(e);
		}
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 204, 102));
		panel.setBounds(0, 0, 450, 47);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblX = new JLabel("   X");
		lblX.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				
				System.exit(0);
			}
		});
		lblX.setForeground(new Color(0, 0, 102));
		lblX.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblX.setBounds(407, 0, 43, 47);
		panel.add(lblX);
		
		JLabel lblX_1 = new JLabel("   -");
		lblX_1.addMouseListener(new MouseAdapter() {
			@SuppressWarnings("static-access")
			@Override
			public void mouseClicked(MouseEvent arg0) {
				
				frame.setState(frame.ICONIFIED);
			}
		});
		lblX_1.setForeground(new Color(0, 0, 102));
		lblX_1.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblX_1.setBounds(363, 0, 43, 47);
		panel.add(lblX_1);
		
		JLabel lblCalculator = new JLabel("Calculator");
		lblCalculator.setForeground(new Color(0, 0, 102));
		lblCalculator.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblCalculator.setBounds(155, -2, 144, 47);
		panel.add(lblCalculator);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(0, 0, 102));
		panel_1.setBounds(0, 45, 450, 440);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JButton buttonOne = new JButton("1");
		buttonOne.setFocusable(false);
		buttonOne.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				if(textFieldN1.isFocusable())
				{
					textFieldN1.setText(textFieldN1.getText() + buttonOne.getText());
				}
				
			   else 
				{
					textFieldN2.setText(textFieldN2.getText() + buttonOne.getText());
				}
				
			}
		});
		buttonOne.setForeground(new Color(0, 0, 102));
		buttonOne.setBackground(new Color(255, 204, 102));
		buttonOne.setFont(new Font("Tahoma", Font.BOLD, 18));
		buttonOne.setBounds(54, 160, 49, 46);
		panel_1.add(buttonOne);
		
		JButton buttonTow = new JButton("2");
		buttonTow.setFocusable(false);
		buttonTow.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				if(textFieldN1.isFocusable())
				{
					textFieldN1.setText(textFieldN1.getText() + buttonTow.getText());
				}
				
			   else 
				{
					textFieldN2.setText(textFieldN2.getText() + buttonTow.getText());
				}

			}
		});
		buttonTow.setForeground(new Color(0, 0, 102));
		buttonTow.setFont(new Font("Tahoma", Font.BOLD, 18));
		buttonTow.setBackground(new Color(255, 204, 102));
		buttonTow.setBounds(103, 160, 49, 46);
		panel_1.add(buttonTow);
		
		JButton buttonThree = new JButton("3");
		buttonThree.setFocusable(false);
		buttonThree.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				if(textFieldN1.isFocusable())
				{
					textFieldN1.setText(textFieldN1.getText() + buttonThree.getText());
				}
				
			   else 
				{
					textFieldN2.setText(textFieldN2.getText() + buttonThree.getText());
				}

			}
		});
		buttonThree.setForeground(new Color(0, 0, 102));
		buttonThree.setFont(new Font("Tahoma", Font.BOLD, 18));
		buttonThree.setBackground(new Color(255, 204, 102));
		buttonThree.setBounds(152, 160, 49, 46);
		panel_1.add(buttonThree);
		
		JButton buttonFour = new JButton("4");
		buttonFour.setFocusable(false);
		buttonFour.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				if(textFieldN1.isFocusable())
				{
					textFieldN1.setText(textFieldN1.getText() + buttonFour.getText());
				}
				
			   else 
				{
					textFieldN2.setText(textFieldN2.getText() + buttonFour.getText());
				}

			}
		});
		buttonFour.setForeground(new Color(0, 0, 102));
		buttonFour.setFont(new Font("Tahoma", Font.BOLD, 18));
		buttonFour.setBackground(new Color(255, 204, 102));
		buttonFour.setBounds(54, 206, 49, 46);
		panel_1.add(buttonFour);
		
		JButton buttonFive = new JButton("5");
		buttonFive.setFocusable(false);
		buttonFive.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				if(textFieldN1.isFocusable())
				{
					textFieldN1.setText(textFieldN1.getText() + buttonFive.getText());
				}
				
			   else 
				{
					textFieldN2.setText(textFieldN2.getText() + buttonFive.getText());
				}

			}
		});
		buttonFive.setForeground(new Color(0, 0, 102));
		buttonFive.setFont(new Font("Tahoma", Font.BOLD, 18));
		buttonFive.setBackground(new Color(255, 204, 102));
		buttonFive.setBounds(103, 206, 49, 46);
		panel_1.add(buttonFive);
		
		JButton buttonSix = new JButton("6");
		buttonSix.setFocusable(false);
		buttonSix.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				if(textFieldN1.isFocusable())
				{
					textFieldN1.setText(textFieldN1.getText() + buttonSix.getText());
				}
				
			   else 
				{
					textFieldN2.setText(textFieldN2.getText() + buttonSix.getText());
				}

			}
		});
		buttonSix.setForeground(new Color(0, 0, 102));
		buttonSix.setFont(new Font("Tahoma", Font.BOLD, 18));
		buttonSix.setBackground(new Color(255, 204, 102));
		buttonSix.setBounds(152, 206, 49, 46);
		panel_1.add(buttonSix);
		
		JButton buttonSeven = new JButton("7");
		buttonSeven.setFocusable(false);
		buttonSeven.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				if(textFieldN1.isFocusable())
				{
					textFieldN1.setText(textFieldN1.getText() + buttonSeven.getText());
				}
				
			   else 
				{
					textFieldN2.setText(textFieldN2.getText() + buttonSeven.getText());
				}
				
			}
		});
		buttonSeven.setForeground(new Color(0, 0, 102));
		buttonSeven.setFont(new Font("Tahoma", Font.BOLD, 18));
		buttonSeven.setBackground(new Color(255, 204, 102));
		buttonSeven.setBounds(54, 252, 49, 46);
		panel_1.add(buttonSeven);
		
		JButton buttonEight = new JButton("8");
		buttonEight.setFocusable(false);
		buttonEight.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				if(textFieldN1.isFocusable())
				{
					textFieldN1.setText(textFieldN1.getText() + buttonEight.getText());
				}
				
			   else 
				{
					textFieldN2.setText(textFieldN2.getText() + buttonEight.getText());
				}

			}
		});
		buttonEight.setForeground(new Color(0, 0, 102));
		buttonEight.setFont(new Font("Tahoma", Font.BOLD, 18));
		buttonEight.setBackground(new Color(255, 204, 102));
		buttonEight.setBounds(103, 252, 49, 46);
		panel_1.add(buttonEight);
		
		JButton buttonNine = new JButton("9");
		buttonNine.setFocusable(false);
		buttonNine.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				if(textFieldN1.isFocusable())
				{
					textFieldN1.setText(textFieldN1.getText() + buttonNine.getText());
				}
				
			   else 
				{
					textFieldN2.setText(textFieldN2.getText() + buttonNine.getText());
				}

			}
		});
		buttonNine.setForeground(new Color(0, 0, 102));
		buttonNine.setFont(new Font("Tahoma", Font.BOLD, 18));
		buttonNine.setBackground(new Color(255, 204, 102));
		buttonNine.setBounds(152, 252, 49, 46);
		panel_1.add(buttonNine);
		
		JButton buttonZero = new JButton("0");
		buttonZero.setFocusable(false);
		buttonZero.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				if(textFieldN1.isFocusable())
				{
					textFieldN1.setText(textFieldN1.getText() + buttonZero.getText());
				}
				
			   else 
				{
					textFieldN2.setText(textFieldN2.getText() + buttonZero.getText());
				}

			}
		});
		buttonZero.setForeground(new Color(0, 0, 102));
		buttonZero.setFont(new Font("Tahoma", Font.BOLD, 18));
		buttonZero.setBackground(new Color(255, 204, 102));
		buttonZero.setBounds(54, 298, 49, 46);
		panel_1.add(buttonZero);
		
		JButton buttonPlus = new JButton("+");
		buttonPlus.setFocusable(false);
		buttonPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
			labelMiddle.setText("   +");
			}
		});
		buttonPlus.setBackground(new Color(255, 204, 102));
		buttonPlus.setForeground(new Color(0, 0, 102));
		buttonPlus.setFont(new Font("Tahoma", Font.BOLD, 18));
		buttonPlus.setBounds(211, 160, 89, 46);
		panel_1.add(buttonPlus);
		
		JButton buttonMinus = new JButton("-");
		buttonMinus.setFocusable(false);
		buttonMinus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				labelMiddle.setText("   -");


			}
		});
		buttonMinus.setForeground(new Color(0, 0, 102));
		buttonMinus.setFont(new Font("Tahoma", Font.BOLD, 18));
		buttonMinus.setBackground(new Color(255, 204, 102));
		buttonMinus.setBounds(310, 160, 89, 46);
		panel_1.add(buttonMinus);
		
		JButton buttonMult = new JButton("*");
		buttonMult.setFocusable(false);
		buttonMult.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				labelMiddle.setText("   *");
				
			}
		});
		buttonMult.setForeground(new Color(0, 0, 102));
		buttonMult.setFont(new Font("Tahoma", Font.BOLD, 18));
		buttonMult.setBackground(new Color(255, 204, 102));
		buttonMult.setBounds(211, 221, 89, 46);
		panel_1.add(buttonMult);
		
		JButton buttonSub = new JButton("/");
		buttonSub.setFocusable(false);
		buttonSub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				

				labelMiddle.setText("   /");

			}
		});
		buttonSub.setForeground(new Color(0, 0, 102));
		buttonSub.setFont(new Font("Tahoma", Font.BOLD, 18));
		buttonSub.setBackground(new Color(255, 204, 102));
		buttonSub.setBounds(310, 221, 89, 46);
		panel_1.add(buttonSub);
		
		JButton buttonEqual = new JButton("=");
		buttonEqual.setFocusable(false);
		buttonEqual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				
				/* 
				 * check if fields are empty 
				 */
				if (textFieldN1.getText().isEmpty() || textFieldN2.getText().isEmpty())
				{
					JOptionPane.showMessageDialog(null, "Please Fill Empty Spaces ");
				}
				
				
				/* 
				 * check if fields Contains characters
				 */
				else if(textFieldN1.getText().contains("a") || textFieldN1.getText().contains("b") ||
						   textFieldN1.getText().contains("c") || textFieldN1.getText().contains("d") ||
						   textFieldN1.getText().contains("e") || textFieldN1.getText().contains("f") ||
						   textFieldN1.getText().contains("g") || textFieldN1.getText().contains("h") ||
						   textFieldN1.getText().contains("i") || textFieldN1.getText().contains("j") ||
						   textFieldN1.getText().contains("k") || textFieldN1.getText().contains("l") ||
						   textFieldN1.getText().contains("m") || textFieldN1.getText().contains("n") ||
						   textFieldN1.getText().contains("o") || textFieldN1.getText().contains("p") ||
						   textFieldN1.getText().contains("q") || textFieldN1.getText().contains("r") ||
						   textFieldN1.getText().contains("s") || textFieldN1.getText().contains("t") ||
						   textFieldN1.getText().contains("u") || textFieldN1.getText().contains("v") ||
						   textFieldN1.getText().contains("w") || textFieldN1.getText().contains("x") ||
						   textFieldN1.getText().contains("y") || textFieldN1.getText().contains("z") ||
						   textFieldN1.getText().contains("A") || textFieldN1.getText().contains("B") ||
						   textFieldN1.getText().contains("C") || textFieldN1.getText().contains("D") ||
						   textFieldN1.getText().contains("E") || textFieldN1.getText().contains("F") ||
						   textFieldN1.getText().contains("G") || textFieldN1.getText().contains("H") ||
						   textFieldN1.getText().contains("I") || textFieldN1.getText().contains("J") ||
						   textFieldN1.getText().contains("K") || textFieldN1.getText().contains("L") ||
						   textFieldN1.getText().contains("M") || textFieldN1.getText().contains("N") ||
						   textFieldN1.getText().contains("O") || textFieldN1.getText().contains("P") ||
						   textFieldN1.getText().contains("Q") || textFieldN1.getText().contains("R") ||
						   textFieldN1.getText().contains("S") || textFieldN1.getText().contains("T") ||
						   textFieldN1.getText().contains("U") || textFieldN1.getText().contains("V") ||
						   textFieldN1.getText().contains("W") || textFieldN1.getText().contains("X") ||
						   textFieldN1.getText().contains("Y") || textFieldN1.getText().contains("Z") ||
						   textFieldN2.getText().contains("a") || textFieldN2.getText().contains("b") ||
						   textFieldN2.getText().contains("c") || textFieldN2.getText().contains("d") ||
						   textFieldN2.getText().contains("e") || textFieldN2.getText().contains("f") ||
						   textFieldN2.getText().contains("g") || textFieldN2.getText().contains("h") ||
						   textFieldN2.getText().contains("i") || textFieldN2.getText().contains("j") ||
						   textFieldN2.getText().contains("k") || textFieldN2.getText().contains("l") ||
						   textFieldN2.getText().contains("m") || textFieldN2.getText().contains("n") ||
						   textFieldN2.getText().contains("o") || textFieldN2.getText().contains("p") ||
						   textFieldN2.getText().contains("q") || textFieldN2.getText().contains("r") ||
						   textFieldN2.getText().contains("s") || textFieldN2.getText().contains("t") ||
						   textFieldN2.getText().contains("u") || textFieldN2.getText().contains("v") ||
						   textFieldN2.getText().contains("w") || textFieldN2.getText().contains("x") ||
						   textFieldN2.getText().contains("y") || textFieldN2.getText().contains("z") ||
						   textFieldN2.getText().contains("A") || textFieldN2.getText().contains("B") ||
						   textFieldN2.getText().contains("C") || textFieldN2.getText().contains("D") ||
						   textFieldN2.getText().contains("E") || textFieldN2.getText().contains("F") ||
						   textFieldN2.getText().contains("G") || textFieldN2.getText().contains("H") ||
						   textFieldN2.getText().contains("I") || textFieldN2.getText().contains("J") ||
						   textFieldN2.getText().contains("K") || textFieldN2.getText().contains("L") ||
						   textFieldN2.getText().contains("M") || textFieldN2.getText().contains("N") ||
						   textFieldN2.getText().contains("O") || textFieldN2.getText().contains("P") ||
						   textFieldN2.getText().contains("Q") || textFieldN2.getText().contains("R") ||
						   textFieldN2.getText().contains("S") || textFieldN2.getText().contains("T") ||
						   textFieldN2.getText().contains("U") || textFieldN2.getText().contains("V") ||
						   textFieldN2.getText().contains("W") || textFieldN2.getText().contains("X") ||
						   textFieldN2.getText().contains("Y") || textFieldN2.getText().contains("Z"))
				{
					JOptionPane.showMessageDialog(null, "Please just Enter Numbers");

				}
				
				
				/*  
				 * check if you DONT choose any calculate operation
				 */
				else if (labelMiddle.getText().isEmpty())
				{
					JOptionPane.showMessageDialog(null, "Please Set Calculate Operation ");
				}
				
				
				/* 
				 * Calculate Operations
				 */
				else {
				
					// get text from text field and change it to Double
				Double N1 = Double.parseDouble(textFieldN1.getText());
				Double N2 = Double.parseDouble(textFieldN2.getText());
					
				if(labelMiddle.getText().equals("   +"))
				{
					Double resault = N1+N2;
					String Sresault = ""+resault;
					
					textFieldResault.setText(Sresault);
					
				}
				
				else if(labelMiddle.getText().equals("   -"))
				{
					Double resault = N1-N2;
					String Sresault = ""+resault;
					
					textFieldResault.setText(Sresault);
					
				}
				
				else if(labelMiddle.getText().equals("   *"))
				{
					Double resault = N1*N2;
					String Sresault = ""+resault;
					
					textFieldResault.setText(Sresault);
					
				}
				
				else if(labelMiddle.getText().equals("   /"))
				{
					
					if (N2 == 0)
					{
						JOptionPane.showMessageDialog(null, "Seccond number should NOT be ZERO ");

					}
					
					
					else {
						
						Double resault = N1/N2;
						
						String Sresault = ""+resault;
						
						textFieldResault.setText(Sresault);
						
				
					}
					
				}
				}
				
			}
		});
		buttonEqual.setForeground(new Color(0, 0, 102));
		buttonEqual.setFont(new Font("Tahoma", Font.BOLD, 18));
		buttonEqual.setBackground(new Color(255, 204, 102));
		buttonEqual.setBounds(211, 287, 188, 46);
		panel_1.add(buttonEqual);
		
		JButton buttonClear = new JButton("C");
		buttonClear.setFocusable(false);
		buttonClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				labelMiddle.setText("");
				textFieldN1.setText("");
				textFieldN2.setText("");
				textFieldResault.setText("");
				
				textFieldN1.setBackground(new Color(204, 255, 255));
				textFieldN2.setBackground(Color.WHITE);
				
				textFieldN1.setFocusable(true);

			}
		});
		buttonClear.setForeground(new Color(0, 0, 102));
		buttonClear.setFont(new Font("Tahoma", Font.BOLD, 18));
		buttonClear.setBackground(new Color(255, 204, 102));
		buttonClear.setBounds(152, 298, 49, 46);
		panel_1.add(buttonClear);
		
		textFieldN1 = new JTextField();
		textFieldN1.setBackground(new Color(204, 255, 255));
		textFieldN1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				
				textFieldN1.setFocusable(true);
				textFieldN2.setFocusable(false);
				
				textFieldN1.setBackground(new Color(204, 255, 255));
				textFieldN2.setBackground(Color.WHITE);

			}
		});
		textFieldN1.setFont(new Font("Tahoma", Font.ITALIC, 18));
		textFieldN1.setBounds(54, 53, 122, 29);
		panel_1.add(textFieldN1);
		textFieldN1.setColumns(10);
		
		textFieldN2 = new JTextField();
		textFieldN2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				
				textFieldN1.setFocusable(false);
				textFieldN2.setFocusable(true);
				
				textFieldN2.setBackground(new Color(204, 255, 255));
				textFieldN1.setBackground(Color.WHITE);

			}
		});
		textFieldN2.setFont(new Font("Tahoma", Font.ITALIC, 18));
		textFieldN2.setColumns(10);
		textFieldN2.setBounds(277, 53, 122, 29);
		panel_1.add(textFieldN2);
		
		textFieldResault = new JTextField();
		textFieldResault.setFocusable(false);
		textFieldResault.setEditable(false);
		textFieldResault.setToolTipText("");
		textFieldResault.setFont(new Font("Tahoma", Font.ITALIC, 18));
		textFieldResault.setColumns(10);
		textFieldResault.setBounds(54, 106, 345, 29);
		panel_1.add(textFieldResault);
		
		labelMiddle = new JLabel("");
		labelMiddle.setFont(new Font("Tahoma", Font.BOLD, 19));
		labelMiddle.setForeground(new Color(255, 204, 102));
		labelMiddle.setBounds(206, 53, 46, 29);
		panel_1.add(labelMiddle);
		
		JLabel lblAllRightsReserved = new JLabel("\u00A9 AMJAD KUNNAH |2021|ALL RIGHTS RESERVED");
		lblAllRightsReserved.setFont(new Font("Tahoma", Font.ITALIC, 10));
		lblAllRightsReserved.setForeground(Color.YELLOW);
		lblAllRightsReserved.setBounds(21, 415, 231, 14);
		panel_1.add(lblAllRightsReserved);
		
		JLabel lblAboutDeveloper = new JLabel("About Developer");
		lblAboutDeveloper.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				
				Devoloper dev = new Devoloper();
				dev.setVisible(true);
				
			}
		});
		lblAboutDeveloper.setForeground(Color.YELLOW);
		lblAboutDeveloper.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblAboutDeveloper.setBounds(311, 414, 113, 14);
		panel_1.add(lblAboutDeveloper);
		
		JButton buttonZero_1 = new JButton(".");
		buttonZero_1.setFocusable(false);
		buttonZero_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				if(textFieldN1.isFocusable())
				{
					textFieldN1.setText(textFieldN1.getText() + buttonZero_1.getText());
				}
				
			   else 
				{
					textFieldN2.setText(textFieldN2.getText() + buttonZero_1.getText());
				}
			}
		});
		buttonZero_1.setForeground(new Color(0, 0, 102));
		buttonZero_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		buttonZero_1.setBackground(new Color(255, 204, 102));
		buttonZero_1.setBounds(103, 298, 49, 46);
		panel_1.add(buttonZero_1);
	}
}
