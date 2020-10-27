import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class frmSquareEquation extends JFrame {

	private JPanel contentPane;
	private JTextField txtA;
	private JTextField txtB;
	private JTextField txtC;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frmSquareEquation frame = new frmSquareEquation();
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
	public frmSquareEquation() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTaskName = new JLabel("\u041A\u0432\u0430\u0434\u0440\u0430\u0442\u043D\u043E\u0435 \u0443\u0440\u0430\u0432\u043D\u0435\u043D\u0438\u0435");
		lblTaskName.setHorizontalAlignment(SwingConstants.CENTER);
		lblTaskName.setBounds(143, 39, 185, 14);
		lblTaskName.setFont(new Font("Tahoma", Font.BOLD, 14));
		contentPane.add(lblTaskName);
		
		txtA = new JTextField();
		txtA.setText("0");
		txtA.setBounds(10, 90, 86, 20);
		txtA.setFont(new Font("Tahoma", Font.PLAIN,12));
		contentPane.add(txtA);
		txtA.setColumns(10);
		
		JLabel lbl_a = new JLabel("\u04452 +");
		lbl_a.setBounds(106, 93, 46, 14);
		lbl_a.setFont(new Font("Tahoma", Font.PLAIN,12));
		contentPane.add(lbl_a);
		
		txtB = new JTextField();
		txtB.setText("0");
		txtB.setBounds(135, 90, 86, 20);
		txtB.setFont(new Font("Tahoma", Font.PLAIN,12));
		contentPane.add(txtB);
		txtB.setColumns(10);
		
		JLabel lbl_b = new JLabel("\u0445 +");
		lbl_b.setBounds(231, 93, 46, 14);
		lbl_b.setFont(new Font("Tahoma", Font.PLAIN,12));
		contentPane.add(lbl_b);
		
		txtC = new JTextField();
		txtC.setText("0");
		txtC.setBounds(256, 90, 86, 20);
		txtC.setFont(new Font("Tahoma", Font.PLAIN,12));
		contentPane.add(txtC);
		txtC.setColumns(10);
		
		JLabel lblRightPart = new JLabel("= 0");
		lblRightPart.setBounds(352, 93, 46, 14);
		lblRightPart.setFont(new Font("Tahoma", Font.PLAIN,12));
		contentPane.add(lblRightPart);
		
		JLabel lblSolution = new JLabel("");
		lblSolution.setBackground(Color.WHITE);
		lblSolution.setBounds(25, 221, 373, 14);
		lblSolution.setHorizontalAlignment(SwingConstants.CENTER);
		lblSolution.setFont(new Font("Tahoma",Font.BOLD,14));
		contentPane.add(lblSolution);
		
		JButton btnSolve = new JButton("\u0420\u0435\u0448\u0438\u0442\u044C \u0443\u0440\u0430\u0432\u043D\u0435\u043D\u0438\u0435");
		btnSolve.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a, b, c;
				try {
					a = Double.parseDouble(txtA.getText());
				}
				catch(NumberFormatException nfe) {
					a= 0.0;
					txtA.setText("0.0");
				}
				try {
					b = Double.parseDouble(txtB.getText());
				}
				catch(NumberFormatException nfe) {
					b= 0.0;
					txtB.setText("0.0");
				}
				try {
					c = Double.parseDouble(txtC.getText());
				}
				catch(NumberFormatException nfe) {
					c= 0.0;
					txtC.setText("0.0");
				}
				double D = b*b-4*a*c;
				double x1,x2;
				String Sol = "";
				if(D<0.0)
					Sol = "Действительных корней нет";
				else if(D> 0 && a != 0) {
					x1=(-b+Math.sqrt(D))/(2*a);
					x2=(-b-Math.sqrt(D))/(2*a);
					Sol= "Корни: х1 = " + x1 + ", x2 = " + x2;
				}
				else if(D==0.0 && b!=0) {
					x1 = -b/(2*a);
					Sol = "Корень х = " + x1;
				}
				else if (a == 0 && b!= 0) {
					x1 = -c/b;
					Sol = "Корень х = " + x1;
				}
				lblSolution.setText(Sol);
			}
		});
		btnSolve.setBounds(135, 141, 171, 23);
		contentPane.add(btnSolve);
		
		JLabel label_1 = new JLabel("\u0420\u0435\u0448\u0435\u043D\u0438\u0435");
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setBounds(193, 175, 74, 14);
		label_1.setFont(new Font("Tahoma",Font.BOLD,14));
		contentPane.add(label_1);
			
	}
}
