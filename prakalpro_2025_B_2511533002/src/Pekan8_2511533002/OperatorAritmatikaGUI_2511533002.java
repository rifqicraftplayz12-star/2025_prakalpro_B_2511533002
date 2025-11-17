package Pekan8_2511533002;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class OperatorAritmatikaGUI_2511533002 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textBil1;
	private JTextField textBil2;
	private JTextField textHasil;
	
	

	private void pesanPeringatan(String pesan) {
		JOptionPane.showMessageDialog(this,pesan,"Peringatan",JOptionPane.WARNING_MESSAGE);		
	}
	private void pesanEror(String pesan) {
		JOptionPane.showMessageDialog(this,pesan,"Kesalahan",JOptionPane.WARNING_MESSAGE);		
	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					OperatorAritmatikaGUI_2511533002 frame = new OperatorAritmatikaGUI_2511533002();
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
	public OperatorAritmatikaGUI_2511533002() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 404, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("OPERATOR ARITMATIKA");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 10));
		lblNewLabel.setBounds(131, 10, 141, 13);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Bilangan 1");
		lblNewLabel_1.setBounds(41, 57, 57, 13);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Bilangan 1");
		lblNewLabel_1_1.setBounds(41, 93, 57, 13);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Operator");
		lblNewLabel_1_2.setBounds(41, 133, 57, 13);
		contentPane.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_2_1 = new JLabel("Head");
		lblNewLabel_1_2_1.setBounds(41, 183, 57, 13);
		contentPane.add(lblNewLabel_1_2_1);
		
		textBil1 = new JTextField();
		textBil1.setHorizontalAlignment(SwingConstants.CENTER);
		textBil1.setBounds(106, 54, 57, 19);
		contentPane.add(textBil1);
		textBil1.setColumns(10);
		
		textBil2 = new JTextField();
		textBil2.setHorizontalAlignment(SwingConstants.CENTER);
		textBil2.setColumns(10);
		textBil2.setBounds(106, 90, 57, 19);
		contentPane.add(textBil2);
		
		JComboBox CbOperator = new JComboBox();
		CbOperator.setModel(new DefaultComboBoxModel(new String[] {"+", "-", "*", "/", "%"}));
		CbOperator.setBounds(106, 129, 57, 21);
		contentPane.add(CbOperator);
		
		textHasil = new JTextField();
		textHasil.setHorizontalAlignment(SwingConstants.CENTER);
		textHasil.setEditable(false);
		textHasil.setBounds(106, 180, 57, 19);
		contentPane.add(textHasil);
		textHasil.setColumns(10);
		
		JButton btnNewButton = new JButton("Proses");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int hasil=0;
				if(textBil1.getText().trim().isEmpty()) {
					pesanPeringatan("Bilangan 1 harus diisi");
				}else if(textBil2.getText().trim().isEmpty()) {
					pesanPeringatan("Bilangan 2 harus diisi");
				}else {
					try {
						int a= Integer.parseInt(textBil1.getText());
						int b= Integer.parseInt(textBil2.getText());
						int c= CbOperator.getSelectedIndex(); //Memilih Operator
						if(c==0) {
							hasil=a+b;
						}
						if(c==1) {
							hasil=a-b;
						}
						if(c==2) {
							hasil=a*b;
						}
						if(c==3) {
							hasil=a/b;
						}
						if(c==4) {
							hasil=a%b;
						}
					}catch(NumberFormatException ex) {
						pesanEror("Bilangan 1 dan Bilangan 2 harus angka");
					}
				}
				
				textHasil.setText(String.valueOf(hasil));
			}
		});
		btnNewButton.setBounds(187, 129, 85, 21);
		contentPane.add(btnNewButton);

	}
}
