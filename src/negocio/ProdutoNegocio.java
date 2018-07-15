package negocio;

import dao.BD.ClienteDaoBD;
import dao.BD.ProdutoDaoBD;
import dao.ClienteDAO;
import dao.ProdutoDAO;
import java.util.List;
import model.Clientes;
import model.Produtos;


public class ProdutoNegocio {
    
    private ProdutoDAO produtoDAO;

    public ProdutoNegocio() {
        produtoDAO = new ProdutoDaoBD();
    }

    public void salvar(Produtos produto) throws NegocioException {
        this.validarCamposObrigatorios(produto);
        this.validarCpfExistente(produto);
        produtoDAO.cadastrarProdutos(produto);
    }

    public List<Produtos> listar() {
        return (produtoDAO.listar());
    }

    public void deletar(Produtos produto) throws NegocioException {
        if (produto == null || produto.getCodProduto() == null) {
            throw new NegocioException("Cliente não existe!");
        }
        produtoDAO.removerProdutos(produto);
    }

    public void atualizar(Produtos produto) throws NegocioException {
        if (produto == null || produto.getCodProduto() == null) {
            throw new NegocioException("produto não existe!");
        }
        this.validarCamposObrigatorios(produto);
        produtoDAO.atualizarDados(produto);
    }

    public Produtos procurarPorCpf(String cod) throws NegocioException {
        if (cod == null || cod.isEmpty()) {
            throw new NegocioException("Campo cdigo não informado");
        }
        Produtos produto = produtoDAO.procurarPorCodProduto(cod);
        if (produto == null) {
            throw new NegocioException("produto não encontrado");
        }
        return (produto);
    }

//    public List<Clientes> procurarPorNome(String nome) throws NegocioException {
//        if (nome == null || nome.isEmpty()) {
//            throw new NegocioException("Campo nome nao informado");
//        }
//        return(clienteDao.procurarPorNome(nome));
//    }

    public boolean produtoExiste(String cod) {
        Produtos produto = produtoDAO.procurarPorCodProduto(cod);
        return (produto != null);
    }

    private void validarCamposObrigatorios(Produtos produto) throws NegocioException {
        if (produto.getCodProduto() == null || produto.getCodProduto().isEmpty()) {
            throw new NegocioException("Campo codigo não informado");
        }

        if (produto.getNomeProduto() == null || produto.getNomeProduto().isEmpty()) {
            throw new NegocioException("Campo nome não informado");
        }
    }

    private void validarCpfExistente(Produtos produto) throws NegocioException {
        if (produtoExiste(produto.getCodProduto())) {
            throw new NegocioException("codigo já cadastrado!");
        }
    }
}
