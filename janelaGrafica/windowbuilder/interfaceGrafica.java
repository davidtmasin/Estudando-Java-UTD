package janelaGrafica.windowbuilder;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import javax.swing.border.BevelBorder;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class interfaceGrafica extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textNome;
	private JTextField textSobrenome;
	private JTextField textTelefone;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					interfaceGrafica frame = new interfaceGrafica();
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
	public interfaceGrafica() {
		setTitle("Janela - WindowBuilder");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 644, 375);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Agenda telef\u00F4nica");
		lblNewLabel.setFont(new Font("Lucida Bright", Font.BOLD, 36));
		lblNewLabel.setBounds(10, 11, 334, 62);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("NOME:");
		lblNewLabel_1.setFont(new Font("Dubai Medium", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(10, 115, 139, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("SOBRENOME:");
		lblNewLabel_1_1.setFont(new Font("Dubai Medium", Font.PLAIN, 14));
		lblNewLabel_1_1.setBounds(10, 157, 139, 14);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("TELEFONE:");
		lblNewLabel_1_1_1.setFont(new Font("Dubai Medium", Font.PLAIN, 14));
		lblNewLabel_1_1_1.setBounds(10, 199, 139, 14);
		contentPane.add(lblNewLabel_1_1_1);
		
		textNome = new JTextField();
		textNome.setBounds(125, 112, 170, 20);
		contentPane.add(textNome);
		textNome.setColumns(10);
		
		textSobrenome = new JTextField();
		textSobrenome.setColumns(10);
		textSobrenome.setBounds(125, 154, 170, 20);
		contentPane.add(textSobrenome);
		
		textTelefone = new JTextField();
		textTelefone.setColumns(10);
		textTelefone.setBounds(125, 196, 129, 20);
		contentPane.add(textTelefone);
		
		
		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String nome = textNome.getText();
				String sobrenome = textSobrenome.getText();
				String telefone = textTelefone.getText();
				
				Contato contato1 = new Contato();
			
				contato1.setNome(nome);
				contato1.setSobrenome(sobrenome);
				contato1.setTelefone(telefone);
				
			}
		});
		
		btnCadastrar.setFont(new Font("Dubai", Font.PLAIN, 14));
		btnCadastrar.setBounds(30, 253, 89, 23);
		contentPane.add(btnCadastrar);
		
		JButton btnListar = new JButton("Listar");
		btnListar.setFont(new Font("Dubai", Font.PLAIN, 14));
		btnListar.setBounds(145, 253, 89, 23);
		contentPane.add(btnListar);
		
		JButton btnAlterar = new JButton("Alterar");
		btnAlterar.setFont(new Font("Dubai", Font.PLAIN, 14));
		btnAlterar.setBounds(30, 304, 89, 23);
		contentPane.add(btnAlterar);
		
		JButton btnDeletar = new JButton("Deletar");
		btnDeletar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
			}
		});
		btnDeletar.setFont(new Font("Dubai", Font.PLAIN, 14));
		btnDeletar.setBounds(145, 304, 89, 23);
		contentPane.add(btnDeletar);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setViewportBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		scrollPane.setBounds(357, 71, 247, 223);
		contentPane.add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"NOME", "SOBRENOME", "TELEFONE"
			}
		) {
			Class[] columnTypes = new Class[] {
				String.class, String.class, String.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		scrollPane.setViewportView(table);
	}
}
