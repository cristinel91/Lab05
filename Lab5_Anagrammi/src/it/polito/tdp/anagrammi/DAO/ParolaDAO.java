package it.polito.tdp.anagrammi.DAO;
import java.sql.*;
import java.util.*;

public class ParolaDAO {
	
	public List<String> getParole() {

		final String sql = "SELECT nome FROM parola";

		List<String>parole = new LinkedList<String>();

		try {
			Connection conn = ConnectDB.getConnection();
			PreparedStatement st = conn.prepareStatement(sql);

			ResultSet rs = st.executeQuery();

			while (rs.next()) {
				parole.add(new String(rs.getString("nome")));
			}

			return parole;

		} catch (SQLException e) {
			// e.printStackTrace();
			throw new RuntimeException("Errore Db");
		}
	}

}
