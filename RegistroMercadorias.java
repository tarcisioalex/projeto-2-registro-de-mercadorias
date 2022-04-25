import java.util.ArrayList;
public class RegistroMercadorias{

  ArrayList<String> mercadoriasTotal = new ArrayList<String>();
  ArrayList<String> mercadoriasReposicao = new ArrayList<String>();

  public void mercadoriasTotal(String nome, String quantMin, String quantMax, String quantAtual, String valorUni){
    mercadoriasTotal.add(nome);
    mercadoriasTotal.add(quantMin);
    mercadoriasTotal.add(quantMax);
    mercadoriasTotal.add(quantAtual);
    mercadoriasTotal.add(valorUni);
  }
  public void mercadoriasReposicao(String nome, String quantMin, String quantMax, String quantAtual, String valorUni){
    mercadoriasReposicao.add(nome);
    mercadoriasReposicao.add(quantMin);
    mercadoriasReposicao.add(quantMax);
    mercadoriasReposicao.add(quantAtual);
    mercadoriasReposicao.add(valorUni);
  }
  public void mostrarMercTotal(){
    System.out.println("**********************************************");
    System.out.println("Mercadorias registradas: ");
    for (int i = 0; i < mercadoriasTotal.size(); i++){
      System.out.println("----------------------------------------------");
      System.out.println(mercadoriasTotal.get(i));
    }
  }
  public void mostrarMercReposicao(){
    System.out.println("**********************************************");
    System.out.println("Reposição: ");
    for (int i = 0; i < mercadoriasReposicao.size(); i++){
      System.out.println("--------------------------------------------");
      System.out.println(mercadoriasReposicao.get(i));
    }
  }

}
