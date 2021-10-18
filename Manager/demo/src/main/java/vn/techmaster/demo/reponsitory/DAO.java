package vn.techmaster.demo.reponsitory;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Repository;
@Repository
public abstract class DAO<T> {
    protected List<T> listObject = new ArrayList<T>();

    public abstract List<T> getall();

    public abstract Optional<T> get(int id);

    public abstract void add(T t);

    public abstract void update(T t);

    public abstract void deleteByID(int id);

    public abstract void delete(T t);
}
