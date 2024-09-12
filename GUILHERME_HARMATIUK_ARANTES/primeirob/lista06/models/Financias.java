package primeirob.lista06.models;

import java.math.BigDecimal;
import java.util.List;

public class Financias {
    public BigDecimal salarioBase;
    public List<BigDecimal> salarioRecebido;

    public void adicionarPagamento() { salarioRecebido.add(salarioBase); }
    public void adicionarPagamento(BigDecimal bonus) { salarioRecebido.add(bonus.add(salarioBase)); }
}
