package Tela04;

import java.awt.*;
import javax.swing.*; //pacote obrigatório para usar swing

public class MinhaTela extends JFrame { 
	
	JLabel lblCodigo = new JLabel ("Código");
	JTextField txtCodigo = new JTextField(5);
	
	JLabel lblNome = new JLabel("Nome:"); //Nome visivel
	JTextField txtNome = new JTextField(40); //Campo e identificação do campo
	
	JLabel lblEndereco = new JLabel("Endereço:");
	JTextField txtEndereco = new JTextField(50);
	
	JLabel lblBairro = new JLabel("Bairro:");
	JTextField txtBairro = new JTextField(35);
	
	JLabel lblCidade = new JLabel("Cidade:");
	JTextField txtCidade = new JTextField(35);
	
	JLabel lblEstado = new JLabel("Estado: ");
	String [] estado = {"Selecione", "Acre", "Alagoas", "Amapá", "Amazonas", "Bahia", "Ceará", "Distrito Federal", "Espírito Santo", "Goiás", "Maranhão", "Mato Grosso", "Mato Grosso do Sul", "Minas Gerais", "Pará", "Paraíba", "Paraná", "Pernambuco", "Piauí", "Roraima", "Rondônia", "Rio de Janeiro", "Rio Grande do Norte", "Rio Grande do Sul", "Santa Catarina", "São Paulo", "Sergipe", "Tocantins"};
	JComboBox cboEstado = new JComboBox(estado);
	
	JLabel lblCep = new JLabel("Cep:");
	JTextField txtCep = new JTextField(10);
	
	JLabel lblTelefone = new JLabel("Telefone:");
	JTextField txtTelefone = new JTextField(15);
	
	JLabel lblObs = new JLabel("Observações:");
	JTextField txtObs = new JTextField(200);
	
	JButton btnNovo = new JButton("Novo");
	JButton btnAlterar = new JButton("Alterar");
	JButton btnExcluir = new JButton("Excluir");
	JButton btnSalvar = new JButton("Salvar");
	JButton btnRelatório = new JButton("Relatório");
	JButton btnRetornar = new JButton("Retorna");
	
	public MinhaTela() {
		//FlowLayout. Ocorre quando os componentes GUI são colocados em um contêiner da esquerda para a direita na ordem em que são colocadas.
		
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
		setTitle("Cartão da Loja");  
	    setSize(550, 450);//Definição do tamanho da janela 
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
		c.add(btnRelatório);
		c.add(btnRetornar);
		
		setVisible(true);
		pack();
	}
}
