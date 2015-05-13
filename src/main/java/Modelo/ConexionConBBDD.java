package Modelo;

import java.lang.reflect.Array;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

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
	public void anyadirCodigoSudokuUsado(String nombreJugador , String codigoSudoku){
		crearConexion();
		Statement st;
		try {
			st = con.createStatement();
			st.executeUpdate("INSERT INTO `sudoku`.`infoJugador` (`nombreJugador`,`cod_sudoku`) VALUES ('"+nombreJugador+"','"+codigoSudoku+"');");
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		cerrarConexion();	
	}
	public String buscarPuntacionMasAltaDeJugador(String nombreJugador){
		crearConexion();
		Statement st;
		String resultado = null;
		try {
			st = con.createStatement();
			 ResultSet rs = st.executeQuery("select max(puntuacion) as puntuacion from infojugador where nombreJugador='"+nombreJugador+"';");
			 rs.next();
			 resultado = rs.getString("puntuacion");
			 cerrarConexion();
			 return resultado;
		} catch (SQLException e) {
			e.printStackTrace();
			return null;		
		}
	}
	public void anyadirPuntuacionJuego(String nombreJugador , String codigoSudoku, int puntuacion){
		crearConexion();
		Statement st;
		try {
			st = con.createStatement();
			st.executeUpdate("INSERT INTO `sudoku`.`infoJugador` (`nombreJugador`,`cod_sudoku`,`puntuacion` ) VALUES ('"+nombreJugador+"','"+codigoSudoku+"','"+puntuacion+"');");
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		cerrarConexion();	
	}
	public String[] buscarPuntuacionesMaximas(){
		crearConexion();
		Statement st;
		String[] resultado = new String[10];
		try {
			st = con.createStatement();
			 ResultSet rs = st.executeQuery("select nombreJugador, puntuacion from infojugador group by  puntuacion desc;");
			 int cont = 0;
			 while(rs.next()&&cont != 9){
				 String dato = (cont+1)+"-> "+rs.getString("nombreJugador")+" --> "+rs.getInt("puntuacion");
				 resultado[cont]=dato;
				 cont++; 
			 }
		} catch (SQLException e) {
			e.printStackTrace();
					
		}
		return resultado;
	}
		
	}

