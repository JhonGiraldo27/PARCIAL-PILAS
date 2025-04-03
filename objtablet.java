public class objtablet {
    private String Marca;
    private String Serial;
    private double Precio;
    private String NomUsuario;
    private boolean Disponible;

    public objtablet() {
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String marca) {
        Marca = marca;
    }

    public String getSerial() {
        return Serial;
    }

    public void setSerial(String serial) {
        Serial = serial;
    }

    public double getPrecio() {
        return Precio;
    }

    public void setPrecio(double precio) {
        Precio = precio;
    }

    public String getNomUsuario() {
        return NomUsuario;
    }

    public void setNomUsuario(String nomUsuario) {
        NomUsuario = nomUsuario;
    }

    public boolean isDisponible() {
        return Disponible;
    }

    public void setDisponible(boolean disponible) {
        Disponible = disponible;
    }

}
