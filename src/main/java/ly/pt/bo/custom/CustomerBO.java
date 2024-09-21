package ly.pt.bo.custom;

import ly.pt.bo.SuperBo;
import ly.pt.dto.CustomerDTO;

import java.sql.SQLException;
import java.util.ArrayList;

public interface CustomerBO extends SuperBo {
    boolean saveCustomer(CustomerDTO customerDTO) throws SQLException, ClassNotFoundException;
    boolean updateCustomer(CustomerDTO customerDTO) throws SQLException, ClassNotFoundException;
    boolean deleteCustomer(String id,CustomerDTO customerDTO) throws SQLException, ClassNotFoundException;
    ArrayList<CustomerDTO> getAllCustomers() throws SQLException, ClassNotFoundException;
}
