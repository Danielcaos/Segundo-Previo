package dao;

import util.Conexion;
import entities.Servicio;

public class ServicioDao extends Conexion<Servicio> implements GenericDao<Servicio> {
	public ServicioDao(){
		super(Servicio.class);
	}
}
