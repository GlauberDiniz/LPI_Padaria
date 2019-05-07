
package Objects;

public class ObjEstoque {
    private String CodProd;
    private String DataValidade;
    private String QtdadeMinina;
    private String QtdadeMaxima;
    private String QtdadeAtual;
    
    public String getCodProd() {
        return CodProd;
    }
    public void setCodProd(String CodProd) {
        this.CodProd = CodProd;
    }
    public String getDataValidade() {
        return DataValidade;
    }
    public void setDataValidade(String DataValidade) {
        this.DataValidade = DataValidade;
    }
    public String getQtdadeMinina() {
        return QtdadeMinina;
    }
    public void setQtdadeMinina(String QtdadeMinina) {
        this.QtdadeMinina = QtdadeMinina;
    }
    public String getQtdadeMaxima() {
        return QtdadeMaxima;
    }
    public void setQtdadeMaxima(String QtdadeMaxima) {
        this.QtdadeMaxima = QtdadeMaxima;
    }
    public String getQtdadeAtual() {
        return QtdadeAtual;
    }
    public void setQtdadeAtual(String QtdadeAtual) {
        this.QtdadeAtual = QtdadeAtual;
    }
}
