import javax.swing.JOptionPane;

public class Conversor {
    
    public void escolherMoeda(){
        Object[] opcoesMoedas = {"De Reais a Dólares", "De Dólares a Reais",
        "De Reais a Euros", "De Euros a Reais", "De Reais a Libras", "De Libras a Reais",
        "De Reais a Peso Argentino", "De Peso Argentino a Reais", "De Reais a Peso Chileno",
        "De Peso Chileno a Reais"};

        Object moedaSelecionada = JOptionPane.showInputDialog(null, "Escolha uma opção", "Input",
        JOptionPane.INFORMATION_MESSAGE, null,opcoesMoedas, opcoesMoedas[0]);

        Validador valida = new Validador();
        valida.validarValor();

        Moedas moeda = new Moedas();
        moeda.atualizarValores();

        if(moedaSelecionada.equals("De Reais a Dólares")){
            double realDolar = valida.getValor() * moeda.getDolar();
            Object str = String.format("%.2f", realDolar);
            JOptionPane.showMessageDialog(null, "O valor em dólares é: " + str, "Conversão", 1);
        } else if (moedaSelecionada.equals("De Reais a Euros")){
            double realEuro = valida.getValor() * moeda.getEuro();
            Object str1 = String.format("%.2f", realEuro);
            JOptionPane.showMessageDialog(null, "O valor em euros é: " + str1, "Conversão", 1);
        } else if (moedaSelecionada.equals("De Reais a Libras")){
            double realLibra = valida.getValor() * moeda.getLibra();
            Object str2 = String.format("%.2f", realLibra);
            JOptionPane.showMessageDialog(null, "O valor em libras é: " + str2, "Conversão", 1);
        } else if (moedaSelecionada.equals("De Reais a Peso Argentino")){
            double realArgentino = valida.getValor() * moeda.getPesoArgentino();
            Object str3 = String.format("%.2f", realArgentino);
            JOptionPane.showMessageDialog(null, "O valor em pesos argentinos é: " + str3, "Conversão", 1);
        } else if (moedaSelecionada.equals("De Reais a Peso Chileno")){
            double realChileno = valida.getValor() * moeda.getPesoChileno();
            Object str4 = String.format("%.2f", realChileno);
            JOptionPane.showMessageDialog(null, "O valor em pesos chilenos é: " + str4, "Conversão", 1);
        } else if (moedaSelecionada.equals("De Dólares a Reais")) {
            double dolarReal = valida.getValor() / moeda.getDolar();
            Object str5 = String.format("%.2f", dolarReal);
            JOptionPane.showMessageDialog(null, "O valor em reais é: " + str5, "Conversão", 1);
        } else if (moedaSelecionada.equals("De Euros a Reais")) {
            double euroReal = valida.getValor() / moeda.getEuro();
            Object str6 = String.format("%.2f", euroReal);
            JOptionPane.showMessageDialog(null, "O valorem reais é: " + str6, "Conversão", 1);
        } else if (moedaSelecionada.equals("De Libras a Reais")) {
            double libraReal = valida.getValor() / moeda.getLibra();
            Object str7 = String.format("%.2f", libraReal);
            JOptionPane.showMessageDialog(null, "O valor em reais é: " + str7, "Conversão", 1);
        } else if (moedaSelecionada.equals("De Peso Argentino a Reais")) {
            double argentinoReal = valida.getValor() / moeda.getPesoArgentino();
            Object str8 = String.format("%.2f", argentinoReal);
            JOptionPane.showMessageDialog(null, "O valor em reais é: " + str8, "Conversão", 1);
        } else if (moedaSelecionada.equals("De Peso Chileno a Reais")) {
            double chilenoReal = valida.getValor() / moeda.getPesoChileno();
            Object str9 = String.format("%.2f", chilenoReal);
            JOptionPane.showMessageDialog(null, "O valor em reais é: " + str9, "Conversão", 1);
        }
    }
    
    public boolean continuar(){
        int continua = JOptionPane.showConfirmDialog(null, "Deseja realizar outra conversão?",  
        null, JOptionPane.YES_NO_CANCEL_OPTION, 3);
                 
        if(continua == JOptionPane.YES_OPTION){
            escolherMoeda();
            continuar();
            return true;
        }          
        return false;
    }
}

