package Modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ConexionConBBDD {
	private static ConexionConBBDD mConexionConBBDD;
	private Connection con;
	private ConexionConBBDD(){
	}
	public static ConexionConBBDD getConexionConBBDD(){
		if(mConexionConBBDD == null){
			mConexionConBBDD= new ConexionConBBDD(); 
		}
		return mConexionConBBDD;
		
		
	}
	private void crearConexion(){
		//Cargamos el Driver
		try {
			Class.forName("con.mysql.jdbc.Driver");
		}catch (ClassNotFoundException e1){};
		//Establecemos Conexion
		try{
			String url="jdbc:mysql://localhost:3306/sudoku?user=root&password=root";
			con=DriverManager.getConnection(url);
			System.out.println("conexion abierta");
		}catch(SQLException e5){System.out.println(e5.toString()); }
	}
	private void cerrarConexion(){
		try {
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	public void anyadirDatosLoguin(String nombreJugador, int nivelDificultad){
		crearConexion();
		Statement st;
		try {
			st = con.createStatement();
			st.executeUpdate("INSERT INTO `sudoku`.`infojuego` (`nombreJugador`,`nivel_dificultad`) VALUES ('"+nombreJugador+"','"+nivelDificultad+"');");
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		cerrarConexion();
		
		
	}
}
