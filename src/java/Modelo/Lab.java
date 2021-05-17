
package Modelo;


public class Lab {
    
    private int id ;
    private String Codigo, Ruc, Empresa, Ciudad,Direccion,Telefono, Correo, Celular;

public Lab(int id, String Codigo, String Ruc, String Empresa,  String Ciudad, String Direccion, String Telefono, String Correo, String Celular){
    
        
        this.id =id;
        this.Codigo= Codigo;
        this.Ruc= Ruc;
        this.Empresa= Empresa;
        this.Ciudad= Ciudad;
        this.Direccion= Direccion;
        this.Telefono= Telefono;
        this.Correo=Correo; 
        this.Celular=Celular;
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

    public String getRuc() {
        return Ruc;
    }

    public void setRuc(String Ruc) {
        this.Ruc = Ruc;
    }

    public String getEmpresa() {
        return Empresa;
    }

    public void setEmpresa(String Empresa) {
        this.Empresa = Empresa;
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

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String Correo) {
        this.Correo = Correo;
    }

    public String getCelular() {
        return Celular;
    }

    public void setCelular(String Celular) {
        this.Celular = Celular;
    }


}

    

