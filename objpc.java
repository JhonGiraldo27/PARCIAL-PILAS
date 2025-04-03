public class objpc {
    private String Marca;
    private String Serial;
    private int MemoriaRam;
    private double DiscDuro;
    private double Precio;
    private String NomUsuario;
    private boolean Disponible;

    public objpc() {
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

    public int getMemoriaRam() {
        return MemoriaRam;
    }

    public void setMemoriaRam(int memoriaRam) {
        MemoriaRam = memoriaRam;
    }

    public double getDiscDuro() {
        return DiscDuro;
    }

    public void setDiscDuro(double discDuro) {
        DiscDuro = discDuro;
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
