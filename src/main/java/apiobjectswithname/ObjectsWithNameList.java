package apiobjectswithname;

import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Класс-обертка для списка объектов, реализующих интерфейс ObjectWithName.
 * Реализует несколько дополнительных методов для работы с объектами со свойством name
 *
 * @param <T>
 */
public class ObjectsWithNameList<T extends ObjectWithName> {

    private List<T> list;

    public ObjectsWithNameList(List<T> data) {
        this.list = data;
    }

    public List<T> getList() {
        return list;
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public void setList(List<T> list) {
        this.list = list;
    }

    /**
     * Ищет элемент в списке по имени
     *
     * @param name - имя для поиска в списке
     * @return возвращает первый найденный в списке объект
     */
    public T getElementWithName(String name) {
        for (T obj : list) {
            if (obj.getName().equals(name)) {
                return obj;
            }
        }
        throw new NoSuchElementInListError("Не найден запрашиваемый элемент " + name);
    }

    /**
     * Ищет элементы в списке по имени
     *
     * @param name - имя для поиска в списке
     * @return возвращает список найденных в исходном списке объектов
     */
    public List<T> getElementsWithName(String name) {
        List<T> result = list.stream().filter(item -> item.getName().equals(name)).collect(Collectors.toList());
        if (result.isEmpty()) {
            return list.stream().filter(item -> item.getName().matches(name)).collect(Collectors.toList());
        }
        return result;
    }

    /**
     * Проверяет, содержит ли список переданное имя
     *
     * @param name - Имя для проверки
     * @return true | false
     */
    public boolean containsName(String name) {
        return list.stream().map(ObjectWithName::getName).collect(Collectors.toList()).contains(name);
    }

    /**
     * @return Возвращает список имен объектов списка
     */
    public List<String> getNames() {
        return list.stream().map(ObjectWithName::getName).collect(Collectors.toList());
    }

    public Stream<T> stream() {
        return list.stream();
    }

    public int size() {
        return list.size();
    }

    public T get(int i) {
        return list.get(i);
    }

    public void add(T item) {
        list.add(item);
    }

    public void sort(Comparator comparator) {
        list.sort(comparator);
    }

    public int indexOf(T obj) {
        return list.indexOf(obj);
    }

    public T remove(int i) {
        return list.remove(i);
    }

    public boolean remove(T obj) {
        return list.remove(obj);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ObjectsWithNameList<?> that = (ObjectsWithNameList<?>) o;
        return Objects.equals(list, that.list);
    }

    @Override
    public int hashCode() {

        return Objects.hash(list);
    }
}
