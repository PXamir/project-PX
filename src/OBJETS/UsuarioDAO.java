package OBJETS;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author SAMIR
 */
public class UsuarioDAO {
    
    private String URL = "jdbc:mysql://sql10.freemysqlhosting.net:3306/sql10719448";
    private String USER = "sql10719448";
    private String PASSWORD = "HUibNhQilU";
   

   // Método para obtener la conexión a la base de datos
    protected Connection getConnection() {
        Connection connection = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return connection;
    }

    // Método para registrar un nuevo usuario
    public void registerUsuario(USUARIO usuario) throws SQLException {
        String INSERT_USERS_SQL = "INSERT INTO USUARIO (DNI, nombre, pass) VALUES (?, ?, ?)";

        try (Connection connection = getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(INSERT_USERS_SQL)) {
            preparedStatement.setString(1, usuario.getDNI());
            preparedStatement.setString(2, usuario.getNombre());
            preparedStatement.setString(3, usuario.getPass());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            printSQLException(e);
        }
    }
    
    
    public boolean loginUsuario(String DNI, String pass) {
        String LOGIN_SQL = "SELECT * FROM USUARIO WHERE DNI = ? AND pass = ?";

        try (Connection connection = getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(LOGIN_SQL)) {
            preparedStatement.setString(1, DNI);
            preparedStatement.setString(2, pass);
            ResultSet resultSet = preparedStatement.executeQuery();

            return resultSet.next();
        } catch (SQLException e) {
            printSQLException(e);
            return false;
        }
    }
    

    private void printSQLException(SQLException ex) {
        for (Throwable e : ex) {
            if (e instanceof SQLException) {
                e.printStackTrace(System.err);
                System.err.println("SQLState: " + ((SQLException) e).getSQLState());
                System.err.println("Error Code: " + ((SQLException) e).getErrorCode());
                System.err.println("Message: " + e.getMessage());
                Throwable t = ex.getCause();
                while (t != null) {
                    System.out.println("Cause: " + t);
                    t = t.getCause();
                }
            }
        }
    }
    
    /*
    public void registrar() {
        
        Connection connection = getConnection();
        String insertSQL = "INSERT INTO USUARIO (DNI, nombre, pass) VALUES (?, ?, ?)";
        try {
            PreparedStatement preparedStatement = Conexion.ejecutarQuery(insertSQL);
            preparedStatement.setString(1, this.usuario.getDNI());
            preparedStatement.setString(2, this.usuario.getNombre());
            preparedStatement.setString(3, this.usuario.getPass());
            int rowsInserted = preparedStatement.executeUpdate();
            if (rowsInserted > 0) {
                System.out.println("Se ha registrado correctamente");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }
    */
    
}
