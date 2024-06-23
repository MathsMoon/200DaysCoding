package JDBCRevision.Service;

import JDBCRevision.Connection.ConnectionFactory;
import JDBCRevision.Dominio.Employee;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EmployeeService {
    //Função que busca todos os Elementos da Tabela
    private List<Employee> findAll(){
        List<Employee> employeeList = new ArrayList<>();
        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement ps = conn.prepareStatement("");
             ResultSet rs = ps.executeQuery()){
            while (!rs.next()){
//                employeeList.stream();
            }
        }catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return null;
    }
}