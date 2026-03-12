public class Conta {
     private double saldo;
     private double chuequeEspecial;
     private double  boleto;


public Conta (){

}

public Conta(double saldo, double chuequeEspecial, double boleto) {
        this.saldo = saldo;
        this.chuequeEspecial = chuequeEspecial;
        this.boleto = boleto;
}

public double getSaldo() {
    return saldo;
}
public void setSaldo(double valor){
      saldo = valor; 
}
public double getChuequeEspecial() {

    if (getSaldo () <= 500 ){

         return chuequeEspecial = 50;
    }else {
           return chuequeEspecial = getSaldo() * 50 / 100;
    }
}

public void setChuequeEspecial(double chuequeEspecial) {
    this.chuequeEspecial = chuequeEspecial;
}

public double getBoleto() {
    return boleto;
}

public void setBoleto(double boleto) {
    this.boleto = boleto;
}
public void verificacao(){

}



}
