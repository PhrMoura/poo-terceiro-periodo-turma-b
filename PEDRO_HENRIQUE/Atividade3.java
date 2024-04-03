class VendasDiariasPorMes {
    HashMap<Integer, Double> vendasPorMes;

    VendasDiariasPorMes() {
        vendasPorMes = new HashMap<>();
    }

    void salvarVenda(int mes, double valor) {
        if (!vendasPorMes.containsKey(mes)) {
            vendasPorMes.put(mes, 0.0);
        }
        vendasPorMes.put(mes, vendasPorMes.get(mes) + valor);
    }

    double buscarVendas(int mes, int dia) {
        if (!vendasPorMes.containsKey(mes)) {
            return 0.0;
        }
        return vendasPorMes.get(mes);
    }

    void exibirVendasPorMes() {
        System.out.println("Vendas por mês: ");
        for (Map.Entry<Integer, Double> entry : vendasPorMes.entrySet()) {
            System.out.println("Mês: " + entry.getKey() + " - Vendas: " + entry.getValue());
        }
    }
}
