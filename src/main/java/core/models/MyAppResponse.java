package core.models;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import core.defaults.DefaultMyAppResponse;

@JsonDeserialize(as = DefaultMyAppResponse.class)
public interface MyAppResponse<T> {

    public boolean isSuccess();

    public void setSuccess(boolean success);

    public T getData();

    public void setData(T data);

}
