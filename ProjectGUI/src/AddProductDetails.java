import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.event.ActionEvent;

public class AddProductDetails extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddProductDetails frame = new AddProductDetails();
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
	public AddProductDetails() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("AddProductDetails");
		lblNewLabel.setBounds(174, 11, 98, 20);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("PID");
		lblNewLabel_1.setBounds(10, 64, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(103, 61, 150, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Pname");
		lblNewLabel_2.setBounds(10, 137, 46, 14);
		contentPane.add(lblNewLabel_2);
		
		textField_1 = new JTextField();
		textField_1.setBounds(103, 134, 150, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("PPrice");
		lblNewLabel_3.setBounds(10, 196, 46, 14);
		contentPane.add(lblNewLabel_3);
		
		textField_2 = new JTextField();
		textField_2.setBounds(106, 193, 147, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		final JButton btnNewButton = new JButton("Add");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				try
				{
					int pid=Integer.parseInt(textField.getText());
					String pname=textField_1.getText();
					int pprice=Integer.parseInt(textField_2.getText());
					String str1="insert into addproduct values('"+pid+"','"+pname+"','"+pprice+"')";
					Class.forName("org.h2.Driver");
					Connection conn=DriverManager.getConnection("jdbc:h2:tcp://localhost/~/javap20","sa","");
					Statement stmt=conn.createStatement();
					stmt.executeUpdate(str1);
					JOptionPane.showMessageDialog(btnNewButton,"Added..");
					
				}
				catch(ClassNotFoundException t)
				{
					System.out.println(t);
				}
				catch(SQLException t1)
				{
					System.out.println(t1);
				}
			}
		});
		btnNewButton.setBounds(308, 54, 89, 24);
		contentPane.add(btnNewButton);
		
		final JButton btnNewButton_1 = new JButton("Search");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				try
				{
					int pid=Integer.parseInt(textField.getText());
					String str2="select * from addProduct where pid='"+pid+"'";
					Class.forName("org.h2.Driver");
					Connection conn=DriverManager.getConnection("jdbc:h2:tcp://localhost/~/javap20","sa","");
					Statement stmt=conn.createStatement();
					ResultSet rs=stmt.executeQuery(str2);
					rs.next();
					String t1=rs.getString(2);
					String t2=rs.getString(3);
					
					textField_1.setText(t1);
					textField_2.setText(t2);
					
					JOptionPane.showMessageDialog(btnNewButton_1,"Searching..");
				}
				catch(ClassNotFoundException t)
				{
					
				}
				catch(SQLException t1)
				{
					
				}
			}
		});
		btnNewButton_1.setBounds(308, 113, 89, 23);
		contentPane.add(btnNewButton_1);
		
		final JButton btnNewButton_2 = new JButton("Update");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				try
				{
					int pid=Integer.parseInt(textField.getText());
					String pname=textField_1.getText();
					String str2="update addproduct set pname='"+pname+"' where pid='"+pid+"'";
					Class.forName("org.h2.Driver");
					Connection conn=DriverManager.getConnection("jdbc:h2:tcp://localhost/~/javap20","sa","");
					Statement stmt=conn.createStatement();
					stmt.executeUpdate(str2);
					JOptionPane.showMessageDialog(btnNewButton_2,"Updated..");
				}
				catch(Exception t)
				{
					
				}
			}
		});
		btnNewButton_2.setBounds(308, 168, 89, 23);
		contentPane.add(btnNewButton_2);
		
		final JButton btnNewButton_3 = new JButton("Delete");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				try
				{
					int pid=Integer.parseInt(textField.getText());
					//String pname=textField_1.getText();
					String str2="delete addproduct where pid='"+pid+"'";
					Class.forName("org.h2.Driver");
					Connection conn=DriverManager.getConnection("jdbc:h2:tcp://localhost/~/javap20","sa","");
					Statement stmt=conn.createStatement();
					stmt.executeUpdate(str2);
					JOptionPane.showMessageDialog(btnNewButton_3,"Deleted..");
				}
				catch(Exception t)
				{
					
				}
			}
		});
		btnNewButton_3.setBounds(308, 213, 89, 23);
		contentPane.add(btnNewButton_3);
	}

}
