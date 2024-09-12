
import java.util.HashMap;
import java.util.Map;

class V{
    private Map<String, Double> vendasPorDia;
    private Map<Integer, Double> vendasPorMes;

    public V() {
        vendasPorDia = new HashMap<>();
        vendasPorMes = new HashMap<>();
    }

    public void salvarVenda(int dia, int mes, double valor) {
        String chave = String.format("%02d-%02d", dia, mes);
        
     
        double totalDia = vendasPorDia.getOrDefault(chave, 0.0);
        vendasPorDia.put(chave, totalDia + valor);
        
        
        double totalMes = vendasPorMes.getOrDefault(mes, 0.0);
        vendasPorMes.put(mes, totalMes + valor);
    }

    public double buscarVendasDia(int dia, int mes) {
        String chave = String.format("%02d-%02d", dia, mes);
        return vendasPorDia.getOrDefault(chave, 0.0);
    }

    public double buscarVendasMes(int mes) {
        return vendasPorMes.getOrDefault(mes, 0.0);
    }
}

