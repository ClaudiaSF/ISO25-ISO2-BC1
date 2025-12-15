package iso_bc01.Dominio;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import iso_bc01.Persistencia.MiAgente;


public class GestorEstadisticas {

	public List<EstadisticaGlobal> generarEstadisticas() {
		List<EstadisticaGlobal> lista = new ArrayList<>();
		
		try {
		
			MiAgente agente = MiAgente.getAgente();
			String sql = "SELECT COUNT(*) FROM Prestamos";
			ResultSet rs = agente.select(sql);
			
			if (rs.next()) {
				int total = rs.getInt(1);
				lista.add(new EstadisticaGlobal(1, total, "Total de Préstamos"));
			}
			
			
			if (lista.isEmpty()) {
				lista.add(new EstadisticaGlobal(0, 0, "Sin datos en BD (Simulado)"));
			}

		} catch (Exception e) {
			System.err.println("Error al generar estadísticas: " + e.getMessage());
		}
		return lista;
	}
	public boolean verificarPermisos(Usuario usuario, Permiso permiso) {
		if (usuario == null || permiso == null) return false;

		
		String nombreUsuario = usuario.get_username();
		if (nombreUsuario == null) return false;

		// Si el permiso indica rol admin, permitir
		String tipo = permiso.getTipoPermiso();
		if (tipo != null && "admin".equalsIgnoreCase(tipo)) return true;

		// Si el permiso especifica un usuario concreto, comprobar que coincide
		Usuario permisoUsuario = permiso.getUsername();
		if (permisoUsuario != null && permisoUsuario.get_username() != null) {
			return nombreUsuario.equalsIgnoreCase(permisoUsuario.get_username());
		}

		// Por defecto, permitir solo si el usuario es admin
		return "admin".equalsIgnoreCase(nombreUsuario);
	}


	public boolean borrarEstadistica(int id) {
		try {
			String sql = "DELETE FROM Estadisticas WHERE id = ?";
			Object[] params = new Object[] { id };
			return MiAgente.getAgente().deletePrepared(sql, params) > 0;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	// Overload to accept an EstadisticaGlobal object (matches design diagrams)
	public boolean borrarEstadistica(EstadisticaGlobal estadistica) {
		if (estadistica == null) return false;
		return borrarEstadistica(estadistica.getId());
	}
}