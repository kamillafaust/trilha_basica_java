public class TesteReferencias {

    public static void main(String[] args) {

        Gerente gerente1 = new Gerente();
        gerente1.setNome("Juca");
        gerente1.setSalario(5000.0);

        EditorVideo editorVideo = new EditorVideo();
        editorVideo.setSalario(2500.00);

        Designer designer = new Designer();
        designer.setSalario(2000.0);

        ControleBonificacao controle = new ControleBonificacao();
        controle.registra(gerente1);
        controle.registra(editorVideo);
        controle.registra(designer);

        System.out.println(controle.somaTotalBonificacao());
    }
}
