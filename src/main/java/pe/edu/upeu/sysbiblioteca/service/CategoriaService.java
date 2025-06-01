package pe.edu.upeu.sysbiblioteca.service;

import java.util.List;
import org.springframework.stereotype.Service;
import pe.edu.upeu.sysbiblioteca.dao.CategoriaDao;
import pe.edu.upeu.sysbiblioteca.entity.Categoria;

@Service
public class CategoriaService implements ICategoriaService{

	private final CategoriaDao cdao;
	public CategoriaService(CategoriaDao cdao) {
		this.cdao = cdao;
	}

	@Override
	public int create(Categoria t) {
		// TODO Auto-generated method stub
		return cdao.create(t);
	}

	@Override
	public int update(Categoria t) {
		// TODO Auto-generated method stub
		return cdao.update(t);
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return cdao.delete(id);
	}

	@Override
	public Categoria read(int id) {
		// TODO Auto-generated method stub
		return cdao.read(id);
	}

	@Override
	public List<Categoria> readAll() {
		// TODO Auto-generated method stub
		return cdao.readAll();
	}
	
}
