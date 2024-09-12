package segundob.aulas.aulaquatro;

public class EnumExemplo {

    public static void main(String[] args) {

        EnumFormaPgto formaPgto = EnumFormaPgto.CARTAO_DEBITO;

        EnumFormaPgto srtToString = EnumFormaPgto.parseSrt("pix");

        System.out.println(srtToString);

        // switch (formaPgto) {
        //     case PIX:
        //         System.out.println(formaPgto.getDescricao());
        //         break;
        //     case BOLETO:
        //         System.out.println(formaPgto.getDescricao());
        //         break;
        //     case CARTAO_DEBITO:
        //         System.out.println(formaPgto.getDescricao());
        //         break;
        // }

    }

}
