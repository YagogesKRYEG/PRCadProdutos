package com.PRCadProdutos.view;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import com.PRCadProdutos.dominio.Produtos;

public class View extends JFrame {

	private JPanel contentPane;
	private JTextField txtFabricante;
	private JTextField txtNome;
	private JTextField txtQuantidade;
	private JTextField txtDescricao;
	private JTextField txtPreco;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					View frame = new View();
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
	public View() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblFabricante = new JLabel("Fabricante:");
		lblFabricante.setHorizontalAlignment(SwingConstants.RIGHT);
		lblFabricante.setBounds(43, 36, 61, 14);
		contentPane.add(lblFabricante);
		
		JLabel lblNome = new JLabel("Nome do produto:");
		lblNome.setBounds(16, 11, 88, 14);
		contentPane.add(lblNome);
		
		JLabel lblQuantidade = new JLabel("Quantidade:");
		lblQuantidade.setBounds(43, 61, 61, 14);
		contentPane.add(lblQuantidade);
		
		JLabel lblDescricao = new JLabel("Descri\u00E7\u00E3o:");
		lblDescricao.setBounds(52, 86, 52, 14);
		contentPane.add(lblDescricao);
		
		txtFabricante = new JTextField();
		txtFabricante.setBounds(114, 33, 236, 20);
		contentPane.add(txtFabricante);
		txtFabricante.setColumns(10);
		
		txtNome = new JTextField();
		txtNome.setBounds(114, 8, 236, 20);
		contentPane.add(txtNome);
		txtNome.setColumns(10);
		
		JLabel lblPreco = new JLabel("Pre\u00E7o:");
		lblPreco.setHorizontalAlignment(SwingConstants.RIGHT);
		lblPreco.setBounds(65, 152, 36, 14);
		contentPane.add(lblPreco);
		
		txtQuantidade = new JTextField();
		txtQuantidade.setBounds(114, 58, 96, 20);
		contentPane.add(txtQuantidade);
		txtQuantidade.setColumns(10);
		
		txtDescricao = new JTextField();
		txtDescricao.setBounds(114, 83, 236, 55);
		contentPane.add(txtDescricao);
		txtDescricao.setColumns(10);
		
		txtPreco = new JTextField();
		txtPreco.setBounds(114, 149, 96, 20);
		contentPane.add(txtPreco);
		txtPreco.setColumns(10);
		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Passar os dados do formulário para o objeto produto
				Produtos.setNome(txtNome.getText());
				Produtos.setFabricante(txtFabricante.getText());
				Produtos.setPreco(txtPreco.getText());
				Produtos.setQuantidade(txtQuantidade.getText());
				Produtos.setDescricao(txtDescricao.getText());



			}
		});
		btnCadastrar.setBounds(10, 196, 88, 42);
		contentPane.add(btnCadastrar);
		
		JButton btnPesquisar = new JButton("Pesquisar");
		btnPesquisar.setBounds(133, 196, 96, 42);
		contentPane.add(btnPesquisar);
		
		JButton btnAtualizar = new JButton("Atualizar");
		btnAtualizar.setBounds(254, 196, 96, 42);
		contentPane.add(btnAtualizar);
	}
}
