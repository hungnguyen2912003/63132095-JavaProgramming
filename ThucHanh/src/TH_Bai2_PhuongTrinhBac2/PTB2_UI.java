package TH_Bai2_PhuongTrinhBac2;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.SwingConstants;
import javax.swing.border.TitledBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.border.EtchedBorder;

public class PTB2_UI {

	private JFrame frame;
	private final JPanel panel = new JPanel();
	private JTextField txta;
	private JTextField txtb;
	private JTextField txtc;
	private JTextField txtkq;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PTB2_UI window = new PTB2_UI();
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
	public PTB2_UI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 800, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		panel.setBackground(new Color(128, 255, 255));
		panel.setBounds(0, 0, 786, 56);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Giải Phương Trình Bậc 2");
		lblNewLabel.setBounds(211, 10, 361, 36);
		lblNewLabel.setEnabled(false);
		lblNewLabel.setForeground(new Color(0, 0, 0));
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 30));
		panel.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 0, 0), new Color(160, 160, 160)), "Nh\u1EADp a,b,c", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_1.setBounds(0, 66, 786, 276);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lbla = new JLabel("a:");
		lbla.setFont(new Font("Arial", Font.PLAIN, 20));
		lbla.setBounds(197, 43, 45, 13);
		panel_1.add(lbla);
		
		JLabel lblB = new JLabel("b:");
		lblB.setFont(new Font("Arial", Font.PLAIN, 20));
		lblB.setBounds(197, 90, 45, 13);
		panel_1.add(lblB);
		
		JLabel lblC = new JLabel("c:");
		lblC.setFont(new Font("Arial", Font.PLAIN, 20));
		lblC.setBounds(197, 137, 45, 13);
		panel_1.add(lblC);
		
		JLabel lblNewLabel_1 = new JLabel("Kết Quả");
		lblNewLabel_1.setFont(new Font("Arial", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(197, 178, 93, 24);
		panel_1.add(lblNewLabel_1);
		
		txta = new JTextField();
		txta.setFont(new Font("Arial", Font.PLAIN, 20));
		txta.setBounds(229, 34, 355, 30);
		panel_1.add(txta);
		txta.setColumns(10);
		
		txtb = new JTextField();
		txtb.setFont(new Font("Arial", Font.PLAIN, 20));
		txtb.setColumns(10);
		txtb.setBounds(229, 81, 355, 30);
		panel_1.add(txtb);
		
		txtc = new JTextField();
		txtc.setFont(new Font("Arial", Font.PLAIN, 20));
		txtc.setColumns(10);
		txtc.setBounds(229, 128, 355, 30);
		panel_1.add(txtc);
		
		txtkq = new JTextField();
		txtkq.setEnabled(false);
		txtkq.setFont(new Font("Arial", Font.PLAIN, 20));
		txtkq.setColumns(10);
		txtkq.setBounds(108, 212, 590, 41);
		panel_1.add(txtkq);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(0, 0, 255), new Color(160, 160, 160)), "Ch\u1ECDn thao t\u00E1c", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_2.setBounds(0, 352, 786, 111);
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		JButton btnGiai = new JButton("Giải");
		btnGiai.setFont(new Font("Arial", Font.PLAIN, 20));
		btnGiai.setBounds(187, 29, 107, 50);
		panel_2.add(btnGiai);
		btnGiai.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				XuLyPhepTinh();
			}
		});		
		JButton btnXoaTrng = new JButton("Xóa trắng");
		btnXoaTrng.setFont(new Font("Arial", Font.PLAIN, 20));
		btnXoaTrng.setBounds(321, 29, 160, 50);
		panel_2.add(btnXoaTrng);
		btnXoaTrng.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				XyLyXoa();
			}
		});
		
		JButton btnThoat = new JButton("Thoát");
		btnThoat.setFont(new Font("Arial", Font.PLAIN, 20));
		btnThoat.setBounds(511, 29, 107, 50);
		panel_2.add(btnThoat);
		btnThoat.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				XuLyThoat();
			}
		});
	}
	void XuLyPhepTinh() {
		String saString = txta.getText();
		String sbString = txtb.getText();
		String scString = txtc.getText();
		float a, b, c;
		try {
			a = Float.parseFloat(saString);
		} catch (Exception e) {
			// TODO: handle exception
			JOptionPane.showMessageDialog(null, "Lỗi a định dạng không đúng hoặc bỏ trống!");
			txta.requestFocus();
			txta.setText("");
		}
		try {
			b = Float.parseFloat(sbString);
		} catch (Exception e) {
			// TODO: handle exception
			JOptionPane.showMessageDialog(null, "Lỗi b định dạng không đúng hoặc bỏ trống!");
			txtb.requestFocus();
			txtb.setText("");
		}
		try {
			c = Float.parseFloat(scString);
		} catch (Exception e) {
			// TODO: handle exception
			JOptionPane.showMessageDialog(null, "Lỗi c định dạng không đúng hoặc bỏ trống!");
			txtc.requestFocus();
			txtc.setText("");
		}
		a = Float.parseFloat(saString);
		b = Float.parseFloat(sbString);
		c = Float.parseFloat(scString);
		float delta = b*b - 4 * a * c;
		if(delta < 0) {
			txtkq.setText("Phương trình vô nghiệm");
		}
		else if(delta == 0) {
			float x = -b / (2 * a);
			txtkq.setText("Phương trình có nghiệm kép = " + x);
		}
		else {
			if(a == 0) {
				if(b == 0) {
					if(c == 0) {
						txtkq.setText("Phương trình vô số nghiệm");
					}
					else {
						txtkq.setText("Phương trình vô nghiệm");
					}
				}
				else {
					txtkq.setText("Phương trình có nghiệm: x = " + (-c/b));
				}
			}
			else {
				float x1 = (float) ((-b + Math.sqrt(delta)) / (2*a));
				float x2 = (float) ((-b - Math.sqrt(delta)) / (2*a));
				txtkq.setText("Phương trình có 2 nghiệm phân biệt: x1 = " + x1 + " và x2 = " + x2);
			}

		}
	}
	
	void XyLyXoa() {
		txta.setText("");
		txtb.setText("");
		txtc.setText("");
		txtkq.setText("");
	}
	
	void XuLyThoat() {
		int thoat = JOptionPane.showConfirmDialog(null, "Bạn có chắc chắn thoát chương trình", "Thông báo", JOptionPane.YES_NO_OPTION);
		if(thoat == JOptionPane.YES_OPTION) {
			System.exit(0);
		}
	}
}
