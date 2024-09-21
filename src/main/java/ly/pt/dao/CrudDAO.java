package ly.pt.dao;

import java.sql.SQLException;
import java.util.ArrayList;

public interface CrudDAO<T> extends SuperDAO{
    ArrayList<T> getAll() throws SQLException, ClassNotFoundException;
    boolean save(T dto)throws SQLException, ClassNotFoundException;
    boolean update(T dto)throws SQLException, ClassNotFoundException;
    boolean delete(String id,T dto)throws SQLException, ClassNotFoundException;
    T find(String id)throws SQLException, ClassNotFoundException;
}
