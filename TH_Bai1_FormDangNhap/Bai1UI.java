import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.security.PublicKey;

import javax.swing.JTextField;
import javax.swing.JButton;

public class Bai1UI extends JFrame {

	private JFrame frmQunLBn;
	private JTextField txtTenDangNhap;
	private JTextField txtMatKhau;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Bai1UI window = new Bai1UI();
					window.frmQunLBn.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Bai1UI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmQunLBn = new JFrame();
		frmQunLBn.getContentPane().setBackground(new Color(0, 128, 255));
		frmQunLBn.getContentPane().setLayout(null);
		
		JLabel lblTenDangNhap = new JLabel("Tên đăng nhập");
		lblTenDangNhap.setForeground(new Color(255, 255, 255));
		lblTenDangNhap.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		lblTenDangNhap.setBounds(84, 54, 111, 35);
		frmQunLBn.getContentPane().add(lblTenDangNhap);
		
		txtTenDangNhap = new JTextField();
		txtTenDangNhap.setFont(new Font("Tahoma", Font.PLAIN, 18));
		txtTenDangNhap.setBounds(205, 54, 236, 32);
		frmQunLBn.getContentPane().add(txtTenDangNhap);
		txtTenDangNhap.setColumns(10);
		
		JLabel lblMtKhu = new JLabel("Mật khẩu");
		lblMtKhu.setForeground(Color.WHITE);
		lblMtKhu.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		lblMtKhu.setBounds(84, 111, 111, 35);
		frmQunLBn.getContentPane().add(lblMtKhu);
		
		txtMatKhau = new JTextField();
		txtMatKhau.setFont(new Font("Tahoma", Font.PLAIN, 18));
		txtMatKhau.setColumns(10);
		txtMatKhau.setBounds(205, 111, 236, 32);
		frmQunLBn.getContentPane().add(txtMatKhau);
		
		JButton btnNewButton = new JButton("ĐĂNG NHẬP");
		btnNewButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				//Xử lý đăng nhập ở đây
				XuLyDangNhap();
			}
		});
		btnNewButton.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		btnNewButton.setBounds(185, 180, 195, 48);
		frmQunLBn.getContentPane().add(btnNewButton);
		frmQunLBn.setTitle("Quản lý bán hàng");
		frmQunLBn.setBounds(100, 100, 600, 300);
		frmQunLBn.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	void XuLyDangNhap() {
		String ten = txtTenDangNhap.getText().toString();
		String mk = txtMatKhau.getText().toString();   
		//Xử lý
		if(ten.equals("63CNTT") && mk.equals("123")) {
			//Hiện form chính
			frmQunLBn.setVisible(false);
			ManHinhChinh mainscreen = new ManHinhChinh();
			mainscreen.setVisible(true);
		}
		else {
			//báo lỗi
			JOptionPane.showMessageDialog(null, "Đăng nhập thất bại. Vui lòng nhập lại", "Thông báo lỗi", JOptionPane.ERROR_MESSAGE);
			txtTenDangNhap.setText("");
			txtMatKhau.setText("");
		}
	}
}
