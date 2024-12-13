package visao;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;
import java.util.Iterator;

import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import Atxy2k.CustomTextField.RestrictedTextField;
import javax.swing.JSeparator;

public class Principal extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JPanel painelDesktop;
	private JLabel lblCep;
	private JTextField txtCep;
	private JLabel lblEndereco;
	private JTextField txtEndereco;
	private JLabel lblBairro;
	private JTextField txtBairro;
	private JLabel lblCidade;
	private JTextField txtCidade;
	private JLabel lblUf;

	@SuppressWarnings("rawtypes")
	private JComboBox boxUf;
	private JButton btnLimpar;
	private JButton btnBuscar;
	private JButton btnSobre;
	private JLabel lblCheck;
	private JLabel lblOk;
	private JLabel lblCadastroPrinciapl;
	private JButton btnAbrirCadastro;
	private JSeparator separator;

	public JLabel getLblCep() {
		return lblCep;
	}

	public void setLblCep(JLabel lblCep) {
		this.lblCep = lblCep;
	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principal frame = new Principal();
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

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public Principal() {
		setTitle("Painel de Cadastros");
		setResizable(false);
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Lucas\\Documents\\GitHub\\Projetos\\CadastroAvançado\\src\\img\\home.png"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(550, 150, 717, 377);
		painelDesktop = new JPanel();
		painelDesktop.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(painelDesktop);
		painelDesktop.setLayout(null);

		lblCep = new JLabel("CEP");
		lblCep.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		lblCep.setBounds(12, 42, 51, 21);
		painelDesktop.add(lblCep);

		txtCep = new JTextField();
		txtCep.setCursor(Cursor.getPredefinedCursor(Cursor.TEXT_CURSOR));
		txtCep.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		txtCep.setBounds(109, 42, 147, 26);
		painelDesktop.add(txtCep);
		txtCep.setColumns(10);

		lblEndereco = new JLabel("Endereço");
		lblEndereco.setMinimumSize(new Dimension(19, 15));
		lblEndereco.setMaximumSize(new Dimension(19, 15));
		lblEndereco.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		lblEndereco.setBounds(12, 102, 80, 21);
		painelDesktop.add(lblEndereco);

		txtEndereco = new JTextField();
		txtEndereco.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		txtEndereco.setBounds(109, 105, 504, 26);
		painelDesktop.add(txtEndereco);
		txtEndereco.setColumns(10);

		lblBairro = new JLabel("Bairro");
		lblBairro.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		lblBairro.setBounds(12, 151, 51, 21);
		painelDesktop.add(lblBairro);

		txtBairro = new JTextField();
		txtBairro.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		txtBairro.setBounds(109, 154, 250, 26);
		painelDesktop.add(txtBairro);
		txtBairro.setColumns(10);

		lblCidade = new JLabel("Cidade");
		lblCidade.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		lblCidade.setBounds(12, 206, 80, 21);
		painelDesktop.add(lblCidade);

		txtCidade = new JTextField();
		txtCidade.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		txtCidade.setBounds(109, 209, 250, 26);
		painelDesktop.add(txtCidade);
		txtCidade.setColumns(10);

		lblUf = new JLabel("UF");
		lblUf.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		lblUf.setBounds(416, 212, 29, 21);
		painelDesktop.add(lblUf);

		boxUf = new JComboBox();
		boxUf.setForeground(SystemColor.textHighlight);
		boxUf.setModel(new DefaultComboBoxModel(
				new String[] { "", "AC", "AL", "AP", "AM", "BA", "CE", "DF", "ES", "GO", "MA", "MT", "MS", "MG", "PA",
						"PB", "PR", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SC", "SP", "SE", "TO" }));
		boxUf.setFont(new Font("Segoe UI", Font.BOLD, 18));
		boxUf.setBounds(455, 206, 70, 29);
		painelDesktop.add(boxUf);

		btnLimpar = new JButton("Limpar");
		btnLimpar.addActionListener(this);
		btnLimpar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnLimpar.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		btnLimpar.setBounds(22, 271, 95, 21);
		painelDesktop.add(btnLimpar);

		btnBuscar = new JButton("Buscar");
		btnBuscar.addActionListener(this);
		btnBuscar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnBuscar.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		btnBuscar.setBounds(303, 43, 95, 21);
		painelDesktop.add(btnBuscar);

		btnSobre = new JButton("");
		btnSobre.addActionListener(this);
		btnSobre.setToolTipText("Sobre\r\n");
		btnSobre.setIcon(new ImageIcon(
				"C:\\Users\\Lucas\\Documents\\GitHub\\Projetos\\CadastroAvançado\\src\\img\\Questionmark.png"));
		btnSobre.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnSobre.setBorder(null);
		btnSobre.setBackground(new Color(240, 240, 240));
		btnSobre.setBounds(565, 31, 50, 50);
		painelDesktop.add(btnSobre);

		lblCheck = new JLabel("");
		lblCheck.setToolTipText("Ok");
		lblCheck.setBackground(new Color(240, 240, 240));
		lblCheck.setBounds(183, 322, 24, 24);
		painelDesktop.add(lblCheck);

		// Biblioteca Atxy2k, limita a caixa de texto para receber somente números e a
		// quantidade de caracteres.
		RestrictedTextField validar = new RestrictedTextField(txtCep);
		validar.setOnlyNums(true);
		validar.setLimit(8);

		lblOk = new JLabel("");
		lblOk.setBounds(266, 43, 25, 25);
		painelDesktop.add(lblOk);
		
		btnAbrirCadastro = new JButton("");
		btnAbrirCadastro.setToolTipText("Cadastro");
		btnAbrirCadastro.setBorder(null);
		btnAbrirCadastro.addActionListener(this);
		btnAbrirCadastro.setBackground(new Color(240, 240, 240));
		btnAbrirCadastro.setBounds(576, 228, 64, 64);
		painelDesktop.add(btnAbrirCadastro);
		
		separator = new JSeparator();
		separator.setBounds(12, 322, 673, 7);
		painelDesktop.add(separator);
		
		
		

	}

	// como usar a API pra pegar o Cep
	private void buscarCep() {
		String logradouro = "";
		String tipoLogradouro = "";
		String resultado = null;
		String cep = txtCep.getText();
		try {
			URL url = new URL("http://cep.republicavirtual.com.br/web_cep.php?cep=" + cep + "&formato=xml/");
			SAXReader xml = new SAXReader();
			Document documento = xml.read(url);
			Element root = documento.getRootElement();
			for (Iterator<Element> it = root.elementIterator(); it.hasNext();) {
				Element element = it.next();
				if (element.getQualifiedName().equals("cidade")) {
					txtCidade.setText(element.getText());
				}
				if (element.getQualifiedName().equals("bairro")) {
					txtBairro.setText(element.getText());
				}
				if (element.getQualifiedName().equals("uf")) {
					boxUf.setSelectedItem(element.getText());
				}
				if (element.getQualifiedName().equals("tipo_logradouro")) {
					tipoLogradouro = element.getText();
				}
				if (element.getQualifiedName().equals("logradouro")) {
					logradouro = element.getText();

					// Como fazer caso digite um cpf errado para terornar uma mnesagem de erro
				}
				if (element.getQualifiedName().equals("resultado")) {
					resultado = element.getText();
					if (resultado.equals("1")) {

						// Exibir o check icone se tiver tudo ok
	        lblOk.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/check.png/")));
	        btnAbrirCadastro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/profile.png/")));

					} else {
						JOptionPane.showMessageDialog(null, "  CEP NÃO ENCONTRADO !!  ");
					}}
			}
		

			// setar o campo endereco
			txtEndereco.setText(tipoLogradouro + " " + logradouro);

		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnAbrirCadastro) {
			actionPerformedBtnAbrirCadastro(e);
		}
		if (e.getSource() == btnLimpar) {
			actionPerformedBtnLimpar(e);
		}
		if (e.getSource() == btnSobre) {
			actionPerformedBtnNewButton(e);
		}
		if (e.getSource() == btnBuscar) {
			actionPerformedBtnBuscar(e);
		}
	}

	protected void actionPerformedBtnBuscar(ActionEvent e) {

		// aparecer mensagem de erro quando a caixa de texto estiver vazia e você quiser
		// obrigar a pessoa a digitar algo.
		if (txtCep.getText().equals("")) {
			JOptionPane.showMessageDialog(null, "Informe o CEP");
			txtCep.requestFocus();
		} else {
			buscarCep();

		}
	}

	protected void actionPerformedBtnNewButton(ActionEvent e) {

		// Serve para fazer um link no botao com o JDialog Sobre.java e abrir ele.
		Sobre sobre = new Sobre();
		sobre.setVisible(true);
	}
	protected void actionPerformedBtnLimpar(ActionEvent e) {
		limpar();
	}
	
	private void limpar() {
		txtCep.setText(null);
		boxUf.setSelectedItem(null);
		txtCidade.setText(null);
		txtBairro.setText(null);
		txtEndereco.setText(null);
		lblOk.setIcon(null);
	}
	protected void actionPerformedBtnAbrirCadastro(ActionEvent e) {
		Principal principal = new Principal();
		principal.setVisible(true);
	}
}
