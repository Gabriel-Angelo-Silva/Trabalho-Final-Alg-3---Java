public class VendaDeDocesController {
    private VendaDeDocesDAO vendaDeDocesDAO;

    public VendaDeDocesController() {
        this.vendaDeDocesDAO = new VendaDeDocesDAO(ConexaoBancoDeDados.obterConexao());
    }

    public void criarVendaDeDoces(VendaDeDoces venda) {
        vendaDeDocesDAO.criarVendaDeDoces(venda);
    }

    public VendaDeDoces lerVendaDeDoces(int id) {
        return vendaDeDocesDAO.lerVendaDeDoces(id);
    }

    public void atualizarVendaDeDoces(VendaDeDoces venda) {
        vendaDeDocesDAO.atualizarVendaDeDoces(venda);
    }

    public void excluirVendaDeDoces(int id) {
        vendaDeDocesDAO.excluirVendaDeDoces(id);
    }
}
