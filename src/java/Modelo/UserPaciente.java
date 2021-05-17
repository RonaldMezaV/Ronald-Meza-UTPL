
package Modelo;


public class UserPaciente{
    
      private int id ;
    private String Codigo, Cedula, Nombre, Apellido,Telefono, correo, Ciudad,Direccion,Celular;

public UserPaciente(int id, String Codigo, String Cedula, String Nombre, String Apellido,String Telefono,String correo,  String Ciudad, String Direccion, String Celular){
    
        
        this.id =id;
        this.Codigo= Codigo;
        this.Nombre= Nombre;
        this.Apellido= Apellido;
        this.Cedula= Cedula;
        this.Direccion= Direccion;
        this.Ciudad= Ciudad;
        this.Telefono= Telefono;
        this.Celular=Celular;
        this.correo=correo; 
}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCodigo() {
        return Codigo;
    }

    public void setCodigo(String Codigo) {
        this.Codigo = Codigo;
    }

    public String getCedula() {
        return Cedula;
    }

    public void setCedula(String Cedula) {
        this.Cedula = Cedula;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getCiudad() {
        return Ciudad;
    }

    public void setCiudad(String Ciudad) {
        this.Ciudad = Ciudad;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public String getCelular() {
        return Celular;
    }

    public void setCelular(String Celular) {
        this.Celular = Celular;
    }



}

    
