package uvsq.fr.pglp_5_1;

import java.sql.Connection;

public interface DAO<T> {


    Connection connect = null;

    public T create(T obj);
    public T find(String id);
    public T update(T obj);
    public void delete(T obj);



}