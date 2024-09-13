package base;
import io.InOut;
public class Oficina {
	private static VetVeiculo arrVeiculo = new VetVeiculo();

	public static void main(String[] args) {    	

		String input = "";
		String placa= " ";
		String modelo= " ";
		String problema= " ";
		double valor= 0.0;

		while (!input.equals("0")) {
            input = InOut.leString("1- Adicionar Veiculo | 2- Pesquisar por Placa | 3- Remover por Placa | 4- Listar Todos os Veiculos | 5- Sair do Programa. Digite a opção desejada:");
			switch(input) {
			// todos os cases estão funcionando.
				case "1":
					// Adicionar veiculo
					// System.out.println("Adicionar Veículo:"); // mensagem para debug.
					// usar lestring para receber a opção do usuário.
					placa=InOut.leString("Por favor, digite o número da placa:");

					break;
				case "2":
					// Pesquisar veiculo por placa e mostrar informações
					// System.out.println("Pesquisar Veículo por Placa:"); // mensagem para debug.

					break;
				case "3":
					// remover veiculo da oficina pela placa
					//System.out.println("Remover Veículo pela Placa:"); // mensagem para debug.
					break;
				case "4":
					// listar todos os veiculos (somente modelo e placa) q estao no sistema da oficina
					// System.out.println("Listar Todos os Veículos:"); // mensagem para debug.
					break;
				case "5":
					System.exit(0); // sair do programa.
				default:
					System.out.println("Opção inválida!");


			}
		}
	}
}
