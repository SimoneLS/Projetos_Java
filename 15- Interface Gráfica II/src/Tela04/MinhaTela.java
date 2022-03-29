package Tela04;

import java.awt.*;
import javax.swing.*; //pacote obrigat�rio para usar swing

public class MinhaTela extends JFrame { 
	
	JLabel lblCodigo = new JLabel ("C�digo");
	JTextField txtCodigo = new JTextField(5);
	
	JLabel lblNome = new JLabel("Nome:"); //Nome visivel
	JTextField txtNome = new JTextField(40); //Campo e identifica��o do campo
	
	JLabel lblEndereco = new JLabel("Endere�o:");
	JTextField txtEndereco = new JTextField(50);
	
	JLabel lblBairro = new JLabel("Bairro:");
	JTextField txtBairro = new JTextField(35);
	
	JLabel lblCidade = new JLabel("Cidade:");
	JTextField txtCidade = new JTextField(35);
	
	JLabel lblEstado = new JLabel("Estado: ");
	String [] estado = {"Selecione", "Acre", "Alagoas", "Amap�", "Amazonas", "Bahia", "Cear�", "Distrito Federal", "Esp�rito Santo", "Goi�s", "Maranh�o", "Mato Grosso", "Mato Grosso do Sul", "Minas Gerais", "Par�", "Para�ba", "Paran�", "Pernambuco", "Piau�", "Roraima", "Rond�nia", "Rio de Janeiro", "Rio Grande do Norte", "Rio Grande do Sul", "Santa Catarina", "S�o Paulo", "Sergipe", "Tocantins"};
	JComboBox cboEstado = new JComboBox(estado);
	
	JLabel lblCep = new JLabel("Cep:");
	JTextField txtCep = new JTextField(10);
	
	JLabel lblTelefone = new JLabel("Telefone:");
	JTextField txtTelefone = new JTextField(15);
	
	JLabel lblObs = new JLabel("Observa��es:");
	JTextField txtObs = new JTextField(200);
	
	JButton btnNovo = new JButton("Novo");
	JButton btnAlterar = new JButton("Alterar");
	JButton btnExcluir = new JButton("Excluir");
	JButton btnSalvar = new JButton("Salvar");
	JButton btnRelat�rio = new JButton("Relat�rio");
	JButton btnRetornar = new JButton("Retorna");
	
	public MinhaTela() {
		//FlowLayout. Ocorre quando os componentes GUI s�o colocados em um cont�iner da esquerda para a direita na ordem em que s�o colocadas.
		
		public JPanel createGridWithJPanels(JPanel[] items, int rows, int columns) {
			GridLayout layout = new GridLayout(rows, columns);
			layout.setVgap(10);
			JPanel panel = new JPanel(layout);
			for (JPanel item : items) {
				panel.add(item);
			}
			return panel;
		}
		

		
		setLayout(new GridLayout(0,1));
		setTitle("Cart�o da Loja");  
	    setSize(550, 450);//Defini��o do tamanho da janela 
	    c.setBackground(Color.white);

		c.add(lblCodigo);
		c.add(txtCodigo);
		c.add(lblNome);
		c.add(txtNome);
		c.add(lblEndereco);
		c.add(txtEndereco);
		c.add(lblBairro);
		c.add(txtBairro);
		c.add(lblCidade);
		c.add(txtCidade);
		c.add(lblEstado);
		c.add(cboEstado);
		c.add(lblCep);
		c.add(txtCep);		
		c.add(lblTelefone);
		c.add(txtTelefone);
		c.add(lblObs);
		c.add(txtObs);
		c.add(btnNovo);
		c.add(btnAlterar);
		c.add(btnExcluir);
		c.add(btnSalvar);
		c.add(btnRelat�rio);
		c.add(btnRetornar);
		
		setVisible(true);
		pack();
	}
}
