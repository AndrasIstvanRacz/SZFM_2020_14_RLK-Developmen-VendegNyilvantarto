package database;

import java.lang.reflect.ParameterizedType;

public abstract class GenericDb<T> {

    private final Class<T> entityClass;

    public GenericDb(){
        this.entityClass = ((Class) ((ParameterizedType) getClass()
                .getGenericSuperclass()).getActualTypeArguments()[0]);
    }
    public void asd(T etity){

    }
}
