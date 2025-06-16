import java.util.Scanner;

public class Switch_Case {
    public static void main(String[] args) {
    // Exemplo de uso do switch case
    Scanner scanner = new java.util.Scanner(System.in);
    System.out.println("Informe o número de 1 a 7 para o dia da semana:");
    var option = scanner.nextInt();
    var message = switch (option){
        case 1, 7-> {
            var day = option == 1 ? "Domingo" : "Sábado";
            yield String.formatted(original: "Hoje é %s, fim de semana! \\o/",day);
        }
        case 2 -> "Segunda-feira";
        case 3 -> "Terça-feira";
        case 4 -> "Quarta-feira";
        case 5 -> "Quinta-feira";
        case 6 -> "Sexta-feira";
        case 7 -> "Sábado";
        default -> "Opção inválida";
    }
}
