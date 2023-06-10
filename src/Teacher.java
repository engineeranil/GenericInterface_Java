public class Teacher implements IDataBase<Teacher>{
    @Override
    public Teacher insert(Teacher data) {
        System.out.println("ADDED");
        return null;
    }

    @Override
    public boolean delete(Teacher data) {
        return false;
    }

    @Override
    public boolean update(Teacher data) {
        return false;
    }

    @Override
    public boolean select(Teacher data) {
        return false;
    }
}
