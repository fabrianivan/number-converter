

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Converter {

	private JFrame frmCalculator;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JTextField input;
	private JTextField output;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Converter window = new Converter();
					window.frmCalculator.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Converter() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmCalculator = new JFrame();
		frmCalculator.setResizable(false);
		frmCalculator.getContentPane().setFont(new Font("SFNS Display", Font.PLAIN, 13));
		frmCalculator.setTitle("Converter");
		frmCalculator.setBounds(100, 100, 591, 314);
		frmCalculator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCalculator.getContentPane().setLayout(null);
		
		JLabel lblOption = new JLabel("Option");
		lblOption.setBounds(16, 27, 83, 16);
		frmCalculator.getContentPane().add(lblOption);
		
		JRadioButton rdbtnBinaryToDecimal = new JRadioButton("Binary to decimal");
		buttonGroup.add(rdbtnBinaryToDecimal);
		rdbtnBinaryToDecimal.setFont(new Font("SFNS Display", Font.PLAIN, 13));
		rdbtnBinaryToDecimal.setBounds(21, 83, 154, 23);
		frmCalculator.getContentPane().add(rdbtnBinaryToDecimal);
		
		JRadioButton rdbtnDecimalToBinary = new JRadioButton("Decimal to binary");
		buttonGroup.add(rdbtnDecimalToBinary);
		rdbtnDecimalToBinary.setFont(new Font("SFNS Display", Font.PLAIN, 13));
		rdbtnDecimalToBinary.setBounds(21, 48, 154, 23);
		frmCalculator.getContentPane().add(rdbtnDecimalToBinary);
		
		JLabel lblInput = new JLabel("Input");
		lblInput.setFont(new Font("SFNS Display", Font.PLAIN, 12));
		lblInput.setBounds(26, 131, 61, 16);
		frmCalculator.getContentPane().add(lblInput);
		
		JLabel lblOutput = new JLabel("Output");
		lblOutput.setFont(new Font("SFNS Display", Font.PLAIN, 12));
		lblOutput.setBounds(26, 171, 61, 16);
		frmCalculator.getContentPane().add(lblOutput);
		
		input = new JTextField();
		input.setFont(new Font("SFNS Display", Font.PLAIN, 13));
		input.setBounds(111, 126, 465, 26);
		frmCalculator.getContentPane().add(input);
		input.setColumns(10);
		
		output = new JTextField();
		output.setFont(new Font("SFNS Display", Font.PLAIN, 13));
		output.setBounds(111, 171, 465, 23);
		frmCalculator.getContentPane().add(output);
		output.setColumns(10);
		

		JRadioButton rdbtnDecimalToOctadecimal = new JRadioButton("Decimal to Octadecimal");
		buttonGroup.add(rdbtnDecimalToOctadecimal);
		rdbtnDecimalToOctadecimal.setFont(new Font("SFNS Display", Font.PLAIN, 13));
		rdbtnDecimalToOctadecimal.setBounds(187, 48, 208, 23);
		frmCalculator.getContentPane().add(rdbtnDecimalToOctadecimal);
		
		JRadioButton rdbtnOctadecimalToDecimal = new JRadioButton("Octadecimal to Decimal");
		buttonGroup.add(rdbtnOctadecimalToDecimal);
		rdbtnOctadecimalToDecimal.setFont(new Font("SFNS Display", Font.PLAIN, 13));
		rdbtnOctadecimalToDecimal.setBounds(187, 87, 208, 16);
		frmCalculator.getContentPane().add(rdbtnOctadecimalToDecimal);
		
		JRadioButton rdbtnDecimalToHexadecimal = new JRadioButton("Decimal to Hexadecimal");
		buttonGroup.add(rdbtnDecimalToHexadecimal);
		rdbtnDecimalToHexadecimal.setBounds(381, 48, 192, 23);
		frmCalculator.getContentPane().add(rdbtnDecimalToHexadecimal);
		
		JRadioButton rdbtnHexadecimalToDecimal = new JRadioButton("Hexadecimal to Decimal");
		buttonGroup.add(rdbtnHexadecimalToDecimal);
		rdbtnHexadecimalToDecimal.setBounds(381, 83, 192, 23);
		frmCalculator.getContentPane().add(rdbtnHexadecimalToDecimal);
		
		
		JButton btnConvert = new JButton("Convert");
		btnConvert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnConvert.setFont(new Font("SFNS Display", Font.PLAIN, 13));
		btnConvert.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				if(rdbtnDecimalToHexadecimal.isSelected()){
				int angka;
				angka = Integer.parseInt(input.getText());
				String hasil = Integer.toHexString(angka);
				output.setText(hasil);}
				
				if(rdbtnHexadecimalToDecimal.isSelected()){
				int angka;
				angka = Integer.parseInt(input.getText(),16);
				output.setText(String.valueOf(angka)); }
				
				if(rdbtnDecimalToBinary.isSelected()){
				int angka;
				angka = Integer.parseInt(input.getText());
				String hasil = Integer.toBinaryString(angka);
				output.setText(hasil);}
				
				if(rdbtnBinaryToDecimal.isSelected()){
				int angka;
				angka = Integer.parseInt(input.getText(),2);
				output.setText(String.valueOf(angka)); }
				
				if(rdbtnDecimalToOctadecimal.isSelected()){
				int angka;
				angka = Integer.parseInt(input.getText());
				String hasil = Integer.toOctalString(angka);
				output.setText(hasil);}
				if(rdbtnOctadecimalToDecimal.isSelected()){
					int angka;
					angka = Integer.parseInt(input.getText(),8);
					output.setText(String.valueOf(angka));
				}
				
			}
		});
		btnConvert.setBounds(20, 216, 117, 29);
		frmCalculator.getContentPane().add(btnConvert);
		

		JMenuBar menuBar = new JMenuBar();
		frmCalculator.setJMenuBar(menuBar);
		
		JMenu mnFile = new JMenu("File");
		menuBar.add(mnFile);
		
		JMenuItem mntmExit = new JMenuItem("Exit");
		mntmExit.addMouseListener(new MouseAdapter() {
			private ImageIcon icon;

			@Override
			public void mouseReleased(MouseEvent e) {
				icon = new ImageIcon(Converter.class.getResource("question.png"));
				String ObjButtons[] = {"Ya","Tidak"};
				int pilihan = JOptionPane.showOptionDialog(null, "Are you sure to quit program?", "Exit program", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, icon ,ObjButtons,ObjButtons[1]);
				 if(pilihan == 0){
			            System.exit(0);
			     }
			}
		});
		
		JMenuItem mntmAbout = new JMenuItem("About");
		mntmAbout.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				ImageIcon icon = new ImageIcon(Converter.class.getResource("icon.png"));
				String kata="Converter;Version 0.1;Created by;M. Ilham Akbar 535140008;Derialdi Samuel 535140010;Fabrian Ivan Prasetya 535140042";
				JOptionPane.showMessageDialog(null, kata.split(";"), "Tentang aplikasi", JOptionPane.INFORMATION_MESSAGE, icon);
			}
		});
		mnFile.add(mntmAbout);
		mnFile.add(mntmExit);
	}
}
