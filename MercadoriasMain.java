import java.util.Scanner;
public class MercadoriasMain{
  public static Scanner leia = new Scanner(System.in);
  public static void main(String[] args) {
    float valorTotal = 0;
    String nome;
    int quantMin;
    int quantMax;
    int quantAtual;
    float valorUni;
    String resp;
    RegistroMercadorias registro = new RegistroMercadorias();

    do{
      System.out.print("Digite o nome da mercadoria: ");
      nome = leia.next();
      System.out.print("Digite a quantidade mínima dessa mercadoria: ");
      quantMin = leia.nextInt();
      while(quantMin <= 0){
        System.out.print("A quantidade mínima não pode ser zero ou inferior.\nDigite novamente: ");
        quantMin = leia.nextInt();
      }
      System.out.print("Digite a quantidade máxima dessa mercadoria: ");
      quantMax = leia.nextInt();
      while (quantMax <= 0 || quantMax < quantMin){
        System.out.print("A quantidade máxima não pode ser zero ou inferior e nem menor do que a quantidade mínima\nDigite novamente: ");
        quantMax = leia.nextInt();
      }
      System.out.print("Digite a quantidade atual dessa mercadoria no estoque: ");
      quantAtual = leia.nextInt();
      while(quantAtual < 0){
        System.out.print("A quantidade atual não pode ser inferior a zero.\nDigite novamente: ");
        quantAtual = leia.nextInt();
      }
      System.out.print("Digite o valor unitário dessa mercadoria: ");
      valorUni = leia.nextFloat();
      while(valorUni <= 0){
        System.out.print("O valor unitário não pode ser igual ou inferior a zero.\nDigite novamente: ");
        valorUni = leia.nextFloat();
      }
      registro.mercadoriasTotal(nome, quantMin+"", quantMax+"", quantAtual+"", valorUni+"");
      if(quantAtual < quantMin){
        registro.mercadoriasReposicao(nome, quantMin+"", quantMax+"", quantAtual+"", valorUni+"");
      }
      System.out.print("Deseja continuar?: ");
      resp = leia.next();
    }while(resp.equals("s"));
    registro.mostrarMercTotal();
    registro.mostrarMercReposicao();

  }
}
