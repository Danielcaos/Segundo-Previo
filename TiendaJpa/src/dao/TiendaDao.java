package dao;

import util.Conexion;
import entities.Tienda;

public class TiendaDao extends Conexion<Tienda> implements GenericDao<Tienda> {
	public TiendaDao() {
		super(Tienda.class);
	}
}
