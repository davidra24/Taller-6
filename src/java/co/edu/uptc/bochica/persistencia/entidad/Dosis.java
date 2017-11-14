package co.edu.uptc.bochica.persistencia.entidad;

import co.edu.uptc.bochica.persistencia.entidad.Vacuna;
import javax.persistence.*;

public class Dosis {

    private Long id;

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    private Integer valorTiempo;

    private String unidadTiempo;

    private Vacuna vacuna;

    public Integer getValorTiempo() {
        return this.valorTiempo;
    }

    /**
     * @generated
     */
    public void setValorTiempo(Integer valorTiempo) {
        this.valorTiempo = valorTiempo;
    }

    /**
     * @generated
     */
    public String getUnidadTiempo() {
        return this.unidadTiempo;
    }

    /**
     * @generated
     */
    public void setUnidadTiempo(String unidadTiempo) {
        this.unidadTiempo = unidadTiempo;
    }

    /**
     * @generated
     */
    public Vacuna getVacuna() {
        return this.vacuna;
    }

    /**
     * @generated
     */
    public void setVacuna(Vacuna vacuna) {
        this.vacuna = vacuna;
    }

}
