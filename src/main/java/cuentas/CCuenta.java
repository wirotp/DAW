package cuentas;

public class CCuenta {

    /**
     * @return nombre - devuelve el nombre del titular de la cuenta
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre - nombre que queremos guardar
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return cuenta - devuelve el numero de cuenta
     */
    public String getCuenta() {
        return cuenta;
    }

    /**
     * @param cuenta - cuenta que queremos guardar
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /**
     * @return saldo - devuelve el saldo que tiene la cuenta
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * @param saldo - saldo que queremos guardar
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * @return tipoInterés - devuelve el tipo de interes de la cuenta
     */
    public double getTipoInterés() {
        return tipoInterés;
    }

    /**
     * @param tipoInterés - tipoInterés que queremos guardar
     */
    public void setTipoInterés(double tipoInterés) {
        this.tipoInterés = tipoInterés;
    }


    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;
    
    /**
     * Constructor por defecto
     */

    public CCuenta()
    {
    }

    /**
     * Constructor por parámetros
     * @param nom nombre con el que queremos inicializar
     * @param cue cuenta con la que queremos inicializar
     * @param sal saldo con el que queremos inicializar
     * @param tipo tipo de interes con el que queremos inicializar
     */
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
    }

    public double estado()
    {
        return getSaldo();
    }

    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        setSaldo(getSaldo() + cantidad);
    }

    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        setSaldo(getSaldo() - cantidad);
    }
}
