package br.com.bandtec.ac2luta.dominio;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.PositiveOrZero;
import javax.validation.constraints.Size;


@Entity
public class Lutador {
    @Id

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idLutador;

    @NotBlank
    @Size(min = 3, max = 12)
    @Pattern(regexp = "/[^     ]+/")
    private String nome;

    @PositiveOrZero
    @NotBlank
    private Double forcaGolpe;

    private Double vida = 100.0;

    private Integer concentracoesRealizadas =0;

    private boolean vivo = true;

    public Integer getIdLutador() {
        return idLutador;
    }

    public void setIdLutador(Integer idLutador) {
        this.idLutador = idLutador;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getForcaGolpe() {
        return forcaGolpe;
    }

    public void setForcaGolpe(Double forcaGolpe) {
        this.forcaGolpe = forcaGolpe;
    }

    public Double getVida() {
        return vida;
    }

    public void setVida(Double vida) {
        this.vida = vida;
    }

    public Integer getConcentracoesRealizadas() {
        return concentracoesRealizadas;
    }

    public void setConcentracoesRealizadas(Integer concentracoesRealizadas) {
        this.concentracoesRealizadas = concentracoesRealizadas;
    }

    public boolean isVivo() {
        return vivo;
    }

    public void setVivo(boolean vivo) {
        this.vivo = vivo;
    }
}
