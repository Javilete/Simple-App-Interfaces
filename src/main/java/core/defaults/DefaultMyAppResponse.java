package core.defaults;

import core.models.MyAppResponse;

public class DefaultMyAppResponse<T> implements MyAppResponse<T> {

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    private boolean success;
    private T data;
}
