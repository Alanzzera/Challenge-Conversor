import javax.swing.JOptionPane;

public class TestaSoftware {
    public static void main(String[] args) throws Exception {

        Object[] opcoesDeConversao = { "Conversor de Moeda"};

        Object conversorSelecionado = JOptionPane.showInputDialog(null, "Escolha uma opção", "Input",
        JOptionPane.INFORMATION_MESSAGE, null,opcoesDeConversao, opcoesDeConversao[0]);
        if (conversorSelecionado.equals("Conversor de Moeda")) {
            ConverteMoeda conversorMoeda = new ConverteMoeda();
            conversorMoeda.escolherMoeda();
            conversorMoeda.continuar();
        }
    }
}