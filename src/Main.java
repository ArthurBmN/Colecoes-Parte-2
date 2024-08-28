import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static List<String> SexoMasculino = new ArrayList<>();
    static List<String> SexoFeminino = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o nome que deseja adicionar a lista:");
        String nome = sc.nextLine().trim();
        System.out.println("Digite o sexo dela (Masculino/Feminino):");
        String sexo = sc.nextLine().trim();

        if (sexo.equals("Masculino")) {
            SexoMasculino.add(nome);
        } else {
            SexoFeminino.add(nome);
        }
        System.out.println("Grupo Masculino: " + SexoMasculino);
        System.out.println("Grupo Feminino : " + SexoFeminino);
    }
}