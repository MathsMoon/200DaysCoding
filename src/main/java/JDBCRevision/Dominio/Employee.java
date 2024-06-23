package JDBCRevision.Dominio;

import lombok.Data;

@Data
public class Employee {
    Integer ID;
    String name;
    String phone;
    String e_mail;
    String Departament;
    Double salary;
}