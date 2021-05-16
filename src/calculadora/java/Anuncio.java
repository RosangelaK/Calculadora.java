package calculadora.java;

import java.util.Date;

/**
 *
 * @author Rosangela
 */
public class Anuncio {

    private String nomeAnuncio;
    private String cliente;
    private Double quantidadeDias;
    private Date dataInicio;
    private Date dataTermino;
    private Double investPorDia;

    /*
    As variáveis: visualizacoes, cliques, compartilhamentos, novasVisualizacoes 
    e totalVisualizacoes, seriam do tipo int. Fiz do tipo Double,
    porque não consegui fazer o cálculo entre Double e Int.
     */
    private Double totalInvestido;
    private Double visualizacoes;
    private Double cliques;
    private Double compartilhamentos;
    private Double novasVisualizações;
    private double totalVisualizacoes;

    public void ListarAnuncios() {
        System.out.println("Anuncio: " + this.nomeAnuncio);
        visualizacoes = investPorDia * 30;
        System.out.println("visualizações : " + Math.floor(this.visualizacoes));
        cliques = visualizacoes * 0.12;
        System.out.println("Cliques: " + Math.floor(this.cliques));

        for (int x = 4; x > 0; x--) {
            compartilhamentos = cliques * 0.15;
            System.out.println("Compartilhamentos: " + Math.floor(this.compartilhamentos));
        }
        novasVisualizações = compartilhamentos * 40;
        System.out.println("Novas visualizações: " + Math.floor(this.novasVisualizações));
        totalVisualizacoes = visualizacoes + novasVisualizações;
        System.out.println("Total de visualizações: " + Math.floor(this.totalVisualizacoes));
        totalInvestido = quantidadeDias * (investPorDia * 30);
        System.out.println("Total investido: " + this.totalInvestido);
        System.out.println("------------------------------------------");
    }

    public void listarPorData() {

    }

    public void listarPorCliente() {

    }

    public String getNomeAnuncio() {
        return nomeAnuncio;
    }

    public void setNomeAnuncio(String nomeAnuncio) {
        this.nomeAnuncio = nomeAnuncio;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public Double getQuantidadeDias() {
        return quantidadeDias;
    }

    public void setQuantidadeDias(Double quantidadeDias) {
        this.quantidadeDias = quantidadeDias;
    }

    public Date getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(Date dataInicio) {
        this.dataInicio = dataInicio;
    }

    public Date getDataTermino() {
        return dataTermino;
    }

    public void setDataTermino(Date dataTermino) {
        this.dataTermino = dataTermino;
    }

    public Double getInvestPorDia() {
        return investPorDia;
    }

    public void setInvestPorDia(Double investPorDia) {
        this.investPorDia = investPorDia;
    }

    public Double getTotalInvestido() {
        return totalInvestido;
    }

    public void setTotalInvestido(Double totalInvestido) {
        this.totalInvestido = totalInvestido;
    }

    public Double getVisualizacoes() {
        return visualizacoes;
    }

    public void setVisualizacoes(Double visualizacoes) {
        this.visualizacoes = visualizacoes;
    }

    public Double getCliques() {
        return cliques;
    }

    public void setCliques(Double cliques) {
        this.cliques = cliques;
    }

    public Double getCompartilhamentos() {
        return compartilhamentos;
    }

    public void setCompartilhamentos(Double compartilhamentos) {
        this.compartilhamentos = compartilhamentos;
    }

    public Double getNovasVisualizações() {
        return novasVisualizações;
    }

    public void setNovasVisualizações(Double novasVisualizações) {
        this.novasVisualizações = novasVisualizações;
    }

    public double getTotalVisualizacoes() {
        return totalVisualizacoes;
    }

    public void setTotalVisualizacoes(double totalVisualizacoes) {
        this.totalVisualizacoes = totalVisualizacoes;
    }
}
