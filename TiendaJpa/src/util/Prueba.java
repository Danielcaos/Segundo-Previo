package util;

import java.util.List;

import dao.ClienteDao;
import dao.ServicioDao;
import dao.TiendaDao;
import entities.Cliente;
import entities.Servicio;
import entities.Tienda;

public class Prueba {
	public static void main(String[] args) {
		
		//insertar cliente
        ClienteDao cDao = new ClienteDao();
        Cliente c = new Cliente();
        c.setClave("hola123");
        c.setEmail("dacaos1999@gmail.com");
        c.setNombre("Daniel");
        
        cDao.insert(c);


        //insertar tienda
        TiendaDao tDao = new TiendaDao();
        Tienda t = new Tienda();
        t.setClave("123456");
        t.setDescripcion("Una tienda famosa por sus postres");
        t.setEmail("postres@gmail.com");
        t.setFacebook("facebook.com/postres/");
        t.setImagen("postres.jpg");
        t.setLema("para endulzar tu dia");
        t.setNombre("Postres");
        t.setPropietario("Petro");
        t.setWeb("www.postres.com");
        
        tDao.insert(t);
        
        //insertar servicio
        ServicioDao sDao = new ServicioDao();
        Servicio s = new Servicio();
        s.setNombre("Regalos personalizados");
        s.setDescripcion("Un regalos para esa persona especial");
        TiendaDao tDao2 = new TiendaDao();
        Tienda t2 = new Tienda();
        t2.setNombre("Postres");
        Tienda ayuda = tDao2.findByFieldObject(Tienda.class, "nombre", t2.getNombre());
        s.setTiendaBean(ayuda);
        sDao.insert(s);
        
        //seguir tieda
        Cliente c2 = new Cliente();
        c2.setNombre("Daniel");
        ClienteDao cDao2 = new ClienteDao();
        Cliente aux = cDao2.findByFieldObject(Cliente.class, "nombre", c2.getNombre());
        //List<Cliente> l = new List();
        //l.add(aux);
        //ayuda.setClientes(l);
        
        //actualizar tienda

        Tienda tienda = new Tienda();
        TiendaDao tDao3 = new TiendaDao();

        tienda.setNombre("hola");
        Tienda aux2 = tDao3.findByFieldObject(Tienda.class, "nombre", tienda.getNombre());
        aux2.setDescripcion("Hola a todos");
        aux2.setImagen("https://i.pinimg.com/originals/7f/7e/73/7f7e73c3ad511bf4b3c4a77ffeec2a6a.jpg");
        tDao3.update(aux2);
	}
}
