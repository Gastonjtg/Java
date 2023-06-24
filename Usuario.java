
public class Usuario {

	private String nombre;
	private String nickname;
	private String contrasenia;




	public Usuario (String nombre, String nickname, String contrasenia)
	{
		this.nombre=nombre;
		this.nickname=nickname;
		this.contrasenia=contrasenia;
	}




	public String getNombre() {
		return nombre;
	}




	public void setNombre(String nombre) {
		this.nombre = nombre;
	}




	public String getNickname() {
		return nickname;
	}




	public void setNickname(String nickname) {
		this.nickname = nickname;
	}




	public String getContrasenia() {
		return contrasenia;
	}




	public void setContrasenia(String contrasenia) {
		this.contrasenia = contrasenia;
	}


}
