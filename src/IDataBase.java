public interface IDataBase<T> {
    public T insert(T data);
    public boolean delete(T data);
    public boolean update(T data);
    public boolean select(T data);



}
