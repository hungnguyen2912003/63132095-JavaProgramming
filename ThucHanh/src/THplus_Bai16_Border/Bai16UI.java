package THplus_Bai16_Border;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.border.EtchedBorder;
import javax.swing.border.BevelBorder;
import javax.swing.border.TitledBorder;
import javax.swing.border.CompoundBorder;
import javax.swing.border.MatteBorder;

public class Bai16UI extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Bai16UI frame = new Bai16UI();
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
	public Bai16UI() {
		setTitle("Border Demo");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 332);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(255, 0, 0), 2));
		panel.setBounds(10, 10, 203, 49);
		contentPane.add(panel);
		
		JLabel lblNewLabel = new JLabel("Line Border");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		panel.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		panel_1.setBounds(223, 10, 203, 49);
		contentPane.add(panel_1);
		
		JLabel lblEtchedBorder = new JLabel("Etched Border");
		lblEtchedBorder.setFont(new Font("Tahoma", Font.PLAIN, 18));
		panel_1.add(lblEtchedBorder);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		panel_2.setBounds(10, 81, 203, 49);
		contentPane.add(panel_2);
		
		JLabel lblRaiseBevedBorder = new JLabel("Raise Bevel Border");
		lblRaiseBevedBorder.setFont(new Font("Tahoma", Font.PLAIN, 18));
		panel_2.add(lblRaiseBevedBorder);
		
		JPanel panel_2_1 = new JPanel();
		panel_2_1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_2_1.setBounds(223, 81, 203, 49);
		contentPane.add(panel_2_1);
		
		JLabel lblLoweredBevelBorder = new JLabel("Lowered Bevel Border");
		lblLoweredBevelBorder.setFont(new Font("Tahoma", Font.PLAIN, 18));
		panel_2_1.add(lblLoweredBevelBorder);
		
		JPanel panel_2_2 = new JPanel();
		panel_2_2.setBorder(new TitledBorder(null, "Title", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_2_2.setBounds(10, 151, 203, 49);
		contentPane.add(panel_2_2);
		
		JLabel lblTitledBorder = new JLabel("Titled Border");
		lblTitledBorder.setFont(new Font("Tahoma", Font.PLAIN, 18));
		panel_2_2.add(lblTitledBorder);
		
		JPanel panel_2_2_1 = new JPanel();
		panel_2_2_1.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Title", TitledBorder.RIGHT, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_2_2_1.setBounds(223, 151, 203, 49);
		contentPane.add(panel_2_2_1);
		
		JLabel lblTitledBorderright = new JLabel("Titled Border (right)");
		lblTitledBorderright.setFont(new Font("Tahoma", Font.PLAIN, 18));
		panel_2_2_1.add(lblTitledBorderright);
		
		JPanel panel_2_2_2 = new JPanel();
		panel_2_2_2.setBorder(new CompoundBorder(new CompoundBorder(new LineBorder(new Color(0, 0, 255), 2), null), new EtchedBorder(EtchedBorder.LOWERED, null, null)));
		panel_2_2_2.setBounds(10, 228, 203, 49);
		contentPane.add(panel_2_2_2);
		
		JLabel lblCompoundBorder = new JLabel("Compound Border");
		lblCompoundBorder.setFont(new Font("Tahoma", Font.PLAIN, 18));
		panel_2_2_2.add(lblCompoundBorder);
		
		JPanel panel_2_2_2_1 = new JPanel();
		panel_2_2_2_1.setBorder(new MatteBorder(1, 4, 1, 1, (Color) new Color(255, 0, 0)));
		panel_2_2_2_1.setBounds(223, 228, 203, 49);
		contentPane.add(panel_2_2_2_1);
		
		JLabel lblMatteBorder = new JLabel("Matte Border");
		lblMatteBorder.setFont(new Font("Tahoma", Font.PLAIN, 18));
		panel_2_2_2_1.add(lblMatteBorder);
	}
}
