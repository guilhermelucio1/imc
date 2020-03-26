package app;


public class App 
{
    
    public static void main( String[] args )
    {
        Pessoa joao = new Pessoa(); 
        joao.cpf = "999.999.999-02";
        joao.rg = "58.766.555.05";
        joao.nome = "Joao";
        joao.idade = 20;
        joao.endereco = "Agudos";
        joao.peso = 80.2;
        joao.altura = 1.8;

        System.out.println("-----------------------------------------");

        System.out.println("NOME: " + joao.nome);

        System.out.println("CIDADE: "           + joao.cidade());
        
        System.out.println("DIAS DE VIDA: "     + joao.dias_De_vida());

        System.out.println("IDADE:"             + joao.idade);

        System.out.println("IMC: "              + joao.valorImc());
        
        System.out.println("SITUAÇÃO: "         + joao.Resultado());
        
        System.out.println("-----------------------------------------");

    }
}