
// Atividade feita por Simone Lopes e Felipe Dourado

import java.util.Scanner;
import javax.swing.JOptionPane;
import javax.swing.JFrame;
 
	public class MainFuncionario {
 
		public static void main(String[] args) {
		Funcionario pessoa = new Funcionario();

	//Inserir os dados
	pessoa.setNome(JOptionPane.showInputDialog("Digite seu nome: "));
	pessoa.setCpf(JOptionPane.showInputDialog("Digite seu CPF: "));
	pessoa.setSalario(Double.parseDouble(JOptionPane.showInputDialog("Digite seu Salario: ")));

	// Apresentar
	pessoa.ApresentarFuncionario();
	}
		}
