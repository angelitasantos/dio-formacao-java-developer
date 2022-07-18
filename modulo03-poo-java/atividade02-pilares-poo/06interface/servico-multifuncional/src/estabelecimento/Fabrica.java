package estabelecimento;

import equipamentos.copiadora.Copiadora;
import equipamentos.copiadora.Xerox;
import equipamentos.digitalizadora.Digitalizadora;
import equipamentos.impressora.Impressora;
import equipamentos.multifuncional.ServicoMultifuncional;    

public class Fabrica {
    public static void main(String[] args) {

        System.out.println("Fabrica");

        Xerox xerox = new Xerox();
        xerox.copiar();

        ServicoMultifuncional multifuncional = new ServicoMultifuncional();
        multifuncional.copiar();

        Impressora impressora = multifuncional;
        Digitalizadora digitalizadora = multifuncional;
        Copiadora copiadora = multifuncional;

        impressora.imprimir();
        digitalizadora.digitalizar();
        copiadora.copiar();

    }
}
