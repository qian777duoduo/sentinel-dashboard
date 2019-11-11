package com.alibaba.csp.sentinel.dashboard.common;

import java.io.Serializable;

public abstract class BaseEntity<T> implements Serializable {
    protected abstract Serializable pkVal();
}
