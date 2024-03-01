import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import java.awt.Color;

public class PushCounterUI extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	private int count = 0;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PushCounterUI frame = new PushCounterUI();
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
	public PushCounterUI() {
		setTitle("Push Counter");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		

		JLabel lblcount = new JLabel("Pushes: 0");
		lblcount.setForeground(new Color(0, 128, 64));
		lblcount.setFont(new Font("Arial", Font.PLAIN, 20));
		lblcount.setBounds(167, 153, 114, 24);
		contentPane.add(lblcount);
		
		JButton btnpush = new JButton("Push Me!");
		btnpush.setFont(new Font("Arial", Font.PLAIN, 20));
		btnpush.setBounds(148, 80, 133, 48);
		contentPane.add(btnpush);
		btnpush.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				count++;
				lblcount.setText("Pushes: " + count);
			}
		});
	}
}