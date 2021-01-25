import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JFormattedTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.UIDefaults;
import javax.swing.UIManager;
import javax.swing.JButton;
import java.awt.Color;

public class pal extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		Font defaultfont = new Font ("Arial", Font.PLAIN, 30);
	       UIDefaults defaults = UIManager.getLookAndFeelDefaults();
	       defaults.put("Button.font", defaultfont);
	       defaults.put("FormattedTextField.font", defaultfont);
	       
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					pal frame = new pal();
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
	public pal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1000, 450);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JFormattedTextField formattedTextField_1_6 = new JFormattedTextField();
		
		JFormattedTextField formattedTextField_1_9 = new JFormattedTextField();
		
		JFormattedTextField formattedTextField_1_10 = new JFormattedTextField();
		
		JFormattedTextField formattedTextField_1_11 = new JFormattedTextField();
		
		JFormattedTextField formattedTextField_1_12 = new JFormattedTextField();
		
		JFormattedTextField formattedTextField_1_11_6 = new JFormattedTextField();
		
		JFormattedTextField formattedTextField_1_10_6 = new JFormattedTextField();
		
		JFormattedTextField formattedTextField_1_9_6 = new JFormattedTextField();
		
		JFormattedTextField formattedTextField_1_6_6 = new JFormattedTextField();
		
		JFormattedTextField formattedTextField_1_12_6 = new JFormattedTextField();
		
		JFormattedTextField formattedTextField_1_12_6_1 = new JFormattedTextField();
		
		JFormattedTextField formattedTextField_1_11_1 = new JFormattedTextField();
		
		JFormattedTextField formattedTextField_1_10_1 = new JFormattedTextField();
		
		JFormattedTextField formattedTextField_1_9_1 = new JFormattedTextField();
		
		JFormattedTextField formattedTextField_1_6_1 = new JFormattedTextField();
		
		JFormattedTextField formattedTextField_1_12_1 = new JFormattedTextField();
		
		JFormattedTextField formattedTextField_1_11_6_1 = new JFormattedTextField();
		
		JFormattedTextField formattedTextField_1_10_6_1 = new JFormattedTextField();
		
		JFormattedTextField formattedTextField_1_9_6_1 = new JFormattedTextField();
		
		JFormattedTextField formattedTextField_1_6_6_1 = new JFormattedTextField();
		
		JFormattedTextField formattedTextField_1_12_6_2 = new JFormattedTextField();
		
		JFormattedTextField formattedTextField_1_12_6_1_1 = new JFormattedTextField();
		
		JFormattedTextField formattedTextField_1_11_2 = new JFormattedTextField();
		
		JFormattedTextField formattedTextField_1_10_2 = new JFormattedTextField();
		
		JFormattedTextField formattedTextField_1_9_2 = new JFormattedTextField();
		
		JFormattedTextField formattedTextField_1_6_2 = new JFormattedTextField();
		
		JFormattedTextField formattedTextField_1_12_2 = new JFormattedTextField();
		
		JFormattedTextField formattedTextField_1_11_6_2 = new JFormattedTextField();
		
		JFormattedTextField formattedTextField_1_10_6_2 = new JFormattedTextField();
		
		JFormattedTextField formattedTextField_1_9_6_2 = new JFormattedTextField();
		
		JFormattedTextField formattedTextField_1_6_6_2 = new JFormattedTextField();
		
		JFormattedTextField formattedTextField_1_12_6_3 = new JFormattedTextField();
		
		JFormattedTextField formattedTextField_1_12_6_1_2 = new JFormattedTextField();
		
		JFormattedTextField formattedTextField_1_11_3 = new JFormattedTextField();
		
		JFormattedTextField formattedTextField_1_10_3 = new JFormattedTextField();
		
		JFormattedTextField formattedTextField_1_9_3 = new JFormattedTextField();
		
		JFormattedTextField formattedTextField_1_6_3 = new JFormattedTextField();
		
		JFormattedTextField formattedTextField_1_12_3 = new JFormattedTextField();
		
		JFormattedTextField formattedTextField_1_11_6_3 = new JFormattedTextField();
		
		JFormattedTextField formattedTextField_1_10_6_3 = new JFormattedTextField();
		
		JFormattedTextField formattedTextField_1_9_6_3 = new JFormattedTextField();
		
		JFormattedTextField formattedTextField_1_6_6_3 = new JFormattedTextField();
		
		JFormattedTextField formattedTextField_1_12_6_4 = new JFormattedTextField();
		
		JFormattedTextField formattedTextField_1_12_6_1_3 = new JFormattedTextField();
		
		JFormattedTextField formattedTextField_1_11_4 = new JFormattedTextField();
		
		JFormattedTextField formattedTextField_1_10_4 = new JFormattedTextField();
		
		JFormattedTextField formattedTextField_1_9_4 = new JFormattedTextField();
		
		JFormattedTextField formattedTextField_1_6_4 = new JFormattedTextField();
		
		JFormattedTextField formattedTextField_1_12_4 = new JFormattedTextField();
		
		JFormattedTextField formattedTextField_1_11_6_4 = new JFormattedTextField();
		
		JFormattedTextField formattedTextField_1_10_6_4 = new JFormattedTextField();
		
		JFormattedTextField formattedTextField_1_9_6_4 = new JFormattedTextField();
		
		JFormattedTextField formattedTextField_1_6_6_4 = new JFormattedTextField();
		
		JFormattedTextField formattedTextField_1_12_6_5 = new JFormattedTextField();
		
		JFormattedTextField formattedTextField_1_12_6_1_4 = new JFormattedTextField();
		
		JFormattedTextField formattedTextField_1_11_5 = new JFormattedTextField();
		
		JFormattedTextField formattedTextField_1_10_5 = new JFormattedTextField();
		
		JFormattedTextField formattedTextField_1_9_5 = new JFormattedTextField();
		
		JFormattedTextField formattedTextField_1_6_5 = new JFormattedTextField();
		
		JFormattedTextField formattedTextField_1_12_5 = new JFormattedTextField();
		
		JFormattedTextField formattedTextField_1_11_6_5 = new JFormattedTextField();
		
		JFormattedTextField formattedTextField_1_10_6_5 = new JFormattedTextField();
		
		JFormattedTextField formattedTextField_1_9_6_5 = new JFormattedTextField();
		
		JFormattedTextField formattedTextField_1_6_6_5 = new JFormattedTextField();
		
		JFormattedTextField formattedTextField_1_12_6_6 = new JFormattedTextField();
		
		JFormattedTextField formattedTextField_1_12_6_1_5 = new JFormattedTextField();
		
		JFormattedTextField formattedTextField_1_11_5_1 = new JFormattedTextField();
		
		JFormattedTextField formattedTextField_1_11_4_1 = new JFormattedTextField();
		
		JFormattedTextField formattedTextField_1_10_4_1 = new JFormattedTextField();
		
		JFormattedTextField formattedTextField_1_9_4_1 = new JFormattedTextField();
		
		JFormattedTextField formattedTextField_1_6_4_1 = new JFormattedTextField();
		
		JFormattedTextField formattedTextField_1_12_4_1 = new JFormattedTextField();
		
		JFormattedTextField formattedTextField_1_11_6_4_1 = new JFormattedTextField();
		
		JFormattedTextField formattedTextField_1_10_6_4_1 = new JFormattedTextField();
		
		JFormattedTextField formattedTextField_1_9_6_4_1 = new JFormattedTextField();
		
		JFormattedTextField formattedTextField_1_6_6_4_1 = new JFormattedTextField();
		
		JFormattedTextField formattedTextField_1_12_6_5_1 = new JFormattedTextField();
		
		JFormattedTextField formattedTextField_1_12_6_1_4_1 = new JFormattedTextField();
		
		JFormattedTextField formattedTextField_1_12_6_1_5_1 = new JFormattedTextField();
		
		JFormattedTextField formattedTextField_1_12_6_6_1 = new JFormattedTextField();
		
		JFormattedTextField formattedTextField_1_6_6_5_1 = new JFormattedTextField();
		
		JFormattedTextField formattedTextField_1_10_6_5_1 = new JFormattedTextField();
		
		JFormattedTextField formattedTextField_1_9_6_5_1 = new JFormattedTextField();
		
		JFormattedTextField formattedTextField_1_11_6_5_1 = new JFormattedTextField();
		
		JFormattedTextField formattedTextField_1_12_5_1 = new JFormattedTextField();
		
		JFormattedTextField formattedTextField_1_6_5_1 = new JFormattedTextField();
		
		JFormattedTextField formattedTextField_1_9_5_1 = new JFormattedTextField();
		
		JFormattedTextField formattedTextField_1_10_5_1 = new JFormattedTextField();
		
		JFormattedTextField formattedTextField_1_11_5_2 = new JFormattedTextField();
		
		JFormattedTextField formattedTextField_1_11_4_2 = new JFormattedTextField();
		
		JFormattedTextField formattedTextField_1_10_4_2 = new JFormattedTextField();
		
		JFormattedTextField formattedTextField_1_9_4_2 = new JFormattedTextField();
		
		JFormattedTextField formattedTextField_1_6_4_2 = new JFormattedTextField();
		
		JFormattedTextField formattedTextField_1_12_4_2 = new JFormattedTextField();
		
		JFormattedTextField formattedTextField_1_11_6_4_2 = new JFormattedTextField();
		
		JFormattedTextField formattedTextField_1_10_6_4_2 = new JFormattedTextField();
		
		JFormattedTextField formattedTextField_1_9_6_4_2 = new JFormattedTextField();
		
		JFormattedTextField formattedTextField_1_6_6_4_2 = new JFormattedTextField();
		
		JFormattedTextField formattedTextField_1_12_6_5_2 = new JFormattedTextField();
		
		JFormattedTextField formattedTextField_1_12_6_1_4_2 = new JFormattedTextField();
		
		JFormattedTextField formattedTextField_1_12_6_1_5_2 = new JFormattedTextField();
		
		JFormattedTextField formattedTextField_1_12_6_6_2 = new JFormattedTextField();
		
		JFormattedTextField formattedTextField_1_6_6_5_2 = new JFormattedTextField();
		
		JFormattedTextField formattedTextField_1_10_6_5_2 = new JFormattedTextField();
		
		JFormattedTextField formattedTextField_1_9_6_5_2 = new JFormattedTextField();
		
		JFormattedTextField formattedTextField_1_11_6_5_2 = new JFormattedTextField();
		
		JFormattedTextField formattedTextField_1_12_5_2 = new JFormattedTextField();
		
		JFormattedTextField formattedTextField_1_6_5_2 = new JFormattedTextField();
		
		JFormattedTextField formattedTextField_1_9_5_2 = new JFormattedTextField();
		
		JFormattedTextField formattedTextField_1_10_5_2 = new JFormattedTextField();
		
		JFormattedTextField formattedTextField_1_11_5_3 = new JFormattedTextField();
		
		JFormattedTextField formattedTextField_1_11_5_4 = new JFormattedTextField();
		
		JFormattedTextField formattedTextField_1_11_5_5 = new JFormattedTextField();
		
		JFormattedTextField formattedTextField_1_11_5_6 = new JFormattedTextField();
		
		JFormattedTextField formattedTextField_1_11_5_7 = new JFormattedTextField();
		
		JFormattedTextField formattedTextField_1_11_5_8 = new JFormattedTextField();
		
		JFormattedTextField formattedTextField_1_11_5_9 = new JFormattedTextField();
		
		JFormattedTextField formattedTextField_1_11_5_10 = new JFormattedTextField();
		
		JFormattedTextField formattedTextField_1_11_5_11 = new JFormattedTextField();
		
		JFormattedTextField formattedTextField_1_11_5_12 = new JFormattedTextField();
		
		JFormattedTextField formattedTextField_1_11_5_13 = new JFormattedTextField();
		
		JFormattedTextField formattedTextField_1_11_5_3_1 = new JFormattedTextField();
		
		JFormattedTextField formattedTextField_1_11_5_4_1 = new JFormattedTextField();
		
		JFormattedTextField formattedTextField_1_11_5_5_1 = new JFormattedTextField();
		
		JFormattedTextField formattedTextField_1_11_5_6_1 = new JFormattedTextField();
		
		JFormattedTextField formattedTextField_1_11_5_7_1 = new JFormattedTextField();
		
		JFormattedTextField formattedTextField_1_11_5_3_2 = new JFormattedTextField();
		
		JFormattedTextField formattedTextField_1_11_5_4_2 = new JFormattedTextField();
		
		JFormattedTextField formattedTextField_1_11_5_3_3 = new JFormattedTextField();
		
		JFormattedTextField formattedTextField_1_11_5_3_4 = new JFormattedTextField();
		
		JFormattedTextField formattedTextField_1_11_5_3_5 = new JFormattedTextField();
		
		JFormattedTextField formattedTextField_1_11_5_3_6 = new JFormattedTextField();
		
		JFormattedTextField formattedTextField_1_11_5_3_7 = new JFormattedTextField();
		
		JFormattedTextField formattedTextField_1_11_5_3_8 = new JFormattedTextField();
		
		JFormattedTextField formattedTextField_1_11_5_3_9 = new JFormattedTextField();
		
		JFormattedTextField formattedTextField_1_11_5_3_10 = new JFormattedTextField();
		
		JFormattedTextField formattedTextField_1_11_5_3_11 = new JFormattedTextField();
		
		JFormattedTextField formattedTextField_1_11_5_3_12 = new JFormattedTextField();
		
		JFormattedTextField formattedTextField_1_11_5_3_13 = new JFormattedTextField();
		
		JFormattedTextField formattedTextField_1_11_5_3_14 = new JFormattedTextField();
		
		JFormattedTextField formattedTextField_1_11_5_3_15 = new JFormattedTextField();
		
		JFormattedTextField frmtdtxtfldXx = new JFormattedTextField();
		frmtdtxtfldXx.setForeground(Color.WHITE);
		
		JFormattedTextField formattedTextField_1_11_5_3_17 = new JFormattedTextField();
		
		JFormattedTextField formattedTextField_1_11_5_3_18 = new JFormattedTextField();
		
		JFormattedTextField formattedTextField_1_11_5_3_19 = new JFormattedTextField();
		
		JFormattedTextField formattedTextField_1_11_5_3_20 = new JFormattedTextField();
		
		JFormattedTextField formattedTextField_1_11_5_3_21 = new JFormattedTextField();
		
		JFormattedTextField formattedTextField_1_11_5_3_22 = new JFormattedTextField();
		
		JFormattedTextField formattedTextField_1_11_5_3_23 = new JFormattedTextField();
		
		JFormattedTextField formattedTextField_1_11_5_3_24 = new JFormattedTextField();
		
		JFormattedTextField formattedTextField_1_11_5_3_25 = new JFormattedTextField();
		formattedTextField_1_11_5_3_25.setBackground(Color.BLACK);
		
		JFormattedTextField formattedTextField_1_11_5_3_26 = new JFormattedTextField();
		
		JFormattedTextField formattedTextField_1_11_5_3_27 = new JFormattedTextField();
		
		JFormattedTextField formattedTextField_1_11_5_3_28 = new JFormattedTextField();
		
		JFormattedTextField formattedTextField_1_11_5_3_29 = new JFormattedTextField();
		
		JFormattedTextField formattedTextField_1_11_5_3_30 = new JFormattedTextField();
		
		JFormattedTextField formattedTextField_1_11_5_3_31 = new JFormattedTextField();
		
		JFormattedTextField formattedTextField_1_11_5_3_32 = new JFormattedTextField();
		
		JFormattedTextField formattedTextField_1_11_5_3_33 = new JFormattedTextField();
		
		JFormattedTextField formattedTextField_1_11_5_3_34 = new JFormattedTextField();
		
		JFormattedTextField formattedTextField_1_11_5_3_35 = new JFormattedTextField();
		JButton btnNewButton = new JButton("New button");
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(btnNewButton)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(formattedTextField_1_11_5_3_2, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
							.addGap(6)
							.addComponent(formattedTextField_1_11_5_4_2, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(formattedTextField_1_11_5_3_1, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
							.addGap(6)
							.addComponent(formattedTextField_1_11_5_4_1, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
							.addGap(6)
							.addComponent(formattedTextField_1_11_5_5_1, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
							.addGap(6)
							.addComponent(formattedTextField_1_11_5_6_1, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
							.addGap(6)
							.addComponent(formattedTextField_1_11_5_7_1, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(formattedTextField_1_11_5_3, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(formattedTextField_1_11_5_4, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(formattedTextField_1_11_5_5, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(formattedTextField_1_11_5_6, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(formattedTextField_1_11_5_7, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(formattedTextField_1_11_5_8, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(formattedTextField_1_11_5_9, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(formattedTextField_1_11_5_10, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(formattedTextField_1_11_5_11, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(formattedTextField_1_11_5_12, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(formattedTextField_1_11_5_13, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(formattedTextField_1_11_4_2, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
							.addGap(6)
							.addComponent(formattedTextField_1_10_4_2, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
							.addGap(6)
							.addComponent(formattedTextField_1_9_4_2, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
							.addGap(6)
							.addComponent(formattedTextField_1_6_4_2, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
							.addGap(6)
							.addComponent(formattedTextField_1_12_4_2, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
							.addGap(6)
							.addComponent(formattedTextField_1_11_6_4_2, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
							.addGap(6)
							.addComponent(formattedTextField_1_10_6_4_2, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
							.addGap(6)
							.addComponent(formattedTextField_1_9_6_4_2, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
							.addGap(6)
							.addComponent(formattedTextField_1_6_6_4_2, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
							.addGap(6)
							.addComponent(formattedTextField_1_12_6_5_2, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
							.addGap(6)
							.addComponent(formattedTextField_1_12_6_1_4_2, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(formattedTextField_1_11_5_2, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
							.addGap(6)
							.addComponent(formattedTextField_1_10_5_2, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
							.addGap(6)
							.addComponent(formattedTextField_1_9_5_2, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
							.addGap(6)
							.addComponent(formattedTextField_1_6_5_2, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
							.addGap(6)
							.addComponent(formattedTextField_1_12_5_2, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
							.addGap(6)
							.addComponent(formattedTextField_1_11_6_5_2, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
							.addGap(6)
							.addComponent(formattedTextField_1_10_6_5_2, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
							.addGap(6)
							.addComponent(formattedTextField_1_9_6_5_2, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
							.addGap(6)
							.addComponent(formattedTextField_1_6_6_5_2, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
							.addGap(6)
							.addComponent(formattedTextField_1_12_6_6_2, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
							.addGap(6)
							.addComponent(formattedTextField_1_12_6_1_5_2, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(formattedTextField_1_11_4_1, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
							.addGap(6)
							.addComponent(formattedTextField_1_10_4_1, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
							.addGap(6)
							.addComponent(formattedTextField_1_9_4_1, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
							.addGap(6)
							.addComponent(formattedTextField_1_6_4_1, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
							.addGap(6)
							.addComponent(formattedTextField_1_12_4_1, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
							.addGap(6)
							.addComponent(formattedTextField_1_11_6_4_1, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
							.addGap(6)
							.addComponent(formattedTextField_1_10_6_4_1, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
							.addGap(6)
							.addComponent(formattedTextField_1_9_6_4_1, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
							.addGap(6)
							.addComponent(formattedTextField_1_6_6_4_1, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
							.addGap(6)
							.addComponent(formattedTextField_1_12_6_5_1, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
							.addGap(6)
							.addComponent(formattedTextField_1_12_6_1_4_1, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(formattedTextField_1_11_5_1, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
							.addGap(6)
							.addComponent(formattedTextField_1_10_5_1, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
							.addGap(6)
							.addComponent(formattedTextField_1_9_5_1, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
							.addGap(6)
							.addComponent(formattedTextField_1_6_5_1, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
							.addGap(6)
							.addComponent(formattedTextField_1_12_5_1, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
							.addGap(6)
							.addComponent(formattedTextField_1_11_6_5_1, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
							.addGap(6)
							.addComponent(formattedTextField_1_10_6_5_1, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
							.addGap(6)
							.addComponent(formattedTextField_1_9_6_5_1, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
							.addGap(6)
							.addComponent(formattedTextField_1_6_6_5_1, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
							.addGap(6)
							.addComponent(formattedTextField_1_12_6_6_1, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
							.addGap(6)
							.addComponent(formattedTextField_1_12_6_1_5_1, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(formattedTextField_1_11_5, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
							.addGap(6)
							.addComponent(formattedTextField_1_10_5, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
							.addGap(6)
							.addComponent(formattedTextField_1_9_5, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
							.addGap(6)
							.addComponent(formattedTextField_1_6_5, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
							.addGap(6)
							.addComponent(formattedTextField_1_12_5, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
							.addGap(6)
							.addComponent(formattedTextField_1_11_6_5, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
							.addGap(6)
							.addComponent(formattedTextField_1_10_6_5, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
							.addGap(6)
							.addComponent(formattedTextField_1_9_6_5, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
							.addGap(6)
							.addComponent(formattedTextField_1_6_6_5, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
							.addGap(6)
							.addComponent(formattedTextField_1_12_6_6, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
							.addGap(6)
							.addComponent(formattedTextField_1_12_6_1_5, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(formattedTextField_1_11_4, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
							.addGap(6)
							.addComponent(formattedTextField_1_10_4, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
							.addGap(6)
							.addComponent(formattedTextField_1_9_4, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
							.addGap(6)
							.addComponent(formattedTextField_1_6_4, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
							.addGap(6)
							.addComponent(formattedTextField_1_12_4, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
							.addGap(6)
							.addComponent(formattedTextField_1_11_6_4, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
							.addGap(6)
							.addComponent(formattedTextField_1_10_6_4, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
							.addGap(6)
							.addComponent(formattedTextField_1_9_6_4, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
							.addGap(6)
							.addComponent(formattedTextField_1_6_6_4, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
							.addGap(6)
							.addComponent(formattedTextField_1_12_6_5, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
							.addGap(6)
							.addComponent(formattedTextField_1_12_6_1_4, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(formattedTextField_1_11_3, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
									.addGap(6)
									.addComponent(formattedTextField_1_10_3, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
									.addGap(6)
									.addComponent(formattedTextField_1_9_3, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
									.addGap(6)
									.addComponent(formattedTextField_1_6_3, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
									.addGap(6)
									.addComponent(formattedTextField_1_12_3, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
									.addGap(6)
									.addComponent(formattedTextField_1_11_6_3, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
									.addGap(6)
									.addComponent(formattedTextField_1_10_6_3, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
									.addGap(6)
									.addComponent(formattedTextField_1_9_6_3, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
									.addGap(6)
									.addComponent(formattedTextField_1_6_6_3, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
									.addGap(6)
									.addComponent(formattedTextField_1_12_6_4, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
									.addGap(26))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
											.addComponent(formattedTextField_1_11_2, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
											.addGap(6))
										.addComponent(formattedTextField_1_11_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addComponent(formattedTextField_1_11, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
									.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addGroup(gl_contentPane.createSequentialGroup()
											.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
												.addGroup(gl_contentPane.createSequentialGroup()
													.addGap(6)
													.addComponent(formattedTextField_1_10_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
													.addGap(63))
												.addGroup(gl_contentPane.createSequentialGroup()
													.addComponent(formattedTextField_1_10, GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
													.addPreferredGap(ComponentPlacement.RELATED)))
											.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING, false)
												.addGroup(gl_contentPane.createSequentialGroup()
													.addComponent(formattedTextField_1_9)
													.addPreferredGap(ComponentPlacement.RELATED)
													.addComponent(formattedTextField_1_6, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
													.addPreferredGap(ComponentPlacement.RELATED)
													.addComponent(formattedTextField_1_12, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
													.addPreferredGap(ComponentPlacement.RELATED)
													.addComponent(formattedTextField_1_11_6, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
													.addGap(6)
													.addComponent(formattedTextField_1_10_6, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
													.addGap(6)
													.addComponent(formattedTextField_1_9_6, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
													.addGap(69)
													.addComponent(formattedTextField_1_6_6, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
													.addPreferredGap(ComponentPlacement.RELATED)
													.addComponent(formattedTextField_1_12_6, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
													.addGap(6))
												.addGroup(gl_contentPane.createSequentialGroup()
													.addComponent(formattedTextField_1_9_1, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
													.addGap(6)
													.addComponent(formattedTextField_1_6_1, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
													.addGap(6)
													.addComponent(formattedTextField_1_12_1, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
													.addGap(6)
													.addComponent(formattedTextField_1_11_6_1, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
													.addGap(6)
													.addComponent(formattedTextField_1_10_6_1, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
													.addGap(6)
													.addComponent(formattedTextField_1_9_6_1, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
													.addGap(6)
													.addComponent(formattedTextField_1_6_6_1, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
													.addGap(6)
													.addComponent(formattedTextField_1_12_6_2, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
													.addGap(26))))
										.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
											.addComponent(formattedTextField_1_10_2, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
											.addGap(6)
											.addComponent(formattedTextField_1_9_2, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
											.addGap(6)
											.addComponent(formattedTextField_1_6_2, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
											.addGap(6)
											.addComponent(formattedTextField_1_12_2, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
											.addGap(6)
											.addComponent(formattedTextField_1_11_6_2, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
											.addGap(6)
											.addComponent(formattedTextField_1_10_6_2, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
											.addGap(6)
											.addComponent(formattedTextField_1_9_6_2, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
											.addGap(6)
											.addComponent(formattedTextField_1_6_6_2, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
											.addGap(6)
											.addComponent(formattedTextField_1_12_6_3, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
											.addGap(26)))))
							.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING, false)
								.addComponent(formattedTextField_1_12_6_1_3, Alignment.LEADING)
								.addComponent(formattedTextField_1_12_6_1_2, Alignment.LEADING)
								.addComponent(formattedTextField_1_12_6_1_1, Alignment.LEADING)
								.addComponent(formattedTextField_1_12_6_1, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(formattedTextField_1_11_5_3_14, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(frmtdtxtfldXx, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(formattedTextField_1_11_5_3_17, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(formattedTextField_1_11_5_3_18, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(formattedTextField_1_11_5_3_19, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(formattedTextField_1_11_5_3_20, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(formattedTextField_1_11_5_3_21, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(formattedTextField_1_11_5_3_22, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(formattedTextField_1_11_5_3_23, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(formattedTextField_1_11_5_3_24, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(formattedTextField_1_11_5_3_25, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(formattedTextField_1_11_5_3_3, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(formattedTextField_1_11_5_3_4, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(formattedTextField_1_11_5_3_5, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(formattedTextField_1_11_5_3_6, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(formattedTextField_1_11_5_3_7, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(formattedTextField_1_11_5_3_8, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(formattedTextField_1_11_5_3_9, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(formattedTextField_1_11_5_3_10, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(formattedTextField_1_11_5_3_11, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(formattedTextField_1_11_5_3_12, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(formattedTextField_1_11_5_3_13, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(formattedTextField_1_11_5_3_15, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(formattedTextField_1_11_5_3_26, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(formattedTextField_1_11_5_3_27, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(formattedTextField_1_11_5_3_28, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(formattedTextField_1_11_5_3_29, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(formattedTextField_1_11_5_3_30, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(formattedTextField_1_11_5_3_31, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(formattedTextField_1_11_5_3_32, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(formattedTextField_1_11_5_3_33, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(formattedTextField_1_11_5_3_34, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(formattedTextField_1_11_5_3_35, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)))
					.addGap(361))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(65)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
							.addComponent(formattedTextField_1_6, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
							.addComponent(formattedTextField_1_11, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
							.addComponent(formattedTextField_1_12, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
							.addComponent(formattedTextField_1_9, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
							.addComponent(formattedTextField_1_10, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE))
						.addComponent(formattedTextField_1_11_6, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
						.addComponent(formattedTextField_1_10_6, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
						.addComponent(formattedTextField_1_9_6, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
							.addComponent(formattedTextField_1_12_6_1, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
							.addComponent(formattedTextField_1_12_6, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
							.addComponent(formattedTextField_1_6_6, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
							.addComponent(formattedTextField_1_11_1, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
							.addComponent(btnNewButton)
							.addComponent(formattedTextField_1_10_1, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE))
						.addComponent(formattedTextField_1_9_1, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
						.addComponent(formattedTextField_1_6_1, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
						.addComponent(formattedTextField_1_12_1, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
						.addComponent(formattedTextField_1_11_6_1, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
						.addComponent(formattedTextField_1_10_6_1, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
						.addComponent(formattedTextField_1_9_6_1, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
						.addComponent(formattedTextField_1_6_6_1, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
						.addComponent(formattedTextField_1_12_6_2, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
						.addComponent(formattedTextField_1_12_6_1_1, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(formattedTextField_1_11_2, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
						.addComponent(formattedTextField_1_10_2, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
						.addComponent(formattedTextField_1_9_2, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
						.addComponent(formattedTextField_1_6_2, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
						.addComponent(formattedTextField_1_12_2, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
						.addComponent(formattedTextField_1_11_6_2, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
						.addComponent(formattedTextField_1_10_6_2, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
						.addComponent(formattedTextField_1_9_6_2, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
						.addComponent(formattedTextField_1_6_6_2, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
						.addComponent(formattedTextField_1_12_6_3, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
						.addComponent(formattedTextField_1_12_6_1_2, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(formattedTextField_1_11_3, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
						.addComponent(formattedTextField_1_10_3, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
						.addComponent(formattedTextField_1_9_3, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
						.addComponent(formattedTextField_1_6_3, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
						.addComponent(formattedTextField_1_12_3, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
						.addComponent(formattedTextField_1_11_6_3, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
						.addComponent(formattedTextField_1_10_6_3, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
						.addComponent(formattedTextField_1_9_6_3, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
						.addComponent(formattedTextField_1_6_6_3, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
						.addComponent(formattedTextField_1_12_6_4, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
						.addComponent(formattedTextField_1_12_6_1_3, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(formattedTextField_1_11_4, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
						.addComponent(formattedTextField_1_10_4, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
						.addComponent(formattedTextField_1_9_4, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
						.addComponent(formattedTextField_1_6_4, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
						.addComponent(formattedTextField_1_12_4, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
						.addComponent(formattedTextField_1_11_6_4, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
						.addComponent(formattedTextField_1_10_6_4, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
						.addComponent(formattedTextField_1_9_6_4, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
						.addComponent(formattedTextField_1_6_6_4, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
						.addComponent(formattedTextField_1_12_6_5, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
						.addComponent(formattedTextField_1_12_6_1_4, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(formattedTextField_1_11_5, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
						.addComponent(formattedTextField_1_10_5, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
						.addComponent(formattedTextField_1_9_5, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
						.addComponent(formattedTextField_1_6_5, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
						.addComponent(formattedTextField_1_12_5, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
						.addComponent(formattedTextField_1_11_6_5, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
						.addComponent(formattedTextField_1_10_6_5, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
						.addComponent(formattedTextField_1_9_6_5, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
						.addComponent(formattedTextField_1_6_6_5, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
						.addComponent(formattedTextField_1_12_6_6, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
						.addComponent(formattedTextField_1_12_6_1_5, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(formattedTextField_1_11_5_3, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
								.addComponent(formattedTextField_1_11_5_4, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE))
							.addComponent(formattedTextField_1_11_5_5, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(formattedTextField_1_11_5_6, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
								.addComponent(formattedTextField_1_11_5_7, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)))
						.addComponent(formattedTextField_1_11_5_8, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
						.addComponent(formattedTextField_1_11_5_9, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
						.addComponent(formattedTextField_1_11_5_10, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
						.addComponent(formattedTextField_1_11_5_11, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
						.addComponent(formattedTextField_1_11_5_12, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
						.addComponent(formattedTextField_1_11_5_13, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE))
					.addGap(6)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(formattedTextField_1_11_5_3_11, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
								.addComponent(formattedTextField_1_11_5_3_12, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE))
							.addGap(192)
							.addComponent(formattedTextField_1_11_5_6_1, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(formattedTextField_1_11_5_3_10, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
							.addGap(192)
							.addComponent(formattedTextField_1_11_5_7_1, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
									.addComponent(formattedTextField_1_11_5_3_3, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
									.addComponent(formattedTextField_1_11_5_3_4, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
									.addComponent(formattedTextField_1_11_5_3_5, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
									.addComponent(formattedTextField_1_11_5_3_6, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
									.addComponent(formattedTextField_1_11_5_3_7, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
									.addComponent(formattedTextField_1_11_5_3_8, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
									.addComponent(formattedTextField_1_11_5_3_9, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE))
								.addComponent(formattedTextField_1_11_5_3_13, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(formattedTextField_1_11_5_3_14, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
								.addComponent(frmtdtxtfldXx, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
								.addComponent(formattedTextField_1_11_5_3_17, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
								.addComponent(formattedTextField_1_11_5_3_18, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
								.addComponent(formattedTextField_1_11_5_3_19, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
								.addComponent(formattedTextField_1_11_5_3_20, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
								.addComponent(formattedTextField_1_11_5_3_21, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
								.addComponent(formattedTextField_1_11_5_3_22, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
								.addComponent(formattedTextField_1_11_5_3_23, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
								.addComponent(formattedTextField_1_11_5_3_24, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
								.addComponent(formattedTextField_1_11_5_3_25, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(formattedTextField_1_11_5_3_35, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
								.addComponent(formattedTextField_1_11_5_3_34, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
								.addComponent(formattedTextField_1_11_5_3_33, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
								.addComponent(formattedTextField_1_11_5_3_32, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
								.addComponent(formattedTextField_1_11_5_3_31, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
								.addComponent(formattedTextField_1_11_5_3_30, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
								.addComponent(formattedTextField_1_11_5_3_29, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
								.addComponent(formattedTextField_1_11_5_3_28, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(formattedTextField_1_11_5_3_27, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
									.addGap(124)
									.addComponent(formattedTextField_1_11_5_5_1, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addGroup(gl_contentPane.createSequentialGroup()
											.addComponent(formattedTextField_1_11_5_3_15, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
											.addGap(130)
											.addComponent(formattedTextField_1_11_5_3_2, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE))
										.addGroup(gl_contentPane.createSequentialGroup()
											.addComponent(formattedTextField_1_11_5_3_26, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
											.addGap(130)
											.addComponent(formattedTextField_1_11_5_4_2, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)))
									.addGap(198)
									.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addComponent(formattedTextField_1_11_5_3_1, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
										.addComponent(formattedTextField_1_11_5_4_1, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE))))))
					.addGap(145)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(formattedTextField_1_11_4_2, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
						.addComponent(formattedTextField_1_10_4_2, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
						.addComponent(formattedTextField_1_9_4_2, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
						.addComponent(formattedTextField_1_6_4_2, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
						.addComponent(formattedTextField_1_12_4_2, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
						.addComponent(formattedTextField_1_11_6_4_2, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
						.addComponent(formattedTextField_1_10_6_4_2, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
						.addComponent(formattedTextField_1_9_6_4_2, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
						.addComponent(formattedTextField_1_6_6_4_2, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
						.addComponent(formattedTextField_1_12_6_5_2, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
						.addComponent(formattedTextField_1_12_6_1_4_2, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE))
					.addGap(6)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(formattedTextField_1_11_5_2, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
						.addComponent(formattedTextField_1_10_5_2, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
						.addComponent(formattedTextField_1_9_5_2, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
						.addComponent(formattedTextField_1_6_5_2, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
						.addComponent(formattedTextField_1_12_5_2, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
						.addComponent(formattedTextField_1_11_6_5_2, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
						.addComponent(formattedTextField_1_10_6_5_2, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
						.addComponent(formattedTextField_1_9_6_5_2, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
						.addComponent(formattedTextField_1_6_6_5_2, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
						.addComponent(formattedTextField_1_12_6_6_2, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
						.addComponent(formattedTextField_1_12_6_1_5_2, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE))
					.addGap(115)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(formattedTextField_1_11_4_1, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
						.addComponent(formattedTextField_1_10_4_1, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
						.addComponent(formattedTextField_1_9_4_1, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
						.addComponent(formattedTextField_1_6_4_1, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
						.addComponent(formattedTextField_1_12_4_1, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
						.addComponent(formattedTextField_1_11_6_4_1, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
						.addComponent(formattedTextField_1_10_6_4_1, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
						.addComponent(formattedTextField_1_9_6_4_1, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
						.addComponent(formattedTextField_1_6_6_4_1, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
						.addComponent(formattedTextField_1_12_6_5_1, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
						.addComponent(formattedTextField_1_12_6_1_4_1, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE))
					.addGap(6)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(formattedTextField_1_11_5_1, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
						.addComponent(formattedTextField_1_10_5_1, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
						.addComponent(formattedTextField_1_9_5_1, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
						.addComponent(formattedTextField_1_6_5_1, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
						.addComponent(formattedTextField_1_12_5_1, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
						.addComponent(formattedTextField_1_11_6_5_1, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
						.addComponent(formattedTextField_1_10_6_5_1, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
						.addComponent(formattedTextField_1_9_6_5_1, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
						.addComponent(formattedTextField_1_6_6_5_1, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
						.addComponent(formattedTextField_1_12_6_6_1, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
						.addComponent(formattedTextField_1_12_6_1_5_1, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		contentPane.setLayout(gl_contentPane);
	}
}
