package modelo;

import java.util.Objects;

public class Fecha {
    private int dia;
    private int mes;
    private int anio;

    @Override
    public String toString() {
        return "Fecha{" +
                "dia=" + dia +
                ", mes=" + mes +
                ", anio=" + anio +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Fecha fecha = (Fecha) o;
        return dia == fecha.dia && mes == fecha.mes && anio == fecha.anio;
    }

    @Override
    public int hashCode() {
        return Objects.hash(dia, mes, anio);
    }

    public Fecha() {
    }

    public Fecha(int dia, int mes, int anio) {
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) throws Exception {
        if (dia >= 1 && dia <= 30) {
            this.dia = dia;
        } else {
            throw new Exception("El día debe ser un digito entre 1 y 30");
        }
    }

        public int getMes () {
            return mes;
        }

        public void setMes ( int mes) throws Exception {
            if (mes >= 1 && mes <= 12) {
                this.mes = mes;
            } else {
                throw new Exception("El mes no está dentro del rango válido 1_12");
            }

        }

        public int getAnio () {
            return anio;
        }

        public void setAnio ( int anio){
            this.anio = anio;
        }

    }
