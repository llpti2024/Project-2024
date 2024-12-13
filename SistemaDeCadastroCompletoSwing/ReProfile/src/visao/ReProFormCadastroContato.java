/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package visao;

import Atxy2k.CustomTextField.RestrictedTextField;
import com.toedter.calendar.JDateChooser;
import dao.CadastroMapDAO;
import interfaces.ICadastroDAO;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;
import java.util.Iterator;
import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.DefaultTableModel;
import modelo.Cadastro;
import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

abstract public class ReProFormCadastroContato extends javax.swing.JInternalFrame
{

    private JDateChooser dateChooser;
    final ICadastroDAO cadastroDAO = new CadastroMapDAO();
    private final DefaultTableModel modelo = new DefaultTableModel();

    public ReProFormCadastroContato()
    {

        ((BasicInternalFrameUI) this.getUI()).setNorthPane(null);
        setBorder(null);
        initComponents();

        initCustomComponents();
        carregarCadastrosDeArquivo();

        limparCaixaDeTexto();
        habilitarBotoes(true);
        habilitarCamposDeTexto(false);
        btnCEP.setEnabled(false);
        txtCep.setEnabled(false);
        txtId.setEnabled(false);

        /* ou pode ser também
         txtId.setEditable(false);
         */
    }

    private void initCustomComponents()
    {

        modelo.addColumn("ID");
        modelo.addColumn("Apelido");
        modelo.addColumn("Nome");
        modelo.addColumn("Data de Nascimento");
        modelo.addColumn("Endereco");
        modelo.addColumn("Número");
        modelo.addColumn("Estado");
        modelo.addColumn("Cidade");
        modelo.addColumn("Bairro");
        modelo.addColumn("Cep");
        modelo.addColumn("DDD");
        modelo.addColumn("Telefone");
        modelo.addColumn("E-mail");

        tabelaClientesCadastrados.setModel(modelo);

        tabelaClientesCadastrados.setFont(new Font("Arial", Font.PLAIN, 16)); // Fonte Arial, tamanho 14, estilo normal
        tabelaClientesCadastrados.setRowHeight(30); // Aumenta a altura da linha (pode ser ajustado conforme desejado)
        tabelaClientesCadastrados.setSelectionBackground(Color.black); // Muda a cor de fundo ao clicar na célula
        tabelaClientesCadastrados.setSelectionForeground(Color.WHITE);

        tabelaClientesCadastrados.getTableHeader().setReorderingAllowed(false);
        tabelaClientesCadastrados.setDefaultEditor(Object.class, null);

        tabelaClientesCadastrados.getColumnModel().getColumn(0).setPreferredWidth(55);   // ID
        tabelaClientesCadastrados.getColumnModel().getColumn(1).setPreferredWidth(150);  // Apelido
        tabelaClientesCadastrados.getColumnModel().getColumn(2).setPreferredWidth(170);  // Nome
        tabelaClientesCadastrados.getColumnModel().getColumn(3).setPreferredWidth(140);  // Data de Nascimento
        tabelaClientesCadastrados.getColumnModel().getColumn(4).setPreferredWidth(230);  // Endereço
        tabelaClientesCadastrados.getColumnModel().getColumn(5).setPreferredWidth(40);  // Número
        tabelaClientesCadastrados.getColumnModel().getColumn(6).setPreferredWidth(40);  // Estado
        tabelaClientesCadastrados.getColumnModel().getColumn(7).setPreferredWidth(100);  // Cidade
        tabelaClientesCadastrados.getColumnModel().getColumn(8).setPreferredWidth(100);  // Bairro
        tabelaClientesCadastrados.getColumnModel().getColumn(9).setPreferredWidth(80);  // Cep
        tabelaClientesCadastrados.getColumnModel().getColumn(10).setPreferredWidth(50); // DDD
        tabelaClientesCadastrados.getColumnModel().getColumn(11).setPreferredWidth(100); // Telefone
        tabelaClientesCadastrados.getColumnModel().getColumn(12).setPreferredWidth(350);

        
         txtDataDeNascimento.addMouseListener(new java.awt.event.MouseAdapter() {
        @Override
        public void mouseClicked(java.awt.event.MouseEvent evt) {
            abrirPopupJCalendar();
        }
    });

    }

    private void abrirPopupJCalendar() {
     PopupJCalendar popup = new PopupJCalendar(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            String selectedDate = (String) e.getSource(); // Obtém a data selecionada
            txtDataDeNascimento.setText(selectedDate); // Atualiza o campo de texto
        }
    });

    // Adiciona o popup no desktop pane da aplicação
    getParent().add(popup);
    popup.setVisible(true);
    try {
        popup.setSelected(true);
    } catch (java.beans.PropertyVetoException ex) {
        ex.printStackTrace();
    }

}

    //
    //
    //
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        RPDesktop = new javax.swing.JDesktopPane();
        RPFormulario = new javax.swing.JPanel();
        lblNome = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        lblCep = new javax.swing.JLabel();
        lblApelido = new javax.swing.JLabel();
        lblDataDeNascimento = new javax.swing.JLabel();
        lblTelefone = new javax.swing.JLabel();
        lblId = new javax.swing.JLabel();
        try
        {
            txtApelido =(javax.swing.JTextField)java.beans.Beans.instantiate(getClass().getClassLoader(), "visao.ReProFormCadastroContato_txtApelido");
        } catch (ClassNotFoundException e)
        {
            e.printStackTrace();
        } catch (java.io.IOException e)
        {
            e.printStackTrace();
        }
        txtEmail = new javax.swing.JTextField();
        txtId = new javax.swing.JTextField();
        txtDDD = new javax.swing.JTextField();
        txtNome = new javax.swing.JTextField();
        txtTelefone = new javax.swing.JTextField();
        txtDataDeNascimento = new javax.swing.JTextField();
        txtCidade = new javax.swing.JTextField();
        lblEndereco = new javax.swing.JLabel();
        lblEstado = new javax.swing.JLabel();
        lblBairro = new javax.swing.JLabel();
        txtCep = new javax.swing.JTextField();
        txtBairro = new javax.swing.JTextField();
        txtEndereco = new javax.swing.JTextField();
        lblCidade = new javax.swing.JLabel();
        lblNumero = new javax.swing.JLabel();
        txtNumero = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        btnCEP = new javax.swing.JButton();
        comboEstado = new javax.swing.JComboBox<>();
        lblOk = new javax.swing.JLabel();
        RPConsulta = new javax.swing.JPanel();
        jSeparator3 = new javax.swing.JSeparator();
        lblConsulta = new javax.swing.JLabel();
        txtConsulta = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaClientesCadastrados = new javax.swing.JTable();
        jSeparator1 = new javax.swing.JSeparator();
        RPPanelBotoes = new javax.swing.JPanel();
        lblAdicionar = new javax.swing.JLabel();
        lblRemover = new javax.swing.JLabel();
        lblEditar = new javax.swing.JLabel();
        lblSalvar = new javax.swing.JLabel();
        lblCancelar = new javax.swing.JLabel();
        lblSair = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();

        setClosable(true);
        setResizable(true);
        setTitle("Área de Cadastro");
        setName("Área de Cadastro"); // NOI18N
        setOpaque(true);
        setPreferredSize(new java.awt.Dimension(1699, 851));
        setVisible(true);

        RPDesktop.setBackground(new java.awt.Color(51, 51, 51));

        RPFormulario.setBackground(new java.awt.Color(51, 51, 51));
        RPFormulario.setForeground(new java.awt.Color(255, 255, 255));

        lblNome.setBackground(new java.awt.Color(51, 51, 51));
        lblNome.setForeground(new java.awt.Color(255, 255, 255));
        lblNome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_name_40px_1.png"))); // NOI18N
        lblNome.setToolTipText("Nome");
        lblNome.setMaximumSize(new java.awt.Dimension(99, 40));
        lblNome.setMinimumSize(new java.awt.Dimension(99, 40));
        lblNome.setPreferredSize(new java.awt.Dimension(99, 40));

        lblEmail.setBackground(new java.awt.Color(51, 51, 51));
        lblEmail.setForeground(new java.awt.Color(255, 255, 255));
        lblEmail.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_email_sign_40px_1.png"))); // NOI18N
        lblEmail.setToolTipText("E-Mail");
        lblEmail.setMaximumSize(new java.awt.Dimension(99, 40));
        lblEmail.setMinimumSize(new java.awt.Dimension(99, 40));
        lblEmail.setPreferredSize(new java.awt.Dimension(99, 40));

        lblCep.setBackground(new java.awt.Color(51, 51, 51));
        lblCep.setForeground(new java.awt.Color(255, 255, 255));
        lblCep.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_postcode_40px.png"))); // NOI18N
        lblCep.setToolTipText("CEP");

        lblApelido.setBackground(new java.awt.Color(51, 51, 51));
        lblApelido.setForeground(new java.awt.Color(255, 255, 255));
        lblApelido.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_badge_40px.png"))); // NOI18N
        lblApelido.setToolTipText("Apelido");
        lblApelido.setPreferredSize(new java.awt.Dimension(99, 40));

        lblDataDeNascimento.setBackground(new java.awt.Color(51, 51, 51));
        lblDataDeNascimento.setForeground(new java.awt.Color(255, 255, 255));
        lblDataDeNascimento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_birthday_40px_1.png"))); // NOI18N
        lblDataDeNascimento.setToolTipText("Data de Nascimento");
        lblDataDeNascimento.setMaximumSize(new java.awt.Dimension(99, 40));
        lblDataDeNascimento.setMinimumSize(new java.awt.Dimension(99, 40));
        lblDataDeNascimento.setPreferredSize(new java.awt.Dimension(99, 40));

        lblTelefone.setBackground(new java.awt.Color(51, 51, 51));
        lblTelefone.setForeground(new java.awt.Color(255, 255, 255));
        lblTelefone.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_telephone_40px.png"))); // NOI18N
        lblTelefone.setToolTipText("Telefone");

        lblId.setBackground(new java.awt.Color(51, 51, 51));
        lblId.setForeground(new java.awt.Color(255, 255, 255));
        lblId.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_orcid_40px_1.png"))); // NOI18N
        lblId.setToolTipText("ID");
        lblId.setPreferredSize(new java.awt.Dimension(99, 40));

        txtApelido.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                txtApelidoActionPerformed(evt);
            }
        });

        txtEmail.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        txtEmail.setToolTipText("E-mail (Ex: cassiano23123@gmail.com)");
        txtEmail.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                txtEmailActionPerformed(evt);
            }
        });

        RestrictedTextField validarID = new RestrictedTextField(txtId);
        validarID.setOnlyNums(true);
        txtId.setEditable(false);
        txtId.setBackground(new java.awt.Color(240, 240, 240));
        txtId.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        txtId.setToolTipText("ID (somente números)");
        txtId.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                txtIdActionPerformed(evt);
            }
        });

        RestrictedTextField validarDDD = new RestrictedTextField(txtDDD);
        validarDDD.setOnlyNums(true);
        validarDDD.setLimit(2);
        txtDDD.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        txtDDD.setToolTipText("DDD (Ex: 19)");
        txtDDD.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                txtDDDActionPerformed(evt);
            }
        });

        txtNome.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        txtNome.setToolTipText("Nome (Ex: Cassiano Rodrigues de Oliveira)");
        txtNome.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                txtNomeActionPerformed(evt);
            }
        });

        RestrictedTextField validarTelefone = new RestrictedTextField(txtTelefone);
        validarTelefone.setOnlyNums(true);
        validarTelefone.setLimit(9);
        txtTelefone.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        txtTelefone.setToolTipText("Número (Ex: 3546-1684 ou 99403-4556)");
        txtTelefone.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                txtTelefoneActionPerformed(evt);
            }
        });

        txtDataDeNascimento.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        txtDataDeNascimento.setText("CLIQUE AQUI");
        txtDataDeNascimento.setToolTipText("");
        txtDataDeNascimento.setActionCommand("<Not Set>");
        txtDataDeNascimento.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                txtDataDeNascimentoActionPerformed(evt);
            }
        });

        txtCidade.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        txtCidade.setToolTipText("Endereço (Ex: Rua Ricardo Aparecido Pinto, 254 - Vila Real - Hortolândia - SP, 13183-091)");
        txtCidade.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                txtCidadeActionPerformed(evt);
            }
        });

        lblEndereco.setBackground(new java.awt.Color(51, 51, 51));
        lblEndereco.setForeground(new java.awt.Color(255, 255, 255));
        lblEndereco.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_location_40px_2.png"))); // NOI18N
        lblEndereco.setToolTipText("Endereço");

        lblEstado.setBackground(new java.awt.Color(51, 51, 51));
        lblEstado.setForeground(new java.awt.Color(255, 255, 255));
        lblEstado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_country_40px.png"))); // NOI18N
        lblEstado.setToolTipText("Estado");

        lblBairro.setBackground(new java.awt.Color(51, 51, 51));
        lblBairro.setForeground(new java.awt.Color(255, 255, 255));
        lblBairro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_apartment_40px.png"))); // NOI18N
        lblBairro.setToolTipText("Bairro");

        txtCep.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        txtCep.setToolTipText("Endereço (Ex: Rua Ricardo Aparecido Pinto, 254 - Vila Real - Hortolândia - SP, 13183-091)");
        RestrictedTextField validar = new RestrictedTextField(txtCep);
        validar.setOnlyNums(true);
        validar.setLimit(8);
        txtCep.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                txtCepActionPerformed(evt);
            }
        });

        txtBairro.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        txtBairro.setToolTipText("Endereço (Ex: Rua Ricardo Aparecido Pinto, 254 - Vila Real - Hortolândia - SP, 13183-091)");
        txtBairro.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                txtBairroActionPerformed(evt);
            }
        });

        txtEndereco.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        txtEndereco.setToolTipText("Endereço (Ex: Rua Ricardo Aparecido Pinto, 254 - Vila Real - Hortolândia - SP, 13183-091)");
        txtEndereco.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                txtEnderecoActionPerformed(evt);
            }
        });

        lblCidade.setBackground(new java.awt.Color(51, 51, 51));
        lblCidade.setForeground(new java.awt.Color(255, 255, 255));
        lblCidade.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_city_40px.png"))); // NOI18N
        lblCidade.setToolTipText("Cidade");

        lblNumero.setBackground(new java.awt.Color(51, 51, 51));
        lblNumero.setForeground(new java.awt.Color(255, 255, 255));
        lblNumero.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_home_address_40px.png"))); // NOI18N
        lblNumero.setToolTipText("Número Casa");

        RestrictedTextField validarNumero = new RestrictedTextField(txtNumero);
        validarNumero.setOnlyNums(true);
        validarNumero.setLimit(3);
        txtNumero.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        txtNumero.setToolTipText("Endereço (Ex: Rua Ricardo Aparecido Pinto, 254 - Vila Real - Hortolândia - SP, 13183-091)");
        txtNumero.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                txtNumeroActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_ask_question_50px.png"))); // NOI18N
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                jLabel1MouseClicked(evt);
            }
        });

        btnCEP.setBackground(new java.awt.Color(153, 153, 255));
        btnCEP.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnCEP.setText("Buscar CEP");
        btnCEP.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnCEPActionPerformed(evt);
            }
        });

        comboEstado.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        comboEstado.setForeground(new java.awt.Color(255, 0, 0));
        comboEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "'", "AC", "AL", "AP", "AM", "BA", "CE", "DF", "ES", "GO", "MA", "MT", "MS", "MG", "PA", "PB", "PR", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SC", "SP", "SE", "TO" }));
        comboEstado.setToolTipText("Estado");
        comboEstado.setName(""); // NOI18N
        comboEstado.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                comboEstadoActionPerformed(evt);
            }
        });

        lblOk.setBackground(new java.awt.Color(51, 51, 51));
        lblOk.setToolTipText("");
        lblOk.setPreferredSize(new java.awt.Dimension(60, 60));

        javax.swing.GroupLayout RPFormularioLayout = new javax.swing.GroupLayout(RPFormulario);
        RPFormulario.setLayout(RPFormularioLayout);
        RPFormularioLayout.setHorizontalGroup(
            RPFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RPFormularioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(RPFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(RPFormularioLayout.createSequentialGroup()
                        .addGroup(RPFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblTelefone)
                            .addComponent(lblId, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblNome, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(RPFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(RPFormularioLayout.createSequentialGroup()
                                .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblApelido, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtApelido, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 433, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(RPFormularioLayout.createSequentialGroup()
                                .addComponent(txtDDD, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(RPFormularioLayout.createSequentialGroup()
                        .addComponent(lblDataDeNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtDataDeNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(RPFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblEstado)
                    .addComponent(lblCidade)
                    .addComponent(lblBairro)
                    .addComponent(lblEndereco))
                .addGap(18, 18, 18)
                .addGroup(RPFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(RPFormularioLayout.createSequentialGroup()
                        .addGroup(RPFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 550, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(comboEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(50, 50, 50)
                        .addGroup(RPFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(RPFormularioLayout.createSequentialGroup()
                                .addComponent(lblCep)
                                .addGap(18, 18, 18)
                                .addGroup(RPFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(RPFormularioLayout.createSequentialGroup()
                                        .addComponent(btnCEP, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(lblOk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(txtCep, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(RPFormularioLayout.createSequentialGroup()
                                .addComponent(lblNumero)
                                .addGap(18, 18, 18)
                                .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(RPFormularioLayout.createSequentialGroup()
                        .addComponent(txtBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 550, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(RPFormularioLayout.createSequentialGroup()
                        .addComponent(txtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 550, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(197, 197, 197))))
        );
        RPFormularioLayout.setVerticalGroup(
            RPFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RPFormularioLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(RPFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(RPFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(RPFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(lblApelido, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtApelido, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCidade)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addGroup(RPFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(RPFormularioLayout.createSequentialGroup()
                        .addGroup(RPFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNome, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblNome, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(RPFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblTelefone, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, RPFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtDDD, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(RPFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(RPFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtDataDeNascimento, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblDataDeNascimento, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(RPFormularioLayout.createSequentialGroup()
                        .addGroup(RPFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(RPFormularioLayout.createSequentialGroup()
                                .addGroup(RPFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblEstado)
                                    .addComponent(comboEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(54, 54, 54)
                                .addGroup(RPFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblNumero)
                                    .addGroup(RPFormularioLayout.createSequentialGroup()
                                        .addGroup(RPFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(lblBairro)
                                            .addComponent(txtBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(RPFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtEndereco, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lblEndereco, javax.swing.GroupLayout.Alignment.TRAILING)))))
                            .addGroup(RPFormularioLayout.createSequentialGroup()
                                .addGroup(RPFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtCep, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblCep))
                                .addGroup(RPFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(RPFormularioLayout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(btnCEP, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, RPFormularioLayout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(lblOk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)))
                                .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(23, 23, 23))))
        );

        RPConsulta.setBackground(new java.awt.Color(51, 51, 51));
        RPConsulta.setForeground(new java.awt.Color(255, 255, 255));
        RPConsulta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        RPConsulta.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jSeparator3.setBackground(new java.awt.Color(102, 102, 102));
        jSeparator3.setForeground(new java.awt.Color(102, 102, 102));

        lblConsulta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_magnifying_glass_tilted_right_40px.png"))); // NOI18N
        lblConsulta.setToolTipText("Consulta");
        lblConsulta.setPreferredSize(new java.awt.Dimension(99, 40));
        lblConsulta.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                lblConsultaMouseClicked(evt);
            }
        });

        txtConsulta.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N

        tabelaClientesCadastrados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][]
            {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            }
            ,
            new String []
            {
                "Tabela 1", "Tabela 2", "Tabela 3", "Tabela 4"
            }
        ));
        tabelaClientesCadastrados.setColumnSelectionAllowed(true);
        tabelaClientesCadastrados.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tabelaClientesCadastrados.setShowHorizontalLines(true);
        tabelaClientesCadastrados.setShowVerticalLines(true);
        jScrollPane1.setViewportView(tabelaClientesCadastrados);

        javax.swing.GroupLayout RPConsultaLayout = new javax.swing.GroupLayout(RPConsulta);
        RPConsulta.setLayout(RPConsultaLayout);
        RPConsultaLayout.setHorizontalGroup(
            RPConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RPConsultaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(RPConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addComponent(jSeparator3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 1629, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(RPConsultaLayout.createSequentialGroup()
                        .addComponent(lblConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 481, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        RPConsultaLayout.setVerticalGroup(
            RPConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RPConsultaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(RPConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(200, Short.MAX_VALUE))
        );

        jSeparator1.setBackground(new java.awt.Color(51, 51, 51));
        jSeparator1.setForeground(new java.awt.Color(51, 51, 51));
        jSeparator1.setOpaque(true);

        RPDesktop.setLayer(RPFormulario, javax.swing.JLayeredPane.DEFAULT_LAYER);
        RPDesktop.setLayer(RPConsulta, javax.swing.JLayeredPane.DEFAULT_LAYER);
        RPDesktop.setLayer(jSeparator1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout RPDesktopLayout = new javax.swing.GroupLayout(RPDesktop);
        RPDesktop.setLayout(RPDesktopLayout);
        RPDesktopLayout.setHorizontalGroup(
            RPDesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RPDesktopLayout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(RPConsulta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(RPDesktopLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(RPFormulario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        RPDesktopLayout.setVerticalGroup(
            RPDesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RPDesktopLayout.createSequentialGroup()
                .addComponent(RPFormulario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(RPDesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(RPConsulta, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1006, 1006, 1006))
        );

        RPPanelBotoes.setBackground(new java.awt.Color(0, 0, 0));
        RPPanelBotoes.setPreferredSize(new java.awt.Dimension(206, 851));

        lblAdicionar.setBackground(new java.awt.Color(0, 0, 0));
        lblAdicionar.setDisplayedMnemonic('a');
        lblAdicionar.setForeground(new java.awt.Color(255, 255, 255));
        lblAdicionar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_add_70px.png"))); // NOI18N
        lblAdicionar.setToolTipText("Adicionar");
        lblAdicionar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblAdicionar.setOpaque(true);
        lblAdicionar.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                lblAdicionarMouseClicked(evt);
            }
        });

        lblRemover.setBackground(new java.awt.Color(0, 0, 0));
        lblRemover.setForeground(new java.awt.Color(255, 255, 255));
        lblRemover.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_delete_70px.png"))); // NOI18N
        lblRemover.setToolTipText("Remover");
        lblRemover.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblRemover.setOpaque(true);
        lblRemover.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                lblRemoverMouseClicked(evt);
            }
        });

        lblEditar.setBackground(new java.awt.Color(0, 0, 0));
        lblEditar.setForeground(new java.awt.Color(255, 255, 255));
        lblEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_edit_70px.png"))); // NOI18N
        lblEditar.setToolTipText("Editar");
        lblEditar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblEditar.setOpaque(true);
        lblEditar.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                lblEditarMouseClicked(evt);
            }
        });

        lblSalvar.setBackground(new java.awt.Color(0, 0, 0));
        lblSalvar.setForeground(new java.awt.Color(255, 255, 255));
        lblSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_save_as_70px.png"))); // NOI18N
        lblSalvar.setToolTipText("Salvar");
        lblSalvar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblSalvar.setOpaque(true);
        lblSalvar.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                lblSalvarMouseClicked(evt);
            }
        });

        lblCancelar.setBackground(new java.awt.Color(0, 0, 0));
        lblCancelar.setForeground(new java.awt.Color(255, 255, 255));
        lblCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_cancel_70px.png"))); // NOI18N
        lblCancelar.setToolTipText("Cancelar Cadastro");
        lblCancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblCancelar.setOpaque(true);
        lblCancelar.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                lblCancelarMouseClicked(evt);
            }
        });

        lblSair.setBackground(new java.awt.Color(255, 255, 255));
        lblSair.setDisplayedMnemonic('e');
        lblSair.setForeground(new java.awt.Color(255, 255, 255));
        lblSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_fire_exit_100px.png"))); // NOI18N
        lblSair.setToolTipText("Sair do Programa");
        lblSair.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblSair.setName("Sair"); // NOI18N
        lblSair.setPreferredSize(new java.awt.Dimension(100, 100));
        lblSair.addMouseMotionListener(new java.awt.event.MouseMotionAdapter()
        {
            public void mouseMoved(java.awt.event.MouseEvent evt)
            {
                lblSairMouseMoved(evt);
            }
        });
        lblSair.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                lblSairMouseClicked(evt);
            }
        });

        jSeparator2.setBackground(new java.awt.Color(51, 51, 51));
        jSeparator2.setForeground(new java.awt.Color(51, 51, 51));
        jSeparator2.setOpaque(true);

        javax.swing.GroupLayout RPPanelBotoesLayout = new javax.swing.GroupLayout(RPPanelBotoes);
        RPPanelBotoes.setLayout(RPPanelBotoesLayout);
        RPPanelBotoesLayout.setHorizontalGroup(
            RPPanelBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RPPanelBotoesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(RPPanelBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(RPPanelBotoesLayout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(RPPanelBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblSalvar)
                            .addComponent(lblEditar)
                            .addComponent(lblRemover)
                            .addComponent(lblAdicionar)
                            .addComponent(lblCancelar))
                        .addGap(23, 23, 23))
                    .addGroup(RPPanelBotoesLayout.createSequentialGroup()
                        .addComponent(jSeparator2)
                        .addContainerGap())
                    .addGroup(RPPanelBotoesLayout.createSequentialGroup()
                        .addComponent(lblSair, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        RPPanelBotoesLayout.setVerticalGroup(
            RPPanelBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RPPanelBotoesLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(lblAdicionar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblRemover)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblEditar)
                .addGap(82, 82, 82)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblSalvar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblCancelar)
                .addGap(231, 231, 231)
                .addComponent(lblSair, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        lblAdicionar.getAccessibleContext().setAccessibleName("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(RPPanelBotoes, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(RPDesktop))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(RPDesktop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(RPPanelBotoes, javax.swing.GroupLayout.DEFAULT_SIZE, 2012, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    //
    //
    //
    //


    private void lblSairMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSairMouseMoved
    }//GEN-LAST:event_lblSairMouseMoved
    private void lblSairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSairMouseClicked
        int confirm = JOptionPane.showConfirmDialog(this, "Deseja salvar antes de sair?", "Sair", JOptionPane.YES_NO_OPTION);
        if (confirm == JOptionPane.YES_OPTION)
        {
            salvarCadastrosEmArquivo(this.cadastroDAO); 
        }
        this.dispose(); // Fecha a JInternalFrame

    }//GEN-LAST:event_lblSairMouseClicked
    private void txtApelidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtApelidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtApelidoActionPerformed
    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailActionPerformed
    private void txtIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdActionPerformed
    private void txtDDDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDDDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDDDActionPerformed
    private void txtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeActionPerformed
    private void txtTelefoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelefoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelefoneActionPerformed
    private void txtDataDeNascimentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDataDeNascimentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDataDeNascimentoActionPerformed
    private void txtCidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCidadeActionPerformed

    }//GEN-LAST:event_txtCidadeActionPerformed
    private void lblAdicionarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAdicionarMouseClicked
        habilitarBotoes(false);
        habilitarCamposDeTexto(false);
        txtCep.setEnabled(true);
        btnCEP.setEnabled(true);
        txtCep.requestFocus();

        // Gera o próximo ID
        Long proximoId = cadastroDAO.getProximoId();
        txtId.setText(String.valueOf(proximoId));  //  Preenche o campo de ID automaticamente
        txtId.setEditable(false);
        txtConsulta.setEnabled(false);

    }//GEN-LAST:event_lblAdicionarMouseClicked
    private boolean modoExclusao = false;
    private void lblRemoverMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRemoverMouseClicked
        habilitarBotoes(false);
        habilitarCamposDeTexto(false);
        txtConsulta.setEnabled(true);
        txtConsulta.requestFocus();

        // Buscar o cadastro pelo ID ou Nome
        String consulta = txtConsulta.getText().trim();
        Cadastro cadastro = cadastroDAO.buscarPorIdOuNome(consulta);

        //Gerar Confirmação se deseja excluir mesmo 
        if (cadastro != null)
        {
            int confirm = JOptionPane.showConfirmDialog(this, "Tem certeza que deseja excluir o cadastro?", "Excluir", JOptionPane.YES_NO_OPTION);
            if (confirm == JOptionPane.YES_OPTION)
            {
                cadastroDAO.excluir(cadastro.getId());
                atualizarTabela();
                limparCaixaDeTexto();
                JOptionPane.showMessageDialog(this, "Cadastro excluído com sucesso!", "Exclusão", JOptionPane.INFORMATION_MESSAGE);
            }
        } else
        {
            JOptionPane.showMessageDialog(this, "Cadastro não encontrado!", "Erro", JOptionPane.ERROR_MESSAGE);
        }

        habilitarBotoes(true);
        habilitarCamposDeTexto(false);
        txtConsulta.setEnabled(true);
    }//GEN-LAST:event_lblRemoverMouseClicked
    private void lblEditarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblEditarMouseClicked

        modoAlteracao = true;
        habilitarBotoes(false);
        habilitarCamposDeTexto(true);

        String consulta = txtConsulta.getText().trim();
        Cadastro cadastro = cadastroDAO.buscarPorIdOuNome(consulta);

        if (cadastro != null)
        {
            preencherCampos(cadastro);
            txtConsulta.setEnabled(false);
        } else
        {
            JOptionPane.showMessageDialog(this, "Informação não encontrada!");
        }

    }//GEN-LAST:event_lblEditarMouseClicked
    private boolean modoAlteracao = false;
    private void lblSalvarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSalvarMouseClicked
        if (modoAlteracao)
        {
            try
            {
                Cadastro cadastroAlterado = criarCadastro();
                cadastroDAO.alterar(cadastroAlterado);
                atualizarTabela();
                limparCaixaDeTexto();
                JOptionPane.showMessageDialog(this, "Cadastro alterado com sucesso!");
                habilitarBotoes(true);
                habilitarCamposDeTexto(false);
                txtConsulta.setEnabled(true);
                modoAlteracao = false;
            } catch (IllegalArgumentException e)
            {
                JOptionPane.showMessageDialog(this, e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
            }
        } else
        {
            // Verificar duplicidade apenas quando for adicionar
            String nomeCadastro = txtNome.getText().trim();
            String dataDeNascimentoCadastro = txtDataDeNascimento.getText().trim();
            //Filtro de verificacao dos dados que eu quero ver a duplciidade
            if (cadastroDAO.existeCadastroDuplicado(nomeCadastro, dataDeNascimentoCadastro))
            {
                JOptionPane.showMessageDialog(null, "Cliente já se encontra cadastrado.", "Atenção", JOptionPane.INFORMATION_MESSAGE);
                return;
            }
            try
            {
                Cadastro cadastroCliente = criarCadastro(); // Cria o novo cadastro com os dados dos campos de texto
                Boolean isCadastrado = this.cadastroDAO.cadastrar(cadastroCliente);
                if (isCadastrado)
                {
                    modelo.addRow(new Object[]
                    {
                        cadastroCliente.getId(), cadastroCliente.getApelido(), cadastroCliente.getNome(),
                        cadastroCliente.getDatadenascimento(), cadastroCliente.getEndereco(), cadastroCliente.getNumero(),
                        cadastroCliente.getEstado(), cadastroCliente.getCidade(), cadastroCliente.getBairro(),
                        cadastroCliente.getCep(), cadastroCliente.getDdd(), cadastroCliente.getTelefone(),
                        cadastroCliente.getEmail()
                    });
                    limparCaixaDeTexto();
                    JOptionPane.showMessageDialog(null, "Cadastro salvo com sucesso!");
                    habilitarBotoes(true);
                    habilitarCamposDeTexto(false);
                    txtConsulta.setEnabled(true);
                } else
                {
                    JOptionPane.showMessageDialog(null, "Cliente já se encontra cadastrado.", "Atenção", JOptionPane.INFORMATION_MESSAGE);
                }
            } catch (IllegalArgumentException e)
            {
                JOptionPane.showMessageDialog(this, e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_lblSalvarMouseClicked
    private void lblCancelarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCancelarMouseClicked
        habilitarBotoes(true);
        habilitarCamposDeTexto(false);
        txtConsulta.setEnabled(true);
        limparCaixaDeTexto();
    }//GEN-LAST:event_lblCancelarMouseClicked

    private void txtCepActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_txtCepActionPerformed
    {//GEN-HEADEREND:event_txtCepActionPerformed

    }//GEN-LAST:event_txtCepActionPerformed
    private void txtBairroActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_txtBairroActionPerformed
    {//GEN-HEADEREND:event_txtBairroActionPerformed

    }//GEN-LAST:event_txtBairroActionPerformed
    private void txtEnderecoActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_txtEnderecoActionPerformed
    {//GEN-HEADEREND:event_txtEnderecoActionPerformed

    }//GEN-LAST:event_txtEnderecoActionPerformed
    private void txtNumeroActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_txtNumeroActionPerformed
    {//GEN-HEADEREND:event_txtNumeroActionPerformed

    }//GEN-LAST:event_txtNumeroActionPerformed
    private void btnCEPActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnCEPActionPerformed
    {//GEN-HEADEREND:event_btnCEPActionPerformed

        if (txtCep.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null, "Por Favor, Informe o CEP", "Atenção !!!", JOptionPane.ERROR_MESSAGE);
            txtCep.requestFocus();
        } else
        {
            buscarCep();
        }
    }//GEN-LAST:event_btnCEPActionPerformed
    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_jLabel1MouseClicked
    {//GEN-HEADEREND:event_jLabel1MouseClicked
        ReProDialogSobre sobre = new ReProDialogSobre();
        sobre.setVisible(true);
    }//GEN-LAST:event_jLabel1MouseClicked
    private void comboEstadoActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_comboEstadoActionPerformed
    {//GEN-HEADEREND:event_comboEstadoActionPerformed
    }//GEN-LAST:event_comboEstadoActionPerformed
    private void lblConsultaMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_lblConsultaMouseClicked
    {//GEN-HEADEREND:event_lblConsultaMouseClicked
    }//GEN-LAST:event_lblConsultaMouseClicked

    private void habilitarBotoes(boolean estado)
    {
        lblAdicionar.setEnabled(estado);
        lblRemover.setEnabled(estado);
        lblEditar.setEnabled(estado);
        lblSalvar.setEnabled(!estado);
        lblCancelar.setEnabled(!estado);

    }

    private void habilitarCamposDeTexto(boolean estado)
    {
        txtApelido.setEnabled(estado);
        txtEmail.setEnabled(estado);
        txtDDD.setEnabled(estado);
        txtNome.setEnabled(estado);
        txtTelefone.setEnabled(estado);
        txtDataDeNascimento.setEnabled(estado);
        txtCidade.setEnabled(estado);
        txtEndereco.setEnabled(estado);
        comboEstado.setEnabled(estado);
        txtNumero.setEnabled(estado);
        txtBairro.setEnabled(estado);

        if (estado == true)
        {
            txtApelido.setBackground(new java.awt.Color(240, 240, 240));
            txtEmail.setBackground(new java.awt.Color(240, 240, 240));
            txtDDD.setBackground(new java.awt.Color(240, 240, 240));
            txtNome.setBackground(new java.awt.Color(240, 240, 240));
            txtTelefone.setBackground(new java.awt.Color(240, 240, 240));
            txtDataDeNascimento.setBackground(new java.awt.Color(240, 240, 240));
            txtCidade.setBackground(new java.awt.Color(204, 204, 204));
            txtEndereco.setBackground(new java.awt.Color(204, 204, 204));
            comboEstado.setBackground(new java.awt.Color(204, 204, 204));
            txtNumero.setBackground(new java.awt.Color(240, 240, 240));
            txtBairro.setBackground(new java.awt.Color(204, 204, 204));
        } else
        {
            txtApelido.setBackground(new java.awt.Color(102, 102, 102));
            txtEmail.setBackground(new java.awt.Color(102, 102, 102));
            txtDDD.setBackground(new java.awt.Color(102, 102, 102));
            txtNome.setBackground(new java.awt.Color(102, 102, 102));
            txtTelefone.setBackground(new java.awt.Color(102, 102, 102));
            txtDataDeNascimento.setBackground(new java.awt.Color(102, 102, 102));
            txtCidade.setBackground(new java.awt.Color(102, 102, 102));
            txtEndereco.setBackground(new java.awt.Color(102, 102, 102));
            comboEstado.setBackground(new java.awt.Color(102, 102, 102));
            txtNumero.setBackground(new java.awt.Color(102, 102, 102));
            txtBairro.setBackground(new java.awt.Color(102, 102, 102));
        }
    }

    private void limparCaixaDeTexto()
    {
        txtApelido.setText(null);
        txtEmail.setText(null);
        txtDDD.setText(null);
        txtNome.setText(null);
        txtTelefone.setText(null);
        txtDataDeNascimento.setText(null);
        txtId.setText(null);
        txtCidade.setText(null);
        txtEndereco.setText(null);
        txtNumero.setText(null);
        txtBairro.setText(null);
        txtCep.setText(null);
        comboEstado.setSelectedIndex(0);
    }

    private void preencherCampos(Cadastro cadastro)
    {
        txtId.setText(String.valueOf(cadastro.getId()));
        txtNome.setText(cadastro.getNome());
        txtApelido.setText(cadastro.getApelido());
        txtCep.setText(String.valueOf(cadastro.getCep()));
        txtEndereco.setText(cadastro.getEndereco());
        txtNumero.setText(String.valueOf(cadastro.getNumero()));
        comboEstado.setSelectedItem(cadastro.getEstado());
        txtCidade.setText(cadastro.getCidade());
        txtBairro.setText(cadastro.getBairro());
        txtDDD.setText(String.valueOf(cadastro.getDdd()));
        txtTelefone.setText(String.valueOf(cadastro.getTelefone()));
        txtEmail.setText(cadastro.getEmail());
        txtDataDeNascimento.setText(cadastro.getDatadenascimento());
    }

    private void buscarCep()
    {
        String logradouro = "";
        String tipoLogradouro = "";
        String resultado = null;
        String cep = txtCep.getText().trim();
        try
        {
            URL url = new URL("http://cep.republicavirtual.com.br/web_cep.php?cep=" + cep + "&formato=xml/");
            SAXReader xml = new SAXReader();
            Document documento = xml.read(url);
            Element root = documento.getRootElement();

            for (Iterator<Element> it = root.elementIterator(); it.hasNext();)
            {
                Element element = it.next();
                if (element.getQualifiedName().equals("cidade"))
                {
                    txtCidade.setText(element.getText());
                }
                if (element.getQualifiedName().equals("bairro"))
                {
                    txtBairro.setText(element.getText());
                }
                if (element.getQualifiedName().equals("uf"))
                {
                    comboEstado.setSelectedItem(element.getText());
                }
                if (element.getQualifiedName().equals("tipo_logradouro"))
                {
                    tipoLogradouro = element.getText();
                }
                if (element.getQualifiedName().equals("logradouro"))
                {
                    logradouro = element.getText();
                }
                if (element.getQualifiedName().equals("resultado"))
                {
                    resultado = element.getText();
                    if (resultado.equals("1"))
                    {
                        lblOk.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_approval_60px.png/")));
                        habilitarCamposDeTexto(true);
                        txtNome.requestFocus();
                        txtCep.setEnabled(false);
                        txtApelido.requestFocus();
                    } else
                    {
                        JOptionPane.showMessageDialog(null, "CEP não encontrado! Tente novamente.");
                    }
                }
            }
            txtEndereco.setText(tipoLogradouro + " " + logradouro);
        } catch (Exception e)
        {
            System.out.println(e);
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel RPConsulta;
    private javax.swing.JDesktopPane RPDesktop;
    private javax.swing.JPanel RPFormulario;
    private javax.swing.JPanel RPPanelBotoes;
    private javax.swing.JButton btnCEP;
    private javax.swing.JComboBox<String> comboEstado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JLabel lblAdicionar;
    private javax.swing.JLabel lblApelido;
    private javax.swing.JLabel lblBairro;
    private javax.swing.JLabel lblCancelar;
    private javax.swing.JLabel lblCep;
    private javax.swing.JLabel lblCidade;
    private javax.swing.JLabel lblConsulta;
    private javax.swing.JLabel lblDataDeNascimento;
    private javax.swing.JLabel lblEditar;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblEndereco;
    private javax.swing.JLabel lblEstado;
    private javax.swing.JLabel lblId;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblNumero;
    private javax.swing.JLabel lblOk;
    private javax.swing.JLabel lblRemover;
    private javax.swing.JLabel lblSair;
    private javax.swing.JLabel lblSalvar;
    private javax.swing.JLabel lblTelefone;
    private javax.swing.JTable tabelaClientesCadastrados;
    private javax.swing.JTextField txtApelido;
    private javax.swing.JTextField txtBairro;
    private javax.swing.JTextField txtCep;
    private javax.swing.JTextField txtCidade;
    private javax.swing.JTextField txtConsulta;
    private javax.swing.JTextField txtDDD;
    private javax.swing.JTextField txtDataDeNascimento;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtEndereco;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtNumero;
    private javax.swing.JTextField txtTelefone;
    // End of variables declaration//GEN-END:variables

    private void atualizarTabela()
    {
        DefaultTableModel modelo = (DefaultTableModel) tabelaClientesCadastrados.getModel();
        modelo.setRowCount(0);

        for (Cadastro cadastro : cadastroDAO.getTodos())
        {
            modelo.addRow(new Object[]
            {
                cadastro.getId(), cadastro.getApelido(), cadastro.getNome(), cadastro.getDatadenascimento(), cadastro.getEndereco(), cadastro.getNumero(), cadastro.getEstado(), cadastro.getCidade(),
                cadastro.getBairro(), cadastro.getCep(), cadastro.getTelefone(), cadastro.getEmail()
            });
        }

    }

    private Cadastro criarCadastro()
    {
        try
        {
            String id = txtId.getText().trim();
            String apelido = txtApelido.getText().trim();
            String nome = txtNome.getText().trim();
            String dataNascimento = txtDataDeNascimento.getText().trim();
            String endereco = txtEndereco.getText().trim();
            String numero = txtNumero.getText().trim();
            String estado = comboEstado.getSelectedItem().toString();
            String cidade = txtCidade.getText().trim();
            String bairro = txtBairro.getText().trim();
            String cep = txtCep.getText().trim();
            String ddd = txtDDD.getText().trim();
            String telefone = txtTelefone.getText().trim();
            String email = txtEmail.getText().trim();

            if (id.isEmpty() || apelido.isEmpty() || nome.isEmpty() || dataNascimento.isEmpty()
                    || endereco.isEmpty() || numero.isEmpty() || estado.isEmpty() || cidade.isEmpty()
                    || bairro.isEmpty() || cep.isEmpty() || ddd.isEmpty() || telefone.isEmpty() || email.isEmpty())
            {
                throw new IllegalArgumentException("Preencha todos os dados!");
            }

            return new Cadastro(id, apelido, nome, dataNascimento, endereco, numero, estado, cidade, bairro, cep, ddd, telefone, email);

        } catch (NumberFormatException e)
        {
            throw new IllegalArgumentException("Campo invalido!");
        }
    }

    //Parametro para ajustar o tamanho das cedulas
    /*  String id = "23213";
        String apelido = "llevyperuchi";
        String nome = "Lucas Levy Peruchi";
        String dataNascimento = "13/04/1989";
        String endereco = "Alameda das Flores";
        String numero = "252";
        String estado = "SP";
        String cidade = "Cordeirópolis";
        String bairro = "Vila Barbosa";
        String cep = "13490000";
        String ddd = "19";
        String telefone = "999501304";
        String email = "lucaslevyperuchi@gmail.com";
        Cadastro cadastroCliente = new Cadastro(id, apelido, nome, dataNascimento, endereco, numero, estado, cidade, bairro, cep, ddd, telefone, email);
        modelo.addRow(new Object[]
        {
            cadastroCliente.getId(), cadastroCliente.getApelido(), cadastroCliente.getNome(),
            cadastroCliente.getDatadenascimento(), cadastroCliente.getEndereco(), cadastroCliente.getNumero(),
            cadastroCliente.getEstado(), cadastroCliente.getCidade(), cadastroCliente.getBairro(),
            cadastroCliente.getCep(), cadastroCliente.getDdd(), cadastroCliente.getTelefone(),
            cadastroCliente.getEmail()
        });*/
    //
    //
    public static void salvarCadastrosEmArquivo(ICadastroDAO cadastroDAO)
    {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("cadastros.txt")))
        {
            for (Cadastro cadastro : cadastroDAO.getTodos())
            {
                writer.write(cadastro.toString());
                writer.newLine();
            }
            JOptionPane.showMessageDialog(null, "Cliente cadastrado com sucesso!!!", "Salvar", JOptionPane.INFORMATION_MESSAGE);
        } catch (IOException e)
        {
            JOptionPane.showMessageDialog(null, "ERRO AO SALVAR " + e.getMessage(), "ATENÇÃO !!!!", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void carregarCadastrosDeArquivo()
    {
        try (BufferedReader reader = new BufferedReader(new FileReader("cadastros.txt")))
        {
            String linha;
            while ((linha = reader.readLine()) != null)
            {
                Cadastro cadastro = Cadastro.fromString(linha); // Converte a linha do arquivo em objeto Cadastro
                cadastroDAO.cadastrar(cadastro); // Adiciona o cadastro ao Map/DAO
                modelo.addRow(new Object[]
                { // Adiciona o cadastro à tabela
                    cadastro.getId(), cadastro.getApelido(), cadastro.getNome(),
                    cadastro.getDatadenascimento(), cadastro.getEndereco(),
                    cadastro.getNumero(), cadastro.getEstado(), cadastro.getCidade(),
                    cadastro.getBairro(), cadastro.getCep(), cadastro.getDdd(),
                    cadastro.getTelefone(), cadastro.getEmail()
                });
            }
            JOptionPane.showMessageDialog(this, "Cadastro carregado com sucesso!", "Carregar", JOptionPane.INFORMATION_MESSAGE);
        } catch (FileNotFoundException e)
        {
            JOptionPane.showMessageDialog(this, "Arquivo não encontrado. Possível problema com os dados salvo.", "Aviso", JOptionPane.WARNING_MESSAGE);
        } catch (IOException e)
        {
            JOptionPane.showMessageDialog(this, "ERRO AO CARREGAR " + e.getMessage(), "ATENÇãO !!!!", JOptionPane.ERROR_MESSAGE);
            System.out.println(e);
        }
    }

}
