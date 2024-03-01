import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;



import javax.swing.border.EtchedBorder;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JRadioButton;

public class Bai0UI extends JFrame{

	private JFrame frame;
	private JTextField txta;
	private JTextField txtb;
	private JTextField txtkq;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Bai0UI window = new Bai0UI();
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
	public Bai0UI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 600, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lbltitle = new JLabel("CỘNG TRỪ NHÂN CHIA");
		lbltitle.setForeground(new Color(0, 128, 192));
		lbltitle.setFont(new Font("Arial", Font.BOLD, 30));
		lbltitle.setBounds(112, 5, 343, 62);
		frame.getContentPane().add(lbltitle);
		
		JPanel panel = new JPanel();
		panel.setForeground(new Color(0, 0, 0));
		panel.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 0, 0), new Color(160, 160, 160)), "Ch\u1ECDn t\u00E1c v\u1EE5", TitledBorder.RIGHT, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel.setBackground(new Color(192, 192, 192));
		panel.setBounds(0, 63, 140, 240);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 0, 0), new Color(160, 160, 160)), "Nh\u1EADp 2 s\u1ED1 a v\u00E0 b:", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_1.setBounds(150, 63, 436, 240);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lbla = new JLabel("nhập a:");
		lbla.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lbla.setBounds(70, 25, 60, 25);
		panel_1.add(lbla);
		
		JLabel lblNhpB = new JLabel("nhập b:");
		lblNhpB.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNhpB.setBounds(70, 70, 60, 25);
		panel_1.add(lblNhpB);
		
		txta = new JTextField();
		txta.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txta.setBounds(126, 25, 220, 24);
		panel_1.add(txta);
		txta.setColumns(10);
		
		txtb = new JTextField();
		txtb.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtb.setColumns(10);
		txtb.setBounds(126, 70, 220, 25);
		panel_1.add(txtb);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Ch\u1ECDn ph\u00E9p to\u00E1n:", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_2.setBounds(150, 105, 165, 70);
		panel_1.add(panel_2);
		panel_2.setLayout(null);
		
		JRadioButton rdbtnCong = new JRadioButton("Cộng");
		rdbtnCong.setFont(new Font("Tahoma", Font.PLAIN, 15));
		rdbtnCong.setBounds(6, 19, 69, 21);
		panel_2.add(rdbtnCong);
		
		JRadioButton rdbtnTr = new JRadioButton("Trừ");
		rdbtnTr.setFont(new Font("Tahoma", Font.PLAIN, 15));
		rdbtnTr.setBounds(94, 19, 49, 21);
		panel_2.add(rdbtnTr);
		
		JRadioButton rdbtnNhn = new JRadioButton("Nhân");
		rdbtnNhn.setFont(new Font("Tahoma", Font.PLAIN, 15));
		rdbtnNhn.setBounds(6, 42, 69, 21);
		panel_2.add(rdbtnNhn);
		
		JRadioButton rdbtnChia = new JRadioButton("Chia");
		rdbtnChia.setFont(new Font("Tahoma", Font.PLAIN, 15));
		rdbtnChia.setBounds(94, 42, 65, 21);
		panel_2.add(rdbtnChia);
		
		JLabel lblkq = new JLabel("Kết quả:");
		lblkq.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblkq.setBounds(64, 197, 66, 24);
		panel_1.add(lblkq);
		
		txtkq = new JTextField();
		txtkq.setEnabled(false);
		txtkq.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtkq.setBounds(126, 197, 220, 24);
		panel_1.add(txtkq);
		txtkq.setColumns(10);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(255, 128, 128));
		panel_3.setBounds(0, 307, 586, 56);
		frame.getContentPane().add(panel_3);
		
		JButton btnGiai = new JButton("Giải");
		btnGiai.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnGiai.setBounds(24, 30, 85, 33);
		panel.add(btnGiai);
		btnGiai.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String sa = txta.getText();
				int a = 0, b = 0;
				try {
					a = Integer.parseInt(sa);
				} catch (Exception ex) {
					// TODO: handle exception
					JOptionPane.showMessageDialog(null, "a định dạng sai!");
					txta.selectAll();
					txta.requestFocus();
					return;
				}
				String sb = txtb.getText();
				try {
					b = Integer.parseInt(sb);
				} catch (Exception ex) {
					// TODO: handle exception
					JOptionPane.showMessageDialog(null, "b định dạng sai!");
					txta.selectAll();
					txta.requestFocus();
					return;
				}
				double kq;
				if(rdbtnCong.isSelected()) {
					kq = a + b;
				}
				else if(rdbtnTr.isSelected()) {
					kq = a - b;
				}
				else if(rdbtnNhn.isSelected()) {
					kq = a * b;
				}
				else {
					kq = a*1.0 / b*1.0;
				}
				txtkq.setText(kq + "");
			}
		});
		
		JButton btnXoa = new JButton("Xóa");
		btnXoa.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnXoa.setBounds(24, 87, 85, 33);
		panel.add(btnXoa);
		btnXoa.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				txta.setText("");
				txtb.setText("");
				txtkq.setText("");
				txta.requestFocus();
			}
		});
		
		JButton btnThoat = new JButton("Thoát");
		btnThoat.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int thoat = JOptionPane.showConfirmDialog(null, "Bạn có muốn thoát không?", "Thoát", JOptionPane.YES_NO_OPTION);
				if(thoat == JOptionPane.YES_OPTION) {
					System.exit(0);
				}
			}
		});
		btnThoat.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnThoat.setBounds(24, 145, 85, 33);
		panel.add(btnThoat);
	}
}