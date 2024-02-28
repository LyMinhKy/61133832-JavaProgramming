import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ManHinhTinhToan extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtB;
	private JTextField txtKQ;
	private JTextField txtA;
	
	public ManHinhTinhToan() {
		setTitle("Chuong trinh tinh toan");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 761, 405);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nhap so a");
		lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		lblNewLabel.setBounds(85, 67, 82, 28);
		contentPane.add(lblNewLabel);
		
		JLabel lblNhapSoB = new JLabel("Nhap so b");
		lblNhapSoB.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		lblNhapSoB.setBounds(85, 116, 82, 28);
		contentPane.add(lblNhapSoB);
		
		txtA = new JTextField();
		txtA.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		txtA.setBounds(193, 67, 310, 28);
		contentPane.add(txtA);
		txtA.setColumns(10);
		
		txtB = new JTextField();
		txtB.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		txtB.setColumns(10);
		txtB.setBounds(193, 117, 310, 28);
		contentPane.add(txtB);
		
		JButton btnCong = new JButton("+");
		btnCong.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Cong
				PhepCong();
			}
		});
		btnCong.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		btnCong.setBounds(116, 197, 85, 21);
		contentPane.add(btnCong);
		
		JButton btnTru = new JButton("-");
		btnTru.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Tru
				PhepTru();
			}
		});
		btnTru.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		btnTru.setBounds(221, 197, 85, 21);
		contentPane.add(btnTru);
		
		JButton btnNhan = new JButton("*");
		btnNhan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Nhan
				PhepNhan();
			}
		});
		btnNhan.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		btnNhan.setBounds(331, 197, 85, 21);
		contentPane.add(btnNhan);
		
		JButton btnChia = new JButton("/");
		btnChia.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Chia
				PhepChia();
			}
		});
		btnChia.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		btnChia.setBounds(440, 197, 85, 21);
		contentPane.add(btnChia);
		
		JLabel lblKetQua = new JLabel("Ket qua");
		lblKetQua.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		lblKetQua.setBounds(85, 278, 82, 28);
		contentPane.add(lblKetQua);
		
		txtKQ = new JTextField();
		txtKQ.setEditable(false);
		txtKQ.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		txtKQ.setColumns(10);
		txtKQ.setBounds(193, 279, 310, 28);
		contentPane.add(txtKQ);
	}
	void PhepCong() {
		//Lay du lieu
		String a = txtA.getText();
		String b = txtB.getText();
		//Chuyen du lieu
		double so_a = Double.parseDouble(a);
		double so_b = Double.parseDouble(b);
		
		double Tong = so_a+so_b;
		
		txtKQ.setText(String.valueOf(Tong));
	}
	void PhepTru() {
		//Lay du lieu
		String a = txtA.getText();
		String b = txtB.getText();
		//Chuyen du lieu
		double so_a = Double.parseDouble(a);
		double so_b = Double.parseDouble(b);
				
		double Tru = so_a-so_b;
				
		txtKQ.setText(String.valueOf(Tru));
	}
	void PhepNhan() {
		//Lay du lieu
		String a = txtA.getText();
		String b = txtB.getText();
		//Chuyen du lieu
		double so_a = Double.parseDouble(a);
		double so_b = Double.parseDouble(b);
						
		double Nhan = so_a*so_b;
						
		txtKQ.setText(String.valueOf(Nhan));
	}
	void PhepChia() {
		//Lay du lieu
		String a = txtA.getText();
		String b = txtB.getText();
		//Chuyen du lieu
		double so_a = Double.parseDouble(a);
		double so_b = Double.parseDouble(b);
								
		double Chia = so_a/so_b;
								
		txtKQ.setText(String.valueOf(Chia));
	}
}
