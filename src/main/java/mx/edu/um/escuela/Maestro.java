/*
 * The MIT License
 *
 * Copyright 2012 Universidad de Montemorelos A. C.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package mx.edu.um.escuela;

import java.util.Date;

/**
 *
 * @author J. David Mendoza <jdmendoza@um.edu.mx>
 */
public class Maestro {
    private String nomina;
    private String nombre;
    private String apellido;
    private Date fechaNacimiento;
    private Boolean esHombre = true;
    private String correo;

    public Maestro() {
    }

    public Maestro(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public Maestro(String nomina, String nombre, String apellido, Date fechaNacimiento, Boolean esHombre, String correo) {
        this.nomina = nomina;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNacimiento = fechaNacimiento;
        this.esHombre = esHombre;
        this.correo = correo;
    }

    /**
     * @return the nomina
     */
    public String getNomina() {
        return nomina;
    }

    /**
     * @param nomina the nomina to set
     */
    public void setNomina(String nomina) {
        this.nomina = nomina;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the apellido
     */
    public String getApellido() {
        return apellido;
    }

    /**
     * @param apellido the apellido to set
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    /**
     * @return the fechaNacimiento
     */
    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    /**
     * @param fechaNacimiento the fechaNacimiento to set
     */
    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    /**
     * @return the esHombre
     */
    public Boolean getEsHombre() {
        return esHombre;
    }

    /**
     * @param esHombre the esHombre to set
     */
    public void setEsHombre(Boolean esHombre) {
        this.esHombre = esHombre;
    }

    /**
     * @return the correo
     */
    public String getCorreo() {
        return correo;
    }

    /**
     * @param correo the correo to set
     */
    public void setCorreo(String correo) {
        this.correo = correo;
    }

    @Override
    public String toString() {
        return "Alumno{" + "nomina=" + nomina + ", nombre=" + nombre + ", apellido=" + apellido + ", fechaNacimiento=" + fechaNacimiento + ", esHombre=" + esHombre + ", correo=" + correo + '}';
    }
    
}
