package UsuarioLogin.Proveedores;

import UsuarioLogin.Address;

public class Proveedores {
    private String FullName;
    private String DNI;
    private Address address; //TODO: meter aquí todos los apartados de direccion, como CP o privincia.
    private PhoneNumber phoneNumber; //TODO: si el numero que mete no encaja con la direccion del cliente por pais, que salte un aviso.
    private String nota; //TODO: Limitar el numero de caracteres
    private String emailAddress; //TODO: si no se adjunta un email correcto, que salte un aviso.
    private String notaProveedor;
    private Vencimientos vencimientos;
    private TimpoEntrega timpoEntrega; //TODO: aquí poner como ciertos valores por defecto para poder elegirse
    private FormaDePago formaDePago;
    private String garantiasYPoliticas;


}
