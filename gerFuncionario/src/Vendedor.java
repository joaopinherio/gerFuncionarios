public class Vendedor extends Funcionario{
    private double comissao;


    public Vendedor(double comissao) {
        this.comissao = comissao;
    }

    @Override
    public double calculaSalario() {
        double salario = super.calculaSalario();
        return (salario + comissao) * salario;
    }

    @Override
    public double calculaImposto() {
        double salario = calculaSalario();
        if(salario <= 500)
            return 0;
        else if(salario > 500 && salario < 2000)
            return salario * 0.1;
        else
            return salario * 0.2;

        
    }


}