package OBJETS;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author SAMIR
 */
public class ReservaDAO {
    
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
    
    
    
     public void registerReserva(RESERVA reserva) throws SQLException {
        String INSERT_RESERVA_SQL = "INSERT INTO RESERVA (DNI, dia, hora) VALUES (?, ?, ?)";

        try (Connection connection = getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(INSERT_RESERVA_SQL)) {
            preparedStatement.setString(1, reserva.getDNI());
            preparedStatement.setDate(2, reserva.getDia());
            preparedStatement.setString(3, reserva.getHora());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            printSQLException(e);
        }
    }
     
     
     /*
      public List<RESERVA> getReservasByDNI(String dni) throws SQLException {
        List<RESERVA> reservas = new ArrayList<>();
        String query = "SELECT * FROM reservas WHERE dni = ?";
        PreparedStatement statement = connection.prepareStatement(query);
        statement.setString(1, dni);
        ResultSet resultSet = statement.executeQuery();
        while (resultSet.next()) {
            String usuarioDNI = resultSet.getString("dni");
            Date dia = resultSet.getDate("dia");
            String hora = resultSet.getString("hora");
            reservas.add(new RESERVA(usuarioDNI, dia, hora));
        }
        return reservas;
    }
     */
      
      
     
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
    
}
