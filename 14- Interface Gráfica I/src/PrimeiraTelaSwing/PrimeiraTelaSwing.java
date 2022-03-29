package PrimeiraTelaSwing;
	
import java.awt.*;
import javax.swing.*; //pacote obrigat�rio para usar swing

public class PrimeiraTelaSwing extends JFrame { //subclasse de JFrame do pr�prio java
	JLabel lblNome = new JLabel("Nome:"); //Nome visivel
	JTextField txtNome = new JTextField(40); //Campo e identifica��o do campo
	JLabel lblCpf = new JLabel("CPF:");
	JTextField txtCpf = new JTextField(35);
	JLabel lblEndereco = new JLabel("Endere�o:");
	JTextField txtEndereco = new JTextField(30);
	JLabel lblSexo = new JLabel("Sexo");
	JButton btnGravar = new JButton("Gravar");
	JButton btnFechar = new JButton("Fechar");
	String [] sexos = {"Masculino" , "Feminino" , "Outro"};
	JComboBox cboSexo = new JComboBox(sexos);
	
	public PrimeiraTelaSwing() { //Utilizando construtor 
		//FlowLayout. Ocorre quando os componentes GUI s�o colocados em um cont�iner da esquerda para a direita na ordem em que s�o colocadas.
		setLayout(new FlowLayout());
	//Os componentes ser�o apresentados na tela nessa ordem.
	//Serve como janela m�e (desktop) das demais janelas. Um objeto JDesktopPene pode conter diversos objetos JInternalFrame.
		
		Container c = getContentPane();
		
		setLayout(new GridLayout(0,1));
		setTitle("Cadastro de Pessoa");
		c.add(lblNome);
		c.add(txtNome);
		c.add(lblCpf);
		c.add(txtCpf);
		c.add(lblEndereco);
		c.add(txtEndereco);
		c.add(lblSexo);
		c.add(cboSexo);
		c.add(btnGravar);
		c.add(btnFechar);
		
		setVisible(true);
		pack();
	}
}
