package LSP;

import SRP.Circulo;
import SRP.Forma;
import SRP.Rectangulo;

public class CalculadoraArea {

    public void calcularAreaTotal(Forma[] formas){

        double areaTotal = 0;

        for (Forma f:formas){

            areaTotal += f.calcularArea();

        }
    }
}

