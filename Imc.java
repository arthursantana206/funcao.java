import java.util.Scanner;

public class Imc {
    public static double calcularImc(double peso, double altura) {
        return peso / (altura * altura);
    }
public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite seu peso em kg: ");
        double peso = input.nextDouble();       
        System.out.println("Digite sua altura em metros: ");
        double altura = input.nextDouble();
        double imc = calcularImc(peso, altura);
        System.out.printf("Seu IMC é: %.2f\n", imc);
        
        if (imc < 19) {
            System.out.println("Abaixo do peso");
        } else if (imc >= 19 && imc < 25) {
            System.out.println("Peso normal");
        } else if (imc >= 25 && imc < 30) {
            System.out.println("Sobrepeso");
        } else {
            System.out.println("Obesidade");
        }
        
    input.close();


    }    

}
