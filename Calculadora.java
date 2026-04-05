public class Calculadora {

    /**

     Executa uma operação matemática básica.
     @param operacao Tipo da operação: "soma", "subtrair", "multiplicar"
     @param a Primeiro número
     @param b Segundo número
     @return Resultado da operação*/
    public double calcular(String operacao, int a, int b) {
        switch (operacao.toLowerCase()) {
            case "soma":
                return a + b;
            case "subtrair":
                return a - b;
            case "multiplicar":
                return a * b;
            default:
                throw new IllegalArgumentException("Operação inválida: " + operacao);}}

    // Método principal para testar
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();

        System.out.println("Soma: " + calc.calcular("soma", 10, 5));
        System.out.println("Subtrair: " + calc.calcular("subtrair", 10, 5));
        System.out.println("Multiplicar: " + calc.calcular("multiplicar", 10, 5));
    }
}
