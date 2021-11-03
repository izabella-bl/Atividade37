package CadastroDePratos.View;

import CadastroDePratos.Controller.PratoController;
import CadastroDePratos.Model.Pratos;

public class DadosView {
    public static void main(String[] args) {
        PratoController pc = new PratoController();


        /*===================Create========================*/
        Pratos p1 = new Pratos();

        p1.setNome("Makizushi");
        p1.setTipo("Japonês");
        p1.setDescricao("Sushi enrolado no nori (folha de alga desidratada) em forma de cilindro sobre uma esteira apropriada(makisu).");
        p1.setPreco(16);

        pc.create(p1);

        Pratos p2 = new Pratos();
        p2.setNome("Dobradinha");
        p2.setTipo("Brasileira");
        p2.setDescricao("Feito de bucho de animais, em especial do boi, cozido em pequenos pedaços com grande variedade de condimentos e acompanhamentos");
        p2.setPreco(21.99);
        pc.create(p2);

        System.out.println("================= Read-Listando ================= ");

        for ( Pratos p: pc.read()) {
            System.out.println(p);
        }

        System.out.println("=========================== Update =========================");

        p2.setNome("Risotto");
        p2.setTipo("Italiano");
        p2.setDescricao("fritam levemente as cebolas e o arbório, ou o arroz em manteiga, e se vai gradualmente deitando fundo de carne ou legumes e outros ingredientes, até o arroz estar cozido e não poder absorver mais líquido");
        p2.setPreco(23.45);
        pc.update(p2);

        for ( Pratos p: pc.read()) {
            System.out.println(p);
        }

        System.out.println("======================== Delete ===================");

        pc.delete(p1);
        for ( Pratos p: pc.read()) {
            System.out.println(p);
        }


    }
}
