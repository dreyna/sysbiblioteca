package pe.edu.upeu.sysbiblioteca.daoImpl;

import java.util.List;
import org.springframework.stereotype.Repository;
import pe.edu.upeu.sysbiblioteca.dao.CategoriaDao;
import pe.edu.upeu.sysbiblioteca.entity.Categoria;

@Repository
public class CategoriaDaoImpl implements CategoriaDao{

	
	@Override
	public int create(Categoria t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(Categoria t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Categoria read(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Categoria> readAll() {
		// TODO Auto-generated method stub
		return null;
	}
}
