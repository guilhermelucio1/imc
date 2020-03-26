package app;

public class Pessoa {
    
    // atributos -o que ela precisa para existir 
    String  nome;
    String  endereco;
    int     idade;
    String  cpf;
    String  rg;
    double  altura;
    double  peso;

    // métodos - ações 
    public int dias_De_vida(){ // assinatura do método
        int totalDias = this.idade * 365;
        return totalDias;
    }

    public String cidade(){
        return endereco;
    }

    public double valorImc(){
        return peso / (altura * altura);
    }
   
    public String Resultado(){
        double retorno;
        retorno = peso / (altura * altura);

        if (retorno >0 && retorno < 18.5){
            return "Possui déficit de massa corporal !!!";
        }
        else if(retorno >= 18.5 && retorno <= 24.9){   
            return "Massa corporal normal !!!";
        }
        else if(retorno >= 25 && retorno <= 29.9){   
            return  "Possui sobrepeso !!!";
        }
        else if(retorno >= 30 &&  retorno <= 34.9){
            return  "Obesidade leve !!!";
        }
        else if(retorno >= 35 &&  retorno <= 39.9){    
            return  "Obesidade media !!!";
        }
        else {   
            return  "Obesidade morbida !!!";
        }    
    }
}