package proyectobiblioteca.domain;

import java.sql.Time;

/**
 *
 * @author victormanuel
 */
public class Multimedia {
    private int idMultimedia;
    private String tipoMultimedia;
    private Time duracion;
    private String formato;
    private int fkIdRecursoDocumental;

    public Multimedia(String tipoMultimedia, Time duracion, String formato) {
        this.tipoMultimedia = tipoMultimedia;
        this.duracion = duracion;
        this.formato = formato;
    }

    public Multimedia(int idMultimedia, String tipoMultimedia, Time duracion, String formato) {
        this.idMultimedia = idMultimedia;
        this.tipoMultimedia = tipoMultimedia;
        this.duracion = duracion;
        this.formato = formato;
    }

    public Multimedia(int idMultimedia, String tipoMultimedia, Time duracion, String formato, int fkIdRecursoDocumental) {
        this.idMultimedia = idMultimedia;
        this.tipoMultimedia = tipoMultimedia;
        this.duracion = duracion;
        this.formato = formato;
        this.fkIdRecursoDocumental = fkIdRecursoDocumental;
    }

    public int getIdMultimedia() {
        return idMultimedia;
    }

    public String getTipoMultimedia() {
        return tipoMultimedia;
    }

    public Time getDuracion() {
        return duracion;
    }

    public String getFormato() {
        return formato;
    }

    public int getFkIdRecursoDocumental() {
        return fkIdRecursoDocumental;
    }

    public void setIdMultimedia(int idMultimedia) {
        this.idMultimedia = idMultimedia;
    }

    public void setTipoMultimedia(String tipoMultimedia) {
        this.tipoMultimedia = tipoMultimedia;
    }

    public void setDuracion(Time duracion) {
        this.duracion = duracion;
    }

    public void setFormato(String formato) {
        this.formato = formato;
    }

    public void setFkIdRecursoDocumental(int fkIdRecursoDocumental) {
        this.fkIdRecursoDocumental = fkIdRecursoDocumental;
    }
}
