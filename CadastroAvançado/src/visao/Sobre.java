package visao;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Desktop;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.Toolkit;
import java.net.URI;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;

public class Sobre extends JDialog implements MouseListener {

	private static final long serialVersionUID = 1L;
	private JLabel lblNomePrograma;
	private JLabel lblAuthor;
	private JLabel lblWebService;
	private JLabel lblSite;
	private JButton btnGitHub;
	private JButton btnLinkedin;
	private JButton btnWhatsApp;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			Sobre dialog = new Sobre();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public Sobre() {
		//Isso serve para nao deixar a pessoa abrir varios pop-ups
		setModal(true);
		setFont(new Font("Dialog", Font.PLAIN, 21));
		setTitle("Sobre");
		setResizable(false);
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Lucas\\Documents\\GitHub\\Projetos\\CadastroAvançado\\src\\img\\home.png"));
		//Aqui serve (eixo x pixels, eixo y pixels, largura e altura)
		setBounds(580,180,620, 465);
		getContentPane().setLayout(null);
		
		lblNomePrograma = new JLabel("Sistema de cadastro  v1.0      ");
		lblNomePrograma.setFont(new Font("Segoe UI", Font.BOLD, 21));
		lblNomePrograma.setBounds(37, 46, 295, 27);
		getContentPane().add(lblNomePrograma);
		
		lblAuthor = new JLabel("@Author Lucas Levy Peruchi");
		lblAuthor.setFont(new Font("Segoe UI", Font.ITALIC, 17));
		lblAuthor.setBounds(37, 73, 282, 27);
		getContentPane().add(lblAuthor);
		
		lblWebService = new JLabel("WEB Service");
		lblWebService.setFont(new Font("Segoe UI", Font.BOLD | Font.ITALIC, 11));
		lblWebService.setBounds(37, 126, 67, 27);
		getContentPane().add(lblWebService);
		
		lblSite = new JLabel("republicavirtual.com.br");
		lblSite.addMouseListener(this);
		lblSite.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblSite.setForeground(SystemColor.textHighlight);
		lblSite.setBounds(106, 126, 138, 27);
		getContentPane().add(lblSite);
		
		btnGitHub = new JButton("");
		btnGitHub.addMouseListener(this);
		btnGitHub.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnGitHub.setName("GitHub");
		btnGitHub.setIcon(new ImageIcon("C:\\Users\\Lucas\\Documents\\GitHub\\Projetos\\CadastroAvançado\\src\\img\\github.png"));
		btnGitHub.setToolTipText("GItHub");
		btnGitHub.setBorder(null);
		btnGitHub.setBackground(new Color(240, 240, 240));
		btnGitHub.setBounds(51, 340, 48, 48);
		getContentPane().add(btnGitHub);
		
		btnLinkedin = new JButton("");
		btnLinkedin.addMouseListener(this);
		btnLinkedin.setBorder(null);
		btnLinkedin.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnLinkedin.setIcon(new ImageIcon("C:\\Users\\Lucas\\Documents\\GitHub\\Projetos\\CadastroAvançado\\src\\img\\Linkedin2.png"));
		btnLinkedin.setToolTipText("Linkedin");
		btnLinkedin.setBackground(new Color(240, 240, 240));
		btnLinkedin.setBounds(109, 340, 48, 48);
		getContentPane().add(btnLinkedin);
		
		btnWhatsApp = new JButton("");
		btnWhatsApp.addMouseListener(this);
		btnWhatsApp.setIcon(new ImageIcon("C:\\Users\\Lucas\\Documents\\GitHub\\Projetos\\CadastroAvançado\\src\\img\\WhatsApp.png"));
		btnWhatsApp.setBorder(null);
		btnWhatsApp.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnWhatsApp.setToolTipText("WhatsApp");
		btnWhatsApp.setBackground(new Color(240, 240, 240));
		btnWhatsApp.setBounds(167, 340, 48, 48);
		getContentPane().add(btnWhatsApp);
	}
	
	//metodo responsável para abrir sites nos botoes
	
	private void link(String site) {
		Desktop desktop = Desktop.getDesktop();
		try {
			URI uri = new URI(site);
			desktop.browse(uri);
		}catch(Exception e){
			System.out.println(e);
			
		}
	}
	//acao com um clique do mouse para abrir o website
	public void mouseClicked(MouseEvent e) {
		if (e.getSource() == btnWhatsApp) {
			mouseClickedBtnWhatsApp(e);
			link("https://github.com/llpti2024/");
		}
		if (e.getSource() == btnLinkedin) {
			mouseClickedBtnLinkedin(e);
			link("https://github.com/llpti2024/");
		}
		if (e.getSource() == btnGitHub) {
			mouseClickedBtnGitHub(e);
			link("https://github.com/llpti2024/");
		}
		if (e.getSource() == lblSite) {
			mouseClickedLblSite(e);
			link("http://www.republicavirtual.com.br/");
		}
	}
	public void mouseEntered(MouseEvent e) {
	}
	public void mouseExited(MouseEvent e) {
	}
	public void mousePressed(MouseEvent e) {
	}
	public void mouseReleased(MouseEvent e) {
	}
	protected void mouseClickedLblSite(MouseEvent e) {
	}
	protected void mouseClickedBtnGitHub(MouseEvent e) {
	}
	protected void mouseClickedBtnLinkedin(MouseEvent e) {
	}
	protected void mouseClickedBtnWhatsApp(MouseEvent e) {
	}
}
