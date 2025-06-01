package pe.edu.upeu.sysbiblioteca.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Categoria {
	private int idcategoria;
	private String nombre;
	private String estado;
	
}
