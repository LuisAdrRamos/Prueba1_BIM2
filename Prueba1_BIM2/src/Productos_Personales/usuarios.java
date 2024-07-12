package Productos_Personales;

public class usuarios {
    int id;
    String usernameU;
    String passwordU;

    public usuarios() {
    }

    public usuarios(int id, String usernameU, String passwordU) {
        this.id = id;
        this.usernameU = usernameU;
        this.passwordU = passwordU;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsernameU() {
        return usernameU;
    }

    public void setUsernameU(String usernameU) {
        this.usernameU = usernameU;
    }

    public String getPasswordU() {
        return passwordU;
    }

    public void setPasswordU(String passwordU) {
        this.passwordU = passwordU;
    }

    public static class productos {
        String cod_product;
        String nombre;
        String descripcion;
        String categoria;
        int cantidad;
        double precio;

        public productos() {
        }

        public productos(String cod_product, String nombre, String descripcion, String categoria, int cantidad, double precio) {
            this.cod_product = cod_product;
            this.nombre = nombre;
            this.descripcion = descripcion;
            this.categoria = categoria;
            this.cantidad = cantidad;
            this.precio = precio;
        }

        public String getCod_product() {
            return cod_product;
        }

        public void setCod_product(String cod_product) {
            this.cod_product = cod_product;
        }

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public String getDescripcion() {
            return descripcion;
        }

        public void setDescripcion(String descripcion) {
            this.descripcion = descripcion;
        }

        public String getCategoria() {
            return categoria;
        }

        public void setCategoria(String categoria) {
            this.categoria = categoria;
        }

        public int getCantidad() {
            return cantidad;
        }

        public void setCantidad(int cantidad) {
            this.cantidad = cantidad;
        }

        public double getPrecio() {
            return precio;
        }

        public void setPrecio(double precio) {
            this.precio = precio;
        }
    }
}
