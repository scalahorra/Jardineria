package modelo;

public class Cliente {
	
	private Integer codigoCliente;
	private String nombreCliente;
	private String nombreContacto;
	private String apellidoContacto;
	private String telefono;
	private Integer fax;
	private String lineaDireccion1;
	private String lineaDireccion2;
	private String ciudad;
	private String region;
	private String pais;
	private Integer codigoPostal;
	private String codigoEmpleadoRepVentas;
	private Integer limiteCredito;
	private String DNI;
	private String NIE;
	private String email;
	private String password;
	@SuppressWarnings("unused")
	private enum TipoDocumento {DNI, NIE}
	
	
	public Cliente(Integer codigoCliente, String nombreCliente, String telefono){
		
		this.codigoCliente = codigoCliente;
		this.nombreCliente = nombreCliente;
		this.telefono = telefono;
	}	
	
	public Integer getCodigoCliente() {
		return codigoCliente;
	}
	public void setCodigoCliente(Integer codigoCliente) {
		this.codigoCliente = codigoCliente;
	}
	
	public String getNombreCliente() {
		return nombreCliente;
	}
	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}
	
	public String getNombreContacto() {
		return nombreContacto;
	}
	public void setNombreContacto(String nombreContacto) {
		this.nombreContacto = nombreContacto;
	}
	
	public String getApellidoContacto() {
		return apellidoContacto;
	}
	public void setApellidoContacto(String apellidoContacto) {
		this.apellidoContacto = apellidoContacto;
	}
	
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	
	public Integer getFax() {
		return fax;
	}
	public void setFax(Integer fax) {
		this.fax = fax;
	}
	
	public String getLineaDireccion1() {
		return lineaDireccion1;
	}
	public void setLineaDireccion1(String lineaDireccion1) {
		this.lineaDireccion1 = lineaDireccion1;
	}
	
	public String getLineaDireccion2() {
		return lineaDireccion2;
	}
	public void setLineaDireccion2(String lineaDireccion2) {
		this.lineaDireccion2 = lineaDireccion2;
	}
	
	public String getCiudad() {
		return ciudad;
	}
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
	
	public int getCodigoPostal() {
		return codigoPostal;
	}
	public void setCodigo_postal(int codigoPostal) {
		this.codigoPostal = codigoPostal;
	}
	
	public String getRegion() {
		return region;
	}
	public void setRegion(String region) {
		this.region = region;
	}
	
	public String getPais() {
		return pais;
	}
	public void setPais(String pais) {
		this.pais = pais;
	}
	
	public String getCodigoEmpleadoRepVentas() {
		return codigoEmpleadoRepVentas;
	}
	public void setCodigoEmpleadoRepVentas(String codigoEmpleadoRepVentas) {
		this.codigoEmpleadoRepVentas = codigoEmpleadoRepVentas;
	}
	
	public Integer getLimiteCredito() {
		return limiteCredito;
	}
	public void setLimiteCredito(Integer limiteCredito) {
		this.limiteCredito = limiteCredito;
	}

	public String getDNI() {
		return DNI;
	}
	public void setDNI(String dNI) {
		DNI = dNI;
	}
	
	public String getNIE() {
		return NIE;
	}
	public void setNIE(String nIE) {
		NIE = nIE;
	}

	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
	public String toString() {
		
		return "ID Cliente: " + this.codigoCliente + " Nombre: " + this.nombreCliente + " Telefono: " + this.telefono;
	}
	
	
}