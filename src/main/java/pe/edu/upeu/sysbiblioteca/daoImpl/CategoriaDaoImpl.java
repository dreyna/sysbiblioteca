package pe.edu.upeu.sysbiblioteca.daoImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import pe.edu.upeu.sysbiblioteca.dao.CategoriaDao;
import pe.edu.upeu.sysbiblioteca.entity.Categoria;

@Repository
public class CategoriaDaoImpl implements CategoriaDao{
	@Autowired
   private JdbcTemplate jdbc;
   	
	@Override
	public int create(Categoria t) {
		String SQL = "INSERT INTO categorias (nombre,estado) VALUES(?,1)";
		return jdbc.update(SQL,new Object[] {t.getNombre()});
	}

	@Override
	public int update(Categoria t) {
		String SQL = "UPDATE INTO categorias SET nombre=? WHERE id=?";
		return jdbc.update(SQL,new Object[] {t.getNombre(), t.getIdcategoria()});
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		String SQL = "DELETE FROM categorias where id=?";
		return jdbc.update(SQL,new Object[] {id});
	}

	@Override
	public Categoria read(int id) {
		// TODO Auto-generated method stub
		String SQL = "SELECT *FROM categoria WHERE id=?";		
		 Categoria cat = jdbc.queryForObject(SQL, BeanPropertyRowMapper.newInstance(Categoria.class), id);
	        return cat;
	}

	@Override
	public List<Categoria> readAll() {
		// TODO Auto-generated method stub
		String SQL = "SELECT *FROM categorias";
		return jdbc.query(SQL,BeanPropertyRowMapper.newInstance(Categoria.class));
	}
}
