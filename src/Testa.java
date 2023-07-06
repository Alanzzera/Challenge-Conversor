import javax.swing.JOptionPane;

public class Testa {
    public static void main(String[] args) throws Exception {
    	
    	Moedas moedas = new Moedas();
    	moedas.atualizarValores();
    	
        Object[] opcoesDeConversao = {"Conversor de Moeda"};

        Object conversorSelecionado = JOptionPane.showInputDialog(null, "Escolha uma opção", "Input",
        JOptionPane.INFORMATION_MESSAGE, null,opcoesDeConversao, opcoesDeConversao[0]);
        if (conversorSelecionado.equals("Conversor de Moeda")) {
            Conversor conversorMoeda = new Conversor();
            conversorMoeda.escolherMoeda();
            conversorMoeda.continuar();
        }
    }
}