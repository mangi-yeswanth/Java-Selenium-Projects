package assessmentongenerics;
class Box1<T> {
    private T item;
    public void set(T item) {
        this.item = item;
    }
    public T get() {
        return item;
    }
}