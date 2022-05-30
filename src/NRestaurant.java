import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.text.MessageFormat;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;

public class NRestaurant {

	private JFrame frame;
	private JTextField txtSubTotal;
	private JTextField txtTax;
	private JTextField txtTotal;
	private JTextField jtxtDisplay;
	private JTextField jtxtChange;
	private JTable table;
	private JTextField txtBarCode;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					NRestaurant window = new NRestaurant();
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
	public NRestaurant() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	//======================================================Functions====================================================================
	public void ItemCost() {
		double sum = 0;
		double tax =3.9;
		for(int i = 0; i < table.getRowCount(); i++) {
			sum = sum + Double.parseDouble(table.getValueAt(i, 2).toString());
		}
		txtSubTotal.setText(Double.toString(sum));
		double cTotal = Double.parseDouble(txtSubTotal.getText());
		
		double cTax = (cTotal * tax)/100;
		String iTaxTotal = String.format("Rs %.2f", cTax);
		txtTax.setText(iTaxTotal);
		
		String iSubTotal = String.format("Rs %.2f", cTotal);
		txtSubTotal.setText(iSubTotal);
		
		String iTotal = String.format("Rs %.2f", cTotal + cTax);
		txtTotal.setText(iTotal);
		
		String BarCode = String.format("Total is %.2f", cTotal + cTax);
		txtBarCode.setText(BarCode);
	}
	//======================================================Functions====================================================================
	public void Change() {
		double sum = 0;
		double tax =3.9;
		double cash = Double.parseDouble(jtxtDisplay.getText());
		
		for(int i = 0; i < table.getRowCount(); i++) {
			sum = sum + Double.parseDouble(table.getValueAt(i, 2).toString());
		}
		
		double cTax = (tax * sum)/100;
		double cChange = (cash - (sum + cTax));
		String ChangeGiven = String.format("Rs %.2f", cChange);
		jtxtChange.setText(ChangeGiven);
	}
	
	//======================================================Functions====================================================================
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(0, 0, 2500, 1500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 11, 291, 453);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Enternumber = jtxtDisplay.getText();
				if(Enternumber == "") {
					jtxtDisplay.setText(btn7.getText());
				}
				else {
					Enternumber = jtxtDisplay.getText() + btn7.getText();
					jtxtDisplay.setText(Enternumber);
				}
				
			}
		});
		btn7.setFont(new Font("Tahoma", Font.BOLD, 38));
		btn7.setBounds(10, 21, 82, 97);
		panel.add(btn7);
		
		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Enternumber = jtxtDisplay.getText();
				if(Enternumber == "") {
					jtxtDisplay.setText(btn4.getText());
				}
				else {
					Enternumber = jtxtDisplay.getText() + btn4.getText();
					jtxtDisplay.setText(Enternumber);
				}
			}
		});
		btn4.setFont(new Font("Tahoma", Font.BOLD, 38));
		btn4.setBounds(10, 129, 82, 92);
		panel.add(btn4);
		
		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Enternumber = jtxtDisplay.getText();
				if(Enternumber == "") {
					jtxtDisplay.setText(btn1.getText());
				}
				else {
					Enternumber = jtxtDisplay.getText() + btn1.getText();
					jtxtDisplay.setText(Enternumber);
				}
			}
		});
		btn1.setFont(new Font("Tahoma", Font.BOLD, 38));
		btn1.setBounds(10, 232, 82, 92);
		panel.add(btn1);
		
		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Enternumber = jtxtDisplay.getText();
				if(Enternumber == "") {
					jtxtDisplay.setText(btn0.getText());
				}
				else {
					Enternumber = jtxtDisplay.getText() + btn0.getText();
					jtxtDisplay.setText(Enternumber);
				}
			}
		});
		btn0.setFont(new Font("Tahoma", Font.BOLD, 38));
		btn0.setBounds(10, 335, 82, 92);
		panel.add(btn0);
		
		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Enternumber = jtxtDisplay.getText();
				if(Enternumber == "") {
					jtxtDisplay.setText(btn8.getText());
				}
				else {
					Enternumber = jtxtDisplay.getText() + btn8.getText();
					jtxtDisplay.setText(Enternumber);
				}
			}
		});
		btn8.setFont(new Font("Tahoma", Font.BOLD, 38));
		btn8.setBounds(107, 26, 82, 92);
		panel.add(btn8);
		
		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Enternumber = jtxtDisplay.getText();
				if(Enternumber == "") {
					jtxtDisplay.setText(btn9.getText());
				}
				else {
					Enternumber = jtxtDisplay.getText() + btn9.getText();
					jtxtDisplay.setText(Enternumber);
				}
			}
		});
		btn9.setFont(new Font("Tahoma", Font.BOLD, 38));
		btn9.setBounds(199, 26, 82, 92);
		panel.add(btn9);
		
		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Enternumber = jtxtDisplay.getText();
				if(Enternumber == "") {
					jtxtDisplay.setText(btn5.getText());
				}
				else {
					Enternumber = jtxtDisplay.getText() + btn5.getText();
					jtxtDisplay.setText(Enternumber);
				}
			}
		});
		btn5.setFont(new Font("Tahoma", Font.BOLD, 38));
		btn5.setBounds(107, 129, 82, 92);
		panel.add(btn5);
		
		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Enternumber = jtxtDisplay.getText();
				if(Enternumber == "") {
					jtxtDisplay.setText(btn2.getText());
				}
				else {
					Enternumber = jtxtDisplay.getText() + btn2.getText();
					jtxtDisplay.setText(Enternumber);
				}
			}
		});
		btn2.setFont(new Font("Tahoma", Font.BOLD, 38));
		btn2.setBounds(107, 232, 82, 92);
		panel.add(btn2);
		
		JButton btnDot = new JButton(".");
		btnDot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(! jtxtDisplay.getText().contains(".")) {
					jtxtDisplay.setText(jtxtDisplay.getText() + btnDot.getText());
				}
			}
		});
		btnDot.setFont(new Font("Tahoma", Font.BOLD, 38));
		btnDot.setBounds(107, 335, 82, 92);
		panel.add(btnDot);
		
		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Enternumber = jtxtDisplay.getText();
				if(Enternumber == "") {
					jtxtDisplay.setText(btn6.getText());
				}
				else {
					Enternumber = jtxtDisplay.getText() + btn6.getText();
					jtxtDisplay.setText(Enternumber);
				}
			}
		});
		btn6.setFont(new Font("Tahoma", Font.BOLD, 38));
		btn6.setBounds(199, 129, 82, 92);
		panel.add(btn6);
		
		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Enternumber = jtxtDisplay.getText();
				if(Enternumber == "") {
					jtxtDisplay.setText(btn3.getText());
				}
				else {
					Enternumber = jtxtDisplay.getText() + btn3.getText();
					jtxtDisplay.setText(Enternumber);
				}
			}
		});
		btn3.setFont(new Font("Tahoma", Font.BOLD, 38));
		btn3.setBounds(199, 232, 82, 92);
		panel.add(btn3);
		
		JButton btnClear = new JButton("C");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jtxtDisplay.setText(null);
				jtxtChange.setText(null);
			}
		});
		btnClear.setFont(new Font("Tahoma", Font.BOLD, 38));
		btnClear.setBounds(199, 335, 82, 92);
		panel.add(btnClear);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(669, 11, 604, 453);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JButton btnCappuccino = new JButton("");
		btnCappuccino.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double PriceOfItem = 50;
				DefaultTableModel model = (DefaultTableModel) table.getModel();
				model.addRow(new Object[] {"Cappuccino", "1", PriceOfItem});
				ItemCost();
			}
		});
		btnCappuccino.setIcon(new ImageIcon("C:\\Users\\Ansaf125\\OneDrive\\Desktop\\jimages\\OIP (1).jpg"));
		btnCappuccino.setFont(new Font("Tahoma", Font.BOLD, 38));
		btnCappuccino.setBounds(10, 11, 132, 115);
		panel_1.add(btnCappuccino);
		
		JButton btnCanDrink = new JButton("");
		btnCanDrink.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double PriceOfItem = 30;
				DefaultTableModel model = (DefaultTableModel) table.getModel();
				model.addRow(new Object[] {"Can Drink", "1", PriceOfItem});
				ItemCost();
			}
		});
		btnCanDrink.setIcon(new ImageIcon("C:\\Users\\Ansaf125\\OneDrive\\Desktop\\jimages\\th.jpg"));
		btnCanDrink.setFont(new Font("Tahoma", Font.BOLD, 38));
		btnCanDrink.setBounds(163, 11, 132, 115);
		panel_1.add(btnCanDrink);
		
		JButton btnCake = new JButton("");
		btnCake.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double PriceOfItem = 300;
				DefaultTableModel model = (DefaultTableModel) table.getModel();
				model.addRow(new Object[] {"Cake", "1", PriceOfItem});
				ItemCost();
			}
		});
		btnCake.setIcon(new ImageIcon("C:\\Users\\Ansaf125\\OneDrive\\Desktop\\jimages\\OIP (5).jpg"));
		btnCake.setFont(new Font("Tahoma", Font.BOLD, 38));
		btnCake.setBounds(313, 11, 132, 115);
		panel_1.add(btnCake);
		
		JButton btnTea = new JButton("");
		btnTea.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double PriceOfItem = 10;
				DefaultTableModel model = (DefaultTableModel) table.getModel();
				model.addRow(new Object[] {"Tea", "1", PriceOfItem});
				ItemCost();
			}
		});
		btnTea.setIcon(new ImageIcon("C:\\Users\\Ansaf125\\OneDrive\\Desktop\\jimages\\OIP (6).jpg"));
		btnTea.setFont(new Font("Tahoma", Font.BOLD, 38));
		btnTea.setBounds(462, 11, 132, 115);
		panel_1.add(btnTea);
		
		JButton btnCoffee = new JButton("");
		btnCoffee.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double PriceOfItem = 20;
				DefaultTableModel model = (DefaultTableModel) table.getModel();
				model.addRow(new Object[] {"Coffee", "1", PriceOfItem});
				ItemCost();
			}
		});
		btnCoffee.setIcon(new ImageIcon("C:\\Users\\Ansaf125\\OneDrive\\Desktop\\jimages\\OIP (7).jpg"));
		btnCoffee.setFont(new Font("Tahoma", Font.BOLD, 38));
		btnCoffee.setBounds(10, 159, 132, 115);
		panel_1.add(btnCoffee);
		
		JButton btnBeen = new JButton("");
		btnBeen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double PriceOfItem = 15;
				DefaultTableModel model = (DefaultTableModel) table.getModel();
				model.addRow(new Object[] {"Been", "1", PriceOfItem});
				ItemCost();
			}
		});
		btnBeen.setIcon(new ImageIcon("C:\\Users\\Ansaf125\\OneDrive\\Desktop\\jimages\\download.jpg"));
		btnBeen.setFont(new Font("Tahoma", Font.BOLD, 38));
		btnBeen.setBounds(10, 306, 132, 115);
		panel_1.add(btnBeen);
		
		JButton btnCola = new JButton("");
		btnCola.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double PriceOfItem = 25;
				DefaultTableModel model = (DefaultTableModel) table.getModel();
				model.addRow(new Object[] {"Cola", "1", PriceOfItem});
				ItemCost();
			}
		});
		btnCola.setIcon(new ImageIcon("C:\\Users\\Ansaf125\\OneDrive\\Desktop\\jimages\\th (1).jpg"));
		btnCola.setFont(new Font("Tahoma", Font.BOLD, 38));
		btnCola.setBounds(163, 159, 132, 115);
		panel_1.add(btnCola);
		
		JButton btnIceTea = new JButton("");
		btnIceTea.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double PriceOfItem = 25;
				DefaultTableModel model = (DefaultTableModel) table.getModel();
				model.addRow(new Object[] {"Ice Tea", "1", PriceOfItem});
				ItemCost();
			}
		});
		btnIceTea.setIcon(new ImageIcon("C:\\Users\\Ansaf125\\OneDrive\\Desktop\\jimages\\download (1).jpg"));
		btnIceTea.setFont(new Font("Tahoma", Font.BOLD, 38));
		btnIceTea.setBounds(163, 306, 132, 115);
		panel_1.add(btnIceTea);
		
		JButton btnjuice = new JButton("");
		btnjuice.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double PriceOfItem = 60;
				DefaultTableModel model = (DefaultTableModel) table.getModel();
				model.addRow(new Object[] {"Juice", "1", PriceOfItem});
				ItemCost();
			}
		});
		btnjuice.setIcon(new ImageIcon("C:\\Users\\Ansaf125\\OneDrive\\Desktop\\jimages\\OIP (11).jpg"));
		btnjuice.setFont(new Font("Tahoma", Font.BOLD, 38));
		btnjuice.setBounds(313, 159, 132, 115);
		panel_1.add(btnjuice);
		
		JButton btnCouldCoffee = new JButton("");
		btnCouldCoffee.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double PriceOfItem = 60;
				DefaultTableModel model = (DefaultTableModel) table.getModel();
				model.addRow(new Object[] {"Could Coffee", "1", PriceOfItem});
				ItemCost();
			}
		});
		btnCouldCoffee.setIcon(new ImageIcon("C:\\Users\\Ansaf125\\OneDrive\\Desktop\\jimages\\download (2).jpg"));
		btnCouldCoffee.setFont(new Font("Tahoma", Font.BOLD, 38));
		btnCouldCoffee.setBounds(313, 306, 132, 115);
		panel_1.add(btnCouldCoffee);
		
		JButton btnIceCream = new JButton("");
		btnIceCream.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double PriceOfItem = 35;
				DefaultTableModel model = (DefaultTableModel) table.getModel();
				model.addRow(new Object[] {"Ice Cream", "1", PriceOfItem});
				ItemCost();
			}
		});
		btnIceCream.setIcon(new ImageIcon("C:\\Users\\Ansaf125\\OneDrive\\Desktop\\jimages\\OIP (12).jpg"));
		btnIceCream.setFont(new Font("Tahoma", Font.BOLD, 38));
		btnIceCream.setBounds(462, 159, 132, 115);
		panel_1.add(btnIceCream);
		
		JButton btnCookies = new JButton("");
		btnCookies.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double PriceOfItem = 5;
				DefaultTableModel model = (DefaultTableModel) table.getModel();
				model.addRow(new Object[] {"Cookies", "1", PriceOfItem});
				ItemCost();
			}
		});
		btnCookies.setIcon(new ImageIcon("C:\\Users\\Ansaf125\\OneDrive\\Desktop\\jimages\\OIP (15).jpg"));
		btnCookies.setFont(new Font("Tahoma", Font.BOLD, 38));
		btnCookies.setBounds(462, 306, 132, 115);
		panel_1.add(btnCookies);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(10, 473, 1263, 216);
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(10, 11, 442, 194);
		panel_2.add(panel_3);
		panel_3.setLayout(null);
		
		JLabel lblSubTotal = new JLabel("SubTotal");
		lblSubTotal.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblSubTotal.setBounds(10, 31, 134, 45);
		panel_3.add(lblSubTotal);
		
		JLabel lblTax = new JLabel("Tax");
		lblTax.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblTax.setBounds(10, 77, 134, 45);
		panel_3.add(lblTax);
		
		JLabel lblTotal = new JLabel("Total");
		lblTotal.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblTotal.setBounds(10, 129, 134, 45);
		panel_3.add(lblTotal);
		
		txtSubTotal = new JTextField();
		txtSubTotal.setFont(new Font("Tahoma", Font.BOLD, 23));
		txtSubTotal.setBounds(227, 31, 205, 32);
		panel_3.add(txtSubTotal);
		txtSubTotal.setColumns(10);
		
		txtTax = new JTextField();
		txtTax.setFont(new Font("Tahoma", Font.BOLD, 23));
		txtTax.setColumns(10);
		txtTax.setBounds(227, 90, 205, 32);
		panel_3.add(txtTax);
		
		txtTotal = new JTextField();
		txtTotal.setFont(new Font("Tahoma", Font.BOLD, 23));
		txtTotal.setColumns(10);
		txtTotal.setBounds(227, 141, 205, 32);
		panel_3.add(txtTotal);
		
		JPanel panel_3_1 = new JPanel();
		panel_3_1.setBounds(462, 11, 427, 194);
		panel_2.add(panel_3_1);
		panel_3_1.setLayout(null);
		
		JLabel lblPaymentMethod = new JLabel("Pay Method");
		lblPaymentMethod.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblPaymentMethod.setBounds(10, 31, 165, 45);
		panel_3_1.add(lblPaymentMethod);
		
		JLabel lblCash = new JLabel("Cash");
		lblCash.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblCash.setBounds(10, 87, 134, 45);
		panel_3_1.add(lblCash);
		
		JLabel lblChange = new JLabel("Change");
		lblChange.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblChange.setBounds(10, 143, 134, 45);
		panel_3_1.add(lblChange);
		
		jtxtDisplay = new JTextField();
		jtxtDisplay.setFont(new Font("Tahoma", Font.BOLD, 23));
		jtxtDisplay.setColumns(10);
		jtxtDisplay.setBounds(212, 87, 205, 32);
		panel_3_1.add(jtxtDisplay);
		
		jtxtChange = new JTextField();
		jtxtChange.setFont(new Font("Tahoma", Font.BOLD, 23));
		jtxtChange.setColumns(10);
		jtxtChange.setBounds(212, 151, 205, 32);
		panel_3_1.add(jtxtChange);
		
		JComboBox jcboPayment = new JComboBox();
		jcboPayment.setModel(new DefaultComboBoxModel(new String[] {"", "Cash", "UPI Pay", "Visa Card", "Master Card"}));
		jcboPayment.setFont(new Font("Tahoma", Font.BOLD, 23));
		jcboPayment.setBounds(212, 31, 205, 39);
		panel_3_1.add(jcboPayment);
		
		JPanel panel_3_2 = new JPanel();
		panel_3_2.setBounds(898, 11, 355, 194);
		panel_2.add(panel_3_2);
		panel_3_2.setLayout(null);
		
		JButton btnPay = new JButton("Pay");
		btnPay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(jcboPayment.getSelectedItem().equals("Cash")) {
					Change();
				}
				else {
					jtxtChange.setText("");
					jtxtDisplay.setText("");
				}
			}
		});
		btnPay.setFont(new Font("Tahoma", Font.BOLD, 24));
		btnPay.setBounds(20, 23, 142, 41);
		panel_3_2.add(btnPay);
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jtxtDisplay.setText(null);
				jtxtChange.setText(null);
				txtTax.setText(null);
				txtSubTotal.setText(null);
				txtTotal.setText(null);
				txtBarCode.setText(null);
				
				DefaultTableModel RecordTable = (DefaultTableModel) table.getModel();
				RecordTable.setRowCount(0);
			}
		});
		btnReset.setFont(new Font("Tahoma", Font.BOLD, 24));
		btnReset.setBounds(191, 23, 142, 41);
		panel_3_2.add(btnReset);
		
		JButton btnPrint = new JButton("Print");
		btnPrint.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MessageFormat header = new MessageFormat("Printing in progress");
				MessageFormat footer = new MessageFormat("Page {0, number, integer}");
				
				try {
					table.print(JTable.PrintMode.NORMAL, header, footer);
				}
				catch(java.awt.print.PrinterException ex){
					System.err.format("No Printer found", ex.getMessage());
				}
			}
		});
		btnPrint.setFont(new Font("Tahoma", Font.BOLD, 24));
		btnPrint.setBounds(20, 86, 142, 41);
		panel_3_2.add(btnPrint);
		
		JButton btnRemove = new JButton("Remove");
		btnRemove.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				DefaultTableModel model = (DefaultTableModel) table.getModel();
				
				int RemoveItem = table.getSelectedRow();
				if(RemoveItem >= 0) {
					model.removeRow(RemoveItem);
				}
				ItemCost();
				
				if(jcboPayment.getSelectedItem().equals("Cash")) {
					Change();
				}
				else {
					jtxtChange.setText("");
					jtxtDisplay.setText("");
				}
				
			}
		});
		btnRemove.setFont(new Font("Tahoma", Font.BOLD, 24));
		btnRemove.setBounds(191, 86, 142, 41);
		panel_3_2.add(btnRemove);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame = new JFrame("Exit");
				if(JOptionPane.showConfirmDialog(frame, "Confirm if you want to exit", "Point of Sale", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
					System.exit(0);
				}
			}
		});
		btnExit.setFont(new Font("Tahoma", Font.BOLD, 24));
		btnExit.setBounds(107, 142, 142, 41);
		panel_3_2.add(btnExit);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(311, 11, 347, 383);
		frame.getContentPane().add(scrollPane);
		
		table = new JTable();
		table.setFont(new Font("Tahoma", Font.PLAIN, 14));
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Items", "Qty", "Amount"
			}
		));
		table.getColumnModel().getColumn(0).setPreferredWidth(88);
		table.getColumnModel().getColumn(1).setPreferredWidth(60);
		scrollPane.setViewportView(table);
		
		txtBarCode = new JTextField();
		txtBarCode.setFont(new Font("Marlett", Font.PLAIN, 24));
		txtBarCode.setBounds(313, 404, 345, 60);
		frame.getContentPane().add(txtBarCode);
		txtBarCode.setColumns(10);
	}
}
