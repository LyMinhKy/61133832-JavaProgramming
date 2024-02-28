import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Login extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtDangNhap;
	private JTextField txtMatKhau;

	public Login() {
		setTitle("ĐĂNG NHẬP");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Tên đăng nhập");
		lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		lblNewLabel.setBounds(32, 38, 101, 31);
		contentPane.add(lblNewLabel);
		
		JLabel lblMtKhu = new JLabel("Mật khẩu");
		lblMtKhu.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		lblMtKhu.setBounds(32, 84, 101, 31);
		contentPane.add(lblMtKhu);
		
		txtDangNhap = new JTextField();
		txtDangNhap.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		txtDangNhap.setBounds(173, 46, 174, 23);
		contentPane.add(txtDangNhap);
		txtDangNhap.setColumns(10);
		
		txtMatKhau = new JTextField();
		txtMatKhau.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		txtMatKhau.setColumns(10);
		txtMatKhau.setBounds(173, 88, 174, 27);
		contentPane.add(txtMatKhau);
		
		JButton btnDangNhap = new JButton("ĐĂNG NHẬP");
		btnDangNhap.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				XuLyDangNhap();
			}
		});
		btnDangNhap.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		btnDangNhap.setBounds(127, 159, 142, 31);
		contentPane.add(btnDangNhap);
	}
	void XuLyDangNhap() {
		String Ten = txtDangNhap.getText();
		String MK = txtMatKhau.getText();
		
		if(Ten.equals("63CNTT") && MK.equals("123")) {
			//Hiện trang chủ
			HomeMain homemain = new HomeMain();
			homemain.setVisible(true);
			//Ẩn form đăng nhập
			this.setVisible(false);
		}else {//Thông báo lỗi
			//Xóa dữ liệu nhập
			txtDangNhap.setText("");
			txtMatKhau.setText("");
			//Thông báo
			JOptionPane hopthoai = new JOptionPane();
			hopthoai.showMessageDialog(this, "Đăng nhập thất bại");
		}
	}
}
