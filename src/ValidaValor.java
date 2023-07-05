import javax.swing.JOptionPane;

public class ValidaValor {

    private double valor;

    String insiraValor = JOptionPane.showInputDialog(null, "Insira um valor", "Valor", 3);
    
    public boolean validarValor(){
        try {
            double valor = Double.parseDouble(insiraValor);
            return true;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Insira somente números", "Erro", 0);    
        }
        return false;        
    }
    public double getValor() {
        double valor = Double.parseDouble(insiraValor);
        return valor;
    }
    public void setValor(double valor) {
        this.valor = valor;
    }
}