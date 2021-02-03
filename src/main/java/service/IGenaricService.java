package service;

import java.util.List;

public interface IGenaricService<T> {
    List<T> findALl();
    T save(int id,T t);
    void delete(int id);
    T editByID(int id, T t);
    T findById(int id);
}
